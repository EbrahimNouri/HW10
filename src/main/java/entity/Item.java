package entity;

import java.util.Objects;

public class Item extends BaseEntity{
    double price;
    ItemType itemType;

    public Item(double price, ItemType itemType) {
        this.price = price;
        this.itemType = itemType;
    }

    public Item(long id, String name, double price, ItemType itemType) {
        super(id, name);
        this.price = price;
        this.itemType = itemType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 && itemType == item.itemType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price, itemType);
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", itemType=" + itemType +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
