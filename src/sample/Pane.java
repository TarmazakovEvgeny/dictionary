package sample;

public enum Pane {

    MAIN("fxml/mainPane.fxml"),
    CHOOSE("fxml/choosePane.fxml"),
    DOWNLOAD("fxml/downloadsPane.fxml"),
    RUBRIC("fxml/rubricPane.fxml"),
    VISTA_1("fxml/vista1.fxml"),
    VISTA_2("fxml/vista2.fxml");

    private String address;

    Pane(String address) {
        this.address = address;
    }

    public String getAddress() {

        return this.address;
    }

}
