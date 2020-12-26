package iterator.menu;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }

    @Override
    public boolean hasNext() {
        return items.size() > position;
    }

}
