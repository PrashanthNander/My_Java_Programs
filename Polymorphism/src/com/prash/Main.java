package com.prash;


class Movie {
    private String name;
    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return ("No Plot here..");
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws () {
        super("Jaws");
    }

    public String plot() {
        return ("It is a movie based on Shark");
    }
}

class MazeRunner extends Movie{
    public MazeRunner()  {
        super("Maze Runner") ;
    }

    @Override
    public String plot() {
        return "Movie about kids escaping a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Sci Fi Movie";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    //No Plot Here
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i < 9; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + "\n" +
                    ":" + movie.getName() + " \n" +
                    "Plot : " + movie.plot());
        }

    }

    public static Movie randomMovie() {
        int randomNum = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was : " + randomNum);

        switch (randomNum) {
            case 1:
                return new Jaws();
            case 2:
                return new MazeRunner();
            case 3:
                return new StarWars();
            case 4:
                return new Forgettable();
        }
        return null;
    }
}





















