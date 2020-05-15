package model;

import model.Product;

public class Food extends Product {
    private String table;
    private int amount = 0;
    private String note = null;
    private boolean cooked = false;
    private boolean paid = false;
    public Food() {
    }
    public Food(String table,String id,String name,int price,int amount,String description,String note,boolean cooked,boolean paid) {
        super(id, name, price, description);
        this.table = table;
        this.amount = amount;
        this.note = note;
        this.cooked = cooked;
        this.paid = paid;
    }
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    public boolean isCooked() {
        return cooked;
    }

    public void setCooked(boolean cooked) {
        this.cooked = cooked;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return getTable()+","+getId()+","+getName()+","+getPrice()+","+getAmount()+","+getDescription()+","+getNote()+","+isCooked()+","+isPaid();
    }
}
