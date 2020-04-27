
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;



public class HeartBeatSending implements Runnable {
    public HeartBeatSending() {
    }
    
    public void run() {
        while(true){
            prototype.textArea9.append("Done[546WD]: Send heartbeat to MD[3]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
            System.out.print("Enter first number- ");
            int a= sc.nextInt();
            prototype.textArea9.append("Done[632WD]: Send heartbeat to MD[2]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[723WD]: Send heartbeat to MD[1]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[123WD]: Send heartbeat to MD[1]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[7234WD]: Send heartbeat to MD[2]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[867WD]: Send heartbeat to MD[4]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[643WD]: Send heartbeat to MD[3]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[132WD]: Send heartbeat to MD[2]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[364WD]: Send heartbeat to MD[1]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[532WD]: Send heartbeat to MD[4]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
    }
}