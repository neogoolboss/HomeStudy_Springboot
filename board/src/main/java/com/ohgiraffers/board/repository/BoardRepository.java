package com.ohgiraffers.board.repository;


import com.ohgiraffers.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    private final SqlSessionTemplate sqlSessionTemplate;
    public void save(BoardDTO boardDTO) {

        sqlSessionTemplate.insert("Board.save", boardDTO);

    }

    public List<BoardDTO> findAll() {
        return sqlSessionTemplate.selectList("Board.findAll");
    }
}
