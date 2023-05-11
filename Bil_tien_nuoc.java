/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doannhom;
import java.util.*;
public class Bil_tien_nuoc 
{

//    private static int number;
String ma_khach_hang;
String loai_khach_hang;
double so_nuoc_moi;
double so_nuoc_cu;
Bil_tien_nuoc(){}
Bil_tien_nuoc(String newma_khach_hang,String newloai_khach_hang,double newso_nuoc_moi,double newso_nuoc_cu)
{
    setma_khach_hang(newma_khach_hang);
    setloai_khach_hang(newloai_khach_hang);
    setso_nuoc_moi(newso_nuoc_moi);
    setso_nuoc_cu(newso_nuoc_cu);
}
String getma_khach_hang()
{
    return ma_khach_hang;
}
String getloai_khach_hang()
{
    return loai_khach_hang;
}
double getso_nuoc_moi()
{
    return so_nuoc_moi;
}
double getso_nuoc_cu()
{
    return so_nuoc_cu;
}
void setma_khach_hang(String newma_khach_hang)
{
    ma_khach_hang=newma_khach_hang;
}
void setloai_khach_hang(String newloai_khach_hang)
{
    loai_khach_hang=newloai_khach_hang;
}
void setso_nuoc_moi(double newso_nuoc_moi)
{
    so_nuoc_moi=newso_nuoc_moi;
}
void setso_nuoc_cu(double newso_nuoc_cu)
{
    so_nuoc_cu=newso_nuoc_cu;
}
void input()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("nhap loai khach hang: "); loai_khach_hang=sc.nextLine();
    System.out.println("nhap ma khach hang: "); ma_khach_hang=sc.nextLine();
    System.out.println("nhap so nuoc cu: "); so_nuoc_cu=sc.nextDouble();
    System.out.println("nhap so nuoc moi: "); so_nuoc_moi=sc.nextDouble();
}
public double price()
{
    if("cu dan".equals(loai_khach_hang))
        return 500;
    else if("doanh nghiep".equals(loai_khach_hang)||"to chuc".equals(loai_khach_hang))
        return 400;
    else
        return 300;
}
public double payment()
{
    return price()*(so_nuoc_moi-so_nuoc_cu);
}
void output()
{
    System.out.println("loai khach hang la: "+loai_khach_hang);
    System.out.println("ma khach hang la: "+ma_khach_hang);
    System.out.println("so nuoc cu la: "+so_nuoc_cu);
    System.out.println("so nuoc moi la: "+so_nuoc_moi);
    System.out.println("don gia cua khach hang la: "+price());
    System.out.println("khach hang phai thanh toan: "+payment());
}
    
    public static void main(String[] args) 
    {
        list_bill l1=new list_bill();
        l1.input();
        l1.output();
        l1.sapxepgiamdan();
        l1.sapxeptangdan();
        l1.tim_thanh_toan_lon_nhat();
        l1.tim_thanh_toan_nho_nhat();
}
}
class list_bill
{
   Bil_tien_nuoc []arr;
   int n;
   void input()
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap danh sach tinh tien nuoc: "); n=sc.nextInt();
        arr=new Bil_tien_nuoc[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("nhap thong tin khach hang thu "+i);
            arr[i]=new Bil_tien_nuoc();
            arr[i].input();
        }
   }
   void output()
   {
      for(int i=0;i<arr.length;i++)
      {
          System.out.println("danh sach tinh tien nuoc la: ");
          arr[i].output();
      }
   }
   void sapxepgiamdan()
   {
       Bil_tien_nuoc temp;
       for(int i=0;i<arr.length-1;i++)
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i].payment()<arr[j].payment())
               {
                   temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
               }
           }
   }
//nguyen van quan cap nhat

}