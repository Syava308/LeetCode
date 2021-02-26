package solution;

public class RevertInteger {
    public int reverse(int x) {
        long z = 0;
        while (x != 0){
            z = z*10 + x%10;
            x=x/10;
        }
        if(z> Integer.MAX_VALUE || z < Integer.MIN_VALUE){
            z = 0;
        }
        return (int) z;
    }
}


