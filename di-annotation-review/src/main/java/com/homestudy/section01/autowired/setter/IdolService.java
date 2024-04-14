package com.homestudy.section01.autowired.setter;

import com.homestudy.section01.common.IdolDAO;
import com.homestudy.section01.common.IdolDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("idolServiceSetter")
public class IdolService {

    private IdolDAO idolDAO;

    @Autowired
    public void setIdolDAO(IdolDAO idolDAO) {
        this.idolDAO = idolDAO;
    }

    public List<IdolDTO> selectAllIdols() {
        return idolDAO.selectIdolList();
    }

    public IdolDTO searchIdolByGroupCode(int groupCode) {
        return idolDAO.selectOneIdol(groupCode);
    }

}
