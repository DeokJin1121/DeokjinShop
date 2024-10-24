package inhatc.cse.deokjinshop.item.repository;

import inhatc.cse.deokjinshop.item.entity.Item;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ItemRepositoryTest2 {

    @Autowired
    private ItemRepository itemRepository;



    @Test
    public void test() {
        System.out.println("11111111111111");
    }

    @Test
    @DisplayName("상품 추가 테스트")
    public void insertItemTest() {
       Item item = Item.builder()
               .itemNm("신상품2")
               .itemDetail("신상품 상세 설명2")
               .price(20000)
               .stockNumber(200)
               .build();

       Item savedItem = itemRepository.save(item);
       System.out.println(savedItem);
    }

    @Test
    public void findByItemNmTest() {
        List<Item> itemList = itemRepository.findByItemNm("신상품2");
        //itemList.forEach(item -> System.out.println(item));
        itemList.forEach(System.out::println);
    }
}