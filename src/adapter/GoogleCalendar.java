package adapter;

import entities.Task;

import java.util.Calendar;

public class GoogleCalendar {

    public void addToCalendar(Task task) {
        System.out.println("Adding to google calendar "+task.toString());
    }

}
