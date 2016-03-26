package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import sample.Pane;
import sample.PaneNavigator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Main controller class for the entire layout.
 */
public class MainController {

    /**
     * Holder of a switchable vista.
     */
    @FXML
    private StackPane vistaHolder;

    private List<Pane> historyPaneList = new LinkedList<Pane>();
    private ListIterator<Pane> paneListIterator = historyPaneList.listIterator();

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
        paneListIterator.add(Pane.CHOOSE);
    }

    @FXML
    public void setDownloadPane(ActionEvent event) {
        PaneNavigator.loadPane(Pane.DOWNLOAD);
        paneListIterator.add(Pane.DOWNLOAD);
    }

    @FXML
    public void setRubricPane(ActionEvent event) {
        PaneNavigator.loadPane(Pane.RUBRIC);
        paneListIterator.add(Pane.RUBRIC);
    }

    @FXML
    public void nextPane(ActionEvent event) {
        if (paneListIterator.hasNext()) {
            if (!paneListIterator.hasPrevious()) {
                paneListIterator.next();
            }
            PaneNavigator.loadPane(paneListIterator.next());
        }
    }

    @FXML
    public void previousPane(ActionEvent event) {
        if (paneListIterator.hasPrevious()) {
            if (!paneListIterator.hasNext()) {
                paneListIterator.previous();
            }
            PaneNavigator.loadPane(paneListIterator.previous());
        }
    }
}