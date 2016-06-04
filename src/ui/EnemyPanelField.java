package ui;

import java.awt.Color;
import java.awt.Graphics;
import logic.ElementState;

public class EnemyPanelField extends PanelField {
    
    public EnemyPanelField(GameModel model) {
        super(model);
    }

    private Color getColorByStateElement(ElementState state) {
        switch (state) {
            case border:
                return new Color(225, 225, 255);
            case water:
                return new Color(225, 225, 255);
            case wall:
                return new Color(225, 225, 255);
            case injured:
                return Color.red;
            case killed:
                return Color.gray;
            case missed:
                return Color.black;
        }

        return Color.blue;
    }
    
    @Override
    protected void paintElement(Graphics graphics, int i, int j) {
        ElementState state = model.enemyPlayerField.getElement(i, j);
        graphics.setColor(getColorByStateElement(state));
        if (state == ElementState.missed) {
            graphics.fillRect(i * 15 + 6, j * 15 + 6, 4, 4);
        } else {
            graphics.fillRect(i * 15 + 1, j * 15 + 1, 14, 14);
        }
    }
    
}
