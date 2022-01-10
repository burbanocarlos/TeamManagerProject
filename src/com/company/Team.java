package com.company;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

import javax.swing.plaf.InsetsUIResource;

public class Team {
    private ArrayList<Players> players;
    private ArrayList<Coaches> coaches;

    public Team() {
        this.players = new ArrayList<Players>();
        this.coaches = new ArrayList<Coaches>();
    }

    public void addNewPlayer(Players player) {

        players.add(player);
    }

    public boolean updatePlayerFirstName(Players oldPLayer, String newName) {
        int position = findPlayer(oldPLayer);
        if (position < 0) {
            System.out.println(oldPLayer.getfName() + " " + oldPLayer.getlName() + " was not found with that ID , double check the ID");
            return false;
        }
        String oldname = oldPLayer.getfName();
        this.players.set(position,oldPLayer).setfName(newName);
        System.out.println("The player;s first's name: " + oldname + " was replaced with " + oldPLayer.getfName());
        return true;
    }

    public boolean updatePlayerHeight(Players oldPLayer, String newPlayer) {
        int position = findPlayer(oldPLayer);
        if (position < 0) {
            System.out.println(oldPLayer.getfName() + " " + oldPLayer.getlName() + " was not found with that ID , double check the ID");
            return false;
        }
        String oldname = oldPLayer.getHeight();
        this.players.set(position,oldPLayer).setHeight(newPlayer);
        System.out.println( oldPLayer.getfName() + "'s  height was replaced with " + oldPLayer.getHeight());
        return true;
    }

    public boolean updatePlayerWeight(Players oldPLayer, String newPlayer) {
        int position = findPlayer(oldPLayer);
        if (position < 0) {
            System.out.println(oldPLayer.getfName() + " " + oldPLayer.getlName() + " was not found with that ID , double check the ID");
            return false;
        }

        this.players.set(position,oldPLayer).setWeight(newPlayer);
        System.out.println( oldPLayer.getfName() + "'s  weight was replaced with " + oldPLayer.getWeight());
        return true;
    }

    public boolean updatePlayerPosition(Players oldPLayer, String newPlayer) {
        int position = findPlayer(oldPLayer);
        if (position < 0) {
            System.out.println(oldPLayer.getfName() + " " + oldPLayer.getlName() + " was not found with that ID , double check the ID");
            return false;
        }

        this.players.set(position,oldPLayer).setPosition(newPlayer);
        System.out.println( oldPLayer.getfName() + "'s  position was replaced with " + oldPLayer.getPosition());
        return true;
    }

    public boolean updatePlayerGamesPlayed(Players oldPLayer, String newPlayer) {
        int position = findPlayer(oldPLayer);
        if (position < 0) {
            System.out.println(oldPLayer.getfName() + " " + oldPLayer.getlName() + " was not found with that ID , double check the ID");
            return false;
        }

        this.players.set(position,oldPLayer).setGamesPlayed(newPlayer);
        System.out.println( oldPLayer.getfName() + "'s  games played  are now " + oldPLayer.getGamesPlayed());
        return true;
    }

    public boolean updatePlayerGoals(Players oldPLayer, String newPlayer) {
        int position = findPlayer(oldPLayer);
        if (position < 0) {
            System.out.println(oldPLayer.getfName() + " " + oldPLayer.getlName() + " was not found with that ID , double check the ID");
            return false;
        }

        this.players.set(position,oldPLayer).setGoals(newPlayer);
        System.out.println( oldPLayer.getfName() + "'s  goals  are now " + oldPLayer.getGoals());
        return true;
    }

    public boolean updatePlayerYellowCards(Players oldPLayer, String newPlayer) {
        int position = findPlayer(oldPLayer);
        if (position < 0) {
            System.out.println(oldPLayer.getfName() + " " + oldPLayer.getlName() + " was not found with that ID , double check the ID");
            return false;
        }

        this.players.set(position,oldPLayer).setYellowCards(newPlayer);
        System.out.println( oldPLayer.getfName() + "'s  yellow cards  are now " + oldPLayer.getYellowCards());
        return true;
    }

