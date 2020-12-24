package composite.htmltodo;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Todo todoList1 = new Todo("todoList 1");
        Todo todoList2 = new Todo("todoList 2");
        List<TodoList> todoList = new ArrayList<>();
        todoList.add(todoList1);
        todoList.add(todoList2);
        Project project1 = new Project("Project 1", todoList);
        System.out.println(project1.getHTML());
    }
}
