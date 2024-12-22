package study.baseball;

public class Ball {
    private int no;
    private int position;

    public Ball(int position, int no) {
        this.position = position;
        this.no = no;
    }

    public boolean isBetweenOneAndNine() {
        return no > 0 && no < 10;
    }

    public int getNo() {
        return no;
    }

    public int getPosition() {
        return position;
    }

}
