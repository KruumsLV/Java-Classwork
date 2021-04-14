package com.rcs.classwork.Day22;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private Address address;
    private String contactNumber;
    private List<StoreItem> storeItems;

    public BookStore(Address address, String contactNumber) {
        this.address = address;
        this.contactNumber = contactNumber;
        this.storeItems = new ArrayList<>();
    }

    public BookStore(Address address, String contactNumber, List<StoreItem> storeItems) {
        this.address = address;
        this.contactNumber = contactNumber;
        this.storeItems = storeItems;
    }

    public void addStoreItem(StoreItem item) {
        storeItems.add(item);
    }
}
