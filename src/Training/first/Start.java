package Training.first;
import java.io.FileNotFoundException;

public class Start {
    public static void main(String[] arg) throws FileNotFoundException {
        People.downloadList();
        new PeopleFrame();
    }
}