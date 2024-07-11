package memory;

import items.User;
import services.IUserService;

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
                .orElseThrow();
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
