package BT_Copy_File_Nhi_Phan;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/BT_Copy_File_Nhi_Phan/TestOut.txt"));
            Student student = new Student(1, "Tran Hao Phong", "Ha Noi", 17);
            oos.writeObject(student);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("TestOut.txt"));
            Student student = (Student) ois.readObject();
            System.out.println(student.toString());
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
