package Poly_Game;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// 유저관리
// 회원가입
// 회원탈퇴
// 로그인
// 로그아웃

class User extends Main {
	private String id;
	private String password;
	private String nickName;
	private BufferedWriter bw = null;
	private int log;
	private int count;

	User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.nickName = name;
		this.log = -1;
		this.count = 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void printMenu() {
		System.out.println("[1] 회원가입");
		System.out.println("[2] 회원탈퇴");
		System.out.println("[3] 로그인");
		System.out.println("[4] 로그아웃");
		System.out.println("[5] 종료");
		System.out.print("선택 : ");
	}

	public int inputNumber() {
		StringBuffer buffer = new StringBuffer();
		try {

			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			buffer.append();
			bw.write(buffer.toString());
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean checkDupl(String id, String nickName) {
		boolean dupl = false;
		for (int i = 0; i < count; i++) {

			if (id.equals(user.id) && (nickName.equals(user.nickName)))
				return false;
		}
		return true;
	}

	User createUser() {
		Scanner scan = new Scanner(System.in);
		User user = new User(id, password, nickName);
		System.out.print("가입할 Id : ");
		String id = scan.next();
		System.out.print("가입할 Pw : ");
		String password = scan.next();
		System.out.print("가입할 Nickname : ");
		String nickName= scan.next();
		scan.close();

		return user;
	}

	public void join() {
		createUser();
//		Users user = 
		if (!checkDupl(user.id && user.nickName)) {
			addUser(user);
		}
	}

	public void leave() {
		if (isLoggedin()) {
			System.out.print("탈퇴할 Id : ");
			String id;
			System.out.print("탈퇴할 Pw : ");
			String password;
			
		}
	}

	public void logIn() {
		if (!isLoggedin()) {
			System.out.print("Id : ");
			String id;
			System.out.print("Pw : ");
			String password;

			for (int i = 0; i < this.count; i++) {
				
			}

			if (!isLoggedin())
				System.out.println("회원정보를 다시 확인해주세요.");
		} else {
			System.out.println("이미 로그인 상태입니다.");
		}
	}

	public boolean isLoggedin() {
		return this.log != -1;
	}
	
	public void logOut() {
		this.log = -1;
		System.out.println("로그아웃 되었습니다.");
	}
	
	public void changePassword() {
	}

	public void run() {
		while (true) {
			printMenu();
			inputNumber();
			int sel = inputNumber();
			if (sel == 1)
				join();
			else if (sel == 2)
				leave();
			else if (sel == 3)
				logIn();
			else if (sel == 4)
				logOut();
			else if (sel == 5)
				break;
			else
				System.out.println("잘못된 메뉴를 선택했습니다.");
		}
	}
}
