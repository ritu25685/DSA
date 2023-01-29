public class OOPs {
    public static void main(String[] args){
        Student s1 = new Student(); //default constructor
        Student s2 = new Student("Ritu",12);
        Student s3 = new Student(s2);
        

    }
}
    
    class Student{
        String name;
        int roll;
        Student(){
            System.out.println("This is a Non parametetrized constructor");
        }
        Student(String name, int roll){
            this.name = name;
            this.roll = roll;
            System.out.println(name);
            System.out.println(roll);
        }
        
    }
    
