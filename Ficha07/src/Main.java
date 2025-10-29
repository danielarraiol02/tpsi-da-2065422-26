import pt.uma.tpsi.ad.utils.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {

        for (Menu op : Menu.values()) {
            System.out.println(op);
        }

        Student s0 = new Student();

        Courses c = new Courses();
        c.add(new Course(6, "AD"));
        c.add(new Course(6, "IP"));
        c.add(new Course(6, "SGBDI"));

        Student s1 = new Student(9887, "Pedro", "Silva", Gender.MALE, c);
        s1.createEmail();
        //Frequencia
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s0);
        students.add(s1);

        Collections.sort(students);
        //Frequencia

        //Collections.sort(students, new StudentComparatorByName());
    }
}