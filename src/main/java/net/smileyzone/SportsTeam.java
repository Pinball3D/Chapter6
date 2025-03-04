package net.smileyzone;

public class SportsTeam {
    private int gP, gW, gL, gT;
    private String name;
    public SportsTeam(String name) {
        gP = 0;
        gW = 0;
        gL = 0;
        gT = 0;
        this.name = name;
    }
    public SportsTeam(String name, int gP, int gW, int gL, int gT) {
        this.name = name;
        this.gP = gP;
        this.gW = gW;
        this.gL = gL;
        this.gT = gT;
    }

    public int getgP() {
        return gP;
    }
    public int getgL() {
        return gL;
    }
    public int getgT() {
        return gT;
    }
    public int getgW() {
        return gW;
    }
    public String getName() {
        return name;
    }
    public double getWinningPercentage() {
        return gW/gP;
    }
    public void playGame(String str) {
        if(str.equalsIgnoreCase("w")) {
            gW++;
        } else if(str.equalsIgnoreCase("l")) {
            gL++;
        } else {
            gT++;
        }
        gP++;
    }
    public String toString() {
        return "Name: "+name+"\nGames Played: "+gP+"\nGames Won: "+gW+"\nGames Lost: "+gL+"\nGames Tied: "+gT;
    }
}

class Baseball extends SportsTeam {
    private int hR, rbi, err;
    public Baseball(String name) {
        super(name);
        hR = 0; rbi = 0; err = 0;
    }

    public Baseball(String name, int i, int i1, int i2, int i3, int i4, int i5, int i6) {
        super(name, i, i1, i2, i3);
        hR = i4; rbi = i5; err = i6;

    }

    public double homeRunsPerGame() {
        return (double) hR /super.getgP();
    }
    public double rbisPerGame() {
        return (double) rbi /super.getgP();
    }
    public double errorsPerGame() {
        return (double) err /super.getgP();
    }

    public String toString() {
        return super.toString()+"\nHome Runs: "+hR+"\nRBIs: "+rbi+"\nErrors: "+err;
    }
}

class Football extends SportsTeam {
    private int interceptions;
    private int touchdowns;
    public Football(String name) {
        super(name);
    }

    public Football(String name, int i, int i1, int i2, int i3, int i4, int i5) {
        super(name, i, i1, i2, i3);
        interceptions = i5; touchdowns = i4;
    }
    public double interceptionsPerGame() {
        return (double) interceptions /super.getgP();
    }
    public double touchdownsPerGame() {
        return (double) touchdowns /super.getgP();
    }
    public String toString() {
        return super.toString()+"\nInterceptions: "+interceptions+"\nTouchdowns: "+touchdowns;
    }
}
