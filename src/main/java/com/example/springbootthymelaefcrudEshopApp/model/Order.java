package com.example.springbootthymelaefcrudEshopApp.model;

import javax.persistence.*;

@Entity
@Table (name= "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Integer quantity;
    @Column (name ="customer_name")
    private String customerName;
    private Tshirt tshirt;

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Tshirt getTshirt() {
        return tshirt;
    }
    public void setTshirt(Tshirt tshirt) {
        this.tshirt = tshirt;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


}
