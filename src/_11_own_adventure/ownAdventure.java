package _11_own_adventure;

import javax.swing.JOptionPane;

public class ownAdventure {
public static void main(String[] args) {
	String Q1 = JOptionPane.showInputDialog(null, "You are walking through the woods and encounter a house. Do you go inside or keep walking?");
	if(Q1.equals("go inside")) {
		String Q2 = JOptionPane.showInputDialog(null, "In the house, there is a large living room. In the center is a table with a bright purple drink. Do you drink the liquid or search the house?");{
			if(Q2.equals("drink liquid")){
				JOptionPane.showMessageDialog(null, "The drink was poison and you quickly feel pain all throughout your body. You hear a broadcast which tells you that there is an antidote. If you can solve the given riddle, you will be cured.");{
					String Q3 = JOptionPane.showInputDialog(null, "The riddle is: If you’ve got me, you want to share me; if you share me, you haven’t kept me. What am I?");{
						if(Q3.equals("a secret")) {
							JOptionPane.showMessageDialog(null, "You have guessed correctly and are given the antidote. You quickly drink it and leave instantly. The End ");
						}
						else {
							JOptionPane.showMessageDialog(null, "You have guessed wrong and died. The End");
						}
					}
				}
			} else{
				JOptionPane.showMessageDialog(null, "You find nothing exciting and leave. You continue to the city and forget about the odd house. The End");
			}
		}
	

	}
	
	else {
		JOptionPane.showMessageDialog(null, "You get to the city safely and forget about the house in the woods. The End.");
	}
}


}