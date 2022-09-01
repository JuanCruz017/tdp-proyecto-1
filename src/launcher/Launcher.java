package launcher;

import entities.Student;
import gui.SimplePresentationScreen;
public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		
		Student alumno = new Student (38802915,"Diaz","Juan Cruz","melli_10d@hotmail.com","https://github.com/JuanCruz017/tdp-proyecto-1.git","/images/tdp.png");
		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SimplePresentationScreen presentacion = new SimplePresentationScreen(alumno);
				presentacion.setVisible(true);
            }
        });
    }
}