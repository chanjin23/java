package generic.demo1;





public class GenericDemoMain {
    public static void main(String[] args) {
        StudentInfo si = new StudentInfo(2);
        StudentPerson sp =new StudentPerson(si);
        System.out.println(sp.info.grade);
        EmployInfo ei =new EmployInfo(1);
        EmployPerson ep = new EmployPerson(ei);
        System.out.println(ep.info.rank);
    }
}
