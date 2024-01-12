package Builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.builder().setName("Kiran").setBatchName("Aug").setGradYear(2021).setId(1).setPsp(98).setYoe(3).build();
        System.out.println(student);
    }
}
