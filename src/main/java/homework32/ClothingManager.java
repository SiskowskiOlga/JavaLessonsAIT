package homework32;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClothingManager {
    //методы для добавления, удаления, поиска по типу, поиску по размеру и нахождения самого дешевого элемента.
    private List<ClothingItem> clothingItems;

    public ClothingManager() {
        this.clothingItems = new ArrayList<>();
    }

    public void addClothingItem(ClothingItem item) {
        clothingItems.add(item);
    }

    public boolean removeClothingItem(String name) {
        return clothingItems.removeIf(item -> item.getName().equals(name));

    }

    public List<ClothingItem> findClothingByType(String type) {
        List<ClothingItem> result = new ArrayList<>();
        for (ClothingItem item : clothingItems) {
            if (item.getType().equalsIgnoreCase(type)) {
                result.add(item);
            }
        }
        return result;
    }

    public List<ClothingItem> findClothingBySize(String size) {
        List<ClothingItem> result = new ArrayList<>();
        for (ClothingItem item : clothingItems) {
            if (item.getSize().equalsIgnoreCase(size)) {
                result.add(item);
            }
        }
        return result;
    }

    public ClothingItem findCheapestItem() {
        return clothingItems.stream()
                .min((item1, item2) -> Double.compare(item1.getPrice(), item2.getPrice()))
                .orElse(null);
    }


}


