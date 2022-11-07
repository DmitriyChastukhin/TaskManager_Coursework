package ru.netology.javacore;

public class OperationRequest {
    private String type;
    private String task;

    public OperationRequest(String type, String task) {
        this.type = type;
        this.task = task;
    }

    public String getType() {
        return type;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "{ \"type: " + type +
                ", \"task: " + task + " }";
    }
}
