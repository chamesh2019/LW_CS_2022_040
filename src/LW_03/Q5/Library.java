package LW_03.Q5;

import java.util.ArrayList;

public class Library {
    private ArrayList<BorrowableItems> borrowableItems = new ArrayList<>();

    public void addItems(BorrowableItems item){
        borrowableItems.add(item);
    }

    public void checkoutItem(BorrowableItems item){
        if (borrowableItems.contains(item)){
            borrowableItems.indexOf(item);
        }
    }

}
