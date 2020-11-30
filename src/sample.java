import java.util.Scanner;

class GFG
{
    static String output="";
    static void pair(String input,int i)
    {
        output = output + input.charAt(i);
        if (i == input.length() - 1)
            return;
        if (input.charAt(i) == input.charAt(i+1))
            output = output + '*';

        pair(input, i+1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        pair(input,0);
        System.out.println(output);
    }
}
