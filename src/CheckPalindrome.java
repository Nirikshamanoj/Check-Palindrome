import java.util.Scanner;
public class CheckPalindrome {
    static int findPalindrome(String s,int start,int end)
    {
        if(start>end)
            return 1;
        if((s.charAt(start))!=(s.charAt(end)))
            return 0;
        return findPalindrome(s,start+1,end-1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int n=s.length();
        int check=findPalindrome(s,0,n-1);
        System.out.println(check);

    }
}
