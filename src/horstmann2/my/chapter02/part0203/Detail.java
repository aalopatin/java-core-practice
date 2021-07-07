package horstmann2.my.chapter02.part0203;

import java.io.Serializable;

public class Detail implements Serializable {

    public static String CONSTANTA = "constanta";

    transient String tranConstructor;
    transient String tranInitialized = "tran initialized";

    private String name;
    private int number;
    public String test = "test";

    public Detail(String name, int number, String tranConstructor) {
        this.name = name;
        this.number = number;
        this.tranConstructor = tranConstructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTranConstructor() {
        return tranConstructor;
    }

    public void setTranConstructor(String tranConstructor) {
        this.tranConstructor = tranConstructor;
    }

    public String getTranInitialized() {
        return tranInitialized;
    }

    public void setTranInitialized(String tranInitialized) {
        this.tranInitialized = tranInitialized;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "tranConstructor='" + tranConstructor + '\'' +
                ", tranInitialized='" + tranInitialized + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
