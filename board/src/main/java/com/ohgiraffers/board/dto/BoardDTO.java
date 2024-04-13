package com.ohgiraffers.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

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
    private int fileAttached;           // 게시글에 파일 첨부 여부 판단
    private List<MultipartFile> boardFile;    // 게시글을 작성할 때 파일을 담기 위한 필드

}
