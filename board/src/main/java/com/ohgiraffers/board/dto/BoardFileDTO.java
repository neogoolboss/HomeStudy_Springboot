package com.ohgiraffers.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardFileDTO {

    private Long id;
    private Long boardId;            // 어느 게시글에 저장되었는지 확인
    private String originalFileName; // 원본 파일 이름
    private String storedFileName;   // 저장한 파일 이름

}
