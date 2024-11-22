import java.util.ArrayList;

public class TaskManager {
    private ArrayList<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("\n=== Task List ===");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, tasks.get(i));
            }
        }
    }

    public void removeTask(int index) {
        if (index <= 0 || index > tasks.size()) {
            System.out.println("Invalid task number.");
        } else {
            tasks.remove(index - 1);
            System.out.println("Task removed successfully!");
        }
    }
}
