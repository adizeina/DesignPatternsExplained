package factory;

public class Film {
    private String filmName;
    private String staringActor;
    private String filmPlot;

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
    public String getFilmPlot(String answer) {
        if (answer.equals("YES"))
            return filmPlot;
        else{
            return "No worries! Also, Good choice, its a GREAT film!";
        }
    }
}
