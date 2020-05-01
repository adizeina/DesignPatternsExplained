package factory;

import java.util.Scanner;

/** This class is the main */

public class Audience {

    public static void main(String[] args) {
        Theater theater = new Theater();

        Film f1 = theater.showFilm("Action");
        System.out.println(f1.getClass().getName());
        System.out.println(f1.getName());

        Film f2 = theater.showFilm("Mystery");
        System.out.println(f2.getClass().getName());
        System.out.println(f2.getName());

        Film f3 = theater.showFilm("Comedy");
        System.out.println(f3.getClass().getName());
        System.out.println(f3.getName());

        Film f4 = theater.showFilm("Horror");
        System.out.println(f4.getClass().getName());
        System.out.println(f4.getName());

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nWhat genre of film would like to see? Type 'Action' OR 'Comedy' OR 'Horror' OR 'Mystery': ");
            String order = scan.nextLine();
            Film f = theater.showFilm(order);
            if (f != null) {
                System.out.println("For this genre, we have the movie " + f.getName() + " and it's staring " + f.getStaringActor());
                System.out.println("Would like to know more about the film? Type YES or NO: ");
                String answer = scan.nextLine();
                System.out.println(f.getFilmPlot(answer));
            }
            else {
                System.out.println("Sorry, we don't have that genre currently in the movie theater.");
            }
        }
    }

}

