package inhatc.cse.deokjinshop.item.dto;

import inhatc.cse.deokjinshop.item.entity.ItemImg;
import lombok.*;
import org.modelmapper.ModelMapper;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ItemImgDto {
    
    private Long id;

    private String imgName;     //저장될 이미지 이름

    private String oriImgName;  // 원본 이름

    private String imgUrl;      // 이미지 경로

    private String repImgYn;    // 대표 이미지 여부

    public static ModelMapper modelMapper = new ModelMapper();

    public static ItemImgDto of(ItemImg itemImg) {
        return modelMapper.map(itemImg, ItemImgDto.class);
    }

    public static ItemImg toEntity(ItemImgDto itemImgDto) {
        return modelMapper.map(itemImgDto, ItemImg.class);
    }
}
