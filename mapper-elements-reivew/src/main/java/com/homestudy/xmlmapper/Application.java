package com.homestudy.xmlmapper;

import com.homestudy.controller.IdolGroupController;
import com.homestudy.service.IdolGroupService;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IdolGroupController idolGroupController = new IdolGroupController();

        do{
            System.out.println("========== Idol Group ==========");
            System.out.println("1. 조회 관련 <resultMap> 서브 메뉴");
            System.out.println("2. 신규 Idol Group 추가");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int number = sc.nextInt();

            switch (number) {
                case 1 :
                    resultMapSubMenu();
                    break;

                case 2 :
                    idolGroupController.insertIdolGroup(idolGroupController.inputMenu());
                    break;

                case 9 :
                    return;

                default :
                    System.out.println("번호를 잘못 입력하셨습니다.");
                    break;
            }

        } while (true);

    }

    private static void resultMapSubMenu() {

        Scanner sc = new Scanner(System.in);
        IdolGroupService idolGroupService = new IdolGroupService();

        do {
            System.out.println("========== <resuleMap> 서브 메뉴 ==========");
            System.out.println("1. Idol Group 전체 조회 <resultMap> 테스트");
            System.out.println("2. Idol Group 전체 조회 <constructor> 테스트");
            //2번 이녀석 때문에 DTO에 DIS_YN char 타입인거 String으로 변경해줌
            System.out.println("3. Idol Group and Hitsong 조회<association> 테스트");
            System.out.println("4. Hitsong and Idol Group 조회<collection> 테스트");
            System.out.println("0. 이전 메뉴");
            System.out.print("번호를 입력하세요 : ");
            int number = sc.nextInt();

            switch (number) {
                case 1 :
                    idolGroupService.selectResultMap();
                    break;

                case 2 :
                    idolGroupService.selectResultMapConstructor();
                    break;

                case 3 :
                    idolGroupService.selectResultMapAssociation();
                    break;

                case 4 :
                    idolGroupService.selectResultMapCollection();
                    break;

                case 0 :
                    return;

                default :
                    System.out.println("번호를 잘못입력하셨습니다.");
                    break;
            }

        } while(true);


    }
}
