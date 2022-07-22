package com.aijieshe.pojo;

public class commodity {
    private String  id;
    private String  name;
    private String  introduce;
    private String  price;
    private String  create_time;
    private String  update_time;
    private String  amount;
    private String  image1_src;
    private String  image2_src;
    private String  image3_src;
    private String  state;
    private String  buyers;
    private String  supplier;

    @Override
    public String toString() {
        return "commodity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", introduce='" + introduce + '\'' +
                ", price='" + price + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", amount='" + amount + '\'' +
                ", image1_src='" + image1_src + '\'' +
                ", image2_src='" + image2_src + '\'' +
                ", image3_src='" + image3_src + '\'' +
                ", state='" + state + '\'' +
                ", buyers='" + buyers + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getImage1_src() {
        return image1_src;
    }

    public void setImage1_src(String image1_src) {
        this.image1_src = image1_src;
    }

    public String getImage2_src() {
        return image2_src;
    }

    public void setImage2_src(String image2_src) {
        this.image2_src = image2_src;
    }

    public String getImage3_src() {
        return image3_src;
    }

    public void setImage3_src(String image3_src) {
        this.image3_src = image3_src;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBuyers() {
        return buyers;
    }

    public void setBuyers(String buyers) {
        this.buyers = buyers;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
