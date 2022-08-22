import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WordCounter extends JFrame implements ActionListener{

    JLabel label1 = new JLabel("Char: ");
    JLabel label2 = new JLabel("Words: ");
    JTextArea textArea = new JTextArea();
    JButton button = new JButton("count");

    public WordCounter(){

        setTitle("Word Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1.setBounds(50,50,100,20);
        label2.setBounds(50,80,100,20);
        textArea.setBounds(50,110,300,200);
        button.setBounds(50,320, 80,30);//x,y,w,h
        button.addActionListener(this);

        add(label1);
        add(label2);
        add(textArea);
        add(button);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button) {
            String text = textArea.getText();
            label1.setText("Characters: " + text.length());
            String words[] = text.split("\\s");
            label2.setText("Words: " + words.length);
        }
    }
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
    }
}