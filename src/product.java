class Product {
    int id; int price;
    public Product (int id, int price) {
        this.id = id;
        this.price = price;
    }
    public String toString() {
        return id + ":" + price;
    }
}