    public boolean updatePlayerMinutesPlayed(Players oldPLayer, String newPlayer) {
        int position = findPlayer(oldPLayer);
        if (position < 0) {
            System.out.println(oldPLayer.getfName() + " " + oldPLayer.getlName() + " was not found with that ID , double check the ID");
            return false;
        }

        this.players.set(position,oldPLayer).setMinutesPlayed(newPlayer);
        System.out.println( oldPLayer.getfName() + "'s  minutes played are now " + oldPLayer.getMinutesPlayed());
        return true;
    }

    public boolean updatePlayerRedCards(Players oldPLayer, String newPlayer) {
        int position = findPlayer(oldPLayer);
        if (position < 0) {
            System.out.println(oldPLayer.getfName() + " " + oldPLayer.getlName() + " was not found with that ID , double check the ID");
            return false;
        }

        this.players.set(position,oldPLayer).setRedCards(newPlayer);
        System.out.println( oldPLayer.getfName() + "'s  red cards  are now " + oldPLayer.getRedCards());
        return true;
    }

    public boolean updatePlayerAssits(Players oldPLayer, String newPlayer) {
        int position = findPlayer(oldPLayer);
        if (position < 0) {
            System.out.println(oldPLayer.getfName() + " " + oldPLayer.getlName() + " was not found with that ID , double check the ID");
            return false;
        }

        this.players.set(position,oldPLayer).setAssists(newPlayer);
        System.out.println( oldPLayer.getfName() + "'s  assits  are now " + oldPLayer.getAssists());
        return true;
    }


    public boolean updatePlayerLastName(Players oldPLayer, String newPlayer) {
        int position = findPlayer(oldPLayer);
        if (position < 0) {
            System.out.println(oldPLayer.getfName() + " " + oldPLayer.getlName() + " was not found with that ID , double check the ID");
            return false;
        }
        String oldname = oldPLayer.getlName();
        this.players.set(position,oldPLayer).setlName(newPlayer);
        System.out.println("The player;s first's name: " + oldname + " was replaced with " + oldPLayer.getlName());
        return true;

    }

    private int findPlayer(Players player) {
        return this.players.indexOf(player);
    }

    private int findPlayer(String id) {
        for (int i = 0; i < this.players.size(); i++) {
            Players player = this.players.get(i);
            if (player.getId().equals(id))
                return i;
        }

        return -1;
    }

    public String queryPlayerID(Players player){
        if( findPlayer(player) >= 0){
            return player.getId();
        }

        return null;
    }

    public Players queryPlayerID(String id){
        int position = findPlayer(id);
        if ( position >= 0)
            return  this.players.get(position);
        return null;
    }



    public void printRooster(){
        String line = new String(new char[110]).replace('\0', '-');
        System.out.println(line);
        System.out.printf("|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%n",
                StringUtils.center("id", 7),
                StringUtils.center("Name", 30),
                StringUtils.center("Position", 12),
                StringUtils.center("Height", 10),
                StringUtils.center("Weight", 10),
                StringUtils.center("GP", 6),
                StringUtils.center("MP", 6),
                StringUtils.center("YC", 4),
                StringUtils.center("RC", 4),
                StringUtils.center("G", 4),
                StringUtils.center("A", 4));
        System.out.println(line);

        for ( int i = 0 ; i < players.size() ; i++){
            System.out.printf("|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%n",
                    StringUtils.center(players.get(i).getId(), 7),
                    StringUtils.center(players.get(i).getfName() + " "+ players.get(i).getlName() , 30),
                    StringUtils.center(players.get(i).getPosition(), 12),
                    StringUtils.center(players.get(i).getHeight(), 10),
                    StringUtils.center(players.get(i).getWeight(), 10),
                    StringUtils.center(players.get(i).getGamesPlayed(), 6),
                    StringUtils.center(players.get(i).getMinutesPlayed(), 6),
                    StringUtils.center(players.get(i).getYellowCards(), 4),
                    StringUtils.center(players.get(i).getRedCards(), 4),
                    StringUtils.center(players.get(i).getGoals(), 4),
                    StringUtils.center(players.get(i).getAssists(), 4));
        }
        System.out.println(line);
    }

