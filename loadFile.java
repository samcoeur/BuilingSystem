package billing.managementsystem;


import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;


public class loadFile {
    
    
     JFileChooser chooser ;
      String filename ="";
      
      
      loadFile(){filename="" ;};
      
      void pathToImage(JLabel image){
      chooser = new JFileChooser();
      chooser.showOpenDialog(null);
      File f=chooser.getSelectedFile();
      ImageIcon icon = new ImageIcon(f.toString());
      Image img = icon.getImage();
      Image imscale = img.getScaledInstance(image.getWidth(), image.getHeight(),Image.SCALE_SMOOTH);
      ImageIcon iconscaled = new ImageIcon(imscale);
      image.setIcon(iconscaled);
      filename = f.getAbsolutePath();
    
      }
      
      
      
      void displaylabelIcon(JLabel image, String link){
      ImageIcon icon = new ImageIcon(link);
      Image img = icon.getImage();
      Image imscale = img.getScaledInstance(image.getWidth(), image.getHeight(),Image.SCALE_SMOOTH);
      ImageIcon iconscaled = new ImageIcon(imscale);
      image.setIcon(iconscaled);
      
      };
      
    
    
}
