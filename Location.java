import java.util.ArrayList;

public class Location {
    private String name;
    private String description;
    private ArrayList<Item> items;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        items = new ArrayList<Item>();
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String description) {
        this.description = description;
    }

    public void addItem(Item newItem) {
        this.items.add(newItem);
    }

    public boolean hasItem(String searchName) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName().compareToIgnoreCase(searchName) == 0) {
                return true;
            }
        }

        return false;
    }

    public Item getItem(String searchName) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName().compareToIgnoreCase(searchName) == 0) {
                return this.items.get(i);
            }
        }

        return null;
    }

    public Item getItem(int searchIndex) {
        return this.items.get(searchIndex);
    }

    public int numItem() {
        return this.items.size();
    }

    public Item removeItem(String searchName) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName().compareToIgnoreCase(searchName) == 0) {
                Item returnItem = this.items.get(i);
                this.items.remove(i);
                return returnItem;
            }
        }

        return null;
    }
}