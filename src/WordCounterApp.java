import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class WordCounterApp extends JFrame {

	private JTextArea textArea;
	private JLabel resultLabel;
	public WordCounterApp() {
		setTitle("Text,Word,and Line Counter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		textArea=new JTextArea(10,40);
		JScrollPane scrollPane=new JScrollPane(textArea);
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout());
		JButton countButton=new JButton("Count");
		resultLabel=new JLabel("Result");
		panel.add(countButton);
		panel.add(resultLabel);
		panel.add(scrollPane,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		
		countButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String text=textArea.getText();
				int charCount=text.length();
				int wordCount=text.split("\\s+").length;
				int lineCount=textArea.getLineCount();
				
				resultLabel.setText("Chars:"+charCount+"|Words:"+wordCount+"|Lines:"+lineCount);}});
		
		       pack();
		       setLocationRelativeTo(null);
		       setVisible(true);
			
		}
		
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WordCounterApp();
			}
		});

	}

}
