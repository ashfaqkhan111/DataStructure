package CLI;
import java.util.*;

public class TaskManager {
    ArrayList<Task> task = new ArrayList<>();
    int idCounter = 1;

    public void addTask(String title, String desc){
        Task t = new Task(idCounter, title, desc);
        task.add(t);
        System.out.println("Task added!");
    }

    public void showTask(){
        for (Task t : task){
            System.out.println(t.id+" | "+t.title+" | "+t.status+" | Active: "+t.isActive);
        }
    }

    public void deleteTask(int id){
        task.removeIf( t -> t.id == id);
        System.out.println("Task Deleted!!");
    }

    public void updateStatus(int id, Status status){
        for (Task t : task){
            if (t.id == id){
                t.status = status;
                System.out.println("Status updated");
                return;
            }
        }
    }

    public void setActiveTask (int id){
        for (Task t : task){
            t.isActive = false;
            if (t.id == id){
                t.isActive = true;
                t.status = Status.IN_PROGRESS;
                System.out.println("Task is now ACTIVE");
            }
        }
    }

    public void


}
