package factory;

public class FilmProductions {
    public Film produceFilm(String choice){
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
