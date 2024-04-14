package com.homestudy.section01.autowired.constructor;

import com.homestudy.section01.common.IdolDAO;
import com.homestudy.section01.common.IdolDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("idolServiceConstructor")
public class IdolService {

    @Autowired
    private final IdolDAO idolDAO;

    public IdolService(IdolDAO idolDAO) {
        this.idolDAO = idolDAO;
    }

    public List<IdolDTO> selectAllIdols() {
        return idolDAO.selectIdolList();
    }

    public IdolDTO searchIdolByGroupCode(int groupCode) {
        return idolDAO.selectOneIdol(groupCode);
    }
}
