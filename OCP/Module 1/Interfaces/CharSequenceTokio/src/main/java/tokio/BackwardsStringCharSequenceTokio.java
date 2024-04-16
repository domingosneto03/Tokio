package tokio;

public class BackwardsStringCharSequenceTokio implements CharSequenceTokio{
    private String sequence;

    public BackwardsStringCharSequenceTokio(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public int length() {
        return sequence.length();
    }

    @Override
    public char charAt(int index) {
        return sequence.charAt(index);
    }

    @Override
    public CharSequenceTokio subSequence(int start, int end) {
        String string = "";
        CharSequenceTokio res = new BackwardsStringCharSequenceTokio(string);
        if(start == end) return res;
        else if(start<0 || end>length()-1 || start>end) return null;
        else {
            for(int i=end; i>start; i--)
                string += charAt(i);
            res = new BackwardsStringCharSequenceTokio(string);
            return res;
        }
    }
}
