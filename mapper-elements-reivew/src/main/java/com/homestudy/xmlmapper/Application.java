package com.homestudy.xmlmapper;

import com.homestudy.service.IdolGroupService;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("========== 매퍼 element 테스트 메뉴 ==========");
            System.out.println("1. <resultMap> 서브 메뉴");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int number = sc.nextInt();

            switch (number) {
                case 1 :
                    resultMapSubMenu();
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
            System.out.println("1. <resultMap> 테스트");
            System.out.println("2. <constructor> 테스트");
            System.out.println("3. <association> 테스트");
            System.out.println("4. <collection> 테스트");
            System.out.println("0. 이전 메뉴");
            System.out.print("번호를 입력하세요 : ");
            int number = sc.nextInt();

            switch (number) {
                case 1 :
                    idolGroupService.selectResultMap();
                    break;

                case 2 :

                    break;

                case 3 :
                    break;

                case 4 :

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
