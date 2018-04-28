package HW5;

public class File extends Document{
	public String toString() {
		String alltext = "Path: " + pathname + "\n" + text;
		return alltext;
	}
	public void setPathname(String str) {
		pathname = str;
	}
	public String getPathname() {
		return pathname;
	}
	
	public String pathname;
}
