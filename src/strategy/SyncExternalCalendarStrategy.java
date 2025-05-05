package strategy;

import adapter.CalendarAdapter;
import adapter.GoogleCalendarAdapter;
import adapter.OutlookCalendarAdapter;
import factory.TaskFactory;
import factory.TaskService;

import java.util.Date;

public class SyncExternalCalendarStrategy implements Strategy {

    private CalendarAdapter calendarAdapter;

    @Override
    public void makeTask(String category, String taskName, String taskDescription, Date taskDate, Date taskEndDate, Integer priority, String module, String project, String developerName, String meetingPlace, String meetingAddress) {
        TaskService taskService = TaskFactory.getTaskService(category, taskName, taskDescription, taskDate, taskEndDate, priority, module, project, developerName, meetingPlace, meetingAddress);
        taskService.addTask();

        calendarAdapter = new GoogleCalendarAdapter();
        calendarAdapter.syncCalendar(taskService.getTaskDetail());

        calendarAdapter = new OutlookCalendarAdapter();
        calendarAdapter.syncCalendar(taskService.getTaskDetail());
    }
}
