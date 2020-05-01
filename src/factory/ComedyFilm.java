package factory;

/** This class is a subclass of Film, it takes a name, a staring actor, and a plot of a comedy film that the theater is offering to the audience*/

public class ComedyFilm extends Film {
    public ComedyFilm(){
        super("Jack & Jill", "Adam Sandler", "Jack hates Thanksgiving because of his twin sister Jill's annual visit." +
                " He is forced to bear with her for longer after actor Al Pacino, whom he needs for an ad, develops a crush on Jill.");
    }
}
