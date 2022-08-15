import java.util.Scanner;

public class MyChatterBox {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = S.nextLine();
        System.out.println("Nice to meet you, " + name + "! How are you?");
        
        Scanner age = new Scanner(System.in);
        System.out.println("How old are you?");
        String myAge = age.nextLine();
        System.out.println(myAge + "!? You're a youngster!");
        
        Scanner hobby = new Scanner(System.in);
        System.out.println("What do you like to do during your free time?");
        String myHobby = hobby.nextLine();
        System.out.println(myHobby + "? Sounds like a lot of fun!");
        
        Scanner location = new Scanner(System.in);
        System.out.println("Where do you live?");
        String myLocation = location.nextLine();
        System.out.println("That's one hell of a commute to Newark.");
        
        Scanner subject = new Scanner(System.in);
        System.out.println("What subjects are you interested in?");
        String mySubject = subject.nextLine();
        System.out.println("Jeez, you're into " + mySubject + "? What a nerd!");      
        }
}
