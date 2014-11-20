/**
 * 
 */
package fr.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;
import javax.swing.filechooser.FileNameExtensionFilter;

import fr.Game;

/**
 * @author dao303
 *
 */
public class lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream( new BufferedOutputStream(new FileOutputStream(new File("game.txt"))));
			
			oos.writeObject(new Game("Assassin Creed", "Aventure", 45.99));
			oos.writeObject(new Game("Tomb Raider", "Aventure", 35.99));
			oos.writeObject(new Game("Tetris", "Puzzle", 5.99));
			
			oos.close();
			
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("game.txt"))));
			
			try {
				System.out.println("Affichage des jeux :");
				System.out.println("**************************\n");
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			ois.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(ois != null) {
					ois.close();
				}
				if(oos != null) {
					oos.close();
				} 
				
			} catch (IOException e){
					e.printStackTrace();
			}
			
		}

	}

}
