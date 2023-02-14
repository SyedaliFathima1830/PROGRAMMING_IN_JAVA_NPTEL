import java.util.Scanner;
public class Exercise1_4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //use while loop to check the armstrong number store the output in result variable (0 or 1)
  int result=0;
  int temp=n;
  int arm=0;
  int rem;
  while(n>0)
  {
      rem=n%10;
      arm=arm+(rem*rem*rem);
      n=n/10;
  }
  if(temp==arm)
  result=1;
  else
  result=0;
  System.out.println(result);
    }

}