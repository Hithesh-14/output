class Student {
    private String rollNo;
    private String name;
    private String email;
    private int age;
    public void setData(String r, String n, String e, int a) {
        rollNo = r;
        name = n;
        email = e;
        age = a;
    }

    // getter methods (read values)
    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
s
public class ExampleEncapsulation {
    public static void main(String[] args) {

        Student s = new Student();

        s.setData("21", "Sai", "sai@gmail.com", 21);

        System.out.println("The student roll no: " + s.getRollNo());
        System.out.println("The student name: " + s.getName());
        System.out.println("The student email: " + s.getEmail());
        System.out.println("The student age: " + s.getAge());
    }
}
