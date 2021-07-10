package com.compare;

/**
 * @program: learn-demo
 * @description:
 * @author: LWB
 * @create: 2019-08-15 09:28
 **/
public class Goods implements Comparable {

    private String name;

    private int price;

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods){
            Goods goods = (Goods) o;
            if (this.price > goods.price){
                return 1;
            }else if (this.price < goods.price){
                return -1;
            }
        }
        return 0;
    }
}
