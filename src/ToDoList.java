import java.util.ArrayList;
import java.util.List;

/**
 * A simple to-do list class that allows users to add, remove, and manage tasks.
 */
public class ToDoList {
    private List<Task> tasks;

    /**
     * Constructor initializes an empty to-do list.
     */
    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Adds a new task to the list.
     *
     * @param description
     *            The task description.
     */
    public void addTask(String description) {
        this.tasks.add(new Task(description));
        System.out.println("Task added: " + description);
    }

    /**
     * Removes a task from the list by description.
     *
     * @param description
     *            The task description to remove.
     * @return true if the task was removed, false otherwise.
     */
    public boolean removeTask(String description) {
        for (Task task : this.tasks) {
            if (task.getDescription().equals(description)) {
                this.tasks.remove(task);
                System.out.println("Task removed: " + description);
                return true;
            }
        }
        System.out.println("Task not found: " + description);
        return false;
    }

    /**
     * Marks a task as completed.
     *
     * @param description
     *            The task description to mark as completed.
     * @return true if successfully marked, false otherwise.
     */
    public boolean markTaskCompleted(String description) {
        for (Task task : this.tasks) {
            if (task.getDescription().equals(description)) {
                task.setCompleted(true);
                System.out.println("Task completed: " + description);
                return true;
            }
        }
        System.out.println("Task not found: " + description);
        return false;
    }

    /**
     * Displays the list of tasks.
     */
    public void displayTasks() {
        if (this.tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("To-Do List:");
            for (Task task : this.tasks) {
                System.out.println(task);
            }
        }
    }

    /**
     * The main method for testing the to-do list functionality.
     */
    public static void main(String[] args) {
        ToDoList myList = new ToDoList();

        myList.addTask("Finish homework");
        myList.addTask("Go to the gym");
        myList.addTask("Read a book");

        myList.displayTasks();

        myList.markTaskCompleted("Go to the gym");
        myList.displayTasks();

        myList.removeTask("Read a book");
        myList.displayTasks();
    }
}

/**
 * A class representing a task in the to-do list.
 */
class Task {
    private String description;
    private boolean isCompleted;

    /**
     * Constructor to create a new task.
     *
     * @param description
     *            The task description.
     */
    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
    }

    @Override
    public String toString() {
        String status;
        if (this.isCompleted) {
            status = "[✔] ";
        } else {
            status = "[ ] ";
        }
        return status + this.description;
    }
}
