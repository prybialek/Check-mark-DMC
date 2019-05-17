package sample.magic.window;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sample.magic.constants.Constants;
import sample.magic.converter.CodeConverter;

public class WindowConfig implements Constants {

    public void loadWindow(Stage primaryStage) {

        primaryStage.setResizable(false);
        primaryStage.setTitle(WINDOW_TITLE);
        GridPane mainGrid = new GridPane();

        FormComponents formComponents = new FormComponents();
        applyGridStyles(mainGrid);
        addFormComponentsToGrid(mainGrid, formComponents);

        formComponents.getCalculateButton().setOnAction(e ->
                formComponents.getResult().setText(CodeConverter.convert(formComponents.getCode().getText()))
        );

        formComponents.getClearButton().setOnAction(e -> clearForm(formComponents));

        primaryStage.setScene(new Scene(mainGrid, WINDOW_WIDTH, WINDOW_HEIGHT));
        primaryStage.show();
    }

    private void clearForm(FormComponents formComponents) {
        formComponents.getResult().setText("");
        formComponents.getCode().setText("");
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
        mainGrid.add(formComponents.getCode(), 1, 1);
        mainGrid.add(formComponents.getResultLabelDesc(), 0, 2);
        mainGrid.add(formComponents.getResult(), 1, 2);
        mainGrid.add(formComponents.getHbBtnCalc(), 1, 4);
        mainGrid.add(formComponents.getHbBtnClear(), 0, 4);
    }
}
