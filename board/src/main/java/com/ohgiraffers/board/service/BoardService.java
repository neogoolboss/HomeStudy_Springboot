package com.ohgiraffers.board.service;


import com.ohgiraffers.board.dto.BoardDTO;
import com.ohgiraffers.board.dto.BoardFileDTO;
import com.ohgiraffers.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) throws IOException {

        // 파일이 없다면
        if(boardDTO.getBoardFile().get(0).isEmpty()) {
            boardDTO.setFileAttached(0);
            boardRepository.save(boardDTO);
        } else { // 파일이 있다면
            boardDTO.setFileAttached(1);
            // 게시글 저장 후 id 값 활용을 위해 리턴
            BoardDTO savedBoard = boardRepository.save(boardDTO);
            // 파일만 가져오기
            for (MultipartFile boardFile : boardDTO.getBoardFile()) {

            // 파일 이름 가져오기
            String originalFilename = boardFile.getOriginalFilename();
            System.out.println("originalFilename = " + originalFilename);
            //저장용 이름 만들기
            System.out.println(System.currentTimeMillis());
            String storedFileName = System.currentTimeMillis() + "-" + originalFilename;
            System.out.println("stroedFileName = " + storedFileName);
            // BoardFileDTO 세팅
            BoardFileDTO boardFileDTO = new BoardFileDTO();
            boardFileDTO.setOriginalFileName(originalFilename);
            boardFileDTO.setStoredFileName(storedFileName);
            boardFileDTO.setBoardId(savedBoard.getId());
            // 파일 저장용 폴더에 파일 저장 처리
            String savePath = "D:/HomeStudy/intellij_spring_file/spring_upload_files/" + storedFileName;
            boardFile.transferTo(new File(savePath));
            // board_file_table 저장 처리
            boardRepository.saveFile(boardFileDTO);

            }
        }
    }

    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }

    public void updateHits(Long id) {
        boardRepository.updateHits(id);
    }

    public BoardDTO findById(Long id) {
        return boardRepository.findById(id);
    }

    public void update(BoardDTO boardDTO) {
        boardRepository.update(boardDTO);
    }

    public void delete(Long id) {
        boardRepository.delete(id);
    }

    public List<BoardFileDTO> findFile(Long id) {

        return boardRepository.findFile(id);
    }
}
