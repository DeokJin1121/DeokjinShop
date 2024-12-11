package inhatc.cse.deokjinshop.item.entity;

import inhatc.cse.deokjinshop.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemImg extends BaseEntity {

    @Id //기본 키 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    @Column(name = "item_img_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    private String imgName;     //저장될 이미지 이름

    private String oriImgName;  // 원본 이름

    private String imgUrl;      // 이미지 경로

    private String repImgYn;    // 대표 이미지 여부

    public void updateItemImg(String oriImgName, String imgName, String ImgUrl) {
        this.oriImgName = oriImgName;
        this.imgName = imgName;
        this.imgUrl = ImgUrl;
    }
}
