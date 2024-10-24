package inhatc.cse.deokjinshop.item.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDataDto {
    private String name;
    private int age;
    private String tell;
    private String dept;
    private int grade;
}
