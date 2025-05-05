package entities;

import java.util.Date;

public class MeetingTask extends Task {

    private String meetingPlace;
    private String meetingAddress;

    public MeetingTask(String taskName, String taskDescription, Date taskDate, Date taskEndDate, Integer priority, String meetingPlace, String meetingAddress) {
        super(taskName, taskDescription, taskDate, taskEndDate, priority);
        this.meetingPlace = meetingPlace;
        this.meetingAddress = meetingAddress;
    }

    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    public String getMeetingAddress() {
        return meetingAddress;
    }

    public void setMeetingAddress(String meetingAddress) {
        this.meetingAddress = meetingAddress;
    }

    @Override
    public String toString() {
        return "MeetingTask{" +
                "meetingPlace='" + meetingPlace + '\'' +
                ", meetingAddress='" + meetingAddress + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskDate=" + taskDate +
                ", taskEndDate=" + taskEndDate +
                ", priority=" + priority +
                '}';
    }
}
