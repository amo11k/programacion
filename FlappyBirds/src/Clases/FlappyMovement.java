package Clases;

import Interfaz.Game;

public class FlappyMovement extends Thread {

    private static final double acceleration = 15;
	private int deltaTime;
    private boolean jump;
    private boolean stopJump1 = false;
    private boolean stopJump2 = true;
    private boolean jumping = false;
    private final Game parent;
    public static boolean stopThread;
    private int yInit;
    private long timeInit;
    private int v0 = -38;  

    public FlappyMovement(Game parent) {
        this.deltaTime = 10;
        this.parent = parent;
    }

    @Override
    public void run() {
        stopThread = false;
        int x = Game.jFlappy.getLocation().x;
        yInit = Game.jFlappy.getLocation().y;
        timeInit = System.currentTimeMillis();
        while (true) {
            if (stopThread) {
                break;
            }
            double time = (System.currentTimeMillis()-timeInit)/100.0f;
            int y = (int) (yInit + v0*time + 0.5*acceleration*time*time);
            Game.jFlappy.setLocation(x,y);
            try {
                Thread.sleep(getDeltaTime());

            } catch (InterruptedException e) {
                //
            }
            parent.validarChoqueTubos();
            parent.detectColision();
        }
    }
    public void jump() {
        timeInit = System.currentTimeMillis();
        yInit = Game.jFlappy.getLocation().y;
    }

    public int getDeltaTime() {
        return deltaTime;
    }

    public void setDeltaTime(int deltaTime) {
        this.deltaTime = deltaTime;
    }

    public boolean isStopThread() {
        return stopThread;
    }

}
