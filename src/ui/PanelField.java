package ui;

import java.awt.Graphics;
import javax.swing.JPanel;

public abstract class PanelField extends JPanel {
    private GameModel model;
    
    public PanelField(GameModel model) {
        this.model = model;
    }

    @Override
    protected void paintComponent(Graphics graphics) {

        for (int i = 0; i < 11; i++) {
            graphics.drawLine(i*15, 0, i*15, 150);
            graphics.drawLine(0, i*15, 150, i*15);
        }
        
        
    }
       
}
