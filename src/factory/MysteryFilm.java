package factory;

/** This class is a subclass of Film, it takes a name, a staring actor, and a plot of a mystery film that the theater is offering to the audience*/

public class MysteryFilm extends Film {
    public MysteryFilm(){
        super("A Quiet Place", "Emily Blunt", "A family struggles for survival in a world where most humans have been killed by " +
                "blind but noise-sensitive creatures. They are forced to communicate in sign language to keep the creatures at bay.");
    }
}
