import java.util.Date;

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
            return "Task: " + description + " | Due Date: " + dueDate;
        }
    }

    // Array to store the Todo items
    private TodoItem[] todoItems;
    private int count;

    // Constructor
    public TodoList(int size) {
        todoItems = new TodoItem[size];
        count = 0;
    }

    // Method to add a Todo item
    public void addTodoItem(String description) {
        if (count < todoItems.length) {
            todoItems[count] = new TodoItem(description);
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

        // Add some todo items
        myTodoList.addTodoItem("Finish Java assignment");
        myTodoList.addTodoItem("Grocery shopping");
        
        // Display all items
        myTodoList.displayTodoItems();
    }
}
