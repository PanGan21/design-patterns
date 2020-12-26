package iterator.template;

public class WordIterator implements Iterator<Word> {
    private Word[] wordsCollection;
    private int position;

    public WordIterator(Word[] wordsCollection) {
        this.wordsCollection = wordsCollection;
        this.position = 0;
    }

    @Override
    public void reset() {
        this.position = 0;
    }

    @Override
    public Word next() {
        return wordsCollection[position++];
    }

    @Override
    public Word currentItem() {
        return wordsCollection[position];
    }

    @Override
    public boolean hasNext() {
        if(position >= wordsCollection.length)
            return false;
        return true;
    }
}
