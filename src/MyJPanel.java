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



            JLabel carModel = new JLabel("Model");
            carModel.setBounds(50, 270, 100, 30);
            add(carModel);
            JTextField textcarModel = new JTextField();
            textcarModel.setBounds(100, 270, 200, 30);
            add(textcarModel);

            JLabel carType = new JLabel("Rok produkcji");
            carType.setBounds(50, 300, 100, 30);
            add(carType);
            String[] selectType ={"1990-1995","1995-2000","2001-2005"};
            JComboBox years =new JComboBox(selectType);
            years.setBounds(150, 300,120,30);
            add(years);


            JLabel dateOfPurchase = new JLabel("Data zakupu");
            dateOfPurchase.setBounds(50, 350, 100, 30);
            add(dateOfPurchase);
            String[] selectDate ={"X", "Inne"};
            JComboBox dateSelect =new JComboBox(selectDate);
            dateSelect.setBounds(150, 350,120,30);
            add(dateSelect);

            JLabel engine = new JLabel("Silnik");
            engine.setBounds(50, 400, 100, 30);
            add(engine);
            JTextField textEngine = new JTextField();
            textEngine.setBounds(100, 400, 200, 30);
            add(textEngine);

            JLabel carValue = new JLabel("Wartość pojazdu");
            carValue.setBounds(50, 450, 150, 30);
            add(carValue);
            JTextField carValueText = new JTextField();
            carValueText.setBounds(175, 450, 125, 30);
            add(carValueText);

            JRadioButton choice1 = new JRadioButton("Samochód osobowy o wartości powyżej 150.000 zł");
            choice1.setBounds(10, 500, 500, 30);
            add(choice1);
            JRadioButton choice2 = new JRadioButton("Pojazd elektryczny o wartości powyżej 225.000 zł");
            choice2.setBounds(10, 525, 500, 30);
            add(choice2);

            ButtonGroup group = new ButtonGroup();
            group.add(choice1);
            group.add(choice2);

            //druga strona

            JLabel calculatorText = new JLabel("Kalkulator");
            calculatorText.setBounds(500, 50, 200, 30);
            add(calculatorText);
            JLabel calculatorLabel = new JLabel("Opis:");
            calculatorLabel.setBounds(450, 75, 60, 30);
            add(calculatorLabel);
            String calculatorName = textFirm.getText();
            JTextArea calculatorCar = new JTextArea();
            calculatorCar.setBounds(500, 75, 200, 100);
            add(calculatorCar);

            JLabel deduction = new JLabel("Prawo do odliczenia VAT");
            deduction.setBounds(450, 200, 200, 30);
            add(deduction);
            String[] deductionSelect ={"100%","50%","Brak"};
            JComboBox deductionBox =new JComboBox(deductionSelect);
            deductionBox.setBounds(620, 200,100,30);
            add(deductionBox);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(750, 600);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {


        }
    }

