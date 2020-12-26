package iterator.menu;

public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.length > position;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }
}
