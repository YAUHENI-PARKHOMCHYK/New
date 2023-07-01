package lesson10;

public class Translator {
    String wordRus;
    String wordEng;

    public Translator(String wordRus, String wordEng) {
        this.wordRus = wordRus;
        this.wordEng = wordEng;
    }

    @Override
    public String toString() {
        return "Translator{" +
                "wordRus='" + wordRus + '\'' +
                ", wordEng='" + wordEng + '\'' +
                '}';
    }
}
