package iterator.template;

public interface Aggregator<T> {
    Iterator<T> getIterator();
}
