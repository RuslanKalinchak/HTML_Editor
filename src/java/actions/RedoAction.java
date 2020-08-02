package java.actions;

import javax.swing.*;
import java.View;
import java.awt.event.ActionEvent;

public class RedoAction extends AbstractAction {
    private View view;
    public RedoAction (View view){
        this.view = view;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        view.redo();
    }
}
