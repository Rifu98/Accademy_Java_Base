package memory;

import items.User;
import services.IUserService;
import exceptions.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Database extends Memory implements IUserService {
    private List<User> users;

    public Database() {
        users = new ArrayList<>();
        users.add(new User(1, "Mario Rossi"));
        users.add(new User(2, "Luigi Verdi"));
    }

    @Override
    public User getUserById(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

	@Override
	public void addUser(User user) {
        users.add(user);
		
	}
}
