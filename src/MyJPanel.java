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

            JLabel kalkulator = new JLabel("Kalkulator opłat leasingowych dotyczących samochodu osobowego");
            kalkulator.setBounds(150, 20, 500, 30);
            add(kalkulator);
            String kalkulatorPozycje []={"X","X", "X","X"};
            JList opis = new JList(kalkulatorPozycje);
            opis.setBounds(100, 75, 250, 100);
            add(opis);
            JLabel textRejestracja = new JLabel("Inne");
            textRejestracja.setBounds(100, 200, 200, 30);
            add(textRejestracja);
            JLabel nazwa = new JLabel("Nazwa:");
            nazwa.setBounds(10, 225, 60, 30);
            add(nazwa);

            JButton wybierz = new JButton("Wybierz");
            wybierz.setBounds(2, 275, 90, 30);
            add(wybierz);
            JList wybieranie = new JList();
            wybieranie.setBounds(100, 275, 250, 100);
            add(wybieranie);

            JButton zarejestruj = new JButton("Zarejestruj");
            zarejestruj.setBounds(100, 500, 95, 30);
            add(zarejestruj);

            JButton wyczysc = new JButton("Wyczyść");
            wyczysc.setBounds(200, 500, 95, 30);
            add(wyczysc);

            JButton i = new JButton("Import");
            i.setBounds(2, 400, 95, 30);
            add(i);

            JTextField sciezka = new JTextField();
            sciezka.setBounds(100, 415, 200, 30);
            add(sciezka);

            JSeparator separator = new JSeparator();
            separator.setOrientation(SwingConstants.VERTICAL);
            separator.setBounds(250,250,2,500);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(750, 600);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

