package classes;
import GUI.KaitekiAirlineGUI;
/**
 *
 * @author hadi
 */
public class SystemRunner {  
    
    public static void main(String args[]){
        KaitekiAirlineSystem k=new KaitekiAirlineSystem();
        KaitekiAirlineGUI gui=new KaitekiAirlineGUI();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KaitekiAirlineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaitekiAirlineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaitekiAirlineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaitekiAirlineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        gui.setVisible(true);
        
    }
}



