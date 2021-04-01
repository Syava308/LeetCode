package solution;

public class LongestPalindromicSubstring {

    public String solution(String input)
    {
        String result = "";
        char[] str = input.toCharArray();
        int pal = 0;
        int k = 1;
        for(int i = 0; i < str.length; i++)
        {
            //char c = input.charAt(i);
            while (i+1 < str.length && str[i]==str[i+1])
            {
                i++;
                pal++;
            }
            while ( i-pal-k >= 0 && i + k < str.length && str[i-pal-k] == str[i+k])
            {
                k++;
            }

            if (result.length() < 2*k+pal && (pal > 0 || k > 1))
            {
                result = input.substring(i-pal - k + 1, i+k);
            }
            else if (result.length() == 0)
            {
                result = String.valueOf(str[i]);
            }
            k=1;
            pal=0;
        }

        return result;
    }
}
