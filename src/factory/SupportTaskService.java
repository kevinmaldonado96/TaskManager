package factory;

import Singleton.Singleton;
import entities.MeetingTask;
import entities.SupportTask;
import entities.Task;

import java.util.Date;

public class SupportTaskService implements TaskService {

    private String taskName;
    private String taskDescription;
    private Date taskDate;
    private Date taskEndDate;
    private Integer priority;
    private String module;
    private String project;
    private SupportTask supportTask;

    private Singleton singleton;

    public SupportTaskService(  String taskName,
                                String taskDescription,
                                Date taskDate,
                                Date taskEndDate,
                                Integer priority,
                                String module,
                                String project) {
        singleton = Singleton.getInstance();


        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDate = taskDate;
        this.taskEndDate = taskEndDate;
        this.priority = priority;
        this.module = module;
        this.project = project;
    }

    @Override
    public void addTask() {
        supportTask = new SupportTask(taskName, taskDescription, taskDate, taskEndDate, priority, module, project);
        singleton.addTask(supportTask);
    }

    @Override
    public Task getTaskDetail() {
        return supportTask;
    }
}
