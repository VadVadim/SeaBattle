package ui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameView extends JFrame {

    private int alignment;
    private GameModel model;
    private GameController controller;

    private JMenuItem newGame;
    private JMenuItem exit;
    private JMenuItem about;

    GameView(GameModel model) {
        this.model = model;
        buildUI();
        this.controller = new GameController(this, model);
        attachController();
    }

    private void attachController() {
        about.addActionListener(controller);
        exit.addActionListener(controller);
    }

    private void buildUI() {
        this.setTitle("SeaBattle");
        this.setResizable(false);
        this.setBounds(400, 300, 500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new FlowLayout(alignment));

        JMenuBar menuBar = new JMenuBar();
        this.getContentPane().add(menuBar);

        JMenu gameMenu = new JMenu("Game");
        menuBar.add(gameMenu);

        newGame = new JMenuItem("New Game");
        gameMenu.add(newGame);

        exit = new JMenuItem("Exit");
        gameMenu.add(exit);

        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        about = new JMenuItem("About");
        helpMenu.add(about);
    }
}
