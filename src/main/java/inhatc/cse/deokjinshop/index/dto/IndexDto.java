package inhatc.cse.deokjinshop.index.dto;

import lombok.*;

// @Data(Getter, Setter, ToString)
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IndexDto {
    private String name;
    private  int grade;
    private String dept;


}
