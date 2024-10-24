package inhatc.cse.deokjinshop.item.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDto {

    private Long id;    // 아이디
    private String itemNm;  // 상품 이름
    private int price;  // 가격
    private int stockNumber;    // 재고 수량
    private String itemDetail;  // 상품 상세 설명
}
