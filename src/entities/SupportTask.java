package entities;

import java.util.Date;

public class SupportTask extends Task{

    private String module;
    private String project;

    public SupportTask(String taskName, String taskDescription, Date taskDate, Date taskEndDate, Integer priority, String module, String project) {
        super(taskName, taskDescription, taskDate, taskEndDate, priority);
        this.module = module;
        this.project = project;
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

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "SupportTask{" +
                "module='" + module + '\'' +
                ", project='" + project + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskDate=" + taskDate +
                ", taskEndDate=" + taskEndDate +
                ", priority=" + priority +
                '}';
    }
}
