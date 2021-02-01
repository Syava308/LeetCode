package solution;

public class NumberOfOneBits {
    public int Solution(int n) {
        int i = 0;
        int m = 1;
        while (n > 0) {
            if(n <= m*2) {
                i +=1;
                n -= m;
                m = 1;
            }
            else{
             m*=2;
            }
        }
        return i;
    }
}
