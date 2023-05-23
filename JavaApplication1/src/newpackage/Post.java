package newpackage;
class Post implements Likeable{
    
    String Content;
    int Likes;
    
    Post(String con, int lik){
        this.Content = con;
        this.Likes = lik;
    }

    @Override
    public void like(){
        Likes++;
    }

    @Override
    public void unlike() {
        Likes--;
    }
    
}
