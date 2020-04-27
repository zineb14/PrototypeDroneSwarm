
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;



public class HeartBeatReceiving implements Runnable {
    public HeartBeatReceiving() {
    }
    
    public void run() {
        while(true){
            prototype.textArea7.append("Done[3]: Ack from #346WD   (8 seconds to arrive)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[2]: Ack from #232WD   (3 seconds to arrive)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[4]: Ack from #423WD   (5 seconds to arrive)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[3]: Ack from #323WD   (4 seconds to arrive)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[2]: Ack from #246WD   (9 seconds to arrive)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[4]: Ack from #467WD   (6 seconds to arrive)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[3]: Ack from #343WD   (7 seconds to arrive)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[2]: Ack from #232WD\n   (4 seconds to arrive)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[3]: Ack from #364WD    (5 seconds to arrive)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea7.append("Done[4]: Ack from #432WD    (5 seconds to arrive)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
    }
}