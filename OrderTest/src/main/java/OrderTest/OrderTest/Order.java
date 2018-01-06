package OrderTest.OrderTest;


import java.io.File;

import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Order {
    public Order() {
        super();
    }

    public List<OrderItem> readOrder() {
        List<OrderItem> orderItemList = new ArrayList<OrderItem>();
        try {

            Scanner input = new Scanner(new File("C:\\Users\\LALITA\\Downloads\\sample_data_ordered.txt")).useDelimiter("\\s+");
            while (input.hasNextLine()) {
                String item = input.next();
                Long time = input.nextLong();
                orderItemList.add(new OrderItem(item,time));
                input.nextLine();
            }
            input.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            } 
        return orderItemList;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Order or=new Order();
        List<OrderItem> result=or.readOrder();
        result.sort((e1,e2) -> (e1.getTime()).compareTo((e2.getTime())));
        for(OrderItem item:result){
        System.out.println(item.getItemName()+" "+item.getTime());
        }
    }
}

