import javax.swing.JOptionPane;
public class adim2 {
    public static void main(String[] args){
        String[] options = {"Istanbul", "Ankara", "Bursa", "Izmir"};
        int x = JOptionPane.showOptionDialog(null, "Turkyenin Baskenti",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println(x);
    }
}
