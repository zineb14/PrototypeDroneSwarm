
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;



public class HeartBeat implements Runnable {
    public HeartBeat() {
    }
    
    public void run() {
        while(true){
            prototype.textArea7.append("Done[3]: Ack from #546WD\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
            System.out.print("Enter first number- ");
            int a= sc.nextInt();
            prototype.textArea7.append("Done[2]: Ack from #632WD\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[4]: Ack from #723WD\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[3]: Ack from #123WD\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[2]: Ack from #746WD\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[4]: Ack from #867WD\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[3]: Ack from #643WD\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[2]: Ack from #132WD\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[3]: Ack from #364WD\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[4]: Ack from #532WD\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
    }
}