package com.ohgiraffers.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {

    private Long id;                // 글 번호
    private String boardWriter;     // 작성자
    private String boardPass;       // 게시글 비밀번호
    private String boardTitle;      // 글 제목
    private String boardContents;   // 글 내용
    private int boardHits;          // 조회수
    private String createdAt;        // 작성시간
}
