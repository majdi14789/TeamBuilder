
package Tools;
/**
 *
 * @author PC
 */
public class GenerationDeCode {

    
    
// Generation de mot de passe aleatoire 
public static String generate(int length)
{
	    String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; 
	    String pass = "";
	    for(int x=0;x<length;x++)
	    {
	       int i = (int)Math.floor(Math.random() * 62); // Si tu supprimes des lettres tu diminues ce nb
	       pass += chars.charAt(i);
	    }
	    System.out.println(pass);
	    return pass;
}   

//
//    public static void main(String[] args) {
//     // Password de longueur 8
//System.out.println(generate(8));
// 
//
//
//// TODO code application logic here
//    }
    
}