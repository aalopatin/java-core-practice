package horstmann.my.chapter08;

public class PairNew<T,U> extends Pair<T>{
    private T firstNew;
    private U secondNew;

    public PairNew(T firstNew, U secondNew) {
        this.firstNew = firstNew;
        this.secondNew = secondNew;
    }

    public PairNew(T first, T second, T firstNew, U secondNew) {
        super(first, second);
        this.firstNew = firstNew;
        this.secondNew = secondNew;
    }

    public T getFirstNew() {
        return firstNew;
    }

    public void setFirstNew(T firstNew) {
        this.firstNew = firstNew;
    }

    public U getSecondNew() {
        return secondNew;
    }

    public void setSecondNew(U secondNew) {
        this.secondNew = secondNew;
    }

    @Override
    public String toString() {
        return super.toString() + " " + String.format("[%s:%s]", firstNew.toString(), secondNew.toString());
    }
}
