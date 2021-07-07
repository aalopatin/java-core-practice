package horstmann2.my.chapter02.part0203;

public class TypedDetail extends Detail{
    private String type;

    public TypedDetail(String name, int number, String tranField, String type) {
        super(name, number, tranField);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
