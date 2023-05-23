package newpackage;

import java.util.ArrayList;

class SocialMediaApp {
    ArrayList<User> Users = new ArrayList<User>();
    
    void addUser(User user){
        Users.add(user);
    }
    
    void removeUser(User user){
        Users.remove(user);
    }
    
    void displayAllUsers(){
        for(User user:Users){
           System.out.println("Username is: "+user.Username); 
        }
    }
    
    /*void displayUserPosts(String username){
        for(Post post:Post){
            
        }
    }*/
}
