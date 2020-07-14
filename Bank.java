import java.io.*;
class Bank
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    public void new_account()throws IOException
    {
        FileWriter fw=new FileWriter("D:\\Bank.csv",true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        FileReader fr=new FileReader("D:\\Bank.csv");
        BufferedReader fbr=new BufferedReader(fr);
        String line;
        int count=0;
        while((line=fbr.readLine())!=null)
        {
            count++;
        }
        System.out.println("Your Account Number is : "+(count+1));
        System.out.println("Enter Your Name");
        String n=br.readLine();
        System.out.println("Enter Amount");
        int m=Integer.parseInt(br.readLine());
        pw.println(n+","+m);
        System.out.println("Your Account Has Been Opened Successfully.");
        fbr.close();
        fr.close();
        pw.close();
        bw.close();
        fw.close();
    }
    
    public void withdraw()throws IOException
    {
        boolean b=false;
        FileWriter fw=new FileWriter("D:\\temp.csv");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        FileReader fr=new FileReader("D:\\Bank.csv");
        BufferedReader fbr=new BufferedReader(fr);
        System.out.println("Enter Your Account Number");
        int ac=Integer.parseInt(br.readLine());
        System.out.println("Enter Money");
        int m=Integer.parseInt(br.readLine());
        int count=0;
        String line;
        while((line=fbr.readLine())!=null)
        {
            String ar[]=line.split(",");
            count++;
            int convert=Integer.parseInt(ar[1]);
            if(count==ac)
            {
                b=true;
                convert=convert-m;
                ar[1]=String.valueOf(convert);
            }
            pw.println(ar[0]+","+ar[1]);
        }
        fbr.close();
        fr.close();
        pw.close();
        bw.close();
        fw.close();
        File f1=new File("D:\\Bank.csv");
        File f2=new File("D:\\temp.csv");
        if(b==true)
        {
            System.out.println("Your Transaction Was Successful.");
            f1.delete();
            f2.renameTo(f1);
        }
        else
        {
            System.out.println("Wrong Account Number");
        }
    }
    
    public void deposit()throws IOException
    {
        boolean b=false;
        FileWriter fw=new FileWriter("D:\\temp.csv");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        FileReader fr=new FileReader("D:\\Bank.csv");
        BufferedReader fbr=new BufferedReader(fr);
        System.out.println("Enter Your Account Number");
        int ac=Integer.parseInt(br.readLine());
        System.out.println("Enter Money");
        int m=Integer.parseInt(br.readLine());
        int count=0;
        String line;
        while((line=fbr.readLine())!=null)
        {
            String ar[]=line.split(",");
            count++;
            int convert=Integer.parseInt(ar[1]);
            if(count==ac)
            {
                b=true;
                convert=convert+m;
                ar[1]=String.valueOf(convert);
            }
            pw.println(ar[0]+","+ar[1]);
        }
        fbr.close();
        fr.close();
        pw.close();
        bw.close();
        fw.close();
        File f1=new File("D:\\Bank.csv");
        File f2=new File("D:\\temp.csv");
        if(b==true)
        {
            System.out.println("Your Transaction Was Successful.");
            f1.delete();
            f2.renameTo(f1);
        }
        else
        {
            System.out.println("Wrong Account Number");
        }
    }
    
    public void bal_inquiry()throws IOException
    {
        boolean b=false;
        FileReader fr=new FileReader("D:\\Bank.csv");
        BufferedReader fbr=new BufferedReader(fr);
        System.out.println("Enter Your Account Number");
        int ac=Integer.parseInt(br.readLine());
        int count=0;
        String line;
        while((line=fbr.readLine())!=null)
        {
            String ar[]=line.split(",");
            count++;
            if(count==ac)
            {
                b=true;
                System.out.println(ar[0]+" you have Rs:"+ar[1]+" in your account.");
                System.out.println();
            }
        }
        fbr.close();
        fr.close();
        if(b==true)
        {
            System.out.println("Your Transaction Was Successful.");
        }
        else
        {
            System.out.println("Wrong Account Number");
        }
    }
}
        
    
    
      