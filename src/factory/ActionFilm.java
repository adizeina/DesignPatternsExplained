package factory;

/** This class is a subclass of Film, it takes a name, a staring actor, and a plot of a action film that the theater is offering to the audience*/

public class ActionFilm extends Film {
    public ActionFilm(){
        super("Mad Max: Fury Road", "Charlize Theron", "In a post-apocalyptic wasteland, Max, a drifter and survivor, " +
                "unwillingly joins Imperator Furiosa, a rebel warrior, in a quest to overthrow a tyrant who controls the land's water supply.");
    }
}
