package bankProject.main;
import bankProject.account.accountDAOImplementation;
import bankProject.account.accountDTO;
import bankProject.customer.customerDAOImplementation;
import bankProject.customer.customerDTO;
import bankProject.dbUtill.dbUtill;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
//        Connection connection = dbUtill.getConnection();
//        // customerDTO 객체 생성
//        customerDTO newCustomer = new customerDTO("3", "고객3");
//
//        // addCustomer 메소드가 포함된 클래스의 인스턴스 생성
//        customerDAOImplementation instance = new customerDAOImplementation();
//
////        // addCustomer 메소드 실행
////        instance.addCustomer(newCustomer);
////
////        String customerNumberToDelete = "3";
////        instance.delectCustomer(customerNumberToDelete);
//
//        String customerNumberToGet = "2";
//        System.out.println(instance.getCustomer(customerNumberToGet));
//
//        System.out.println(instance.getAllcustome());


        accountDAOImplementation dao = new accountDAOImplementation();
      //  accountDTO account1 = new accountDTO("123456", 1234, 1000L, "1");
      //  dao.addAccount(account1);
//
//        accountDTO retrievedAccount = dao.getAccount("1");
//        System.out.println("Retrieved Account: " + retrievedAccount);
        System.out.println("All Accounts:");
        dao.getAllAcount().forEach(System.out::println);

    }

}
