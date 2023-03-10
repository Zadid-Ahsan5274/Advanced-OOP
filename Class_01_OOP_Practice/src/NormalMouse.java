
public class NormalMouse implements IMouse{

	@Override
	public void rightClick() {
		System.out.println("Normal Mouse - right click");
		
	}

	@Override
	public void leftClick() {
		System.out.println("Normal Mouse - left click");
		
	}

	@Override
	public void singleClick() {
		System.out.println("Normal Mouse - single click");
		
	}

	@Override
	public void doubleClick() {
		System.out.println("Normal Mouse - double click");
		
	}

}
