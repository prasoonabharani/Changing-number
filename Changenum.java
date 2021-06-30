import java.io.*;
import java.util.*;
public class Changenum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int r=0,s=0,z=1;
int n= sc.nextInt();
int x= sc.nextInt();
int y= sc.nextInt();
while(n!=0)
{
r=n%10;
if(r==x)
{s=s+y*z;}
else
{s=s+r*z;}
z=z*10;
n=n/10;
}
System.out.println(s);
}}