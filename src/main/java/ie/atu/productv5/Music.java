package ie.atu.productv5;

public class Music extends Product {

    private String label;

    public Music() {
        super();
        label = "";
        count++;
    }

    public void setLabel(String author) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
       @Override
    public String toString() {
        return super.toString() + " by " + label;
    }
}
