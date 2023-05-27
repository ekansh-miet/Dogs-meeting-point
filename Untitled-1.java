import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt(), q=sc.nextInt(), r=sc.nextInt(), s=sc.nextInt();
        int c=0;
        for(int i=0;i<q;i++){
            p+=r;
            q-=s;
            c++;
            if(p==q)
            break;
        }
        if(p==q)
        System.out.println(c);
        else
        System.out.println(-1);
    }
}