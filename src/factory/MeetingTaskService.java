package factory;

import Singleton.Singleton;
import entities.MeetingTask;
import entities.Task;

import java.util.Date;

public class MeetingTaskService implements TaskService {

    private String taskName;
    private String taskDescription;
    private Date taskDate;
    private Date taskEndDate;
    private Integer priority;
    private String meetingPlace;
    private String meetingAddress;
    private MeetingTask meetingTask;

    private Singleton singleton;


    public MeetingTaskService( String taskName,
                               String taskDescription,
                               Date taskDate,
                               Date taskEndDate,
                               Integer priority,
                               String meetingPlace,
                               String meetingAddress) {
        singleton = Singleton.getInstance();

        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDate = taskDate;
        this.taskEndDate = taskEndDate;
        this.priority = priority;
        this.meetingPlace = meetingPlace;
        this.meetingAddress = meetingAddress;
    }


    @Override
    public void addTask() {
        meetingTask = new MeetingTask(taskName, taskDescription, taskDate, taskEndDate, priority, meetingPlace, meetingAddress);
        singleton.addTask(meetingTask);
    }

    @Override
    public Task getTaskDetail() {
        return meetingTask;
    }
}
