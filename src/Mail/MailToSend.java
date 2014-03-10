
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import javax.activation.DataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.URLName;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Salma
 */
public class MailToSend {
    
    
    
    public static void sendMessage(String subject, String text, String destinataire, String copyDest) { 
    // 1 -> Création de la session 
    Properties props = new Properties(); 
    props.setProperty("mail.transport.protocol", "smtp");
    props.put("mail.smtp.auth","true");
    props.put("mail.smtp.starttls.enable","true"); // ********
    props.put("mail.smtp.host","smtp.gmail.com"); // serveur 
    props.put("mail.smtp.port","587"); // port
   
    //properties.setProperty("mail.smtp.host", SMTP_HOST1); 
    //properties.setProperty("mail.smtp.user", LOGIN_SMTP1); 
    //properties.setProperty("mail.from", IMAP_ACCOUNT1); 
    Session session = Session.getInstance(props);
    
      // 2 -> Création du message 
    MimeMessage message = new MimeMessage(session); 
    try { 
        message.setText(text); 
        message.setSubject(subject); 
        message.addRecipients(Message.RecipientType.TO, destinataire); 
        message.addRecipients(Message.RecipientType.CC, copyDest); 
    } catch (MessagingException e) { 
        e.printStackTrace(); 
    } 
    
     // 3 -> Envoi du message 
    Transport transport=null;
    try { 
         transport = session.getTransport("smtp"); 
        transport.connect("torjmen.salma@gmail.com","barratira9ra"); 
        transport.sendMessage(message, new Address[] { new InternetAddress(destinataire), 
                                                        new InternetAddress(copyDest) }); 
    } catch (MessagingException e) { 
        e.printStackTrace(); 
    } finally { 
        try { 
            if (transport != null) { 
                transport.close(); 
            } 
        } catch (MessagingException e) { 
            e.printStackTrace(); 
        } 
        
     
    }
    }
    
    
    
    
    
    
    
     //Reception des messages
    
    public static int receiveMessage() { 
    // 1 -> La session 
     String inboxx;
     int ret=0;
    Properties properties = new Properties(); 
    properties.setProperty("mail.store.protocol", "pop3"); 
    
   
    properties.setProperty("mail.pop3.host","pop.gmail.com");
    properties.put("mail.pop3.port", 995);
    properties.put("mail.pop3.auth","true");
    properties.put("mail.pop3.socketFactory" , 995 );
    properties.put("mail.pop3.socketFactory.class" , "javax.net.ssl.SSLSocketFactory" );
 //   properties.setProperty("mail.pop3.user","torjmen.salma@gmail.com");
 // properties.put("mail.pop3.auth","true");
    Session session = Session.getInstance(properties); 
    
    
    // 2 -> Les dossiers 
    Store store = null; 
    Folder defaultFolder = null; 
    Folder inbox = null; 
    try { 
        store = session.getStore(new URLName("pop3://"+"pop.gmail.com")); 
        store.connect("pop.gmail.com" , 995,"covoituragetfadad@gmail.com","chayifadad"); 
        defaultFolder = store.getDefaultFolder(); 
       
        System.out.println("defaultFolder : " + defaultFolder.getName()); 
 
        for (Folder folder : defaultFolder.list()) { 
            System.out.println(folder.getName()); 
        } 
        inbox = defaultFolder.getFolder("INBOX"); 
        
        ret=printMessages(inbox); 
    } catch (Exception e) { 
        e.printStackTrace(); 
    } finally { // Ne pas oublier de fermer tout ça ! 
        close(inbox); 
        close(defaultFolder); 
        try { 
            if (store != null && store.isConnected()) { 
                store.close(); 
            } 
        } catch (MessagingException e) { 
            e.printStackTrace(); 
        } 
    } 
    return ret;
} 

    private static int printMessages(Folder folder) { 
    String linee = null;
    int unreadMessage = 0;
        try { 
        folder.open(Folder.READ_ONLY); 
        
        int count = folder.getMessageCount(); 
        int unread = folder.getUnreadMessageCount(); 
        unreadMessage=unread;
        System.out.println(folder.getUnreadMessageCount());
        System.out.println("Il y a " + count + " messages, dont " + unread + " non lus."); 
        //for (int i = 1; i <= count; i++ ) 
      //  (int i = message.length-1; i >0; i--)
        for (int i = count; i >= count-2; i-- ) { 
 
            Message message = folder.getMessage(i); 
            System.out.println("Message n° " + i); 
            System.out.println("Sujet : " + message.getSubject()); 
 
            System.out.println("Expéditeur : "); 
            Address[] addresses = message.getFrom(); 
            for (Address address : addresses) { 
                System.out.println("\t" + address); 
            } 
 
            System.out.println("Destinataires : "); 
            addresses = message.getRecipients(RecipientType.TO); 
            if (addresses != null) { 
                for (Address address : addresses) { 
                    System.out.println("\tTo : " + address); 
                } 
            } 
            addresses = message.getRecipients(RecipientType.CC); 
            if (addresses != null) { 
                for (Address address : addresses) { 
                    System.out.println("\tCopie : " + address); 
                } 
            } 
 
            System.out.println("Content : "); 
            for (String line : inputStreamToStrings(message.getInputStream())) { 
                System.out.println(line); 
                linee=line;
            } 
            
        } 
 
    } catch (Exception e) { 
        e.printStackTrace(); 
    } 
    return unreadMessage;
} 
    
    
 
public void printMessage(Message message) { 
 
    try { 
        DataSource dataSource = message.getDataHandler().getDataSource(); 
        MimeMultipart mimeMultipart = new MimeMultipart(dataSource); 
        int multiPartCount = mimeMultipart.getCount(); 
        System.out.println("Il y a " + multiPartCount + " partie(s) dans ce message."); 
 
        for (int i = 0; i < multiPartCount; i++ ) { 
            BodyPart bp = mimeMultipart.getBodyPart(i); 
            processBodyPart(bp); 
        } 
    } catch (MessagingException e) { 
        e.printStackTrace(); 
    } 
} 
    private static void close(Folder folder) { 
    if (folder != null && folder.isOpen()) { 
        try { 
            folder.close(false); // false -> On n'efface pas les messages marqués DELETED 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
} 
    private void processBodyPart(BodyPart bp) { 
    try { 
        System.out.println("Type : " + bp.getContentType()); 
        String fileName = bp.getFileName(); 
        System.out.println("FileName : " + fileName); 
 
        if (bp.isMimeType("text/plain")) { 
            System.out.println("Texte du message :"); 
            List<String> strings = inputStreamToStrings(bp.getInputStream()); 
            for (String string : strings) { 
                System.out.println(string); 
            } 
        } else { 
            File file = new File("C:/Users/Salma/Desktop/Esprit/PIWEB" + "/received_" + fileName); 
            FileOutputStream fos = new FileOutputStream(file); 
            bp.writeTo(fos); 
        } 
    } catch (MessagingException | IOException e) { 
        e.printStackTrace(); 
    } 
} 

      private static List<String> inputStreamToStrings(InputStream is) {
        InputStreamReader isr = new InputStreamReader(is);
        List<String> strings = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(isr)) {
            String line = reader.readLine();
            while (line != null) {
                strings.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
    
    }
    
  