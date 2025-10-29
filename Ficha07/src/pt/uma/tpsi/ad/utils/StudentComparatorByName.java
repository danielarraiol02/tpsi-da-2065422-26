package pt.uma.tpsi.ad.utils;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {//Receber os dois pq n temos acesso ao this + criar seletor

        return o1.getFullName().compareTo(o2.getFullName());

    }

}
