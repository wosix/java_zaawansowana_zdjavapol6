package calc;

public class ByTwos implements Series {

    int a;
    int start = 0;

    public void ByTwos() {
        this.a = 0;
    }

    public int getNext() {
        return a += 2;
    }

    public void reset() {
        a = start;
    }

    public void setStart(int x) {
        start = x;
        a = x;
    }
}
