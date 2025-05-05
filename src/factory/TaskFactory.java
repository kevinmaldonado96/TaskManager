package factory;

import entities.Category;

import java.util.Date;

public class TaskFactory {

    public static TaskService getTaskService(
                                            String category,
                                            String taskName,
                                            String taskDescription,
                                            Date taskDate,
                                            Date taskEndDate,
                                            Integer priority,
                                            String module,
                                            String project,
                                            String developerName,
                                            String meetingPlace,
                                            String meetingAddress) {

        Category categoryEnum = Category.valueOf(category);

        return switch (categoryEnum){
            case DEVELOPER_TASK -> new DeveloperTaskService(taskName, taskDescription, taskDate, taskEndDate, priority, module, project, developerName);
            case MEETING_TASK -> new MeetingTaskService(taskName, taskDescription, taskDate, taskEndDate, priority, meetingPlace, meetingAddress);
            case SUPPORT_TASK -> new SupportTaskService(taskName, taskDescription, taskDate, taskEndDate, priority, module, project);
            default -> throw new IllegalArgumentException("Unknown category: " + category);
        };

    }



}
