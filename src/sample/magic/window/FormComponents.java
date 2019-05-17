package sample.magic.window;

import javafx.beans.binding.BooleanBinding;
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
    private TextField code;
    private TextField result;
    private Button calculateButton;
    private Button clearButton;


    public FormComponents() {
        headerText = new Text(HEADER_TEXT);
        headerText.setFont(Font.font(HEADER_FONT, FontWeight.NORMAL, HEADER_SIZE));
        asciiLabelDesc = new Label(ASCII_LABEL_DESC);
        code = new TextField();
        code.setPrefWidth(TEXTFIELDS_WIDTH);
        resultLabelDesc = new Label(RESULT_LABEL_DESC);
        result = new TextField();
        result.setPrefWidth(TEXTFIELDS_WIDTH);
        result.setStyle(RESULT_TEXT_STYLE);
        result.setEditable(false);
        calculateButton = new Button(CALC_BUTTON_DESC);
        calculateButton.disableProperty().bind(createBind());
        hbBtnCalc = new HBox(GAP_SIZE);
        hbBtnCalc.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnCalc.getChildren().add(calculateButton);
        clearButton = new Button(CLEAR_BUTTON_DESC);
        hbBtnClear = new HBox(GAP_SIZE);
        hbBtnClear.setAlignment(Pos.BOTTOM_LEFT);
        hbBtnClear.getChildren().add(clearButton);
    }

    private BooleanBinding createBind() {
        return new BooleanBinding() {
            {
                super.bind(code.textProperty());
            }

            @Override
            protected boolean computeValue() {
                return (code.getText().isEmpty());
            }
        };
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

    public TextField getCode() {
        return code;
    }

    public void setCode(TextField code) {
        this.code = code;
    }

    public TextField getResult() {
        return result;
    }

    public void setResult(TextField result) {
        this.result = result;
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
