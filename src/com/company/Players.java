package com.company;

public class Players {
    private String  fName ,
                    lName ,
                    height,
                    weight,
                    position,
                    id,
                    dateOfBirth,
                    gamesPlayed,
                    minutesPlayed,
                    yellowCards,
                    redCards,
                    goals,
                    assists;

    public Players(String fName, String lName, String height, String weight, String position, String id, String dateOfBirth, String gamesPlayed, String minutesPlayed, String yellowCards, String redCards, String goals, String assists) {
        this.fName = fName;
        this.lName = lName;
        this.height = height;
        this.weight = weight;
        this.position = position;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.gamesPlayed = gamesPlayed;
        this.minutesPlayed = minutesPlayed;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.goals = goals;
        this.assists = assists;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGamesPlayed(String gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public void setMinutesPlayed(String minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public void setYellowCards(String yellowCards) {
        this.yellowCards = yellowCards;
    }

    public void setRedCards(String redCards) {
        this.redCards = redCards;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public void setAssists(String assists) {
        this.assists = assists;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getPosition() {
        return position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGamesPlayed() {
        return gamesPlayed;
    }

    public String getMinutesPlayed() {
        return minutesPlayed;
    }

    public String getYellowCards() {
        return yellowCards;
    }

    public String getRedCards() {
        return redCards;
    }

    public String getGoals() {
        return goals;
    }

    public String getAssists() {
        return assists;
    }

    public static Players createPlayer(String fname, String lName,  String height, String weight, String position, String dateOfBirth){
        Integer id = IdGenerator.id();
        return new Players(fname, lName,height, weight, position,("p"+id), dateOfBirth, "0" , "0", "0", "0","0", "0");
    }

    public static Players createPlayer(String fname, String lName,  String height, String weight, String position, String dateOfBirth, String gamesPlayed, String minutesPlayed, String yellowCards, String redCards, String goals, String assists ){
        Integer id = IdGenerator.id();
        return new Players(fname, lName,height, weight, position,("p"+id), dateOfBirth, gamesPlayed , minutesPlayed, yellowCards, redCards,goals, assists);
    }
}