    public boolean removePlayer(Players players){
        int foundPosition = findPlayer(players);
        if ( foundPosition < 0 ){
            System.out.println(players.getfName() + " was not found");
            return false;
        }
        this.players.remove(foundPosition);
        System.out.println(players.getfName() + ", was deleted");
        return true;
    }

    public boolean removeCoach(Coaches coaches){
        int foundPosition = findCoach(coaches);
        if ( foundPosition < 0 ){
            System.out.println(coaches.getFname() + " was not found");
            return false;
        }
        this.coaches.remove(foundPosition);
        System.out.println(coaches.getFname() + ", was deleted");
        return true;
    }


//**********************************************************************//
//
//                             Coaches
//
//**********************************************************************//


    public void addNewCoach(Coaches coach) {

        coaches.add(coach);
    }

    public void printCoachInfo(){
        String line = new String(new char[98]).replace('\0', '-');
        System.out.println(line);
        System.out.printf("|%s|%s|%s|%s|%s|%n",
                StringUtils.center("id", 7),
                StringUtils.center("Name", 20),
                StringUtils.center("Roll", 20),
                StringUtils.center("Date Of Birth", 15),
                StringUtils.center("Email", 30));
        System.out.println(line);

        for ( int i = 0 ; i < coaches.size();i++){
            System.out.printf("|%s|%s|%s|%s|%s|%n",
                    StringUtils.center(coaches.get(i).getId(), 7),
                    StringUtils.center(coaches.get(i).getFname() + " " + coaches.get(i).getLname(), 20 ),
                    StringUtils.center(coaches.get(i).getRoll(), 20),
                    StringUtils.center(coaches.get(i).getDateOfBirth(), 15),
                    StringUtils.center(coaches.get(i).getEmail(), 30));
        }
        System.out.println(line);

    }
    public String queryPlayerID(Coaches coaches){
        if ( findCoach(coaches) >=0){
            return coaches.getId();
        }
        return null;
    }

    public Coaches queryCoachID(String id){
        int position = findCoach(id);
        if ( position >= 0){
            return this.coaches.get(position);
        }
        return null;
    }

    private int findCoach(Coaches coach) {
        return this.coaches.indexOf(coach);
    }


    private int findCoach(String id) {
        for (int i = 0; i < this.coaches.size(); i++) {
            Coaches coach = this.coaches.get(i);
            if (coach.getId().equals(id))
                return i;
        }
        return -1;
    }



    public boolean updateCoachFname(Coaches oldCoach, String newCoach) {
        int position = findCoach(oldCoach);
        if (position < 0) {
            System.out.println(oldCoach.getFname() + " " + oldCoach.getLname() + " was not found with that ID , double check the ID");
            return false;
        }
        String oldname = oldCoach.getFname();
        this.coaches.set(position,oldCoach).setFname(newCoach);
        System.out.println("The coach's first's name: " + oldname + " was replaced with " + oldCoach.getFname());
        return true;
    }

    public boolean updateCoachLname(Coaches oldCoach, String newCoach) {
        int position = findCoach(oldCoach);
        if (position < 0) {
            System.out.println(oldCoach.getFname() + " " + oldCoach.getLname() + " was not found with that ID , double check the ID");
            return false;
        }
        String oldname = oldCoach.getLname();
        this.coaches.set(position,oldCoach).setLname(newCoach);
        System.out.println("The coach's last name: " + oldname + " was replaced with " + oldCoach.getLname());
        return true;
    }



    public boolean updateCoachRoll(Coaches oldCoach, String newCoach) {
        int position = findCoach(oldCoach);
        if (position < 0) {
            System.out.println(oldCoach.getFname() + " " + oldCoach.getLname() + " was not found with that ID , double check the ID");
            return false;
        }

        this.coaches.set(position,oldCoach).setRoll(newCoach);
        System.out.println("The coach's : " + oldCoach.getFname() + " roll was replaced with " + oldCoach.getRoll());
        return true;
    }

}