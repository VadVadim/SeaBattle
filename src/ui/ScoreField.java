package ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ScoreField extends JPanel {

    private GameModel model;
    private int ships;

    public ScoreField(GameModel model) {
        this.model = model;
    }

    @Override
    protected void paintComponent(Graphics g) {
        int[] elem = new int[4];
        for (int i = 0; i < 0; i++) {
            elem[i] = 0;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < (i + 1); j++) {
                g.setColor(Color.gray);
                g.fillRect(j * 15 + 10, i * 15 + 5, 13, 13);
            }
            g.setColor(Color.black);
            g.drawString(String.valueOf(elem[i]), 75, i * 15 + 16);
        }

        String string = "Alive: ".concat(String.valueOf(ships));
        g.drawString(string, 25, 100);
    }

}
