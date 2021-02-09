package pruebaJOGL3;

import javax.swing.JFrame;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

public class Animacion{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modelo cubo = new Modelo("Intento cubo 3D");
		
		cubo.setSize(400, 400);
		cubo.setLocationRelativeTo(null);
		cubo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cubo.setResizable(false);
		GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities caps = new GLCapabilities(profile);
		GLCanvas canvas = new GLCanvas(caps);
		canvas.addGLEventListener(cubo);
		canvas.addKeyListener(cubo);
		cubo.add(canvas);
		cubo.setVisible(true);
		//canvas.requestFocusInWindow();// for Handling KeyEvents
		//this.setFocusable(true);
		//this.requestFocus();
		final FPSAnimator animator = new FPSAnimator(canvas, 200,true);  
		animator.start();  
	}


}
