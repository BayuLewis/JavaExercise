/* Bai 1:
 * a. Tạo ngẫu nhiên mảng số nguyên có n phần tử (n nguyên dương được nhập vào từ bàn phím).
 * Sau đó thực hiện các yêu cầu trên mảng số nguyên đó
 * b. Liệt kê các số đối xứng
 * c. Tính tổng của Max + Min
 * Ví dụ: n =7. Mảng: {12, 33, 29, 11, 54, 14}
 * Kết quả câu b: 33 11
 * Kết quả câu c: 54 + 11
 */
import java.util.Scanner;

public class LTCSKTBai1 {
    static void NhapMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(new Scanner(System.in).nextLine());
        }
    }

    static void XuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static int DaoNguoc(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return reverse;
    }

    static boolean KiemTraDoiXung(int n) {
        int reverse = DaoNguoc(n);
        if (reverse == n) {
            return true;
        }
        return false;
    }

    static int TongMaxVaMinTrongMang(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max + min;
    }

    public static void main(String[] args)
    {
        int[] arr = new int[6];
        int n = 6;
        NhapMang(arr);
        XuatMang(arr);
        for(int i = 0; i<n;i++)
        {
            if(KiemTraDoiXung(arr[i])) { 
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\nTong cua max va min la: " + TongMaxVaMinTrongMang(arr));
    }

}
