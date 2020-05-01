package factory;

/** This class  holds all the features of a standard semi-detached home, but the attributes can be personalized, based on client's wishes (in Main)*/

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
