
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DataCollection implements Runnable {
    public DataCollection() {
    }

    public void run() {
        while(true){
            prototype.textArea5.append("Done[3]: Assemble Data From #346WD (84MB)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea5.append("Done[2]: Assemble Data From #232WD (23MB)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea5.append("Done[4]: Assemble Data From #423WD (42MB)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea5.append("Done[3]: Assemble Data From #323WD (85MB)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea5.append("Done[2]: Assemble Data From #246WD (126MB)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea5.append("Done[4]: Assemble Data From #467WD (198MB)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea5.append("Done[3]: Assemble Data From #343WD (14MB)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea5.append("Done[2]: Assemble Data From #232WD (201MB)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea5.append("Done[3]: Assemble Data From #364WD (112MB)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
            prototype.textArea5.append("Done[4]: Assemble Data From #432WD (74MB)\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(prototype.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
    }
}