package newpackage;

import java.util.ArrayList;

class RegularUser extends User{
    ArrayList<String> Posts = new ArrayList<String>();
    
    RegularUser(String username, String password) {
        super(username, password);
    }

    @Override
    void displayProfile() {
        System.out.println("Your username is: "+Username);
    }
    
    void addPost(String post){
        Posts.add(post);
        for(String posts:Posts){
            System.out.println(posts);
        }
    }
    
}
