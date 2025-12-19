public class AbstractProblem {
public static void main(String[] args) {
  }
}
abstract class Vaccine {

    int age;
    String nationality;
    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("Eligible for First Dose");
        } else {
            System.out.println("Not eligible for First Dose");
        }
    }

    
    void secondDose() {
        System.out.println("Second Dose can be taken after 84 days after the firstDose");
    }
}
