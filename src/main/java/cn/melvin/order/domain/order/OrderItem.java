package cn.melvin.order.domain.order;

public class OrderItem {
    private int id;
    private int OrderId;
    private int productId;
    private String productName;//商品名称
    private int num;//订单的该商品数量
    private int price;//商品单价

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", OrderId=" + OrderId +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", num=" + num +
                ", price=" + price +
                '}';
    }
}
