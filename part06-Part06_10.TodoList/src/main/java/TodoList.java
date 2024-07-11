import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todoList.add(task);
    }
    
    public void print() {
        
        int index = 1;
        
        for(String list: todoList) {
            System.out.println(index + ": " + list);
            index++;
        }
    }
    
    public void remove(int number) {
        
        if (number > 0 && number <= this.todoList.size()) {
            this.todoList.remove(number - 1);
        }
    }
    
    
}
