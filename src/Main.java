import Singleton.Singleton;
import entities.Category;
import entities.Task;
import strategy.BasicStrategy;
import strategy.Strategy;
import strategy.SyncExternalCalendarStrategy;

import javax.swing.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer menu = 0;

        String developerName = null;
        String module = null;
        String project = null;
        String category = null;
        String meetingPlace = null;
        String meetingAddress = null;
        Strategy strategy = null;
        String taskName = null;
        String taskDescription = null;
        Date startDate = null;
        Date endDate = null;
        Integer priority = null;

        do {
            strategy = new BasicStrategy();


            menu = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n 1. crear tarea desarrollo \n 2. crear tarea reunión \n 3. crear tarea soporte \n 4. ver tareas \n 0. salir"));
            if(menu > 0 && menu < 4) {
                taskName = JOptionPane.showInputDialog("Ingrese el nombre del tarea: ");
                taskDescription = JOptionPane.showInputDialog("Ingrese el descripcion del tarea: ");
                startDate = new Date();


                String taskEndDate = JOptionPane.showInputDialog("Ingrese la fecha final de la tarea: ");
                LocalDate endLocalDate = LocalDate.parse(taskEndDate, DateTimeFormatter.ISO_LOCAL_DATE);
                endDate = Date.from(endLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

                priority = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el prioridad del tarea: "));
            }
            switch (menu) {
                case 1:
                    developerName = JOptionPane.showInputDialog("Ingrese el nombre del desarrollador: ");
                    module = JOptionPane.showInputDialog("Ingrese el modulo del proyecto: ");
                    project = JOptionPane.showInputDialog("Ingrese el projecto del tarea: ");
                    category = Category.DEVELOPER_TASK.toString();

                    break;

                case 2:
                    meetingAddress = JOptionPane.showInputDialog("Ingrese la direccion de la reunción: ");
                    meetingPlace = JOptionPane.showInputDialog("Ingrese el lugar de la tarea");
                    category = Category.MEETING_TASK.toString();

                    break;

                case 3:
                    module = JOptionPane.showInputDialog("Ingrese el modulo del proyecto: ");
                    project = JOptionPane.showInputDialog("Ingrese el projecto del tarea: ");
                    category = Category.SUPPORT_TASK.toString();

                    break;
                case 4:
                    Singleton singleton = Singleton.getInstance();
                    List<Task> tasks = singleton.getTasks();

                    System.out.println("Mostrando tareas");
                    tasks.forEach(task -> {System.out.println(task.toString());});
            }

            Integer replicaTask = Integer.parseInt(JOptionPane.showInputDialog("Quiere replicar esta tarea con sistemas externos: "));
            if (replicaTask == 1){
                strategy = new SyncExternalCalendarStrategy();
            }

            strategy.makeTask(category, taskName, taskDescription, startDate, endDate, priority, module, project, developerName, meetingPlace, meetingAddress);

        } while(menu != 0);



    }


}