/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import Entité.Adherent;
import Gui.admin.MainFrameAdmin;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;
import com.tn.doa.AdherentDAO;

import java.awt.BorderLayout;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import Tools.GenerationDeCode;
import Tools.Gmail;

public class ConnexionFacebook {
    
    public static Adherent currentUser;
    // les attribus 
    //public static String API_KEY = "744242495596671";
   public static String API_KEY = "1471522786397444";
    //public static String SECRET = "e7d974d763f40021365cd43da84fb040";
       public static String SECRET = "cb77000447a93093eeb4e6e05704cd53";

    public static String firstRequest = "https://graph.facebook.com/oauth/authorize?"
            + "client_id="
            + API_KEY
            + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
            + "scope=publish_stream,offline_access,create_event,read_stream,email,user_birthday";
    public static String secondRequest = "https://graph.facebook.com/oauth/access_token?"
            + "client_id="
            + API_KEY
            + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
            + "client_secret=" + SECRET + "&code=";
    public static String access_token = "";
    public static boolean firstRequestDone = false;
    public static boolean secondRequestDone = false;
    final JFrame loginFrame = new JFrame();
    public static FacebookClient facebookClient = null;
    private String userName;
    private String userMail;
    public static boolean fbCnxEnd = false;
    /**
     *
     */
    public String  registredUserName;
    
    // notification par email
    Gmail gmail = new Gmail(); 

    

    public void loginFb() {
        NativeInterface.open();
        NativeInterface.initialize();
        final JFrame authFrame = new JFrame();
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        final JWebBrowser webBrowser = new JWebBrowser();
        
        webBrowser.navigate(firstRequest);
        
        
        
        webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
            @Override
            public void locationChanged(WebBrowserNavigationEvent e) {
                super.locationChanged(e);
                // Check if first request was not done
                if (!firstRequestDone) {
                    // Check if you left the location and were redirected to the next
                    // location
                    
                    if (e.getNewResourceLocation().contains("http://www.facebook.com/connect/login_success.html?code=")) {
                        // If it successfully redirects you, get the verification code
                        // and go for a second request
                        String[] splits = e.getNewResourceLocation().split("=");
                        String stage2temp = secondRequest + splits[1];
                        System.out.println("First =" + splits[1]);
                        webBrowser.navigate(stage2temp);
                        firstRequestDone = true;
                    }
                } else {
                    // If secondRequest is not done yet, you perform this and get the
                    // access_token
                    if (!secondRequestDone) {
                        System.out.println(webBrowser.getHTMLContent());
                        // Create reader with the html content
                        StringReader readerSTR = new StringReader(webBrowser.getHTMLContent());
                        // Create a callback for html parser
                        HTMLEditorKit.ParserCallback callback;
                        callback = new HTMLEditorKit.ParserCallback() {
                               @Override
                               public void handleText(char[] data, int pos) {
                                   try {
                                       System.out.println(data);
                                       // because there is only one line with the access_token
                                       // in the html content you can parse it.
                                       String string = new String(data);
                                       String[] temp1 = string.split("&");
                                       String[] temp2 = temp1[0].split("=");
                                       System.out.println("access tocken=" + temp2);
                                       access_token = temp2[1];
                                       new GraphReaderExample(access_token).runEverything();
                                       facebookClient = new DefaultFacebookClient(access_token);
                                       User user = facebookClient.fetchObject("me", User.class);
                       //                Page page = facebookClient.fetchObject("cocacola", Page.class);
                                     //  userName = user.getName();
                                     //  userMail = user.getEmail();

                                       authFrame.dispose();
                                       /**
                                        * *****
                                        */
                                       String userName = user.getName();
                                       String userMail = user.getEmail();
                              
                                       // attribution de mot de passe aleatoire de longuer 8 
                                       String motdepasse = GenerationDeCode.generate(8);
                                       AdherentDAO adherentDAO = new AdherentDAO();
                                       Adherent ad = new Adherent();
                                       ad.setAdresseMail(userMail);
                                       ad.setNom(userName);
                                       ad.setEtat("false");
                                       // attribution de mot de passe automatique
                                       ad.setMdp(motdepasse);
                                       System.out.println("**************");
                                       System.out.println(ad.getNom());
                                       System.out.println(adherentDAO.findByPseudo(userName).getNom());
                                       
                                 registredUserName = adherentDAO.findByPseudo(userName).getNom();
                                       
                                       if (ad.getNom().equals(registredUserName)) {

                                           
                                           MainFrameAdmin admin=new MainFrameAdmin();
                                           JOptionPane.showMessageDialog(admin, "Bievenue " + registredUserName);

                                       } else {
                              // envoie de l email automatiaue             
                                           adherentDAO.AjouterAdherentfb(ad);
                             gmail.adresse_destination=ad.getAdresseMail();
                             gmail.subject="Votre Mot de passe";
                             gmail.contenu="voici votre mot de passe pour le site de covoiturage"+ad.getMdp() +"changer le";
                             gmail.sendMail();
                                           
                                       }
                                   } catch (Exception ex) {
                                       Logger.getLogger(ConnexionFacebook.class.getName()).log(Level.SEVERE, null, ex);
                                   }
                               }
                           };
                        try {
                            // Call the parse method
                            new ParserDelegator().parse(readerSTR, callback, false);

                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        // After everything is done, you can dispose the jframe
                        authFrame.dispose();
                        

                    }
                }
            }
        });

        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        authFrame.add(webBrowserPanel);
        authFrame.setSize(900, 700);
        authFrame.setVisible(true);
        authFrame.setLocationRelativeTo(null);

    }
    
}
