package ss17.exercise.exercise2;

import java.io.*;

public class CoppyFile {
    private static final String SOURCE_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\ss17\\exercise\\exercise2\\hoa.jpg";
    private static final String DEST_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\ss17\\exercise\\exercise2\\hoacopy.jpg";
    public static void coppyFile(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        try {
            coppyFile(new File(SOURCE_FILE), new File(DEST_FILE));
            System.out.println("Coppy xong");
        } catch (IOException e) {
            System.out.println("Khong the coppy");
        }
    }
}
