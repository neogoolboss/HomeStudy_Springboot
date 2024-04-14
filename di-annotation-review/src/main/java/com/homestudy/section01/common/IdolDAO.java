package com.homestudy.section01.common;

import java.util.List;

public interface IdolDAO {

    List<IdolDTO> selectIdolList();

    IdolDTO selectOneIdol(int groupCode);
}
