package iterator.menu;

import java.util.Calendar;

public class AlternativeDinnerMenuIterator implements Iterator {
    MenuItem[] list;
    int position;

    public AlternativeDinnerMenuIterator(MenuItem[] list) {
        this.list = list;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 2;
        return menuItem;
    }

    public String toString() {
        return "Alternating Diner Menu Iterator";
    }
}
