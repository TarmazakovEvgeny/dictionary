package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Controller class for the second vista.
 */
public class Vista2Controller {

    /**
     * Event handler fired when the user requests a previous vista.
     *
     * @param event the event that triggered the handler.
     */
    @FXML
    void previousPane(ActionEvent event) {
        PaneNavigator.loadPane(Pane.VISTA_1);
    }

}