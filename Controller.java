import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Controller implements ActionListener {
    public Controller(Viewer viewer) {
        Model model = new Model(viewer);
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println("Hello");
    }
}