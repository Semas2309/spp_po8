public class Main {
    public static void main(String[] args) {
        Paragraph p1 = new Paragraph("Это первый абзац.");
        Paragraph p2 = new Paragraph("Это второй абзац.");

        Text text = new Text();
        text.addParagraph(p1);
        text.addParagraph(p2);

        text.printText();
    }
}
