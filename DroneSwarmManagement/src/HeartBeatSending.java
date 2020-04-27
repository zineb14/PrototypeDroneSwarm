
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;



public class HeartBeatSending implements Runnable {
    public HeartBeatSending() {
    }
    
    public void run() {
        while(true){
            prototype.textArea9.append("Done[346WD]: Send heartbeat to MD[3]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[232WD]: Send heartbeat to MD[2]\n");
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
            prototype.textArea9.append("Done[112WD]: Send heartbeat to MD[1]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[246WD]: Send heartbeat to MD[2]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[467WD]: Send heartbeat to MD[4]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[343WD]: Send heartbeat to MD[3]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[232WD]: Send heartbeat to MD[2]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[164WD]: Send heartbeat to MD[1]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea9.append("Done[432WD]: Send heartbeat to MD[4]\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
    }
}