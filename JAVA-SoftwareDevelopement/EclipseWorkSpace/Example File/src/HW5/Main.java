package HW5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input_1 = scanner.nextLine();
		String input_2 = scanner.nextLine();
		Document document = new Document();
		Email email = new Email();
		File file = new File();
		

		if (input_2.equals("Document")) {
			String input_3 = scanner.nextLine();
			document.setText(input_3);
		} else if (input_2.equals("Email")) {
			String input_3 = scanner.nextLine();
			String input_4 = scanner.nextLine();
			String input_5 = scanner.nextLine();
			String input_6 = scanner.nextLine();
			email.setSender(input_3);
			email.setRecipient(input_4);
			email.setTitle(input_5);
			email.setText(input_6);
		} else if (input_2.equals("File")) {
			String input_3 = scanner.nextLine();
			String input_4 = scanner.nextLine();
			file.setPathname(input_3);
			file.setText(input_4);
		} else {
			System.out.println("Wrong Input");
		}
		if (input_1.equals("A")) {
			if(input_2.equals("Document")) {
				System.out.println(document.toString());
			}else if (input_2.equals("Email")) {
				System.out.println(email.toString());
			}else if (input_2.equals("File")) {
				System.out.println(file.toString());
			}
		} else if (input_1.equals("B")) {
			String input_last = scanner.nextLine();
			if (input_2.equals("Document")) {
				System.out.println(input_last.contentEquals(document.toString()));
			}else if (input_2.equals("Email")) {
				System.out.println(input_last.contentEquals(email.toString()));
			}else if (input_2.equals("File")) {
				System.out.println(input_last.contentEquals(file.toString()));
			}else {
				System.out.println("Wrong Input");
			}
		} else if (input_1.equals("C")) {
			String input_7 = scanner.nextLine();
			String input_8 = scanner.nextLine();
			if (input_2.equals("Document")) {
				if (input_7.equals("text")) {
					document.setText(input_8);
				} else {
					System.out.println("Wrong Input");
				}
				System.out.println(document.toString());
			} else if (input_2.equals("Email")) {
				if (input_7.equals("sender")) {
					email.setSender(input_8);
				} else if (input_7.equals("recipirent")) {
					email.setRecipient(input_8);
				} else if (input_7.equals("title")) {
					email.setTitle(input_8);
				} else if (input_7.equals("text")) {
					email.setText(input_8);
				} else {
					System.out.println("Wrong Input");
				}
				System.out.println(email.toString());
			} else if (input_2.equals("File")) {
				if(input_7.equals("pathname")) {
					file.setPathname(input_8);
				}else if (input_7.equals("text")) {
					file.setText(input_8);
				}else {
					System.out.println("Wrong Input");
				}
				System.out.println(file.toString());
			} else {
				System.out.println("Wrong Input");
			}
		} else {
			System.out.println("Wrong Input");
		}
		scanner.close();
	}

}