package inhatc.cse.deokjinshop.item.controller;

import inhatc.cse.deokjinshop.item.dto.ItemDataDto;
import inhatc.cse.deokjinshop.item.dto.ItemDto;
import inhatc.cse.deokjinshop.item.dto.ItemFormDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @GetMapping("/cart")
    public String cartList() {
        return "cart/list";
    }

    @GetMapping("/orders")
    public String orderList() {
        return "order/list";
    }

    @GetMapping("/admin/item/add")
    public String itemAdd(Model model) {
        model.addAttribute("itemFormDto", new ItemFormDto());
        return "item/add";
    }

    @GetMapping("/admin/items")
    public String itemList() {
        return "item/list";
    }

    @GetMapping("/item/thymeleaf1")
    public String thymeleaf1(Model model) {
        ItemDto itemDto = ItemDto.builder()
                .id(1L)
                .itemNm("상품명2222")
                .itemDetail("상품 상세 설명2222")
                .price(10000)
                .stockNumber(100)
                .build();

        model.addAttribute("itemDto", itemDto);

        return "item/thymeleaf1";
    }

    @GetMapping("/item/thymeleaf2")
    public String thymeleaf2(ItemDataDto itemDataDto,
                             Model model) {
        System.out.println("============" + itemDataDto);
        model.addAttribute("item", itemDataDto);
        return "item/thymeleaf2";
    }

    @GetMapping("/item/thymeleaf3")
    public String thymeleaf3(Model model) {
        List<ItemDto> itemDtoList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품 상세 설명" + i);
            itemDto.setItemNm("테스트 상품" + i);
            itemDto.setPrice(1000*i);

            itemDtoList.add(itemDto);
        }
        model.addAttribute("itemDtoList", itemDtoList);
        System.out.println("itemDtoList size: " + itemDtoList.size());
        return "item/thymeleaf3";
    }
}
