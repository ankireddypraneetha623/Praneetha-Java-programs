class Institute {
    String name;
    Institute(String name) {
        this.name = name;
        System.out.println("Institute name: " + name);
    }
}

class School extends Institute {
    String student_name = "swathi";
    int roll_no = 90;
    int marks = 30;
    School(String instituteName) {
        super(instituteName);
    }
    void display() {
        System.out.println("Student Name: " + student_name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + marks);
        if(marks>80){
            System.out.println("1st grade");
        }
        else if(marks>60){
            System.out.println("2nd grade");
        }
        else if(marks>40){
            System.out.println("3rd grade");
        }
        else{
            System.out.println("Sorry!  "+student_name+" you are failed. better luck next time");
        }
    }
}
public class  schoolManagment {
    public static void main(String[] args) {
        School s = new School("Annamacharya");
        s.display();
    }
}
