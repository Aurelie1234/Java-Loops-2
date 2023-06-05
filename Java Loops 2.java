public class Solution{
public static void main(String []argh){
Scanner in = new Scanner(System.in);
int t=in.nextInt();
for(int i=0;i<t;i++){
int a = in.nextInt();
int b = in.nextInt();
int n = in.nextInt();
Double value = 0.0;
Double temp = 0.0;
for (int j = 0; j < n ; j++){
temp += Math.pow(2,j);
value = a + b*temp;
System.out.printf("%.0f ", value);
}
System.out.println();
}
in.close();
}
}
