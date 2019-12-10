package _06_test_scores;

import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("Enter your score");
	double s = Double.parseDouble(score);
if(s >= 90.00) {
JOptionPane.showMessageDialog(null, "You must have worked really hard!");	
} 
else {
	JOptionPane.showMessageDialog(null, "Study Harder!");
}
}}
