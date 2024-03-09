package ManagementProgramIo;

import java.util.Iterator;

public class UserMain {
    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        UserDao userDao = new UserDao("/tmp/user.dat");
        UserService userService = new UserServiceInMemory(userDao.getUsers());
        while (true) {
            int menuId = userUI.menu();
            if (menuId == 5) {
                System.out.println("종료됩니다..");
                userDao.saveUser(userService.getUsers());
                break;
            } else if (menuId == 1) {
                User user = userUI.regUser();
                userService.addUser(user);
                System.out.println("등록 되었습니다.");
            } else if (menuId == 2) {
                userUI.printUserList(userService.getUsers());
            } else if (menuId == 3) {
                String email = userUI.inputEmail();
                if (userService.exists(email)) {
                    User updateUser = userUI.inputUser(email);
                    userService.updateUser(updateUser);
                    System.out.println("수정 되었습니다.");
                } else {
                    System.out.println("수정할 회원 정보가 없습니다.");
                }
            } else if (menuId == 4) {
                String email = userUI.inputEmail();
                if (userService.exists(email)) {
                    User deleteUser = new User(email, "", 0); // 삭제할 때는 이메일 정보만으로 유저 객체 생성
                    userService.deleteUser(deleteUser);
                    System.out.println("삭제 되었습니다.");
                } else {
                    System.out.println("삭제할 회원정보가 없습니다.");
                }
            }
        }
    }
}
