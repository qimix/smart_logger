package Logger;
import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    int count = 1;
    String  str1 = "INFO";
    String  str2 = "ERROR";
    @Override
    public void log(String msg){
        if(msg.matches("ERROR")){}
        System.out.println(str2 + "#" + count + LocalDateTime.now() + " " + msg);
    } else {
        System.out.println(str1 + "#" + count + LocalDateTime.now() + " " + msg);
    }
}
