package entities;

import java.util.Date;

public class DeveloperTask extends Task {

    private String developerName;
    private String module;
    private String project;

    public DeveloperTask(String taskName, String taskDescription, Date taskDate, Date taskEndDate, Integer priority, String developerName, String module, String project) {
        super(taskName, taskDescription, taskDate, taskEndDate, priority);
        this.developerName = developerName;
        this.module = module;
        this.project = project;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getProject() {
        return project;
    }

    @Override
    public String toString() {
        return "DeveloperTask{" +
                "developerName='" + developerName + '\'' +
                ", module='" + module + '\'' +
                ", project='" + project + '\'' +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskDate=" + taskDate +
                ", taskEndDate=" + taskEndDate +
                ", priority=" + priority +
                '}';
    }

    public void setProject(String project) {
        this.project = project;
    }
}
