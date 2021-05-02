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
//cars
            JLabel calculator = new JLabel("Kalkulator opłat leasingowych dotyczących samochodu osobowego");
            calculator.setBounds(150, 20, 500, 30);
            add(calculator);
            JLabel carBrand = new JLabel("Samochód");
            carBrand.setBounds(50, 50, 100, 30);
            add(carBrand);
            String calculatorPosition []={"X","X", "X","Inne"};
            JList opis = new JList(calculatorPosition);
            opis.setBounds(80, 75, 250, 100);
            add(opis);
            JButton wybierz = new JButton("Wybierz");
            wybierz.setBounds(200, 175, 90, 30);
            add(wybierz);

            //data
            JLabel textData = new JLabel("Dane");
            textData.setBounds(50, 200, 200, 30);
            add(textData);
            JLabel textFirm = new JLabel("Marka:");
            textFirm.setBounds(50, 225, 60, 30);
            add(textFirm);
            String textName = textFirm.getText();
            JTextField textCarFirm = new JTextField();
            textCarFirm.setBounds(100, 225, 200, 30);
            add(textCarFirm);

            JLabel carType = new JLabel("Typ pojazdu");
            carType.setBounds(50, 270, 100, 30);
            add(carType);

            String[] selectType ={"Osobowy","Inny"};
            JComboBox miecze =new JComboBox(selectType);
            miecze.setBounds(130, 270,120,30);
            add(miecze);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(750, 600);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {


        }
    }

