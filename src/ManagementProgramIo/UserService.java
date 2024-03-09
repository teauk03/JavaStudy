package ManagementProgramIo;

import java.util.Iterator;
import java.util.List;

public interface UserService {
    public void addUser(User user);
    public boolean updateUser(User user);
    public boolean deleteUser(User user);
    public Iterator<User> getUsers();
    public boolean exists(String email);
}
