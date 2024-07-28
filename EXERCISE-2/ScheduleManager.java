import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private static final Logger logger = Logger.getLogger(ScheduleManager.class.getName());

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static synchronized ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) throws Exception {
        validateTask(task);
        tasks.add(task);
        logger.info("Task added successfully: " + task.getDescription());
    }

    public void removeTask(String description) throws Exception {
        boolean removed = tasks.removeIf(task -> task.getDescription().equals(description));
        if (removed) {
            logger.info("Task removed successfully: " + description);
        } else {
            throw new Exception("Error: Task not found.");
        }
    }

    public List<Task> viewTasks() {
        return tasks.stream()
                .sorted((t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()))
                .collect(Collectors.toList());
    }

    private void validateTask(Task newTask) throws Exception {
        validateTimeFormat(newTask.getStartTime());
        validateTimeFormat(newTask.getEndTime());
        for (Task task : tasks) {
            if (isOverlapping(task, newTask)) {
                throw new Exception("Task conflicts with existing task \"" + task.getDescription() + "\".");
            }
        }
    }

    private void validateTimeFormat(String time) throws Exception {
        try {
            LocalTime.parse(time);
        } catch (DateTimeParseException e) {
            throw new Exception("Error: Invalid time format.");
        }
    }

    private boolean isOverlapping(Task existingTask, Task newTask) {
        return !(newTask.getEndTime().compareTo(existingTask.getStartTime()) <= 0 ||
                newTask.getStartTime().compareTo(existingTask.getEndTime()) >= 0);
    }
}
