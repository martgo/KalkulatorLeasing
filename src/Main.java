import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        JFrame window = new JFrame("Kalkulator opłat Leasingowych");

//        MyJPanel panel = new MyJPanel();
//        window.add(panel);

        window.setLocation(200,  100);
//		window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();
    }
}
