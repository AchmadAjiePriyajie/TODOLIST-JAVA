package entity;

public class Todolist {
    private String todo;

    public Todolist(String todo) {
        this.todo = todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
 
    public String getTodo() {
        return todo;
    }
}
