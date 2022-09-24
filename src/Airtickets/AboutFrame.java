package Airtickets;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*κλάση AboutFrame η οποία υλοποιεί ένα label και μέσα σε αυτό υπάρχουν το όνομα της εφαρμογής,το ονοματεπώνυμο του φοιτητή,αριθμό μητρώου
ημερομηνία project και screenshot από το κώδικα,για την περίπτωση που ο χρήστης επιλέξει το κουμπί about στο αρχικό frame
'Οσων αφορά τις εικόνες έγινε προσπάθεια να τυπώνονται στο frame με ImageIcon και BuffredImage,ο κώδικασ βρίσκεται σε σχόλια*/
public class AboutFrame extends JFrame {

   
	private static final long serialVersionUID = 1L;

	public void prepareui() {
		
		
		
	//	BufferedImage img = null;
	//	BufferedImage img2 = null;
	//	BufferedImage img3 = null;
	//	try {
	//	    img = ImageIO.read(new File("java ide1.jpg"));
	//	    img2 = ImageIO.read(new File("java ide2.jpg"));
	//	    img3 = ImageIO.read(new File("java ide3.jpg"));
	//	} catch (IOException e) {
	//	}
		
		//ImageIcon icon = new ImageIcon("java ide1.jpg");
		//ImageIcon icon2 = new ImageIcon("java ide2.jpg");
		//ImageIcon icon3 = new ImageIcon("java ide3.jpg");
		// JLabel label = new JLabel(icon);
		// JLabel label2 = new JLabel(icon2);
		// JLabel label3 = new JLabel(icon3);
	    //  this.add(label);
		//  this.add(label2);
		//  this.add(label3);
        JLabel aboutLbl = new JLabel();
        aboutLbl.setText("<html><h3>Java Application for airplane tickets</h3><br>Bill Xristodoulou AM:161028 <br><strong>MAE 02 13/6/2021 2020-21</strong></html>");
       
        
        this.add(aboutLbl);
     
        //setup the frame
        this.setSize(400, 400);
      
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("About");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);
    }

	

}
