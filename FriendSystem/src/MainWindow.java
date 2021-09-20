package oosdterm1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class MainWindow extends JFrame {

	private JLabel nameLabel = new JLabel("Username:");
	private JTextField nameTextField = new JTextField(10);
	private JLabel codeLabel = new JLabel("Friend Code:");
	private JTextField codeTextField = new JTextField(10);
	private JCheckBox favouriteCheckBox = new JCheckBox("Favourite");
	private JButton b = new JButton("SEND FRIEND REQUEST");
	private JButton c = new JButton("CANCEL");
	private JOptionPane sent = new JOptionPane("Friend request sent!");
	ArrayList<Friend> friends = new ArrayList<Friend>();


	public MainWindow() //(String uName, String fCode) 
	{
		//super(n, c);
		this.setLayout(new MigLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(nameLabel);
		this.add(nameTextField, "wrap paragraph, grow");
		this.add(codeLabel);
		this.add(codeTextField, "wrap paragraph, grow");
		this.add(favouriteCheckBox, "wrap paragraph");
		
		this.add(b);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String uName = nameTextField.getText();
				String fCode = codeTextField.getText();
				Friend friend = new Friend(uName, fCode);
				friends.add(friend);
				System.out.println(friends);
				JOptionPane.showMessageDialog(MainWindow.this,
						"Friend request sent!",
						"Friend request",
						JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		this.add(c);
		c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MainWindow.this.dispose();
			}
			
		});
		
		this.pack();
	}

	public void addFriend(Friend friend)
	{
		friends.add(friend);
	}
	
	//public void displayFriends()
	//{
		//friends.toString();
	//}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String systemLookAndFeelClassName = UIManager.getSystemLookAndFeelClassName();
		try {
			UIManager.setLookAndFeel(systemLookAndFeelClassName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		MainWindow window = new MainWindow();
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
}
