package adapter;

import entities.Task;

public class GoogleCalendarAdapter implements CalendarAdapter {


    private GoogleCalendar googleCalendar;

    public GoogleCalendarAdapter() {
        googleCalendar = new GoogleCalendar();
    }

    @Override
    public void syncCalendar(Task task) {
        googleCalendar.addToCalendar(task);
    }
}
