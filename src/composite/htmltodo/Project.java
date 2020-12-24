package composite.htmltodo;

import java.util.List;

public class Project implements TodoList {
    String title;
    List<TodoList> todoLists;

    public Project(String title, List<TodoList> todoLists) {
        this.title = title;
        this.todoLists = todoLists;
    }

    @Override
    public String getHTML() {
        String html = "<h1>";
        html += this.title;
        html += "</h1><ul>";
        for (TodoList tl : this.todoLists) {
            html += "<li>";
            html += tl.getHTML();
            html += "</li>";
        }
        html += "</ul>";
        return html;
    }
}
