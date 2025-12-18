import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the gender");
        String gender=s.next();
        System.out.println("enter the age");
        int age=s.nextInt();
        if(gender.equals("male"))
        {
            if(age>=21)
            {
                System.out.println("Eligiable");
            }
            else
            {
                System.out.println("Not eligibale");
            }
        }
        else
        {
            if(gender.equals("female"))
            {
            if(age>=18)
            {
                System.out.println("Eligiable");
            }
            else
            {
                System.out.println("Not eligibale");
            }
            }
        }
    }
}
