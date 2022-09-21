import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;

public class Chatter extends JFrame implements IChatter, ActionListener {
    JPanel jp = new JPanel();
    JTextArea ta = new JTextArea();
    JScrollPane sp = new JScrollPane(ta);
    JTextField message = new JTextField();
    Button button = new Button("Send");

    Server _server;

    public void actionPerformed(ActionEvent e) {
        _server.NewMessage(this.getTitle(), message.getText());
        message.setText("");
    }

    public void NewMessage(String From, String Message) {
        ta.append(From + ": " + Message + "\n");
    }

//    public void keyTyped(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_ENTER){
//            _server.NewMessage(this.getTitle(), message.getText());
//            message.setText("");
//
//        }
//    }


    public Chatter(String name, Server server) {
        super(name);
        _server = server;
        getContentPane().add(jp, BorderLayout.CENTER);
        jp.setLayout(new BoxLayout(jp, BoxLayout.PAGE_AXIS));

        message.setMaximumSize(new Dimension(300, 300));
        sp.setSize(500, 580);
        ta.setBounds(1, 5, 500, 100);

        jp.add(sp);
        jp.add(message);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        jp.add(button);
        button.addActionListener(this);
        //message.addKeyListener(this);
    }


}
