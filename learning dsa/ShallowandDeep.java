public class ShallowandDeep {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        for(int i=0;i<3;i++){
            System.out.println(s1.marks[i]);
        }



    }
    
}
class Student{
    String name;
    int roll;
    int marks[];
    Student(){
        marks = new int[3];
    }
    Student(Student s1){
            this.marks = s1.marks;
    }
    
}
