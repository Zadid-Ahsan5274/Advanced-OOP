package newpackage;

class Post implements Likeable {

	String Content;
	int Likes;

	Post(String con, int lik) {
		this.Content = con;
		this.Likes = lik;
	}

	@Override
	public void like() {
		try {
			Likes++;
		} catch (Exception e) {
			System.out.println("Post not found!");
		}
	}

	@Override
	public void unlike() {
		try {
			Likes--;
		} catch (Exception e) {
			System.out.println("Post not found");
		}
	}

}