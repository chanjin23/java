package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1=createStudent("학생1",15,90);
        System.out.println("student1의 참조값 : " + student1);
        Student student2=createStudent("학생2",16,80);
        System.out.println("student2의 참조값 : " + student2);

        studentPrint(student1);
        studentPrint(student2);

    }

    static Student createStudent(String name, int age, int grade){
        Student student =new Student();
        System.out.println("student의 참조값 : " + student);
        student.name= name;
        student.age =age;
        student.grade= grade;
        return student;
    }

    static void studentPrint(Student student){
        System.out.println("이름 : " + student.name +"나이:" +student.age+"성적:" +student.grade);
    }
}
