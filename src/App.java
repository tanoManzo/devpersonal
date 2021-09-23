
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    private static final int MAX_NUM_Student=2;
    public static void main(String[] args) throws Exception {

        ArrayList<Student> s=new ArrayList<Student>();

        for(int i=0;i<MAX_NUM_Student;i++){
            s.add(new Student());
        }
        
        s.get(0).setAge(10);
        s.get(1).setAge(5);

        System.out.println(s.get(0).getAge());
        System.out.println(s.get(1).getAge());

        Collections.sort(s);

        System.out.println(s.get(0).getAge());
        System.out.println(s.get(1).getAge());
        
    }
}
