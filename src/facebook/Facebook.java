/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.json.JsonObject;
import com.restfb.types.User;

/**
 *
 * @author Invite
 */
public class Facebook {
    
    public static void main (String [] args) {
        
     FacebookClient fbClients = new DefaultFacebookClient("CAAI04XdYA9EBABNsSZAZA82jchWrBqzbc8HrlxCxt4ynKE1IW4XdYD1M5c6yFO4fga1FE7UtRnat3birlEj8q8tXY7ghNwxgon27gmgkDToPi713hOYrZA2ZBuGh2iLAa6PNZA2hyIYH6HiHQZBqVFC6qsRPCZBZA1mgCVLRTZApI9u9xZB2gtZA0ZCnoeH5riOwJxFCJqedZCS8HDAZDZD");
     User me = fbClients.fetchObject("1389661517",com.restfb.types.User.class);
  
//     
//     FacebookClient fbClients = new DefaultFacebookClient(NewClass.access_token);
//     User me = fbClients.fetchObject("/me",com.restfb.types.User.class);
//  
//     


    //************************************************
     
     System.out.println(me.getEmail());
     //*******************************
    System.out.println(me.getBirthday());
     //*******************************
    System.out.println(me.getId());
     //*******************************
    System.out.println(me.getUsername());
     //*******************************
    
    
    }
    
    
}
