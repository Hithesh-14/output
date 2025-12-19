import java.util.Scanner;

public class CustomException {

  public static void main(String[] args) {
    Bank b = new Bank();
    b.initiate();
  }
}

class ATM {
  int acc_number = 12345678;
  int password = 1111;
  int AN, Pwd;
  Scanner s = new Scanner(System.in);

  void acceptInput() {
    System.out.println("Enter the account no:");
    AN = s.nextInt();
    System.out.println("Enter the password:");
    Pwd = s.nextInt();
  }

  void verify() {
    if (acc_number == AN && password == Pwd) {
      System.out.println("collect your money");

    } else {
      System.out.println("Invalid card details");
    }
  }
}

class Bank {
  void initiate() {
    ATM atm = new ATM();
    atm.acceptInput();
    atm.verify();
  }
}
