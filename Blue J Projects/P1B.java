import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class P1B
{
    public static void main() {
        JPanel panel = new JPanel();
        try {
            int minimum = Integer.parseInt(JOptionPane.showInputDialog("Please input your minimum value."));
            int maximum = Integer.parseInt(JOptionPane.showInputDialog("Please input your maximum value."));
            int numInArray = Integer.parseInt(JOptionPane.showInputDialog("Please input your list length."));
            if (minimum >= maximum) {
                JOptionPane.showMessageDialog(panel, "Your minimum value is greater than or equal to your maximum value. Please try again.","Minmax error",JOptionPane.ERROR_MESSAGE);
                main();
            } else {
                int evens = 0;
                int[] numArray = new int[numInArray];
                for (int i = 0; i < numArray.length; i++) {
                    numArray[i] = (int) (Math.random() * (maximum - minimum) + minimum + 0.5);
                    System.out.print("Number: ");
                    System.out.print(numArray[i]);
                    System.out.print("  Index (0 based): ");
                    System.out.print(i);
                    if (numArray[i] % 2 == 0) {
                        evens++;
                        System.out.println("    (Even)");
                    } else {
                        System.out.println("    (Odd)");
                    }
                }
                System.out.print("Number of evens: ");
                System.out.println(evens);
                System.out.print("Number of odds: ");
                System.out.println(numArray.length - evens);
                int n = JOptionPane.showConfirmDialog(panel,"Would you like to run this program again?","Run again?",JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION) {
                    int i = JOptionPane.showConfirmDialog(panel,"Would you like to clear the terminal?","Clear terminal?",JOptionPane.YES_NO_OPTION);
                    if (i == JOptionPane.YES_OPTION) {
                        System.out.print('\f');
                    }
                    main();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panel, "Your input value cannot be parsed. Please try again.","Input error",JOptionPane.ERROR_MESSAGE);
            main();
        }
    }
}
