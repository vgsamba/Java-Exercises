package school;

/**
 * Created by Vamsee Vennu on 3/20/2019.
 */
public class student {
    public String name;   //properties of a class
    public int studentId;
    private int numberOfCredits;
    private double gpa;

    public student(String name, int studentID, int numberOfCredits, double gpa){
        this.name= name;
        this.studentId=studentID;
        this.numberOfCredits=numberOfCredits;
        this.gpa=gpa;

    }

    public student(String name, int studentId){   //constructor overloading
        this(name, studentId, 0,0);
        //this.name=null;
        //this.studentId=0;


    }
    public static void main(String[] args){
        student st=new student("apple", 1);
        System.out.println(st.name);

    }
}
