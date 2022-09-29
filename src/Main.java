import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Problem problem = new Problem();
        problem.writer();
    }
}

class Problem {

    public StringBuilder generateString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<100; i++){
            stringBuilder.append("TEST");
        }
        return stringBuilder;
    }

    public void writer() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\toshqaaa\\Desktop\\test.txt");

        fileOutputStream.write(generateString().toString().getBytes());

        fileOutputStream.close();
    }
}
