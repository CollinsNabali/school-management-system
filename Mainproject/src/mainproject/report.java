/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainproject;


import com.itextpdf.text.Phrase;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.xdevapi.Statement;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JFileChooser;
//import javax.swing.text.Document;


/**
 *
 * @author ADMIN
 */
public class report {
    report(){
     Connection con;
            

     
                    
                                    try {
                                         JFileChooser jFileChooser = new JFileChooser();         
     jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);             
     int i = jFileChooser.showSaveDialog(jFileChooser); 
     
                   // Connection con;
                 java.sql.Statement st;
                    ResultSet rs = null;
                Document doc = new    Document();

                        String path = "";
                        if (i == JFileChooser.APPROVE_OPTION) {
                          path = jFileChooser.getSelectedFile().getAbsolutePath();
                        }
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Confirm","root","");
                        st =con.createStatement();
                        String sql ="select * from register1";
                        rs =st.executeQuery(sql);

                        PdfWriter.getInstance(doc, new FileOutputStream(path+"report.pdf"));
                        
                        //Paragraph paragraph = new Paragraph();
                       
                        
                        doc.open();
                        
                        PdfPTable table1 = new PdfPTable(6);
                        PdfPCell cell;
                        table1.addCell("First_Name");
                        table1.addCell("Other_Names");
                        table1.addCell("Age");
                        table1.addCell("Phone_number");
                        table1.addCell("Nationality");
                        table1.addCell("Gender ");
                        
                        while (rs.next()) {
                            String first_name = rs.getString("First_Name");
                            cell = new PdfPCell(new Phrase(first_name));
                            table1.addCell(cell);
                            String last_name = rs.getString("Other_Names");
                            cell = new PdfPCell(new Phrase(last_name));
                            table1.addCell(cell);
                            String admission = rs.getString("Age");
                            cell = new PdfPCell(new Phrase(admission));
                            table1.addCell(cell);
                            String email = rs.getString("Phone_number");
                            cell = new PdfPCell(new Phrase(admission));
                            table1.addCell(cell);
                            String contact = rs.getString("Nationality");
                            cell = new PdfPCell(new Phrase(contact));
                            table1.addCell(cell);
                         
                            String gender = rs.getString("Gender");
                            cell = new PdfPCell(new Phrase(gender));
                            table1.addCell(cell);

                        }
                        doc.add(table1);

                            doc.close();



                    } catch (Exception ex) {
                        System.err.println(ex);

                    }
              //  doc.close();
                }


       };





