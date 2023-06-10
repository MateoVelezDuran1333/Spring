package com.platzimarket.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {
    private int pruchaseId;
    private String clientId;
    private LocalDateTime date;
    private String paymentMethod;
    private String comments;
    private String state;
    private List<PurchaseItem> item;

    public int getPruchaseId() {
        return pruchaseId;
    }

    public void setPruchaseId(int pruchaseId) {
        this.pruchaseId = pruchaseId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<PurchaseItem> getItem() {
        return item;
    }

    public void setItem(List<PurchaseItem> item) {
        this.item = item;
    }
}
