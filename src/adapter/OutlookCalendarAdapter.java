package adapter;

import entities.Task;

public class OutlookCalendarAdapter implements CalendarAdapter {

    private OutlookCalendar outlookCalendar;

    public OutlookCalendarAdapter() {
        outlookCalendar = new OutlookCalendar();
    }

    @Override
    public void syncCalendar(Task task) {
        outlookCalendar.addToCalendar(task);
    }
}
