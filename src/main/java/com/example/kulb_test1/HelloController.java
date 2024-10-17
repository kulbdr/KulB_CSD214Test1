package com.example.kulb_test1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField userName;
    public PasswordField passWord;
    @FXML
    private Label welcomeText;
    private int invalidRequest;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }



    @FXML
    private void showAlert(String s) {
    }



    Integer att =5;

    public void Submit(ActionEvent actionEvent) {

        String username = userName.getText();
        String password = passWord.getText();



        if (username.isEmpty() || password.isEmpty()) {
            welcomeText.setText("Please Provide Username or Password.");
        } else if (username.equals("kul") && password.equals("456")) {

            att=5;

            welcomeText.setText("Success");
        } else if (username.equals("kul") && password!="456") {
            if(att>0){

                att--;
                welcomeText.setText("Sorry, Invalid Username or Password. You have "+att+" left");
            }else if(att==0){
                welcomeText.setText("Account Locked!!");


            }

        }  else {
            welcomeText.setText("Sorry, Invalid Username or Password.");
        }

    }
}

