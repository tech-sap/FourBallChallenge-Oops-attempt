import processing.core.PApplet;

public class Balls extends PApplet {
    private final int ballSize;
    private final float yPosition;
    private float xPosition;

    public Balls(float yPosition, int ballSize) {
        this.xPosition = 0;
        this.yPosition = yPosition;
        this.ballSize = ballSize;
    }

    public void drawBall(FourBallChallenge Ball, int ballNo) {
        drawCircle(Ball, ballNo);
    }

    private void drawCircle(FourBallChallenge Ball, int ballNo) {
        Ball.ellipse(xPosition, yPosition, ballSize, ballSize);
        xPosition += ballNo;
    }
}
