package com.bigJavaExercises.Chapter3Exercises;

class VotingMachine {
    private String vote;
    public VotingMachine() {
        vote = null;
    }
    public String voteDemocrat() {
        return "GILOCAV SHEN DEMOKRATEBI AIRCHIE";
    }
    public  String voteRepublican() {
        return "GILOCAV SHEN RESPUBLIKELEBI AIRCHIE";
    }
    public void reset() {
        vote = null;
    }

}

public class VotingMachineTester {
    public static void main(String[] args) {
    VotingMachine votingMachine = new VotingMachine();
    votingMachine.voteDemocrat();
    votingMachine.reset();
        System.out.println(votingMachine.voteRepublican());

    }
}
