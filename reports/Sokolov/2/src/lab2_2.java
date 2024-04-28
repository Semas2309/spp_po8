import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int count = 10;
        String fileName;

        if (args.length == 4 && args[0].equals("tail") && args[1].equals("n")) {
            try {
            count = Integer.parseInt(args[2]);
            fileName = args[3]; }

            catch (NumberFormatException e)
            {
                System.out.println("Invalid command");
                return;
            }
    } else
        if (args.length == 3 && args[0].equals("tail"))
        {
            try {
                count = Integer.parseInt(args[1]);
                fileName = args[2];
                }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid command");
                return;
            }
    }
        else {
        System.out.println("Usage: tail [-n] <number of lines> file");
        return;
        }


        try (RandomAccessFile file = new RandomAccessFile(fileName, "r")) {
            long length = file.length();
            long pos = length - 1;
            int lines = 0;
            Stack<String> tailLines = new Stack<>();
            StringBuilder builder = new StringBuilder();
            for (long pointer = pos; pointer >= 0; pointer--) {
                file.seek(pointer);
                char c = (char) file.read();
                builder.append(c);

                if (c == '\n') {
                    builder = builder.reverse();
                    tailLines.push(builder.toString());
                    builder.setLength(0);
                    lines++;
                    if (lines >= count) {
                        break;
                     }
                 }
             }
    Iterator<String> iterator = tailLines.iterator();
            while (iterator.hasNext()) {
                 System.out.print(iterator.next());
            }
        } catch (IOException e) {
        System.out.println("Error reading the file: " + e.getMessage());  }
        }
        }
