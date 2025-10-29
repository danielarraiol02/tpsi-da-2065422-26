package pt.uma.tpsi.ad.utils;

import java.util.Comparator;

public class StudentComparatorByCourses implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourses().size() - o2.getCourses().size();
    }
}
