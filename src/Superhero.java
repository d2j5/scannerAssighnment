import java.util.Scanner;
public class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero.\nWho is the hero of our story?");
        String hero = scanner.nextLine();
        System.out.println("What is their superpower");
        String superpower = scanner.nextLine();
        System.out.println("There once was a superhero named " +hero+" , who had the power of "+superpower+".\n As they grew older, "+hero+" saw that the world needed them.\n "+hero+" used their ability to "+superpower+" to save the world.");


    }
}
