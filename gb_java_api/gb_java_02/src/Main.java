import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ololo"));

//        writeTest2File();

        System.out.println(Arrays.toString(getDirContent()));

        write2File(getDirContent());

    }

    public static Boolean isPalindrome(String str) {
        StringBuilder checkPl = new StringBuilder(str);
        checkPl.reverse();
        String reversedStr = new String(checkPl);
        return (str.equals(reversedStr));
    }

    public static void writeTest2File() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            s.append("TEST ");
        }
//        System.out.println(s);
        try (FileWriter testWriter = new FileWriter("test.txt")) {
            testWriter.write(String.valueOf(s));
        } catch (Exception error) {
            error.printStackTrace();
        } finally {
            System.out.println("Конец работы с файлом");
        }
    }

    public static String[] getDirContent(){
        try {
            String pathProject = System.getProperty("user.dir");
            File dir = new File(pathProject);
            return dir.list();
        } catch (Exception e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    public static void write2File(String[] data) {
        String strData = String.join(", ", data);
        String pathProject = System.getProperty ("user.dir") ;
        String pathFile = pathProject.concat(File.separator + "dirList.txt");
        try {
//            File file = new File(pathFile);
//            FileWriter fileWriter = new FileWriter(file, true);
            FileWriter fileWriter = new FileWriter(pathFile, true);
            fileWriter.write(strData);
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


