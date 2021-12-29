package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryController lc = new LibraryController();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        System.out.println("# 회원 정보를 입력해주세요.");
        System.out.printf("이름: ");
        String name = sc.next();

        System.out.printf("나이: ");
        int age = sc.nextInt();

        System.out.printf("성별(M/F): ");
        char gender = sc.next().charAt(0);

        lc.insertMember(new Member(name, age, gender));
        
        while (true) {
            System.out.println("\n============= 도서 메뉴 ==============");
            System.out.println("# 1. 마이페이지");
            System.out.println("# 2. 도서 전체 조회");
            System.out.println("# 3. 도서 검색");
            System.out.println("# 4. 도서 대여하기");
            System.out.println("# 9. 프로그램 종료하기");
            System.out.printf("- 메뉴 번호: ");
            int menuNum = sc.nextInt();

            switch (menuNum) {
                case 1:
                    System.out.println(lc.myInfo().toString());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("# 메뉴 번호를 잘못 입력했습니다.");
            }

        }
    }

    private void rentBook() {

    }

    private void searchBook() {

    }

    private void selectAll() {
        Book[] books = lc.selectAll();
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%d번째 도서: %s\n", i+1, books[i].toString());
        }
    }
}
