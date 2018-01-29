package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Controller {

    String name = "none";
    String age = "null";
    String year = "xxx";


    @FXML
    private Text greatingText;
    @FXML
    private Text askingForName;
    @FXML
    private Button enterName;
    @FXML
    private TextField userInput;
    @FXML
    private Text name_age_year;
    @FXML
    private Button restartGame;




    public void nameEntered(ActionEvent actionEvent) {


        Boolean ask = true;

        String userEntry = userInput.getText();


        while(ask){
            String[] questions = {
                    "Please enter your name:",
                    "Please enter your current age:",
                    "Please enter current year:"
            };

            List<String> answers = new ArrayList<>();


            if (name.equalsIgnoreCase("none")){
                name = userEntry;
            }

            if (name.equalsIgnoreCase("null")){
                name = userEntry;
            }

            if (name.equalsIgnoreCase("xxx")){
                name = userEntry;
            }

            for(int i = 0; i < questions.length; i++) {
                //System.out.println(questions[i]);
                askingForName.setText(questions[i]);
                answers.add(userEntry);

            }

            String nameString = answers.get(0);
            String ageString = answers.get(1);
            String yearString = answers.get(2);

            int age = Integer.parseInt(ageString);
            int year = Integer.parseInt(yearString);

           // System.out.println(nameString + ", you are currently " + age + " years old.");

            int oneYear = year + 1;
            int fiveYear = year + 5;
            int tenYear = year + 10;

            int oneAge = age + 1;
            int fiveAge = age + 5;
            int tenAge = age + 10;



            //System.out.println("In " + oneYear + " you will be " + oneAge + " years old.");
            //System.out.println("In " + fiveYear + " you will be " + fiveAge + " years old.");
            //System.out.println("In " + tenYear + " you will be " + tenAge + " years old.");

            //System.out.println(nameString + ", would you like to enter a different name and age?");

            //String userResponse = robot.nextLine();
            //if(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")){
                ask = true;
            //} else {
                ask = false;
            }
            //System.out.println("Have a nice day!");
        }

        public void restartGame(ActionEvent actionEvent){
        askingForName.setText("Please enter a new name.");
        greatingText.setText("New Game");

        }

    }


//}
