package com.homestudy.section01.common;


import lombok.*;

@NoArgsConstructor      // 기본 생성자
@AllArgsConstructor     // 매개변수가 있는 생성자
@Getter                 // 게터
@Setter                 // 세터
@ToString               // 투스트링
public class IdolDTO {

    private int groupCode;
    private String groupName;
    private String entName;
    private String hitsong;
    private long debYear;

}
