package movies;

import util.Input;

public class MoviesApplication {

    public static Input input = new Input();

    public static void displayMovies(int num){
        if(num == 0){
            System.out.println("Thank you, have a good day!");
        } else if(num == 1){
            for(int i = 0; i < MoviesArray.findAll().length; i++){
                System.out.println(MoviesArray.findAll()[i].getName() + "--" + MoviesArray.findAll()[i].getCategory());
            }
        } else if(num == 2){
            for(int i = 0; i < MoviesArray.findAll().length; i++){
                if(MoviesArray.findAll()[i].getCategory().equals("animated")){
                    System.out.println(MoviesArray.findAll()[i].getName() + "--" + MoviesArray.findAll()[i].getCategory());
                }
            }
        } else if(num == 3){
            for(int i = 0; i < MoviesArray.findAll().length; i++){
                if(MoviesArray.findAll()[i].getCategory().equals("drama")){
                    System.out.println(MoviesArray.findAll()[i].getName() + "--" + MoviesArray.findAll()[i].getCategory());
                }
            }
        } else if(num == 4){
            for(int i = 0; i < MoviesArray.findAll().length; i++){
                if(MoviesArray.findAll()[i].getCategory().equals("horror")){
                    System.out.println(MoviesArray.findAll()[i].getName() + "--" + MoviesArray.findAll()[i].getCategory());
                }
            }
        } else if(num == 5){
            for(int i = 0; i < MoviesArray.findAll().length; i++){
                if(MoviesArray.findAll()[i].getCategory().equals("scifi")){
                    System.out.println(MoviesArray.findAll()[i].getName() + "--" + MoviesArray.findAll()[i].getCategory());
                }
            }
        }
        System.out.println();
        boolean response = input.yesNo("Do you want to search again?");
        if(response){
            userOptions();
        }
    }

    public static void userOptions(){
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println();
        System.out.println("Enter your choice:");
        int userChoice = input.getInt();
        displayMovies(userChoice);
    }

    public static void main(String[] args){
        System.out.println("What would you like to do?");
        userOptions();
    }

}
