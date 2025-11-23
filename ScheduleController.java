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
    @FXML private ChoiceBox<Employee> sun11132;
    @FXML private ChoiceBox<Employee> sun11131;
    @FXML private ChoiceBox<Employee> sun11141;

    //10am
    @FXML private ChoiceBox<Employee> sun10am;
    @FXML private ChoiceBox<Employee> mon10am;
    @FXML private ChoiceBox<Employee> tues10am;
    @FXML private ChoiceBox<Employee> wed10am;
    @FXML private ChoiceBox<Employee> sun11129;
    @FXML private ChoiceBox<Employee> sun11128;
    @FXML private ChoiceBox<Employee> sun11140;

    //11am
    @FXML private ChoiceBox<Employee> sun11am;
    @FXML private ChoiceBox<Employee> mon11am;
    @FXML private ChoiceBox<Employee> tues11am;
    @FXML private ChoiceBox<Employee> wed11am;
    @FXML private ChoiceBox<Employee> sun11126;
    @FXML private ChoiceBox<Employee> sun11125;
    @FXML private ChoiceBox<Employee> sun11139;

    //12pm
    @FXML private ChoiceBox<Employee> sun12pm;
    @FXML private ChoiceBox<Employee> mon12pm;
    @FXML private ChoiceBox<Employee> tues12pm;
    @FXML private ChoiceBox<Employee> wed12pm;
    @FXML private ChoiceBox<Employee> sun11118;
    @FXML private ChoiceBox<Employee> sun11147;
    @FXML private ChoiceBox<Employee> sun11138;

    //1pm
    @FXML private ChoiceBox<Employee> sun1pm;
    @FXML private ChoiceBox<Employee> mon1pm;
    @FXML private ChoiceBox<Employee> tues1pm;
    @FXML private ChoiceBox<Employee> wed1pm;
    @FXML private ChoiceBox<Employee> sun11117;
    @FXML private ChoiceBox<Employee> sun11146;
    @FXML private ChoiceBox<Employee> sun11137;

    //2pm
    @FXML private ChoiceBox<Employee> sun2pm;
    @FXML private ChoiceBox<Employee> mon2pm;
    @FXML private ChoiceBox<Employee> tues2pm;
    @FXML private ChoiceBox<Employee> wed2pm;
    @FXML private ChoiceBox<Employee> sun11116;
    @FXML private ChoiceBox<Employee> sun11145;
    @FXML private ChoiceBox<Employee> sun11136;

    //3pm
    @FXML private ChoiceBox<Employee> sun3pm;
    @FXML private ChoiceBox<Employee> mon3pm;
    @FXML private ChoiceBox<Employee> tues3pm;
    @FXML private ChoiceBox<Employee> wed3pm;
    @FXML private ChoiceBox<Employee> sun11115;
    @FXML private ChoiceBox<Employee> sun11144;
    @FXML private ChoiceBox<Employee> sun11135;

    //4pm
    @FXML private ChoiceBox<Employee> sun4pm;
    @FXML private ChoiceBox<Employee> mon4pm;
    @FXML private ChoiceBox<Employee> tues4pm;
    @FXML private ChoiceBox<Employee> wed4pm;
    @FXML private ChoiceBox<Employee> sun11114;
    @FXML private ChoiceBox<Employee> sun11143;
    @FXML private ChoiceBox<Employee> sun11134;

    //5pm
    @FXML private ChoiceBox<Employee> sun5pm;
    @FXML private ChoiceBox<Employee> mon5pm;
    @FXML private ChoiceBox<Employee> tues5pm;
    @FXML private ChoiceBox<Employee> wed5pm;
    @FXML private ChoiceBox<Employee> sun11113;
    @FXML private ChoiceBox<Employee> sun11142;
    @FXML private ChoiceBox<Employee> sun11133;

    //Using Initialize to run the gui using the .fxml file
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Choice boxes dont use regular array lists so we have to convert the contents of the array list into an observable list
        ObservableList<Employee> employees =
                FXCollections.observableArrayList(employeeList);

        // Adding the lists to each of the choice boxes
        //9am
        sun9am.setItems(employees);
        wed9am.setItems(employees);
        mon9am.setItems(employees);
        tues9am.setItems(employees);
        sun11132.setItems(employees);
        sun11131.setItems(employees);
        sun11141.setItems(employees);


        //10am
        sun10am.setItems(employees);
        mon10am.setItems(employees);
        tues10am.setItems(employees);
        wed10am.setItems(employees);
        sun11128.setItems(employees);
        sun11129.setItems(employees);
        sun11140.setItems(employees);

        //11am
        sun11am.setItems(employees);
        mon11am.setItems(employees);
        tues11am.setItems(employees);
        wed11am.setItems(employees);
        sun11126.setItems(employees);
        sun11125.setItems(employees);
        sun11139.setItems(employees);

        //12pm
        sun12pm.setItems(employees);
        mon12pm.setItems(employees);
        tues12pm.setItems(employees);
        wed12pm.setItems(employees);
        sun11118.setItems(employees);
        sun11147.setItems(employees);
        sun11138.setItems(employees);

        //1pm
        sun1pm.setItems(employees);
        mon1pm.setItems(employees);
        tues1pm.setItems(employees);
        wed1pm.setItems(employees);
        sun11117.setItems(employees);
        sun11146.setItems(employees);
        sun11137.setItems(employees);

        //2pm
        sun2pm.setItems(employees);
        mon2pm.setItems(employees);
        tues2pm.setItems(employees);
        wed2pm.setItems(employees);
        sun11116.setItems(employees);
        sun11145.setItems(employees);
        sun11136.setItems(employees);

        //3pm
        sun3pm.setItems(employees);
        mon3pm.setItems(employees);
        tues3pm.setItems(employees);
        wed3pm.setItems(employees);
        sun11115.setItems(employees);
        sun11144.setItems(employees);
        sun11135.setItems(employees);

        //4pm
        sun4pm.setItems(employees);
        mon4pm.setItems(employees);
        tues4pm.setItems(employees);
        wed4pm.setItems(employees);
        sun11114.setItems(employees);
        sun11143.setItems(employees);
        sun11134.setItems(employees);

        //5pm
        sun5pm.setItems(employees);
        mon5pm.setItems(employees);
        tues5pm.setItems(employees);
        wed5pm.setItems(employees);
        sun11113.setItems(employees);
        sun11142.setItems(employees);
        sun11133.setItems(employees);
    }
}