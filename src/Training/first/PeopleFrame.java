package Training.first;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PeopleFrame extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JTextField nameSearch = new JTextField(10);
    JButton button = new JButton("Поиск");
    JTextField name = new JTextField(10);
    JTextField number = new JTextField(10);

    public PeopleFrame() {
        add(nameSearch);
        add(button);
        button.addActionListener(this);
        add(name);
        add(number);
        setTitle("Справочник");
        setLocation(500, 200);
        setLayout(new GridLayout(2, 2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }
}
