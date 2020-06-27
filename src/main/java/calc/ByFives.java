package calc;

public class ByFives implements Series {

    int a;
    int start = 0;

    public void ByFives() {
        this.a = 0;
    }

    @Override
    public int getNext() {
        return a += 5;
    }

    @Override
    public void reset() {
        a = start;
    }

    @Override
    public void setStart(int x) {
        start = x;
        a = x;
    }
}
