package billing.managementsystem;


import com.itextpdf.text.Paragraph;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.*;
import javax.swing.JFileChooser;


public class PDFAcessFile {
    
    Document doc ; 
    String pathFile ; 
    
    
    PDFAcessFile(){ 
  
   
  };
    
   public void createNewPDF(Paragraph parag , String filename ){try {
      doc = new Document();String path="/Users/admin/NetBeansProjects/Billing ManagementSystem/src/billing/managementsystem/pdffile/"+filename+".pdf";
      PdfWriter.getInstance(doc,new FileOutputStream(path));
     
      doc.open();
      doc.add(parag);
      doc.close();
      
  }catch(Exception e){System.out.print(e);};
   } 
    
    
    public String browser(){
       JFileChooser chooser = new JFileChooser();
      chooser.showOpenDialog(null);
      File f=chooser.getSelectedFile();
      return f.getAbsolutePath().toString();
    };
    
   public void openPDFFile(String pathFile) {
    try{
    File pdffile = new File(pathFile);
   if(Desktop.isDesktopSupported()) Desktop.getDesktop().open(pdffile);
    }catch (Exception e){};
   };
    
   public void editPdf(Paragraph p,String path){
       try{
   PdfReader read = new PdfReader(path);
  
   PdfStamper stamper = new PdfStamper(read, new FileOutputStream(path));
 stamper.addFileAttachment(p.toString(), null);
 
   
   
           }catch(Exception e){};
   };
   
   
   
}
