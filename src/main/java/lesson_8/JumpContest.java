package lesson_8;

public class JumpContest {
    Jumpable[] participants;
    String winnerName;

    public JumpContest (Jumpable[] participants){
        this.participants = participants;
    }
    
    public void start(){
        int maxJump = 0;
        for (Jumpable participant:participants) {
            int jump = participant.jump();
            String name = participant.getName();
            System.out.println(name + " прыгнул на " + jump);
            if (jump > maxJump) {
                maxJump = jump;
                winnerName = name;
            }
        }
    }

    public void getWinner() {
        System.out.println("победил " + winnerName);
    }
    
}
