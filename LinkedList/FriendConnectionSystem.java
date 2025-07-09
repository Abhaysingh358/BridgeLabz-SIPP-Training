package LinkedList;

import java.util.ArrayList;

class UserNode {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds;
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

public class FriendConnectionSystem {
    UserNode head;

    // Add new user
    public void addUser(int userId, String name, int age) {
        UserNode newNode = new UserNode(userId, name, age);
        if (head == null) {
            head = newNode;
        } else {
            UserNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // Add friend connection (bidirectional)
    public void addFriend(int userId1, int userId2) {
        UserNode user1 = findById(userId1);
        UserNode user2 = findById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIds.contains(userId2)) {
            user1.friendIds.add(userId2);
        }
        if (!user2.friendIds.contains(userId1)) {
            user2.friendIds.add(userId1);
        }

        System.out.println("Friend connection added between " + userId1 + " and " + userId2);
    }

    // Remove friend connection (bidirectional)
    public void removeFriend(int userId1, int userId2) {
        UserNode user1 = findById(userId1);
        UserNode user2 = findById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendIds.remove(Integer.valueOf(userId2));
        user2.friendIds.remove(Integer.valueOf(userId1));

        System.out.println("Friend connection removed between " + userId1 + " and " + userId2);
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findById(userId1);
        UserNode user2 = findById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("Users not found.");
            return;
        }

        System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ":");
        boolean found = false;
        for (int id : user1.friendIds) {
            if (user2.friendIds.contains(id)) {
                UserNode mutual = findById(id);
                if (mutual != null) {
                    System.out.println("-> " + mutual.name + " (ID: " + id + ")");
                    found = true;
                }
            }
        }

        if (!found) System.out.println("No mutual friends found.");
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        UserNode user = findById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        if (user.friendIds.isEmpty()) {
            System.out.println("-> No friends added.");
            return;
        }

        for (int id : user.friendIds) {
            UserNode friend = findById(id);
            if (friend != null) {
                System.out.println("-> " + friend.name + " (ID: " + id + ")");
            }
        }
    }

    // Search for a user by ID
    public UserNode findById(int userId) {
        UserNode curr = head;
        while (curr != null) {
            if (curr.userId == userId) return curr;
            curr = curr.next;
        }
        return null;
    }

    // Search for a user by Name
    public void searchByName(String name) {
        UserNode curr = head;
        boolean found = false;
        while (curr != null) {
            if (curr.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + curr.name + " (ID: " + curr.userId + ", Age: " + curr.age + ")");
                found = true;
            }
            curr = curr.next;
        }
        if (!found) System.out.println("No user found with name: " + name);
    }

    // Count number of friends for each user
    public void countAllFriends() {
        UserNode curr = head;
        System.out.println("Friend counts:");
        while (curr != null) {
            System.out.println(curr.name + " (ID: " + curr.userId + ") has " + curr.friendIds.size() + " friend(s).");
            curr = curr.next;
        }
    }

    // Display all users
    public void displayAllUsers() {
        UserNode curr = head;
        System.out.println("All Users:");
        while (curr != null) {
            System.out.println("-> ID: " + curr.userId + ", Name: " + curr.name + ", Age: " + curr.age);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        FriendConnectionSystem system = new FriendConnectionSystem();

        system.addUser(1, "Alice", 25);
        system.addUser(2, "Bob", 30);
        system.addUser(3, "Charlie", 22);
        system.addUser(4, "Daisy", 27);

        system.displayAllUsers();
        System.out.println();

        system.addFriend(1, 2);
        system.addFriend(1, 3);
        system.addFriend(2, 3);
        system.addFriend(2, 4);

        System.out.println();
        system.displayFriends(1);
        system.displayFriends(2);
        System.out.println();

        system.findMutualFriends(1, 2);
        System.out.println();

        system.removeFriend(1, 2);
        system.displayFriends(1);
        system.displayFriends(2);
        System.out.println();

        system.searchByName("Charlie");
        system.countAllFriends();
    }
}
