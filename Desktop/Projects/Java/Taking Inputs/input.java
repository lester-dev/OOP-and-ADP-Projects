import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String password = "12345";
    String enteredPassword;
    int attempts = 0;

    do {
      System.out.print("Enter password: ");
      enteredPassword = scanner.nextLine();

      if (!enteredPassword.equals(password)) {
        System.out.println("Wrong password");
        attempts++;
      }

      if (attempts == 3) {
        System.out.println("Too many attempts!");
        break;
      }

    } while (!enteredPassword.equals(password));

    if (enteredPassword.equals(password)) {
      System.out.println("Access granted!");
    }
  }
}
