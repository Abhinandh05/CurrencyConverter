import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CurrencyConverter {

    private JTextField inputTextField;
    private JLabel outputLabel;

    public CurrencyConverter() {

        JFrame jf = new JFrame("Currency Converter");
        jf.setLayout(null);
        jf.setSize(600, 200);
        jf.setLocationRelativeTo(null); 

        JLabel enterLabel = new JLabel("Enter Amount :");
        enterLabel.setBounds(30, 30, 100, 25);
        jf.add(enterLabel);

        inputTextField = new JTextField();
        inputTextField.setBounds(140, 30, 200, 25);
        jf.add(inputTextField);

        

        JLabel resultLabel = new JLabel("Converted amount:");
        resultLabel.setBounds(30, 80, 150, 25);
        jf.add(resultLabel);

        outputLabel = new JLabel();
        outputLabel.setBounds(180, 80, 300, 25);
        jf.add(outputLabel);

        JButton dollarButton = new JButton("Dollar");
        dollarButton.setBounds(30, 120, 100, 25);
        dollarButton.addActionListener(e -> convertToCurrency("Dollar"));
        jf.add(dollarButton);

        JButton poundButton = new JButton("Pound");
        poundButton.setBounds(150, 120, 100, 25);
        poundButton.addActionListener(e -> convertToCurrency("Pound"));
        jf.add(poundButton);

        JButton euroButton = new JButton("Euro");
        euroButton.setBounds(270, 120, 100, 25);
        euroButton.addActionListener(e -> convertToCurrency("Euro"));
        jf.add(euroButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void convertCurrency() {
        
        String amountText = inputTextField.getText();
        try {
            double amount = Double.parseDouble(amountText);

          
            outputLabel.setText(Double.toString(amount));
        } catch (NumberFormatException e) {
          
            outputLabel.setText("Invalid input");
        }
    }

    private void convertToCurrency(String currency) {
        
        String amountText = inputTextField.getText();
        try {
            double amount = Double.parseDouble(amountText);
            double convertedAmount;

           
            switch (currency) {
                case "Dollar":
                    convertedAmount = amount * 83;
                    break;
                case "Pound":
                    convertedAmount = amount * 104.85; 
                    break;
                case "Euro":
                    convertedAmount = amount * 89.69; 
                    break;
                default:
                    convertedAmount = amount; 
            }

           
            outputLabel.setText(Double.toString(convertedAmount));
        } catch (NumberFormatException e) {
          
            outputLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
