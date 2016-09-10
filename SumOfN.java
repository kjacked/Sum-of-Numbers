import javax.swing.JOptionPane;

public class SumOfN {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Enter a numeric value.");
        int numericVal = Integer.parseInt(userInput);
        int sum = numericVal;
        for (int i = 0; i < numericVal; i++) {
            sum += (i) ;
        }
        System.out.println(sum);
        }
    }