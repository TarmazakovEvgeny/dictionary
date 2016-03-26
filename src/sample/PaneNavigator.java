package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import sample.controller.MainController;

import java.io.IOException;

/**
 * Utility class for controlling navigation between vistas.
 * <p/>
 * All methods on the navigator are static to facilitate
 * simple access from anywhere in the application.
 */
public class PaneNavigator {

    /**
     * Convenience constants for fxml layouts managed by the navigator.
     */
    public static final String MAIN = "fxml/mainPane.fxml";
    public static final String CHOOSE_PANE = "fxml/choosePane.fxml";
    public static final String DOWNLOAD_PANE = "fxml/downloadsPane.fxml";
    public static final String VISTA_1 = "fxml/vista1.fxml";
    public static final String VISTA_2 = "fxml/vista2.fxml";
    public static final String RUBRIC_PANE = "fxml/rubricPane.fxml";

    /**
     * The main application layout controller.
     */
    private static MainController mainController;

    /**
     * Stores the main controller for later use in navigation tasks.
     *
     * @param mainController the main application layout controller.
     */
    public static void setMainController(MainController mainController) {
        PaneNavigator.mainController = mainController;
    }

    /**
     * Loads the vista specified by the fxml file into the
     * vistaHolder pane of the main application layout.
     * <p/>
     * Previously loaded vista for the same fxml file are not cached.
     * The fxml is loaded anew and a new vista node hierarchy generated
     * every time this method is invoked.
     * <p/>
     * A more sophisticated load function could potentially add some
     * enhancements or optimizations, for example:
     * cache FXMLLoaders
     * cache loaded vista nodes, so they can be recalled or reused
     * allow a user to specify vista node reuse or new creation
     * allow back and forward history like a browser
     *
     * @param fxml the fxml file to be loaded.
     */
    public static void loadPane(Pane fxml) {
        try {
            mainController.setNode((Node) FXMLLoader.load(PaneNavigator.class.getResource(fxml.getAddress())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}