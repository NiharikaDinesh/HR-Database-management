/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javafx.scene.image.ImageView;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dinesh
 */
public class Splash {

    public static void main(String args[]) {
        sframe f1 = new sframe("Payroll System Free Licence Version 2.0");
        f1.setVisible(true);
        int i;
        int x = 1;
        for (i = 2; i < 500; i += 4, x += 1) {
            f1.setLocation((700 - (i + x) / 2), 400 - (i / 2));
            f1.setSize(i + x, i);
            try {
                Thread.sleep(10);

            } catch (Exception e) {

            }
        }
    }

}

class sframe extends JFrame implements Runnable {

    Thread t1;

    sframe(String s) {
        super(s);
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon("C:\\Users\\dinesh\\Documents\\NetBeansProjects\\PayrollSystem\\src\\payrollsystem\\first.jpg") ;
      Image i1=c1.getImage().getScaledInstance(730,550, Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i1);

        JLabel m1=new JLabel(i2);
         add(m1);
        t1 = new Thread(this);
        t1.start();

    }

    public void run() {
        try {
            ImageView iv=new ImageView();
            javafx.scene.image.Image image = null;
            iv.setImage(image);
            Thread.sleep(5000);
            this.setVisible(false);
            Login f1 = new Login();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
