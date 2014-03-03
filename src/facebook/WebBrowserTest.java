/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;
import javax.swing.JFrame;

/**
 *
 * @author Invite
 */


public class WebBrowserTest {
    
public  static String API_KEY = "621092927964113";


public  static String access_token = "CAAI04XdYA9EBABNsSZAZA82jchWrBqzbc8HrlxCxt4ynKE1IW4XdYD1M5c6yFO4fga1FE7UtRnat3birlEj8q8tXY7ghNwxgon27gmgkDToPi713hOYrZA2ZBuGh2iLAa6PNZA2hyIYH6HiHQZBqVFC6qsRPCZBZA1mgCVLRTZApI9u9xZB2gtZA0ZCnoeH5riOwJxFCJqedZCS8HDAZDZD";


 public static String firstRequest = "https://graph.facebook.com/oauth/authorize?"
  + "client_id="
  + API_KEY;
//  + "&redirect_uri=http://www.facebook.com/connect/login_success.html"
// + "scope=publish_stream,offline_access,create_event,read_stream,email,user_birthday";
    

public static void main(String [] args ) {
  
     
    JWebBrowser webBrowser = new JWebBrowser();
    webBrowser.setMenuBarVisible(false);
    webBrowser.setButtonBarVisible(false);
    webBrowser.setLocationBarVisible(false);
   
    webBrowser.navigate(firstRequest);
   
    
  // webBrowser.navigate("http://www.facebook.com/");
// ba3ed me tasna3 el Browser T3ayyet lel NativeInterface 
   NativeInterface.open();
   NativeInterface.initialize();
//*****************************************************************
     
                     
    JFrame loginFrame = new JFrame();
    loginFrame.setSize(1000,1000);
    loginFrame.setVisible(true);
loginFrame.add(webBrowser);
//if (webBrowser.getHTMLContent().contains("Success")) {

    
    
//FacebookClient fbClients = new DefaultFacebookClient(access_token);
//User me = fbClients.fetchObject("/me",com.restfb.types.User.class);

     
//     //************************************************
//     
//     System.out.println(me.getEmail());
//     //*******************************
//    System.out.println(me.getBirthday());
//     //*******************************
//    System.out.println(me.getId());
//     //*******************************
//    System.out.println(me.getUsername());
//     //*******************************
//    
}    
    }
    

    









