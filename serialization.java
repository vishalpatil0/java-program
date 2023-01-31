
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialization {
    public static void main(String[] args) {
        File f = new File("SerializationDemo.txt");
        try {
           FileInputStream fis = new FileInputStream(f);
           ObjectInputStream ois = new ObjectInputStream(fis);
           Demo d = (Demo) ois.readObject();
           System.out.println(d.i);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
class Demo implements Serializable{
    public int i;
}
