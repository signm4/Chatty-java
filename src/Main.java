import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class Main {
    static Server chat = new Server();
    public static void main(String args[]){
        chat.Add(new Chatter("User1", chat));
        chat.Add(new Chatter("User2", chat));
    }
}
