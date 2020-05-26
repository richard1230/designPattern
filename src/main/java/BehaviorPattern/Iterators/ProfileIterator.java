package BehaviorPattern.Iterators;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
