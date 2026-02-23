package Feb_23;


class Studentt {
    String name;
    int rollNo;
    char grade;

    public Studentt(String name, int rollNo, char grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }



    void displayDetails(){
        System.out.println("Student Details :");
        System.out.println("Roll No is : "+ rollNo);
        System.out.println("Name is :"+ name);
        System.out.println("Grade is :"+grade);
        System.out.println("-------------------------------");

    }
    void updateGrade(char NewGrade){
        grade=NewGrade;
        System.out.println("Details Updated...");
    }


}
public class Student1{
    public static void main(String[] args) {
        Studentt st1=new Studentt("Govind",18,'A');
        Studentt st2=new Studentt("Om",46,'A');
        Studentt st3=new Studentt("Tejas",47,'A');

        st1.displayDetails();
        st2.displayDetails();
        st3.displayDetails();


        st1.updateGrade('B');

        st1.displayDetails();

    }
}

