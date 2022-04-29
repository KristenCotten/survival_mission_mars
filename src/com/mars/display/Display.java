package com.mars.display;

import com.mars.objects.Location;
import com.mars.objects.Player;
import com.mars.objects.Stats;

import java.util.Scanner;

public class Display {

    public void displaySplash(){
        //TODO: ASCII Art later
        System.out.println("Welcome to Survival Mission: Mars!");
    }
    public String playGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play a game? Enter Y or N: "); //TODO input validation
        String userInput = scanner.nextLine();
        return userInput;
    }
    public void displayGameInfo(){
        System.out.println("You have been deployed from Mars HQ to a remote outpost.  Your objective is to return this outpost to operational status.\n" +
                "In order to do so, you must return the Solar farm to operational status for basic lighting, turn on the reactor for full power,\n" +
                "initialize the hydro system to provide both breathable air and water and utilize the provided water for planting seeds in the\n" +
                "greenhouse and obtaining growth from those seeds.  You have 14 days to complete these tasks. After 12 days, if you have not\n" +
                "accomplished all these tasks you will be given the option to continue AT YOUR OWN RISK, or return to Mars HQ as a complete &\n" +
                "total failure, with your head held low.");
    }
    public void displayMenu(){
        System.out.println("Avail. Game Commands here..."); //TODO
    }
    public void displayCurrentStatus(Location location, Stats stats, Player player){
        System.out.println("Display player stats here"); //TODO

    }
}//end class display