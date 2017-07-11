# tamil
import java.io.*;
import java.util.*;
public class Reversenum
{
  
  public static void main(String args[])throws IOException
  {
    
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    int num=0,reversenum=0;
    System.out.println("Enter the number");
    num=Integer.parseInt(br.readLine());
    while(num!=0)
    {
      
      reversenum=reversenum * 10;
      reversenum=reversenum + num % 10;
      num=num/10;
      }
      System.out.println("reverse of input number is:"+reversenum);
      }
      }

    

