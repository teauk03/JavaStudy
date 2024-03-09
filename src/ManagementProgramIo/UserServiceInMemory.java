package ManagementProgramIo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserServiceInMemory implements UserService {
    private List<User> users;

    public UserServiceInMemory() {
        this.users = new ArrayList<>();
    }

    public UserServiceInMemory(List<User> list) {
        this.users = list;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public boolean updateUser(User user) {
        boolean deleteFlag = deleteUser(user);
        if (deleteFlag) {
            users.add(user);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteUser(User user) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User currentUser = iterator.next();
            if (currentUser.getEmail().equals(user.getEmail())) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<User> getUsers() {
        return users.iterator();
    }

    @Override
    public boolean exists(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}
