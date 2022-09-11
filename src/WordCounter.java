import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WordCounter extends JFrame implements ActionListener{
    //erstellt zwei labels, eine textarea und einen button
    JLabel label1 = new JLabel("Char: ");
    JLabel label2 = new JLabel("Words: ");
    JTextArea textArea = new JTextArea();
    JButton button = new JButton("count");

    public WordCounter(){
        //setzt den Titel
        setTitle("Word Counter");
        //bricht das Program ab wenn das GUI Fester sich schliesst
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set Bounds benutzt man um die Position und die Grösse eines Elements zu setzten
        //setbounds(int x(x-coordinate), int y(y-coordinate), int width (breite), int hight (höhe)
        label1.setBounds(50,50,100,20);
        label2.setBounds(50,80,100,20);
        textArea.setBounds(50,110,300,200);
        button.setBounds(50,320, 80,30);
        //einen Actionlistener hinzufügen
        //ein ActionListener definiert eine Aktion wenn ein User im Programm was macht
        button.addActionListener(this);

        //wir fügen die GUI komponente zum contentPane
        //da wir alle componente mit setBounds bereits plaziert haben, müssen wir dem ContentPane kein Layout geben
        //das default Layout ist das FlowLayout
        //BorderLayout: Nord, West, East, South, Center
        //Flowlayout: alles in einer reihe, wechselt auf eine andere reihe nur wenn das GUI Grenzen hat
        add(label1);
        add(label2);
        add(textArea);
        add(button);

        //grösse des GUI's
        setSize(400,400);
        //bedeutet das wir den default manager benutzen.
        //ist eigentlich unnötig
        setLayout(null);
        //die Sichtbarkeit des GUI's auf wahr
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        //wenn der Button gedrückt wird
        if(e.getSource() == button) {
            //wird aus der TextArea der Text gehollt und in die Variable text gespeichert
            String text = textArea.getText();
            //in Label 1 wird die anzahl der Chars angezeigt indem man die länge des Strings anzeigt
            label1.setText("Characters: " + text.length());
            //erstellen ein array in dem wir mit der hilfe von split(), den text nach den leerzeichen trennen
            //split() ist eine library (vorgeschriebener code, die mit jdk mitkommt)
            String[] words = text.split("\\s");
            //in diesem label wird die anzahl wörter im Array gezählt
            label2.setText("Words: " + words.length);
        }
    }
    //main methode
    public static void main(String[] args) {
        //erstellt das GUI
        WordCounter wordCounter = new WordCounter();
    }
}