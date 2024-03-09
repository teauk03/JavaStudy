package ManagementProgramIo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class UserUI {
    private BufferedReader br;

    public UserUI() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int menu() {
        System.out.println("1. 회원등록");
        System.out.println("2. 회원목록보기");
        System.out.println("3. 회원정보수정하기");
        System.out.println("4. 회원정보삭제하기");
        System.out.println("5. 종료");
        int menuId = -1;
        try {
            String line = br.readLine();
            menuId = Integer.parseInt(line);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return menuId;
    }

    public String inputEmail() {
        System.out.println("이메일을 입력하세요:");
        try {
            return br.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public User inputUser(String email) {
        try {
            System.out.println(email + " 회원의 정보를 수정합니다.");
            System.out.println("이름을 입력하세요:");
            String name = br.readLine();
            System.out.println("생년월일을 입력하세요:");
            String strBirthYear = br.readLine();
            int birthYear = Integer.parseInt(strBirthYear);
            return new User(email, name, birthYear);
        } catch (IOException | NumberFormatException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public User regUser() {
        try {
            System.out.println("이메일을 입력하세요:");
            String email = br.readLine();
            System.out.println("이름을 입력하세요:");
            String name = br.readLine();
            System.out.println("생년월일을 입력하세요:");
            String strBirthYear = br.readLine();
            int birthYear = Integer.parseInt(strBirthYear);
            return new User(email, name, birthYear);
        } catch (IOException | NumberFormatException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void printUserList(Iterator<User> iter) {
        System.out.println("email\t이름\t생년월일");
        System.out.println("==========================");
        while (iter.hasNext()) {
            User user = iter.next();
            System.out.println(user.getEmail() + "\t" + user.getName() + "\t" + user.getBirthYear());
        }
    }
}
