package pt.uma.tpsi.ad.utils;

public class Student extends User implements Comparable<Student>{

    private int number;
    private Gender gender;
    private Courses courses;

    public Student(){
        super();
        number = 0;
        gender = Gender.OTHER;
        courses = new Courses();
    }

    public Student(int number, String firstName, String lastName,  Gender gender, Courses courses){

        super(firstName, lastName);
        this.number = number;
        this.gender = gender;
        this.courses = courses;

    }



    public Courses getCourses() {
        return courses;
    }


    @Override
    public int compareTo(Student o) {
        return this.number - o.number;
    }

    @Override
    public void createEmail() {
        email = number + "@student.uma.pt";
    }
}
