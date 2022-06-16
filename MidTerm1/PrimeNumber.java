class PrimeNumber 
{
    static void PrimeCheck(int n)
    {
        int i, flag = 0;
        for (i = 2; i <= n / 2; ++i)
        {
            if (n % i == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }

    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter a number");
        n = Integer.parseInt(System.console().readLine());
        PrimeCheck(n);
    }
}