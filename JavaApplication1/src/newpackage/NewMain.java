package newpackage;
public class NewMain {
    public static void main(String[] args) {
        RegularUser regularUser = new RegularUser("ruuname","rupass");
        RegularUser regularUser1 = new RegularUser("ruuname1","rupass1");
        Admin admin = new Admin("adminuname1","adminpass1","Super Admin");
        Post post = new Post("Post1",100);
        SocialMediaApp socialMediaApp = new SocialMediaApp();
        
        socialMediaApp.addUser(regularUser);
        socialMediaApp.addUser(regularUser1);
        socialMediaApp.removeUser(regularUser1);
        socialMediaApp.displayAllUsers();
        regularUser.addPost("First Post");
        //socialMediaApp.displayUserPosts("ruuname");
        post.like();
        post.unlike();
    }
    
}
