package dotorybook;

import java.util.Scanner;

public class DotoryBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
				System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
				System.out.println("●●도토리 서점 관리 시스템Ver2.0");
				System.out.println("●●1.도서등록");
				System.out.println("●●2.도서수정");
				System.out.println("●●3.도서삭제");
				System.out.println("●●4.도서조회");
				System.out.println("●●5.도서검색");
				System.out.println("●●6.만든이");
				System.out.println("●●7.프로그램 종료");
				System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
				
				int code = 0;
				while(true) {
					System.out.print("●●번호>>>");
					code = sc.nextInt();
						if(code >=1 && code <=7) {
							break;
						}else {
							System.out.println("●●1~7까지만 입력하세요");
							continue;
						}
					
					}//작은while
				BookDAO bDao = new BookDAO();
				if(code == 1) {
					System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
					System.out.println("●●등록할 도서명 입력하세요");
					System.out.println("●●도서명>>>");
					sc.nextLine();
					String bname = sc.nextLine();
					System.out.println("●●가격>>");
					int price = sc.nextInt();
					System.out.println("●●출판사>>>");
					sc.nextLine();//버그버그
					String company = sc.nextLine();
					System.out.println("●●작가>>>");
					String writer = sc.nextLine();
					
					BookDTO bDto = new BookDTO( bname, price, company, writer);
					bDao.bookInsert(bDto);
					
				}else if (code == 2) {
					System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
					System.out.println("●●수정할 도서번호를 입렵하세요");
					System.out.println("●●번호>>>");
					sc.nextLine();
					String bno = sc.nextLine();
					System.out.println("●●도서명>>");
					String bname = sc.nextLine();
					System.out.println("●●가격>>");
					int price = sc.nextInt();
					System.out.println("●●출판사");
					sc.nextLine();
					String company = sc.nextLine();
					System.out.println("●●작가");
					String writer = sc.nextLine();
					BookDTO bDto = new BookDTO(bno, bname, price, company, writer);
					bDao.bookUpdate(bDto);
				}else if (code == 3) {
					System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
					System.out.println("●●삭제할 도서명");
					System.out.println("●●도서명>>");
					sc.nextLine();
					String bno = sc.nextLine();
					bDao.bookDelete(bno);
				}else if (code == 4) {
					System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
					System.out.println("●●현재 판매중인 도서목록을 출력합니다.");
					bDao.bookSelect();
				}else if (code == 5) {
					System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
					System.out.println("●●현재 판매중인 도서목록 검색검색");
					System.out.println("●●도서번호>>>");
					sc.nextLine();
					String bname = sc.nextLine();
					bDao.bookSerach(bname);
					
					
				}else if (code == 6) {
					System.out.println("연승연승");
				}else if (code == 7) {
					System.exit(0);
				}
				
				
				
			}//큰while

	}

}
