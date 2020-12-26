package iterator.template;

public class WordsList implements List<Word> {
    private Word[] words;

    public WordsList(Word[] words) {
        this.words = words;
    }

    @Override
    public Iterator<Word> iterator() {
        return new WordIterator(words);
    }
}
