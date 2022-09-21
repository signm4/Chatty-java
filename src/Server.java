import java.util.ArrayList;

public class Server {
    private ArrayList<IChatter> Chatters = new ArrayList<>();
    public void Add(IChatter x) { Chatters.add(x); }
    public void  NewMessage(String From, String Message) {
        for(IChatter chatter : Chatters) chatter.NewMessage(From, Message);
    }
}
