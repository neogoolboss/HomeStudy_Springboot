package com.homestudy.controller;

import com.homestudy.common.IdolGroupDTO;
import com.homestudy.service.IdolGroupService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IdolGroupController {



    public void insertIdolGroup(Map<String, String> parameter) {

        String groupName = parameter.get("groupName");
        int groupCount = Integer.parseInt(parameter.get("groupCount"));
        String entName = parameter.get("entName");
        String hitsong = parameter.get("hitsong");
        String fandumName = parameter.get("fandumName");
        String debYear = parameter.get("debYear");
        String disYear = parameter.get("disYear");
        String disYn = parameter.get("disYn");

        IdolGroupDTO idol = new IdolGroupDTO();
        idol.setGroupName(groupName);
        idol.setGroupCount(groupCount);
        idol.setEntName(entName);
        idol.setHitsong(hitsong);
        idol.setFandumName(fandumName);
        idol.setDebYear(debYear);
        idol.setDisYear(disYear);
        idol.setDisYn(disYn);

        IdolGroupService idolGroupService = new IdolGroupService();
        idolGroupService.insertIdol(idol);

    }
    public Map<String, String> inputMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.print("그룹명을 입력하세요 : ");
        String groupName = sc.nextLine();
        System.out.print("그룹인원수를 입력하세요 : ");
        String groupCount = sc.nextLine();
        System.out.print("소속사를 입력하세요 : ");
        String entName = sc.nextLine();
        System.out.print("히트곡을 입력하세요 : ");
        String hitsong = sc.nextLine();
        System.out.print("팬덤명을 입력하세요 : ");
        String fandumName = sc.nextLine();
        System.out.print("데뷔년도를 입력하세요 : ");
        String debYear = sc.nextLine();
        System.out.print("해체연도를 입력하세요 : ");
        String disYear = sc.nextLine();
        System.out.print("해체여부를 입력하세요 : ");
        String disYn = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("groupName", groupName);
        parameter.put("groupCount", groupCount);
        parameter.put("entName", entName);
        parameter.put("hitsong", hitsong);
        parameter.put("fandumName", fandumName);
        parameter.put("debYear", debYear);
        parameter.put("disYear", disYear);
        parameter.put("disYn", disYn);

        return parameter;
    }
}
