package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentName =new String[3];
        int[] studentAge =new int[3];
        int[] studentGrade =new int[3];

        studentName[0]="이찬진";
        studentName[1]="박향은";
        studentName[2]="차민정";


        for (int i = 0; i < studentAge.length ; i++) {
            studentAge[i]=(1+i)*10;
        }
        for (int i = 0; i < studentGrade.length ; i++) {
            studentGrade[i] =i;
        }

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("이름:" +studentName[i]+" 나이: "+ studentAge[i]+" 성적: "+studentGrade[i]);

        }
    }
}
