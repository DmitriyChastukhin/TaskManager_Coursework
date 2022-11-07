package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

public class TodosTests {
    Todos todos;

    @BeforeEach
    void setUp() {
        todos = new Todos();
        TreeSet<String> list = new TreeSet<>();
        list.add("Пробежка");
        list.add("Акробатика");
        list.add("Учёба");

        todos.allTasks = list;
    }

    @Test
    @DisplayName("Возвращаем все задачи в отсортированном порядке")
    void allTalksSorted() {
        String expected = "Акробатика Пробежка Учёба";
        String actual = todos.getAllTasks();
        Assertions.assertEquals(expected, actual);
        System.out.println(todos.allTasks);
    }

    @Test
    @DisplayName("Проверяем добавление задачи сверх максимального количества")
    void addTaskLimit() {
        int sizeListOfAllTasks = todos.allTasks.size();
        todos.addTask("Работа");
        Assertions.assertEquals(3, sizeListOfAllTasks);
        System.out.println(todos.allTasks);
    }

    @Test
    @DisplayName("Проверяем добавление задачи в список")
    void addTaskList() {
        String taskToAdd = "Встреча";
        todos.addTask(taskToAdd);
        Assertions.assertTrue(todos.allTasks.contains(taskToAdd));
        System.out.println(todos.allTasks);
    }

    @Test
    @DisplayName("Проверяем удаление задачи из списка")
    void removeTaskList() {
        String taskToRemove = "Учёба";
        todos.removeTask(taskToRemove);
        Assertions.assertFalse(todos.allTasks.contains(taskToRemove));
        System.out.println(todos.allTasks);
    }
}
    // ваши тесты для класса Todos
