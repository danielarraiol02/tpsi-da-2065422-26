package pt.uma.tpsi.ad.utils;

public class Course {

    private int ects;
    private String name;

    public Course(){
        ects = 0;
        name = "";
    }
    public Course(int ects, String name){
        this.ects = ects;
        this.name = name;
    }

}
