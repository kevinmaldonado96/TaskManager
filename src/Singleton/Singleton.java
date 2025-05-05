package Singleton;

import entities.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Singleton {
    private List<Task> tasks;
    private static Singleton instance;

    private Singleton() {
        tasks = new ArrayList<>();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return this.orderTasks();
    }

    public List<Task> orderTasks() {
        return tasks.stream().sorted(Comparator.comparing(Task::getPriority)).collect(Collectors.toList());
    }



}
