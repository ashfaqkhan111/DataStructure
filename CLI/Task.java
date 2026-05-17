package CLI;

public class Task {
    int id;
    String title,description;

    Status status;
    boolean isActive;

    Task(int id, String title,String description){
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status.PENDING;
        this.isActive = false;
    }

}
