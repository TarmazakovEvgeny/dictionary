package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import sample.Pane;
import sample.PaneNavigator;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Main controller class for the entire layout.
 */
public class MainController {

    /**
     * Holder of a switchable vista.
     */
    @FXML
    private StackPane vistaHolder;

    private Set<Pane> paneList = new LinkedHashSet<Pane>();

    /**
     * Replaces the vista displayed in the vista holder with a new vista.
     *
     * @param node the vista node to be swapped in.
     */
    public void setNode(Node node) {
        vistaHolder.getChildren().setAll(node);
    }

    @FXML
    public void setChoosePane(ActionEvent event) {
        PaneNavigator.loadPane(Pane.CHOOSE);
    }

    @FXML
    public void setDownloadPane(ActionEvent event) {
        PaneNavigator.loadPane(Pane.DOWNLOAD);
    }

    @FXML
    public void setRubricPane(ActionEvent event) {
        PaneNavigator.loadPane(Pane.RUBRIC);
    }

    @FXML
    public void nextPane(ActionEvent event) {
//        PaneNavigator.loadPane(PaneNavigator.RUBRIC_PANE);
    }

    @FXML
    public void previousPane(ActionEvent event) {
//        PaneNavigator.loadPane(PaneNavigator.RUBRIC_PANE);
    }
}