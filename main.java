import java.util.Date;
import java.text.SimpleDateFormat;

public class TodoList {
    // Class to represent a single Todo item with a description and a due date
    class TodoItem {
        String description;
        Date dueDate;

        public TodoItem(String description, Date dueDate) {
            this.description = description;
            this.dueDate = dueDate;
        }

        @Override
        public String toString() {
            return "Task: " + description + " | Due Date: " + dateFormat.format(dueDate);
        }
    }

    // Array to store the Todo items
    private TodoItem[] todoItems;
    private int count;
    SimpleDateFormat dateFormat; 

    // Constructor
    public TodoList(int size) {
        todoItems = new TodoItem[size];
        count = 0;
        dateFormat = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
    }

    // Method to add a Todo item
    public void addTodoItem(String description, Date myDueDate) {
        if (count < todoItems.length) {
            todoItems[count] = new TodoItem(description, myDueDate);
            count++;
        } else {
            System.out.println("Todo list is full!");
        }
    }
    
    // Method to display all Todo items
    public void displayTodoItems() {
        for (int i = 0; i < count; i++) {
            System.out.println(todoItems[i]);
        }
    }

    public static void main(String[] args) {
        // Create a TodoList object with space for 5 items
        TodoList myTodoList = new TodoList(5);

        Date currentDate = new Date();
        // Add some todo items
        myTodoList.addTodoItem("Finish Java assignment", currentDate);
        myTodoList.addTodoItem("Grocery shopping", currentDate);
        
        // Display all items
        myTodoList.displayTodoItems();
    }
}
