package iterator.socialmedia;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
