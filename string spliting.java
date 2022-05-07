import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
   String s1[]=new String[100];
   String s2[][]=new String[s1.length][100];
for(int i=0;i<s.length();i++){
    s1=s.split(" ");
}
for(int i=0;i<s1.length;i++){
    s2[i]=s1[i].split("@");
}
int dis=0;
int tim=0;
//System.out.println(s2.length);
for(int i=0;i<s1.length;i++){
dis=Integer.parseInt(s2[i][0])+dis;
    tim=tim+Integer.parseInt(s2[i][1]);
}
double ans=dis/(tim*1.0);
System.out.printf("%.2f kmph",ans);
	}
}
