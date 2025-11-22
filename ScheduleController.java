package com.example.groupproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ScheduleController implements Initializable {

    // Creating an array list that we will later append the employees too
    public static ArrayList<Employee> employeeList = new ArrayList<>();

    // Instantiating all the employees before the gui is created.
    static {
        employeeList.add(new Employee("Logan", true, true, 15.75, 40, "worker"));
        employeeList.add(new Employee("John", true, false, 10.50, 20, "worker"));
        employeeList.add(new Employee("Mason", true, true, 16.25, 30, "worker"));
        employeeList.add(new Employee("Ava", false, false, 11.75, 25, "worker"));
        employeeList.add(new Manager("Avery", true, true, 22.00, 40, "Manager", "District", true, 7));
    }


    // FXML ChoiceBoxes and their IDs
    @FXML private ChoiceBox<Employee> sun9am;
    @FXML private ChoiceBox<Employee> mon9am;
    @FXML private ChoiceBox<Employee> tues9am;
    @FXML private ChoiceBox<Employee> wed9am;
    // ** add others here **

    //Using Initialize to run the gui using the .fxml file
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Choice boxes dont use regular array lists so we have to convert the contents of the array list into an observable list
        ObservableList<Employee> employees =
                FXCollections.observableArrayList(employeeList);

        // Adding the lists to each of the choice boxes
        sun9am.setItems(employees);
        mon9am.setItems(employees);
        tues9am.setItems(employees);
        wed9am.setItems(employees);
        // ** add others here **
    }
}