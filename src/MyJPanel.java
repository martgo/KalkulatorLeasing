import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class MyJPanel extends JPanel implements ActionListener {
        public MyJPanel(){
            setLayout(null);

            JLabel calculator = new JLabel("Kalkulator opłat leasingowych dotyczących samochodu osobowego");
            calculator.setBounds(150, 20, 500, 30);
            add(calculator);
            JLabel carBrand = new JLabel("Samochód:");
            carBrand.setBounds(90, 50, 100, 30);
            add(carBrand);
            String calculatorPosition []={"X","X", "X","Inne"};
            JList opis = new JList(calculatorPosition);
            opis.setBounds(100, 75, 250, 100);
            add(opis);
            JButton wybierz = new JButton("Wybierz");
            wybierz.setBounds(270, 175, 90, 30);
            add(wybierz);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(750, 600);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

