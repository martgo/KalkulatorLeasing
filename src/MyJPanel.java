import jdk.jfr.Percentage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class MyJPanel extends JPanel implements ActionListener {
        public MyJPanel(){
            setLayout(null);
//cars
            JLabel calculator = new JLabel("Kalkulator opłat leasingowych dotyczących samochodu osobowego");
            calculator.setBounds(150, 20, 500, 30);
            add(calculator);
            JLabel carBrand = new JLabel("Samochód");
            carBrand.setBounds(130, 50, 100, 30);
            Font font = new Font("Lucida Grande", Font.BOLD,12);
            carBrand.setFont(font);
            add(carBrand);
            String calculatorPosition []={"Mazda CX5","Mazda CX3", "Alfa Romeo","Dodaj"};
            JList opis = new JList(calculatorPosition);
            opis.setBounds(50, 75, 250, 100);
            add(opis);
            JButton wybierz = new JButton("Wybierz");
            wybierz.setBounds(200, 175, 90, 30);
            add(wybierz);

            //data
            JLabel textData = new JLabel("Dane");
            textData.setBounds(50, 200, 200, 30);
            textData.setFont(font);
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
            String[] selectType ={"2015","2016","2017","2018","2019","2020","2021"};
            JComboBox years =new JComboBox(selectType);
            years.setBounds(150, 300,120,30);
            add(years);


            JLabel dateOfPurchase = new JLabel("Data zakupu");
            dateOfPurchase.setBounds(50, 350, 100, 30);
            add(dateOfPurchase);
            String[] selectDate ={"2015","2016","2017","2018","2019","2020","2021"};
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
            choice1.setBounds(10, 500, 375, 20);
            add(choice1);
            JRadioButton choice2 = new JRadioButton("Pojazd elektryczny o wartości powyżej 225.000 zł");
            choice2.setBounds(10, 525, 375, 30);
            add(choice2);

            ButtonGroup group = new ButtonGroup();
            group.add(choice1);
            group.add(choice2);

            //druga strona

            JLabel calculatorText = new JLabel("Kalkulator");
            calculatorText.setBounds(575, 50, 200, 30);
            Font fontCalculator = new Font("Lucida Grande", Font.BOLD,20);
            calculatorText.setFont(font);
            add(calculatorText);
            JLabel calculatorLabel = new JLabel("Opis:");
            calculatorLabel.setBounds(450, 75, 60, 30);
            add(calculatorLabel);
            String calculatorName = textFirm.getText();
            JTextArea calculatorCar = new JTextArea();
            calculatorCar.setBounds(500, 75, 225, 100);
            add(calculatorCar);

            JLabel deduction = new JLabel("Prawo do odliczenia VAT");
            deduction.setBounds(450, 180, 200, 30);
            add(deduction);
            String[] deductionSelect ={String.valueOf(100.0) + "%",String.valueOf(50.0)+ "%","Brak"};
            String[] deductionSelect1 ={String.valueOf(100.0) + "%",String.valueOf(50.0)+ "%","Brak"};
            JComboBox deductionBox =new JComboBox(deductionSelect);
            deductionBox.setBounds(620, 180,100,30);
            add(deductionBox);

            JLabel capex = new JLabel("Opłaty leasingowe w części kapitałowej:");
            capex.setBounds(450, 215, 300, 30);
            add(capex);

            JLabel capexNet = new JLabel("Kwota Netto");
            capexNet.setBounds(450, 250, 150, 30);
            add(capexNet);
            JTextField capexNetField = new JTextField();
            capexNetField.setBounds(550, 250, 125, 30);
            add(capexNetField);

            JLabel capexVat = new JLabel("Kwota Vat");
            capexVat.setBounds(450, 285, 150, 30);
            add(capexVat);
            JTextField capexVatField = new JTextField();
            capexVatField.setBounds(550, 285, 125, 30);
            add(capexVatField);

            JLabel interest = new JLabel("Opłaty leasingowe w części odsetkowej:");
            interest.setBounds(450, 325, 350, 30);
            add(interest);

            JLabel interestNet = new JLabel("Kwota Netto");
            interestNet.setBounds(450, 360, 150, 30);
            add(interestNet);
            JTextField interestNetField = new JTextField();
            interestNetField.setBounds(550, 360, 125, 30);
            add(interestNetField);

            JLabel interestVat = new JLabel("Kwota Vat");
            interestVat.setBounds(450, 395, 150, 30);
            add(interestVat);
            JTextField interestVatField = new JTextField();
            interestVatField.setBounds(550, 395, 125, 30);
            add(interestVatField);

            JButton count = new JButton("Oblicz");
            count.setBounds(500, 440, 90, 30);
            count.setForeground(Color.GREEN);
            count.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    int contents = Integer.parseInt(carValueText.getText());
                    int minCarValue = 150000;
                    int result = (minCarValue * 100) / contents;
                    if (contents < 150000) {
                        JLabel error = new JLabel("Błąd!");
                        error.setBounds(400, 470, 30, 10);
                        error.setVisible(true);
                        add(error);
                        System.out.println("błąd!");
                    } else {
                        System.out.println("Proporcja w jakiej kwota 150.000,00 zł pozostaje do wartości samochodu osobowego: " + result + "%");
                    }
                    int contents1 = Integer.parseInt(capexNetField.getText());
                    var netSum = (result * contents1) / 100;
                    if (contents < 150000) {
                        JLabel error = new JLabel("Błąd!");
                        error.setBounds(400, 470, 30, 10);
                        error.setVisible(true);
                        add(error);
                        System.out.println("błąd!");
                    } else {
                        System.out.println("Opłata leasingowa w części kapitałowej, stanowiąca koszt uzyskania przychodu: " + netSum + " złotych");
                    }
                    int contents2 = Integer.parseInt(capexVatField.getText());
                    int contents3 = Integer.parseInt(interestNetField.getText());
                    int contents4 = Integer.parseInt(interestVatField.getText());
                    if (contents < 150000) {
                        JLabel error = new JLabel("Błąd!");
                        error.setBounds(400, 470, 30, 10);
                        error.setVisible(true);
                        add(error);
                        System.out.println("błąd!");
                    } else {
                        System.out.println("Opłata leasingowa w części odsetkowej, stanowiąca koszt uzyskania przychodu: " + contents3 + " złotych");
                    }
                    if (contents < 150000) {
                        JLabel error = new JLabel("Błąd!");
                        error.setBounds(400, 470, 30, 10);
                        error.setVisible(true);
                        add(error);
                        System.out.println("błąd!");
                    } else {
                        System.out.println("Suma opłat leasingowych stanowiących koszt uzyskania przychodu: " + (contents3 + netSum) + " złotych");
                    }
                }
            });
            add(count);

            JTextArea countField = new JTextArea();
            countField.setBounds(450, 475, 200, 50);
            add(countField);

            JButton save = new JButton("Zapisz");
            save.setBounds(500, 525, 90, 30);
            save.setForeground(Color.red);
            add(save);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(750, 600);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {


        }
    }

