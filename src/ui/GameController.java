package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GameController implements ActionListener {

    public static final String gameRules = "В игру \"морской бой\" играют два человека, "
            + "которые по очереди называют координаты кораблей на карте противника. "
            + "Если координаты заняты, то корабль или часть его \"топится\", а попавший имеет право сделать ещё один ход.";
    private GameModel model;
    private GameView view;

    public GameController(GameView view, GameModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("About".equals(command)) {
            JFrame rules = new JFrame();
            rules.setVisible(true);
            rules.setTitle("Game Rules");
            rules.setResizable(false);
            rules.setBounds(1000, 300, 500, 300);

            JTextField textField = new JTextField(gameRules);
            rules.getContentPane().add(textField);
        }
        if ("Exit".equals(command)) {
            System.exit(0);
        }
    }

}
