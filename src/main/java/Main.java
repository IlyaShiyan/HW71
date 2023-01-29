import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter out = new BufferedWriter(new FileWriter("C:/Test/File1.txt"));
        try {
            String inputLine = null;
            do {
                inputLine=in.readLine();
                if (inputLine.length()>3){
                out.write(inputLine);
                out.newLine();}
            } while (!inputLine.equalsIgnoreCase("."));
            System.out.print("Write Successful");
        } catch(IOException e1) {
            System.out.println("Error during reading/writing");
        } finally {
            out.close();
            in.close();
        }
    }
}
