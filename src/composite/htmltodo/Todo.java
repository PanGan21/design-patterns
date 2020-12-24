package composite.htmltodo;

public class Todo implements TodoList {
    String text;

    public Todo(String text) {
        this.text = text;
    }

    @Override
    public String getHTML() {
        return this.text;
    }
}
