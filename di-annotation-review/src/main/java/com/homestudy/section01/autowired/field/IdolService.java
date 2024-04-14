package com.homestudy.section01.autowired.field;

import com.homestudy.section01.common.IdolDAO;
import com.homestudy.section01.common.IdolDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("idolServiceField")
public class IdolService {

    @Autowired
    private IdolDAO idolDAO;

    public List<IdolDTO> selectAllIdols() {

        return idolDAO.selectIdolList();

    }

}
