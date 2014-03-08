package Tools;

import java.util.ArrayList; 

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class GMaps extends JEditorPane {
//public static String[] ville_tab = {"Tunis","Bizerte","Grombalia","Nabeul"}; 

public static String[] ville_tab = {"",""}; 
public ArrayList<String> arrList = new ArrayList<String>();


private float longitude;

    
private float latitude;

private static final long serialVersionUID = 1L;
private int zoomFactor = 8;
//private String ApiKey = "ABQIAAAA5U876NY9uQtuJYcYdj0hPRSB3fYKqo9sRR7o2MKyAKh3L0V4NBREpf50rgLOScH_jEQR7BtpLbAZ0g";
private String ApiKey="AIzaSyAmYhzpu6dxUMCZkAWXMDubs43ahBYhnig";
// saf private String ApiKey = "AIzaSyDLz0GRExK6FU1yf48yMStyc0sc426rbEA";

private String roadmap = "roadmap";
public final String viewTerrain = "terrain";
public final String viewSatellite = "satellite";
public final String viewHybrid = "hybrid";
public final String viewRoadmap = "roadmap";
private String bouton = "";
private String cursor ="";
//private String line ="&path=color:0xff0000ff|weight:5|Bizerte|Tunis|Nabeul";
private String line = "";


//private String line ="&path=weight:3%7Ccolor:orange%7Cenc:polyline_data|Tunis|Nabeul";

public GMaps(float longitude,float latitude) {
       // this.ville_tab = new String[]{"", ""};


HTMLEditorKit kit = new HTMLEditorKit();
HTMLDocument htmlDoc = (HTMLDocument) kit.createDefaultDocument();
this.setEditable(false);
this.setContentType("text/html");
this.setEditorKit(kit);
this.setDocument(htmlDoc);
this.setLongitude(longitude);
this.setLatitude(latitude);

}/* C'EST LA FONCTION POUR RAJOUTER DES CURSEUR*/

    private GMaps() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public void addCursor(String color,String lettre,float clongitude,float clatitude) {
cursor +="&markers=color:"+color+"%7Clabel:"+lettre+"%7C"+clatitude+","+clongitude;
}

/* C'EST LA FONCTION POUR RAJOUTER DES ligne sur ta carte*/
public void addLine(String color,float llongitude1, float llatitude1,float llongitude2,float llatitude2) {
line +="&path=color:0x0000ff|weight:5|"+llatitude1+","+llongitude1+"|"+llongitude2+","+llatitude2;
}

public String getRoadmap() {
        return roadmap;
    }

/**
     * Fixer le zoom
     * @param zoom valeur de 0 � 21
     */
public void setZoom(int zoom) {
this.zoomFactor = zoom;
}
public int getZoom() {
return zoomFactor;
}

/**
     * Fixer la cl� de developpeur
     * @param key APIKey fourni par Google
     */
public void setApiKey(String key) {
this.ApiKey = key;
}

/**
     * Fixer le type de vue
     * @param roadMap
     */
public void setRoadmap(String roadMap) {
this.roadmap = roadMap;
}

/**
     * Afficher la carte d'apr�s des coordonn�es GPS
     * @param latitude
     * @param longitude
     * @param width
     * @param height
     * @throws Exception erreur si la APIKey est non renseign�e
     */
public void showCoordinate(int width, int height) throws Exception {
this.setMap(Float.toString(latitude),Float.toString(longitude) , width, height);
}

/**
     * Afficher la carte d'apr�s une ville2 et son pays
     * @param city
     * @param country
     * @param width
     * @param height
     * @throws Exception erreur si la APIKey est non renseign�e
     */
public void showLocation(String city, String country, int width, int height) throws Exception {
this.setMap(city, country, width, height);
}

/**
    *
    * @param x
    * @param y
    * @param width
    * @param height
    * @throws Exception
  */
public String setMap(String x, String y, Integer width, Integer height) throws Exception {
if (this.ApiKey.isEmpty()) {
throw new Exception("Developper API Key not set !!!!");
}


String ville = "\\&markers=size:mid";

//for (int i=0;i<ville_tab.length;i++) {
//    ville = ville+"%7C"+ville_tab[i];
//}

for (int i=0;i<arrList.size();i++) {
    if(arrList.get(i).equals("")!=true) { 
ville = ville+"%7C"+arrList.get(i).toString()+",TUNISIA";
    }
}

System.out.println(ville);

//String url = "http://maps.google.com/maps/api/staticmap?";
String url = "http://maps.googleapis.com/maps/api/staticmap?";
//String url ="http://maps.googleapis.com/maps/api/geocode/json?";

//url += "center=" + x + "," + y;
//url += "&amp;zoom=" /*+ this.zoomFactor*/ + getZoom();
url += "&amp;size=" + width.toString() + "x" + height.toString();
url += "&amp;maptype=" /*+ this.roadmap */ + getRoadmap();
url += ville;
url += line;
url += "&amp;sensor=false";
//String html = "<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>";
String html = "";

html += "<html><head></head>";
html +="<body><img src='" + url + "'>";
html += "</body></html>";

//this.setText(html);
//JEditorPane ed=new JEditorPane("text/html",html);
//add(ed);

//this.setPage(url);
//ed.setPage(html);

//System.out.println(ville_tab[0].toString());
System.out.println(ville_tab[1].toString());
System.out.println(html);

return html;
}


public void setLongitude(float longitude) {this.longitude = longitude;}
public float getLongitude() {return longitude;}
public void setLatitude(float latitude) {this.latitude = latitude;}
public float getLatitude() {return latitude;}






// public static void main(String[] args) throws Exception {
// GMaps map = new GMaps();
//
//
//        try {
//            map.setApiKey("AIzaSyDLz0GRExK6FU1yf48yMStyc0sc426rbEA");
//            // googleMap.setRoadmap(googleMap.viewHybrid);
//
//            /**
//            Afficher la ville de Strabourg
//             */
//           // map.showLocation(ville_tab[0], "tunisia", 500, 500);
//         
//            
//            System.out.println(map.setMap(ville_tab[0], "tunisia", 500, 500));
//            
//            /**
//             * Afficher Paris en fonction ses coordonnées GPS
//             */
//            //  googleMap.showCoordinate("48.8667", "2.3333",390, 400);
//        } catch (Exception ex) {
//            //Logger.getLogger(JGoogleMapEditorPan.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
// 
// //map.showLocation(ville_tab[0], "tunisia", 500, 500);
// map.setZoom(9);
//
// JFrame frame = new JFrame();
// 
// 
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(map);
//        
//        frame.setSize(400, 420);
//        frame.setLocation(200, 200);
//        frame.setVisible(true);
// 
// 
// }
     
     
  
     
 }



