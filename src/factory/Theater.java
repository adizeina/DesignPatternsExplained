package factory;

/** This class decides which subclass of film is called upon, depending on the keyword the user inserted*/

public class Theater {
    public Film showFilm(String choice){
        if (choice.equals("Comedy"))
            return new ComedyFilm();
        if (choice.equals("Action"))
            return new ActionFilm();
        if (choice.equals("Horror"))
            return new HorrorFilm();
        if (choice.equals("Mystery"))
            return new MysteryFilm();
        return null;
    }


}
