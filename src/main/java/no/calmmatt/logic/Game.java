package no.calmmatt.logic;

public class Game {

    private GameWindow gameWindow;
    private GamePanel gamePanel;
    public Game(){
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
    }
}