package Tools;

import java.util.ArrayList; 

import javax.swing.JEditorPane;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class GMaps extends JEditorPane {

public ArrayList<String> arrList = new ArrayList<String>();


private float longitude;

    
private float latitude;

private static final long serialVersionUID = 1L;
private int zoomFactor = 8;
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



public GMaps(float longitude,float latitude) {


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



for (int i=0;i<arrList.size();i++) {
    if(arrList.get(i).equals("")!=true) { 
ville = ville+"%7C"+arrList.get(i).toString()+",TUNISIA";
    }
}


//String url = "http://maps.google.com/maps/api/staticmap?";
String url = "http://maps.googleapis.com/maps/api/staticmap?";

//url += "center=" + x + "," + y;
//url += "&amp;zoom=" /*+ this.zoomFactor*/ + getZoom();
url += "&amp;size=" + width.toString() + "x" + height.toString();
url += "&amp;maptype=" /*+ this.roadmap */ + getRoadmap();
url += ville;
url += line;
url += "&amp;sensor=false";

String html = "";

html += "<html><head></head>";
html +="<body><img src='" + url + "'>";
html += "</body></html>";


//System.out.println(html);

return html;
}


public void setLongitude(float longitude) {this.longitude = longitude;}
public float getLongitude() {return longitude;}
public void setLatitude(float latitude) {this.latitude = latitude;}
public float getLatitude() {return latitude;}







     
  
     
 }



