import java.io.*;
class Call_Bank
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Bank ob=new Bank();
        int ch;
        do
        {
            System.out.println("1=To Open New Account");
            System.out.println("2=Withdrawl");
            System.out.println("3=Deposit");
            System.out.println("4=Balance Inquiry");
            System.out.println("5=Exit");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                ob.new_account();
                break;
                case 2:
                ob.withdraw();
                break;
                case 3:
                ob.deposit();
                break;
                case 4:
                ob.bal_inquiry();
                break;
            }
            System.out.println();
        }while(ch!=5);
    }
}