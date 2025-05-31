package interest;

import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.SwingUtilities;

public class Interest {

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        
        SwingUtilities.invokeLater(() -> {
            Form form = new Form();
            form.show();
        });
    }
}
