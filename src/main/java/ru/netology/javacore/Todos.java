package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;

public class Todos {
    TreeSet<String> allTasks;
    private static final int MAX_NUMBER_TASKS = 7;

    public Todos() {

        allTasks = new TreeSet<>();
    }

    public void addTask(String task) {

        if (allTasks.size() < MAX_NUMBER_TASKS) {
            allTasks.add(task);
        }
    }

    public void removeTask(String task) {

        allTasks.remove(task);
    }

    public String getAllTasks() {

        String sortedAllTasks = this.allTasks.stream()
                .collect(Collectors.joining(" "));
        return sortedAllTasks;
    }
}
