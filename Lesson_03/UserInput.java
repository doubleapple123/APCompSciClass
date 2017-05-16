import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hi, my name is RudeAI");
        System.out.println("I'd like to ask you a few questions");
        System.out.println("What is your name?");

        String name = keyboard.next();
        System.out.println("Pretty cool name I gotta say");
        System.out.println("How old are you, " + name + "?");

        int age = keyboard.nextInt();
        System.out.println("OOooooo " + age + " is getting up there!");
        System.out.println("What do you do for fun, " + name + " ?");

        String fun = keyboard.next();
        System.out.println("I thought only nerds like to " + fun);
        System.out.println("What kind of music do you like?");

        String music = keyboard.next();
        System.out.println("Booo!!!, I wouldn't even wish " + music + " on my worst enemy!");
        System.out.println("How many siblings do you have?");

        int siblings = keyboard.nextInt();
        System.out.println(siblings + ", wow I hope the rest of your family is better looking");
        System.out.println("What do you want to be when you grow up?");

        String job = keyboard.next();
        System.out.println(job);
        System.out.println("I think you'd have to be smarter to be a " + job);
        System.out.println("So, " + name + ", you like to " + fun + ",  listen to " + music + ". Good luck becoming a " + job + "." + " I'm only kiddin' " + name);

    }

}

