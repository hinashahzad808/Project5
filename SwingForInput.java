import javax.swing.JOptionPane;

 class SwingForInput {

	public static void main(String[] args){
		
		String name=JOptionPane.showInputDialog("What's your name");
		
		String input=JOptionPane.showInputDialog("What's your age");
		String number=JOptionPane.showInputDialog("your phone number?");
		int phone_number=Integer.parseInt(number);
				
		int age=Integer.parseInt(input);
		
		System.out.println("Hi, "+name);
		System.out.println("Next year you will be "+(age+1));
		System.out.println("Phone_number: "+phone_number);
		System.exit(0);
				}
}
