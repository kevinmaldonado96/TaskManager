package adapter;

import entities.Task;

public class OutlookCalendar {

    public void addToCalendar(Task task) {
        System.out.println("Adding to google calendar "+task.toString());
    }
}
