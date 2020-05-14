package model;

import model.Product;

public class Food extends Product {
    private String table = null;
    private int amount = 0;
    private String note = null;

    public Food() {
    }
    public Food(String table,String id,String name,int price,int amount,String description,String note) {
        super(id, name, price, description);
        this.table = table;
        this.amount = amount;
        this.note = note;
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
}
