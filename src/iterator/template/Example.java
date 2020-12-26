package iterator.template;

public class Example {
    public static void main(String[] args) {
        Word[] words = new Word[5];
        words[0] = new Word("words1");
        words[1] = new Word("words2");
        words[2] = new Word("words3");
        words[3] = new Word("words4");
        words[4] = new Word("words5");

        List<Word> list = new WordsList(words);

        Iterator<Word> iterator = list.iterator();

        while(iterator.hasNext()) {
            Word currentWord = iterator.next();
            System.out.println(currentWord.getWord());
        }
    }
}
