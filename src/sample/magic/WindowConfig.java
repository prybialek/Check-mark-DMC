package sample.magic;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class WindowConfig implements Constants {

    FormComponents formComponents;

    public void loadWindow(Stage primaryStage) {

        primaryStage.setTitle(WINDOW_TITLE);
        GridPane mainGrid = new GridPane();
        Scene scene = new Scene(mainGrid, WINDOW_WIDTH, WINDOW_HEIGHT);
        primaryStage.setScene(scene);

        FormComponents formComponents = new FormComponents();
        applyGridStyles(mainGrid);
        addFormComponentsToGrid(mainGrid, formComponents);

        formComponents.getCalculateButton().setOnAction(e -> {
            formComponents.getResultText().setText("Clicked!");
        });

        primaryStage.show();
    }

    private void applyGridStyles(GridPane mainGrid) {
        mainGrid.setAlignment(Pos.CENTER);
        mainGrid.setHgap(GAP_SIZE);
        mainGrid.setVgap(GAP_SIZE);
        mainGrid.setPadding(new Insets(PADDING_SIZE));
    }

    private void addFormComponentsToGrid(GridPane mainGrid, FormComponents formComponents) {
        mainGrid.add(formComponents.getHeaderText(), 0, 0, 2, 1);
        mainGrid.add(formComponents.getAsciiLabelDesc(), 0, 1);
        mainGrid.add(formComponents.getAsciiCode(), 1, 1);
        mainGrid.add(formComponents.getResultLabelDesc(), 0, 2);
        mainGrid.add(formComponents.getResultText(), 1, 2);
        mainGrid.add(formComponents.getHbBtn(), 1, 4);
    }
}
