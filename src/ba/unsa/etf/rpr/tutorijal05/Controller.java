package ba.unsa.etf.rpr.tutorijal05;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    public TextField inputField;
    public Button buttonPercent;
    public Button buttonDivide;
    public Button buttonMultiple;
    public Button buttonDecrease;
    public Button buttonIncrease;
    public Button buttonComma;
    public Button buttonResult;
    public Button button0;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;

    private double firstNumber = 0;
    private double secondNumber = 0;
    private String method;

    public void buttonPercentClick(ActionEvent actionEvent) {
        firstNumber = Double.parseDouble(inputField.getText());
        method = "%";
    }

    public void buttonDivideClick(ActionEvent actionEvent) {

    }

    public void buttonMultipleClick(ActionEvent actionEvent) {

    }

    public void buttonDecreaseClick(ActionEvent actionEvent) {

    }

    public void buttonIncreaseClick(ActionEvent actionEvent) {
        firstNumber = Double.parseDouble(inputField.getText());
        method = "+";
    }

    public void buttonCommaClick(ActionEvent actionEvent) {

    }

    public void buttonResultClick(ActionEvent actionEvent) {
        secondNumber = Double.parseDouble(inputField.getText());

        if (method.equals("%")) {
            inputField.setText(String.valueOf(firstNumber % secondNumber));
        } else if (method.equals("/")) {
            inputField.setText(String.valueOf(firstNumber / secondNumber));
        } else if(method.equals("+")){
            inputField.setText(String.valueOf(firstNumber + secondNumber));
        }
    }

    public void button0Click(ActionEvent actionEvent) {
        double input = Double.parseDouble(inputField.getText());

        if (input != 0) {
            firstNumber = input * 10;
        }
        inputField.setText(String.valueOf(firstNumber));
    }

    public void button1Click(ActionEvent actionEvent) {
        double input = Double.parseDouble(inputField.getText());

        if (input != 0) {
            firstNumber = input * 10;
            firstNumber += 1;
        } else {
            firstNumber = 1;
        }
        inputField.setText(String.valueOf(firstNumber));
    }

    public void button2Click(ActionEvent actionEvent) {
        double input = Double.parseDouble(inputField.getText());

        if (input != 0) {
            firstNumber = input * 10;
            firstNumber += 2;
        } else {
            firstNumber = 2;
        }
        inputField.setText(String.valueOf(firstNumber));
    }

    public void button3Click(ActionEvent actionEvent) {
        double input = Double.parseDouble(inputField.getText());

        if (input != 0) {
            firstNumber = input * 10;
            firstNumber += 3;
        } else {
            firstNumber = 3;
        }
        inputField.setText(String.valueOf(firstNumber));
    }

    public void button4Click(ActionEvent actionEvent) {
        double input = Double.parseDouble(inputField.getText());

        String newInput = "";
        if (input != 0) {
            newInput += input + "4";
            firstNumber = Double.parseDouble(newInput);
            inputField.setText(String.valueOf(firstNumber));
        } else {
            firstNumber = 4;
            inputField.setText(String.valueOf((int) firstNumber));
        }


    }

    public void button5Click(ActionEvent actionEvent) {
        double input = Double.parseDouble(inputField.getText());

        if (input != 0) {
            firstNumber = input * 10;
            firstNumber += 5;
        } else {
            firstNumber = 5;
        }
        inputField.setText(String.valueOf(firstNumber));
    }

    public void button6Click(ActionEvent actionEvent) {
        double input = Double.parseDouble(inputField.getText());

        if (input != 0) {
            firstNumber = input * 10;
            firstNumber += 6;
        } else {
            firstNumber = 6;
        }
        inputField.setText(String.valueOf(firstNumber));
    }

    public void button7Click(ActionEvent actionEvent) {
        double input = Double.parseDouble(inputField.getText());

        if (input != 0) {
            firstNumber = input * 10;
            firstNumber += 7;
        } else {
            firstNumber = 7;
        }
        inputField.setText(String.valueOf(firstNumber));
    }

    public void button8Click(ActionEvent actionEvent) {
        double input = Double.parseDouble(inputField.getText());

        if (firstNumber != 0) {
            firstNumber = input * 10;
            firstNumber += 8;
        }  else {
            firstNumber = 8;
        }

        inputField.setText(String.valueOf(firstNumber));
    }

    public void button9Click(ActionEvent actionEvent) {
        double input = Double.parseDouble(inputField.getText());

        if (firstNumber != 0) {
            firstNumber = input * 10;
            firstNumber += 9;
        }  else {
            firstNumber = 9;
        }

        inputField.setText(String.valueOf(firstNumber));
    }
}
