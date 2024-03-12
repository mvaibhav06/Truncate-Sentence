public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] input = s.split(" ");
        String out = "";
        for(int i=0; i<k; i++){
            out += input[i];
            if(i != k-1){
                out += " ";
            }
        }
        return out;
    }
}
