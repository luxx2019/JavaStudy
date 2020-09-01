package enumeration;


public class EnumTest {
	public static void main(String[] args) throws Exception {
		//Size s = Enum.valueOf(Size.class, "SMALL");
		Size s = Size.SMALL;
		System.out.println(s.ordinal());
		//System.out.println(root.getAttribute("area"));
	}
}

enum Size {
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
	
	private String abbreviation;
	private Size(String s){
		this.abbreviation = s;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
}

