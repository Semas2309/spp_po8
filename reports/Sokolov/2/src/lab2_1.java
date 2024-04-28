import java.io.*;

public class FileComparator {
    public static void main(String[] args) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("file2.txt"));

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            int lineNum = 1;
            while (line1 != null || line2 != null) {
                if (!line1.equalsIgnoreCase(line2)) {
                    System.out.println("Two files differ at line:" + lineNum);
                    System.out.println("File1 has:" + line1 + " and File2 has:" + line2);
                    break;
                }

                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNum++;
            }

            if (line1 == null && line2 == null) {
                System.out.println("Two files have same content.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
