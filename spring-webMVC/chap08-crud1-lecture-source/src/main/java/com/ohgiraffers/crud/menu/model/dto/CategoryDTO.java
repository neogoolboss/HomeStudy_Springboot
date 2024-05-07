package com.ohgiraffers.crud.menu.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CategoryDTO {

    private int code;
    private String name;
    private int refCategoryCode;

}
