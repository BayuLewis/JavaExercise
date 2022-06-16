public class CheckDigits {
    static int GetArrayInput(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element");
            arr[i] = Integer.parseInt(System.console().readLine());
        }
        return n;
    }

    static void ShowArray(int a[], int n)
    {
        int i;
        for (i = 0; i < n; ++i)
        {
            System.out.print(a[i] + " ");
        }
    }

   static int Check2Digits(int a[], int n)
    {
         int count = 0;
         for (int i = 0; i < n; ++i)
         {
              if (a[i] >= 10 && a[i] <= 99)
                count++;
         }
         return count;
    }

    static boolean isRepresentASet(int a[], int n)
    {
        int i, j;
        for (i = 0; i < n; ++i)
        {
            for (j = i + 1; j < n; ++j)
            {
                if (a[i] == a[j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int a[] = new int[5];
        int n = GetArrayInput(a);
        ShowArray(a, n);
        System.out.println("\n"+Check2Digits(a,n));
        System.out.println("\n"+isRepresentASet(a,n));
    }
}
