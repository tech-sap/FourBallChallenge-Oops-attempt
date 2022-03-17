import processing.core.PApplet;

public class FourBallChallenge extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 500;
    public static final int BALL_COUNT = 4;
    public static final int BALL_SIZE = 10;
    public static final double Y_POSITION_FIXER = 0.2;
    private static Balls balls[];


    public static void main(String[] args) {
        PApplet.main("FourBallChallenge");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        balls = new Balls[BALL_COUNT];
        for(int ball = 0; ball < BALL_COUNT; ++ball) {
            balls[ball] = new Balls(getPositionOfY(ball+1), BALL_SIZE);
        }
    }

    private float getPositionOfY(int ball) {
        return (float) (ball * HEIGHT * Y_POSITION_FIXER);
    }

    @Override
    public void draw() {
        for(int ball = 0; ball< BALL_COUNT; ++ball) {
            balls[ball].drawBall(this, ball+1);
        }
    }
}
