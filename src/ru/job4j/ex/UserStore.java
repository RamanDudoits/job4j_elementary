package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                rsl = i;
            }
        }
           if (rsl == -1) {
               throw new UserInvalidException("User is not found");
           }
        return users[rsl];
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
           throw new UserInvalidException("User is not valid");
        }
        String login = user.getUsername();
        if (login.length() < 3) {
            throw new UserInvalidException("Not enough characters");
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", false)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            validate(user);
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }
    }
}