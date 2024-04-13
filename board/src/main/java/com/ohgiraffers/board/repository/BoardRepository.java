package com.ohgiraffers.board.repository;


import com.ohgiraffers.board.dto.BoardDTO;
import com.ohgiraffers.board.dto.BoardFileDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    private final SqlSessionTemplate sqlSessionTemplate;
    public BoardDTO save(BoardDTO boardDTO) {

        sqlSessionTemplate.insert("Board.save", boardDTO);

        return boardDTO;
    }

    public List<BoardDTO> findAll() {
        return sqlSessionTemplate.selectList("Board.findAll");
    }

    public void updateHits(Long id) {
        sqlSessionTemplate.update("Board.updateHits", id);
    }

    public BoardDTO findById(Long id) {
        return sqlSessionTemplate.selectOne("Board.findById", id);
    }

    public void update(BoardDTO boardDTO) {
        sqlSessionTemplate.update("Board.update", boardDTO);
    }

    public void delete(Long id) {
        sqlSessionTemplate.delete("Board.delete", id);
    }

    public void saveFile(BoardFileDTO boardFileDTO) {
        sqlSessionTemplate.insert("Board.saveFile", boardFileDTO);
    }

    public List<BoardFileDTO> findFile(Long id) {
       return sqlSessionTemplate.selectList("Board.findFile", id);
    }
}
