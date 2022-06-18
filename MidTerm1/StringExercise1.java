/* Viết chương trình nhập vào chuỗi Họ và tên, chuyển phần họ của chuỗi họ và tên sang Hoa và các
ký tự còn lại sang ký tự thường. In kết quả ra màn hình đê kiêm tra.Ví dụ: Nhập vào chuỗi: nGuyEn
tHI bIch vAN. Kết quả in ra như sau: NGUYEN thi bịch van.*/
public class StringExercise1{
    static String BitchVanString(String str){
        String[] words = str.split(" ");
        String firstWord = words[0];
        String restOfString = str.substring(firstWord.length() + 1);
        String lowerCaseRestOfString = restOfString.toLowerCase();
        return firstWord.toUpperCase() + " " + lowerCaseRestOfString;
    }

    public static void main(String[] args){
        System.out.println(BitchVanString("nGuYen tHi bIch vAn"));
    }
}
