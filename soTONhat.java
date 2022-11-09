package quan;

import java.util.Scanner;

public class soTONhat {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  System.out.println("nhap vao so phan tu:");
  int n = sc.nextInt();
  int a[] = new int[n];    
     for(int i = 0 ; i< a.length;i++){
      System.out.println("nhap vao mang: "+i);
      int temp = sc.nextInt();
  a[i] = temp;
     }
     System.out.println("cac phan tu duoc nhap");
for (int i : a) {
  System.out.print(i+"");
}
System.out.println("tong cac so la: ");
int sum = 0;
for (int i : a) {
  sum +=i;
}
System.out.println(sum);
int max = Integer.MIN_VALUE;
for (int i : a) {
  if(max<i){
    max = i;
  }
  

  
}
System.out.println("phan tu lon nhat la "+max);


    }
  }

    
