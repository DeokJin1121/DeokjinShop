package inhatc.cse.deokjinshop.item.controller;

import groovyjarjarantlr4.v4.codegen.model.SrcOp;
import inhatc.cse.deokjinshop.item.dto.ItemDataDto;
import inhatc.cse.deokjinshop.item.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String itemAdd() {
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
}
