import javax.swing.JFrame;

public class Program {

	public Program() {
		JFrame frame = new JFrame();
		GamePanel gamepanel = new GamePanel();
		
		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("JOGO DA COBRINHA");
		
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {

		new Program();
	}

}
