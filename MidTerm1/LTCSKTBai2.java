/* Bài 2: Cho văn bản (file text) chứa các dòng văn bản, hãy thực hiện công việc sau:
 * a. Đếm xem có bao nhiêu ký tự số trong văn bản.
 * b. Đếm xem có bao nhiêu từ trong văn bản
 * c. Đếm xem có bao nhiêu kí tự thuộc bản chữ cái tiếng anh
 * |-------------------------------------------------------------|
 * | Lich thi ket thuc hoc phan CS211                           |
 * | Ngay 18/6 vao luc 15h30                                    |
 * |                                                            |
 * |------------------------------------------------------------|
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class LTCSKTBai2 {
    static void DemTuTrongFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int count = 0;
            while (line != null) {
                String[] words = line.split(" ");
                count += words.length;
                line = br.readLine();
            }
            System.out.println("So tu trong file la: " + count);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void DemSoChuSoTrongFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int count = 0;
            while (line != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    String[] numbers = words[i].split("");
                    for (int j = 0; j < numbers.length; j++) {
                        if (numbers[j].matches("[0-9]")) {
                            count++;
                        }
                    }
                }
                line = br.readLine();
            }
            System.out.println("So chu so trong file la: " + count);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void DemChuTrongFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int count = 0;
            while (line != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    for (int j = 0; j < words[i].length(); j++) {
                        if (words[i].charAt(j) >= 'a' && words[i].charAt(j) <= 'z' || words[i].charAt(j) >= 'A' && words[i].charAt(j) <= 'Z') {
                            count++;
                        }
                    }
                }
                line = br.readLine();
            }
            System.out.println("So so chu trong file la: " + count);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args)
    {
        System.out.print("Nhap duong dan file: ");
        String fileName = new Scanner(System.in).nextLine();
        DemTuTrongFile(fileName);
        DemSoChuSoTrongFile(fileName);
        DemTuTrongFile(fileName);
    }
}
