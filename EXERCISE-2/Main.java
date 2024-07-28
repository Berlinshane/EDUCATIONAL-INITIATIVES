import java.util.List;
import java.util.Scanner;

public class Main {
    private static final ScheduleManager scheduleManager = ScheduleManager.getInstance();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    viewTasks();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void showMenu() {
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. View Tasks");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addTask() {
        try {
            System.out.print("Enter description: ");
            String description = scanner.nextLine();
            System.out.print("Enter start time (HH:MM): ");
            String startTime = scanner.nextLine();
            System.out.print("Enter end time (HH:MM): ");
            String endTime = scanner.nextLine();
            System.out.print("Enter priority (High/Medium/Low): ");
            String priority = scanner.nextLine();
            Task task = TaskFactory.createTask(description, startTime, endTime, priority);
            scheduleManager.addTask(task);
            System.out.println("Task added successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void removeTask() {
        System.out.print("Enter description of task to remove: ");
        String description = scanner.nextLine();
        try {
            scheduleManager.removeTask(description);
            System.out.println("Task removed successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void viewTasks() {
        List<Task> tasks = scheduleManager.viewTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}
