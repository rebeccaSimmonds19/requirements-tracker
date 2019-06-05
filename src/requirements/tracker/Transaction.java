package requirements.tracker;

public class Transaction {
    private int score;
    private boolean approve;

    public Transaction()
    {

    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public int getScore()
    {
        return score;
    }

    public boolean getApproved() {
        return approve;
    }

    public void setApproved(boolean approve)
    {
        this.approve = approve;
    }
}
