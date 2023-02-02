package ie.atu.productv5;

public class Tv extends Product{


        private String size;

        public Tv() {
            super();
            size = "";
            count++;
        }

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }



    @Override
        public String toString() {
            return super.toString() + " by " + size;
        }
}

