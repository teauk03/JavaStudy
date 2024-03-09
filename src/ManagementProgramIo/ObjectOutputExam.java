package ManagementProgramIo;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class ObjectOutputExam {
    public static void main(String[] args) throws Exception{
        User user = new User("hong@example.com", "홍길동", 1992);
        // 이 user 인스턴스(객체)를 /tmp/user.dat 에 저장하고 싶음
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/tmp/user.dat"));
        out.writeObject(user);
        out.close();
    }
}
