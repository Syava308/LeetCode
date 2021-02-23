package solution;

public class NumberOfOneBits {
    public int Solution(long n) {
        System.out.println(Long.toBinaryString(n));
        int i = 0;
        long m = 1;
        while (n > 0) {
            if(n <= m*2) {
                if(n< m*2) {
                    i += 1;
                    n -= m;
                    m = 1;
                }
                else {
                    i+=1;
                    n-=m*2;
                    m=1;
                }
            }
            else{
             m*=2;
            }
        }
        return i;
    }
}
