import com.denys.Category;
import com.denys.StoreFakeJSONMapper;
import com.denys.Product;
import com.denys.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class StoreFakeJSONMapperTest {

    StoreFakeJSONMapper mapper;
    @BeforeEach
    void setUp() {
        mapper = new StoreFakeJSONMapper();
    }

    @Test
    void MapCategories_MinimalValidJSON_ShouldReturnListOfCategories() {
        Category expected = new Category(3, "Test category 1", "TestImage.jpeg 1");
        String json = """
                [
                  {
                    "id": 3,
                    "name": "Test category 1",
                    "image": "TestImage.jpeg 1"
                  }
                ]
                """;

        var actual = mapper.mapCategories(json);

        assertFalse(actual.isEmpty());
        assertEquals(1, actual.size());
        assertEquals(expected.toString(), actual.get(0).toString());
    }

    @Test
    void MapProducts_MinimalValidJSON_ShouldReturnListOfProducts() {
        Product expected = new Product(2, "Test product 1", 200, "Test description 1", Collections.emptyList(),
                new Category(2, "Test category 1", "TestImage.jpeg 1"));
        String json = """
                [
                  {
                    "id": 2,
                    "title": "Test product 1",
                    "price": 200,
                    "description": "Test description 1",
                    "images": [],
                    "category": {
                      "id": 2,
                      "name": "Test category 1",
                      "image": "TestImage.jpeg 1"
                    }
                  }
                ]
                """;

        var actual = mapper.mapProducts(json);

        assertFalse(actual.isEmpty());
        assertEquals(1, actual.size());
        assertEquals(expected.toString(), actual.get(0).toString());
    }

    @Test
    void MapUsers_MinimalValidJSON_ShouldReturnListOfUsers() {
        User expected = new User(1, "test@test.com", "1234", "test1", "tester1", "test.jpg 1");
        String json = """
                [
                  {
                    "id": 1,
                    "email": "test@test.com",
                    "password": "1234",
                    "name": "test1",
                    "role": "tester1",
                    "avatar": "test.jpg 1"
                  }
                ]
                """;

        var actual = mapper.mapUsers(json);

        assertFalse(actual.isEmpty());
        assertEquals(1, actual.size());
        assertEquals(expected.toString(), actual.get(0).toString());
    }
}