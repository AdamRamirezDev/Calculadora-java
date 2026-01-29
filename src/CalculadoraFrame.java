import javax.swing.JFrame;

public class CalculadoraFrame extends JFrame {

    public CalculadoraFrame(){
        setTitle("Mi calculadora");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        new CalculadoraFrame();
    }

}
