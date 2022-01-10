package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner((System.in));
    private static Team team = new Team();


    public static void main(String[] args) throws FileNotFoundException {

        boolean quit = false;

        IdGenerator.generator();
        addPlayersFromFile();
        addCoachesFromFile();
        menu();

    }

    private static void printActions(){

        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n"+
                "1 - to print rooster\n"+
                "2 - to add a new player\n"+
                "3 - to update an existing player\n" +
                "4 - to remove an existing player\n"+
                "5 - to print Coach staff \n" +
                "6 - to add new coach\n"+
                "7 - to update an existing coach\n"+
                "8 - to remove existing coach\n"+
                "9 - to display options");
        System.out.println("Choose you action: ");
    }

    private static void menu(){
        boolean quit = false;
        printActions();

        while (!quit) {
            System.out.println("\nEnter action: ( 8 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch ((action)) {
                case 0:
                    System.out.println("\nShutting down");
                    quit = true;
                    break;

                case 1:
                    team.printRooster();
                    break;

                case 2:
                    addNewPLayer();
                    break;

                case 3:
                    updatePlayer();
                    break;

                case 4:
                    removePLayer();
                    break;

                case 5:
                    team.printCoachInfo();
                    break;

                case 6:
                    addNewCoach();
                    break;

                case 7:
                    updateCoach();
                    break;

                case 8:
                    removeCoach();
                    break;

                case 9:
                    printActions();
                    break;


            }


        }
    }



    private static void updatePlayer(){

        boolean quit = false;
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to go back to main menu\n"+
                "1 - to update player's first name\n"+
                "2 - to update player's last name\n"+
                "3 - tto update player's height\n" +
                "4 - to to update player's weight\n"+
                "5 - to to update player's position\n" +
                "6 - to to update player's games played\n"+
                "7 - to to update player's minutes played\n"+
                "8 - to to update player's yellow cards\n"+
                "9 - to to update player's red cards\n"+
                "10 - to to update player's goal's\n"+
                "11 - to to update player's red assist's\n");
        System.out.println("Choose you action: ");

        while (!quit){
            System.out.println("\nUpdate Player Menu Enter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch ((action)) {
                case 0:
                    menu();
                    quit = true;
                    break;
                case 1:
                    updatePlayerFirstName();
                    quit = true;
                    break;

                case 2:
                    updatePlayerLastName();
                    quit = true;
                    break;

                case 3:
                    updatePlayerHeight();
                    quit =true;
                    break;

                case 4:
                    updatePlayerWeight();
                    quit = true;
                    break;

                case 5:
                    updatePlayerPosition();
                    quit =true;
                    break;

                case 6:
                    updatePlayerGamesPlayed();
                    quit = true;
                    break;

                case 7:
                    updatePlayerMinutesPlayed();
                    quit = true;
                    break;

                case 8 :
                    updatePlayerYellowCards();
                    quit = true;
                    break;

                case 9 :
                    updatePlayerRedCards();
                    quit = true;
                    break;

                case 10 :
                    updatePlayerGoals();
                    quit = true;
                    break;

                case 11:
                    updatePlayerAssits();
                    quit = true;
                    break;
            }
        }

    }

    private static void updatePlayerFirstName (){
        System.out.println("Enter Player's ID: ");
        String id = scanner.nextLine();
        Players existingPlayerRecord =team.queryPlayerID(id);
        if ( existingPlayerRecord == null){
            System.out.println("Player not found");
            return;
        }

        System.out.println("Enter Player's New first name: ");
        String newName = scanner.nextLine();


        if (team.updatePlayerFirstName(existingPlayerRecord, newName)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }



    private static void updatePlayerLastName(){
        System.out.println("Enter Player's ID: ");
        String id = scanner.nextLine();
        Players existingPlayerRecord =team.queryPlayerID(id);
        if ( existingPlayerRecord == null){
            System.out.println("Player not found");
            return;
        }

        System.out.println("Enter Player's New last name: ");
        String newName = scanner.nextLine();


        if (team.updatePlayerLastName(existingPlayerRecord, newName)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }

    private static void updatePlayerHeight(){
        System.out.println("Enter Player's ID: ");
        String id = scanner.nextLine();
        Players existingPlayerRecord =team.queryPlayerID(id);
        if ( existingPlayerRecord == null){
            System.out.println("Player not found");
            return;
        }

        System.out.println("Enter Player's New Height: ");
        String newHeight = scanner.nextLine();


        if (team.updatePlayerLastName(existingPlayerRecord, newHeight)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }

    private static void updatePlayerWeight(){
        System.out.println("Enter Player's ID: ");
        String id = scanner.nextLine();
        Players existingPlayerRecord =team.queryPlayerID(id);
        if ( existingPlayerRecord == null){
            System.out.println("Player not found");
            return;
        }

        System.out.println("Enter Player's New weight: ");
        String newHeight = scanner.nextLine();


        if (team.updatePlayerWeight(existingPlayerRecord, newHeight)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }

    private static void updatePlayerPosition(){
        System.out.println("Enter Player's ID: ");
        String id = scanner.nextLine();
        Players existingPlayerRecord =team.queryPlayerID(id);
        if ( existingPlayerRecord == null){
            System.out.println("Player not found");
            return;
        }

        System.out.println("Enter Player's New position: ");
        String newPosition = scanner.nextLine();


        if (team.updatePlayerPosition(existingPlayerRecord, newPosition)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }

    private static void updatePlayerGamesPlayed(){
        System.out.println("Enter Player's ID: ");
        String id = scanner.nextLine();
        Players existingPlayerRecord =team.queryPlayerID(id);
        if ( existingPlayerRecord == null){
            System.out.println("Player not found");
            return;
        }

        System.out.println("Enter Player's games played: ");
        String newData = scanner.nextLine();


        if (team.updatePlayerGamesPlayed(existingPlayerRecord, newData)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }

    private static void updatePlayerMinutesPlayed(){
        System.out.println("Enter Player's ID: ");
        String id = scanner.nextLine();
        Players existingPlayerRecord =team.queryPlayerID(id);
        if ( existingPlayerRecord == null){
            System.out.println("Player not found");
            return;
        }

        System.out.println("Enter Player's Minutes played: ");
        String newData = scanner.nextLine();


        if (team.updatePlayerMinutesPlayed(existingPlayerRecord, newData)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }

    private static void updatePlayerYellowCards(){
        System.out.println("Enter Player's ID: ");
        String id = scanner.nextLine();
        Players existingPlayerRecord =team.queryPlayerID(id);
        if ( existingPlayerRecord == null){
            System.out.println("Player not found");
            return;
        }

        System.out.println("Enter Player's yellow cards: ");
        String newData = scanner.nextLine();


        if (team.updatePlayerYellowCards(existingPlayerRecord, newData)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }

    private static void updatePlayerRedCards(){
        System.out.println("Enter Player's ID: ");
        String id = scanner.nextLine();
        Players existingPlayerRecord =team.queryPlayerID(id);
        if ( existingPlayerRecord == null){
            System.out.println("Player not found");
            return;
        }

        System.out.println("Enter Player's red cards: ");
        String newData = scanner.nextLine();


        if (team.updatePlayerRedCards(existingPlayerRecord, newData)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }

    private static void updatePlayerGoals(){
        System.out.println("Enter Player's ID: ");
        String id = scanner.nextLine();
        Players existingPlayerRecord =team.queryPlayerID(id);
        if ( existingPlayerRecord == null){
            System.out.println("Player not found");
            return;
        }

        System.out.println("Enter Player's Goals: ");
        String newData = scanner.nextLine();


        if (team.updatePlayerGoals(existingPlayerRecord, newData)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }

    private static void updatePlayerAssits(){
        System.out.println("Enter Player's ID: ");
        String id = scanner.nextLine();
        Players existingPlayerRecord =team.queryPlayerID(id);
        if ( existingPlayerRecord == null){
            System.out.println("Player not found");
            return;
        }

        System.out.println("Enter Player's Assits: ");
        String newData = scanner.nextLine();


        if (team.updatePlayerAssits(existingPlayerRecord, newData)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }

    private static void addNewPLayer(){

        System.out.println("Enter player's First name: ");
        String fName = scanner.nextLine();
        System.out.println("Enter player's last name: ");
        String lName = scanner.nextLine();
        System.out.println("Enter player's height: ");
        String height = scanner.nextLine();
        System.out.println("Enter player's weight: ");
        String weight = scanner.nextLine();
        System.out.println("Enter player's position: ");
        String position = scanner.nextLine();
        System.out.println("Enter player's date of birth (mm/dd/yyyy) : ");
        String dateOfBirth = scanner.nextLine();

        Players newPlayer = Players.createPlayer(fName,lName,height,weight,position,dateOfBirth);
        team.addNewPlayer(newPlayer);
        System.out.println(fName + " " + lName + " has been added.");
    }



    public static void addPlayersFromFile() throws FileNotFoundException {

        Scanner file = new Scanner(new File("team.txt"));

        while (file.hasNextLine()){
            String fname = file.nextLine();
            String lname = file.nextLine();
            String height = file.nextLine();
            String weight = file.nextLine();
            String position = file.nextLine();
            String dateOfBirth = file.nextLine();
            String gamesPlayed = file.nextLine();
            String minutesPlayed = file.nextLine();
            String yellowCards = file.nextLine();
            String redCards = file.nextLine();
            String goals = file.nextLine();
            String assists = file.nextLine();
            Players newPlayer = Players.createPlayer(fname,lname,height,weight,position,dateOfBirth,gamesPlayed,minutesPlayed,yellowCards,redCards,goals,assists);
            team.addNewPlayer(newPlayer);
        }

    }

    private static void removePLayer(){
        System.out.println("Enter existing Player ID : ");
        String id = scanner.nextLine();
        Players existingContactRecord = team.queryPlayerID(id);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (team.removePlayer(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting record");
        }
    }

    private static void removeCoach(){
        System.out.println("Enter existing Coach ID : ");
        String id = scanner.nextLine();
        Coaches existingContactRecord = team.queryCoachID(id);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (team.removeCoach(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting record");
        }
    }

    //**********************************************************************//
//
//                             Coaches
//
//**********************************************************************//

    public static void addCoachesFromFile() throws FileNotFoundException {
        Scanner file = new Scanner(new File("coaches.txt"));

        while ( file.hasNextLine()){
            String fname = file.nextLine();
            String lname = file.nextLine();
            String roll = file.nextLine();
            String dateOfBirth = file.nextLine();
            Coaches newCoach = Coaches.newCoach(fname,lname,dateOfBirth,roll);
            team.addNewCoach(newCoach);
        }
    }

    private static void addNewCoach(){
        System.out.println("Enter First name: ");
        String fName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lName = scanner.nextLine();
        System.out.println("Enter date of birth (mm/dd/yyyy) : ");
        String dateOfBirth = scanner.nextLine();
        System.out.printf("Enter Roll");
        String roll = scanner.nextLine();

        Coaches newCoach = Coaches.newCoach(fName,lName,dateOfBirth,roll);
        team.addNewCoach(newCoach);
        System.out.println(fName + " " + lName + " has been added as a " + roll);

    }

    private static void updateCoach(){

        boolean quit = false;
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to go back to main menu\n"+
                "1 - to update coach's first name\n"+
                "2 - to update coach's last name\n"+
                "3 - to update coach's roll\n");
        System.out.println("Choose you action: ");

        while (!quit) {
            System.out.println("\nUpdate Player Menu Enter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch ((action)){

                case 0:
                    menu();
                    quit = true;
                    break;

                case 1:
                    updateCoachFirstName();
                    quit = true;
                    break;

                case 2:
                    updateCoachLastName();
                    quit = true;
                    break;

                case 3:
                    updateCoachRoll();
                    quit = true;
                    break;

            }
        }

    }

    private static void updateCoachFirstName(){
        System.out.println("Enter coach's ID: ");
        String id = scanner.nextLine();
        Coaches existingCoachRecord =team.queryCoachID(id);
        if ( existingCoachRecord == null){
            System.out.println("Coach not found");
            return;
        }

        System.out.println("Enter coach's New first name: ");
        String newName = scanner.nextLine();


        if (team.updateCoachFname(existingCoachRecord, newName)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }

    private static void updateCoachLastName(){
        System.out.println("Enter Coach's ID: ");
        String id = scanner.nextLine();
        Coaches existingCoachRecord =team.queryCoachID(id);
        if ( existingCoachRecord == null){
            System.out.println("Coach not found");
            return;
        }

        System.out.println("Enter coach's New Last name: ");
        String newName = scanner.nextLine();


        if (team.updateCoachLname(existingCoachRecord, newName)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }

    private static void updateCoachRoll(){
        System.out.println("Enter coach's ID: ");
        String id = scanner.nextLine();
        Coaches existingCoachRecord =team.queryCoachID(id);
        if ( existingCoachRecord == null){
            System.out.println("Coach not found");
            return;
        }

        System.out.println("Enter coach's New roll: ");
        String newName = scanner.nextLine();


        if (team.updateCoachRoll(existingCoachRecord, newName)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record");
        }
    }
}


