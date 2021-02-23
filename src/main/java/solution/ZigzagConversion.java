package solution;

public class ZigzagConversion {

    public String convert(String s, int numRows) {
        String result = "";
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i=0; i<numRows; i++){
            sb[i] = new StringBuffer();
        }
        for(int i=0; i<s.length(); i++){

            for (int j=0; j<numRows && i<s.length(); j++){
                sb[j].append(s.charAt(i));
                i++;
            }
            for (int j=numRows-2; j>=1 && i<s.length(); j--){
                sb[j].append(s.charAt(i));
                i++;
            }
            i--;
        }
        for(int i=0; i<numRows; i++){
            //System.out.println(sb[i].toString());
            result += sb[i].toString();
        }
        return result;
    }
}
