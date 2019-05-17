package sample.magic.window;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import sample.magic.constants.Constants;

public class FormComponents implements Constants {

    private final Text headerText;
    private final Label asciiLabelDesc;
    private final Label resultLabelDesc;
    private final HBox hbBtnCalc;
    private final HBox hbBtnClear;
    private TextField asciiCode;
    private TextField resultText;
    private Button calculateButton;
    private Button clearButton;


    public FormComponents() {
        headerText = new Text(HEADER_TEXT);
        headerText.setFont(Font.font(HEADER_FONT, FontWeight.NORMAL, HEADER_SIZE));
        asciiLabelDesc = new Label(ASCII_LABEL_DESC);
        asciiCode = new TextField();
        resultLabelDesc = new Label(RESULT_LABEL_DESC);
        resultText = new TextField();
        resultText.setStyle(RESULT_TEXT_STYLE);
        resultText.setDisable(true);
        calculateButton = new Button(CALC_BUTTON_DESC);
        hbBtnCalc = new HBox(GAP_SIZE);
        hbBtnCalc.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnCalc.getChildren().add(calculateButton);
        clearButton = new Button(CLEAR_BUTTON_DESC);
        hbBtnClear = new HBox(GAP_SIZE);
        hbBtnClear.setAlignment(Pos.BOTTOM_LEFT);
        hbBtnClear.getChildren().add(clearButton);
    }

    public Text getHeaderText() {
        return headerText;
    }

    public Label getAsciiLabelDesc() {
        return asciiLabelDesc;
    }

    public Label getResultLabelDesc() {
        return resultLabelDesc;
    }

    public TextField getAsciiCode() {
        return asciiCode;
    }

    public void setAsciiCode(TextField asciiCode) {
        this.asciiCode = asciiCode;
    }

    public TextField getResultText() {
        return resultText;
    }

    public void setResultText(TextField resultText) {
        this.resultText = resultText;
    }

    public Button getCalculateButton() {
        return calculateButton;
    }

    public Button getClearButton() {
        return clearButton;
    }

    public HBox getHbBtnCalc() {
        return hbBtnCalc;
    }

    public HBox getHbBtnClear() {
        return hbBtnClear;
    }
}
