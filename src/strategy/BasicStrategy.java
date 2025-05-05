package strategy;

import factory.TaskFactory;
import factory.TaskService;

import java.util.Date;

public class BasicStrategy implements Strategy {

    @Override
    public void makeTask(String category, String taskName, String taskDescription, Date taskDate, Date taskEndDate, Integer priority, String module, String project, String developerName, String meetingPlace, String meetingAddress) {
        TaskService taskService = TaskFactory.getTaskService(category, taskName, taskDescription, taskDate, taskEndDate, priority, module, project, developerName, meetingPlace, meetingAddress);
        taskService.addTask();
    }
}
