package factory;

import Singleton.Singleton;
import entities.DeveloperTask;
import entities.Task;

import java.util.Date;

public class DeveloperTaskService implements TaskService {

    private String taskName;
    private String taskDescription;
    private Date taskDate;
    private Date taskEndDate;
    private Integer priority;
    private String developerName;
    private String module;
    private String project;
    private DeveloperTask developerTask;
    private Singleton singleton;


    public DeveloperTaskService( String taskName,
                                 String taskDescription,
                                 Date taskDate,
                                 Date taskEndDate,
                                 Integer priority,
                                 String developerName,
                                 String module,
                                 String project) {

        singleton = Singleton.getInstance();

        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDate = taskDate;
        this.taskEndDate = taskEndDate;
        this.priority = priority;
        this.developerName = developerName;
        this.module = module;
        this.project = project;
    }

    @Override
    public void addTask() {
        developerTask = new DeveloperTask(taskName, taskDescription, taskDate, taskEndDate, priority, developerName, module, project);
        singleton.addTask(developerTask);

    }

    @Override
    public Task getTaskDetail() {
        return developerTask;
    }
}
