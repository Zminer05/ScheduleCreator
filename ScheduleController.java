import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.util.HashMap;
import java.util.ArrayList;

public class ScheduleController {

    private ObservableList<Employee> employees = FXCollections.observableArrayList();
    private ObservableList<Manager> managers = FXCollections.observableArrayList();

    private HashMap<String, ArrayList<Employee>> schedule = new HashMap<>();

    @FXML private ChoiceBox<Employee> sun9am;
    @FXML private ChoiceBox<Employee> mon9am;
    @FXML private ChoiceBox<Employee> tues9am;
    @FXML private ChoiceBox<Employee> wed9am;

    @FXML
    public void initialize() {

        schedule.put("Sunday", new ArrayList<>());
        schedule.put("Monday", new ArrayList<>());
        schedule.put("Tuesday", new ArrayList<>());
        schedule.put("Wednesday", new ArrayList<>());
        schedule.put("Thursday", new ArrayList<>());
        schedule.put("Friday", new ArrayList<>());
        schedule.put("Saturday", new ArrayList<>());

        managers.add(new Manager(
                "Sarah (Mgr)", true, true,
                25.00, 40, "Shift Manager",
                "Full", true, 10
        ));

        employees.add(new Employee(
                "John", false, false, 15.50, 30, "Cashier"
        ));

        populateSelectableEmployees();
        addListener(sun9am, "Sunday");
        addListener(mon9am, "Monday");
        addListener(tues9am, "Tuesday");
        addListener(wed9am, "Wednesday");
    }

    private void populateSelectableEmployees() {
        ObservableList<Employee> all = FXCollections.observableArrayList();
        all.addAll(managers);
        all.addAll(employees);

        sun9am.setItems(all);
        mon9am.setItems(all);
        tues9am.setItems(all);
        wed9am.setItems(all);
    }

    private void addListener(ChoiceBox<Employee> box, String day) {

        box.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {

            if (newVal == null)
                return;

            boolean newIsKeyManager = (newVal instanceof Manager) && ((Manager) newVal).getHasKeys();

            boolean dayHasKeyManager = schedule.get(day).stream()
                    .anyMatch(e -> (e instanceof Manager) && ((Manager) e).getHasKeys());

            if (!newIsKeyManager && !dayHasKeyManager) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setHeaderText("Scheduling Error");
                alert.setContentText("You must assign at least ONE manager with keys to " + day + ".");
                alert.showAndWait();

                box.getSelectionModel().clearSelection();
                return;
            }

            schedule.get(day).add(newVal);
        });
    }

    public void addEmployee(Employee e) {
        employees.add(e);
        populateSelectableEmployees();
    }

    public void addManager(Manager m) {
        managers.add(m);
        populateSelectableEmployees();
    }
}
