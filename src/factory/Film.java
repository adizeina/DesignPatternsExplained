package factory;

/** This class is the superclass of the mystery film, comedy film, horror film, action film*/

public class Film {

    private String filmName;
    private String staringActor;
    private String filmPlot;

    /** This constructor is used by the subclasses */
    public Film(String name, String staring, String plot) {
        this.filmName = name;
        this.staringActor = staring;
        this.filmPlot = plot;
    }

    public String getName() {
        return filmName;
    }

    public String getStaringActor() {
        return staringActor;
    }

    /** This method is called upon if the user of the scanner wants to know of the plot of the type of film chosen and shown at the theater
     * @return String of the plot if the user says "YES" or an ending statement of "NO"
     * */
    public String getFilmPlot(String answer) {
        if (answer.equals("YES"))
            return filmPlot;
        else{
            return "No worries! Also, Good choice, its a GREAT film!";
        }
    }
}
