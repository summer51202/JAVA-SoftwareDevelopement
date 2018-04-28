package HW5;

public class Email extends Document {
	public String toString() {
		String alltext = "From: " + sender + "\n" + "To: " + recipient + "\n" + "Title: " + title + "\n"
				+ text;
		return alltext;
	}

	public void setSender(String str) {
		sender = str;
	}

	public void setRecipient(String str) {
		recipient = str;
	}

	public void setTitle(String str) {
		title = str;
	}

	public String getSender() {
		return sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public String getTitle() {
		return title;
	}

	public String sender, recipient, title;
}
