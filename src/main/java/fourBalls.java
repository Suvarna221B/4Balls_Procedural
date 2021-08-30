import processing.core.PApplet;
public class fourBalls extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int ball1X=0;
    int ball2X=0;
    int ball3X=0;
    int ball4X=0;

    public static void main(String args[]){PApplet.main("fourBalls",args);}

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle1(1,1);
        drawCircle2(2,2);
        drawCircle3(3,3);
        drawCircle4(4,4);
    }

    private void drawCircle1(int y,int speed) {
        ellipse(ball1X, (y * HEIGHT) / 5, DIAMETER, DIAMETER);
        ball1X+=speed;
    }
    private void drawCircle2(int y,int speed) {
        ellipse(ball2X, (y * HEIGHT) / 5, DIAMETER, DIAMETER);
        ball2X+=speed;
    }
    private void drawCircle3(int y,int speed) {
        ellipse(ball3X, (y * HEIGHT) / 5, DIAMETER, DIAMETER);
        ball3X+=speed;
    }
    private void drawCircle4(int y,int speed) {
        ellipse(ball4X, (y * HEIGHT) / 5, DIAMETER, DIAMETER);
        ball4X+=speed;
    }
}
