package tokio;

public class ArrayCharSequenceTokio implements CharSequenceTokio{
    private char[] arrayChar;

    public ArrayCharSequenceTokio(char[] arrayChar) {
        this.arrayChar = arrayChar;
    }

    @Override
    public int length() {
        return arrayChar.length;
    }

    @Override
    public char charAt(int index) {
        if(index<0 || index>length()-1) return 0;
        return arrayChar[index];
    }

    @Override
    public CharSequenceTokio subSequence(int start, int end) {
        char[] array = new char[end];
        CharSequenceTokio res = new ArrayCharSequenceTokio(array);
        if(start == end) return res;
        else if(start<0 || end>length()-1 || start>end) return null;
        else {
            int arrayIdx = 0;
            for(int i=start; i<end; i++) {
                array[arrayIdx] = charAt(i);
                arrayIdx++;
            }
            res = new ArrayCharSequenceTokio(array);
            return res;
        }
    }
}
