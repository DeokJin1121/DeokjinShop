package inhatc.cse.deokjinshop.item.dto;

import inhatc.cse.deokjinshop.item.constant.ItemSellStatus;
import inhatc.cse.deokjinshop.item.entity.Item;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemFormDto {

    private Long id;    // 아이디

    @NotBlank(message = "상풍명은 필수 입력 값입니다.")
    private String itemNm;  // 상품 이름

    @NotNull(message = "가격은 필수 입력 값입니다.")
    private int price;  // 가격

    @NotNull(message = "재고 수량은 필수 입력 값입니다.")
    private int stockNumber;    // 재고 수량

    @NotBlank(message = "상품 설명은 필수 입력 값입니다.")
    private String itemDetail;  // 상품 상세 설명

    private ItemSellStatus itemSellStatus;

    private List<ItemImgDto> itemImgDtoList = new ArrayList<>();

    private List<Long> itemImgIds = new ArrayList<>();

    private static ModelMapper modelMapper = new ModelMapper();

    public Item createItem() {      // dtoToEntity
        return modelMapper.map(this, Item.class);
    }


    public static ItemFormDto of(Item item) {
        return modelMapper.map(item, ItemFormDto.class);
    }
}
