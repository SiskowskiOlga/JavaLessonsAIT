package homework32;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ClothingManagerTest {
    //используются аннотации @ParameterizedTest, @ValueSource и @CsvSource для создания параметризированных тестов.
    private ClothingManager manager;

    @BeforeEach
    public void setUp() {
        //создается начальная коллекция одежды.
        manager = new ClothingManager();
        manager.addClothingItem(new ClothingItem("T-Shirt", "Shirt", "M", 19.99));
        manager.addClothingItem(new ClothingItem("Jeans", "Pants", "L", 49.99));
        manager.addClothingItem(new ClothingItem("Jacket", "Outerwear", "M", 89.99));
        manager.addClothingItem(new ClothingItem("Shorts", "Pants", "S", 24.99));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Shirt", "Pants", "Outerwear"})
    public void testFindClothingByType(String type) {
        List<ClothingItem> items = manager.findClothingByType(type);
        assertFalse(items.isEmpty());
        for (ClothingItem item : items) {
            assertEquals(type, item.getType());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"S", "M", "L"})
    public void testFindClothingBySize(String size) {
        List<ClothingItem> items = manager.findClothingBySize(size);
        assertFalse(items.isEmpty());
        for (ClothingItem item : items) {
            assertEquals(size, item.getSize());
        }
    }

    @Test
    public void testFindCheapestItem() {
        ClothingItem cheapestItem = manager.findCheapestItem();
        assertNotNull(cheapestItem);
        assertEquals("T-Shirt", cheapestItem.getName());
        assertEquals(19.99, cheapestItem.getPrice());
    }

    @ParameterizedTest
    @CsvSource({
            "T-Shirt, true",
            "Jacket, true",
            "NonExistentItem, false"
    })
    public void testRemoveClothingItem(String name, boolean expectedResult) {
        boolean result = manager.removeClothingItem(name);
        assertEquals(expectedResult, result);
    }
}
