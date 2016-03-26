package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * Created by user2 on 23.03.2016.
 */
public class RubricPaneController {

    @FXML
    TreeView selectionTreeView;

    @FXML
    protected void initialize() {
//create root
        TreeItem<String> root = new TreeItem<String>("Тема");
        //root.setExpanded(true);
        TreeItem<String> itemChild1 = new TreeItem<String>("Подтема 1");
//        itemChild1.setExpanded(t);
        TreeItem<String> itemChildChild1 = new TreeItem<String>("Подтема подтемы 1");
        TreeItem<String> itemChild2 = new TreeItem<String>("Подтема 2");
//        itemChild2.setExpanded();
        root.getChildren().addAll(itemChild1, itemChild2);
        itemChild1.getChildren().addAll(itemChildChild1);
        selectionTreeView.setRoot(root);
    }

    public void createTree(String... rootItems) {

    }
}
