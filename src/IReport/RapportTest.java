/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IReport;

import com.tn.connect.MyConnection;
import java.sql.Connection;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Salma
 */
public class RapportTest {

    /**
     * @param args the command line arguments
     */
    
 
    public RapportTest() {
    }
       public void report(int id_reclamation) throws JRException {
       
       HashMap m = new HashMap();
       m.put("id_reclamation",id_reclamation);
           System.out.println("iddddddddddddddddd"+id_reclamation);
            //String report="D:\\Rapport\\reclamationREPORT2.jasper";
            String report ="C:\\Users\\majdi\\Desktop\\salma pi dev\\chouchou\\Rapport\\reclamationREPORT1.jasper";
            //JasperReport jasperReport = JasperCompileManager.compileReport(report);
            System.out.println("Test1");
            Connection cnx;
            cnx = MyConnection.getInstance(); 
            if (cnx != null)
                System.out.println(" not Nulll");
            JasperPrint jp = JasperFillManager.fillReport(report,m,cnx);
            JasperViewer.viewReport(jp);
            
    }

    
}
