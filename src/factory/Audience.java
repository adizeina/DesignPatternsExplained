package factory;

import java.util.Scanner;

public class Audience {

    public static void main(String[] args) {
        FilmProductions productions = new FilmProductions();

        Film f1 = productions.produceFilm("Action");
        System.out.println(f1.getClass().getName());
        System.out.println(f1.getName());

        Film f2 = productions.produceFilm("Mystery");
        System.out.println(f2.getClass().getName());
        System.out.println(f2.getName());

        Film f3 = productions.produceFilm("Comedy");
        System.out.println(f3.getClass().getName());
        System.out.println(f3.getName());

        Film f4 = productions.produceFilm("Horror");
        System.out.println(f4.getClass().getName());
        System.out.println(f4.getName());

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nWhat genre of film would like to see? Type 'Action' OR 'Comedy' OR 'Horror' OR 'Mystery': ");
            String order = scan.nextLine();
            Film f = productions.produceFilm(order);
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

