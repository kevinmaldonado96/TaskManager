package strategy;

import java.util.Date;

public interface Strategy {

    void makeTask(String category,
                  String taskName,
                  String taskDescription,
                  Date taskDate,
                  Date taskEndDate,
                  Integer priority,
                  String module,
                  String project,
                  String developerName,
                  String meetingPlace,
                  String meetingAddress);

}
