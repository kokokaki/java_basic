package day18.api.lang.obj;

public class Phone {

    String model;
    String company;
    int price;

    public Phone(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Phone) {
            Phone target = (Phone) obj;
            return this.company.equals(target.company);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
