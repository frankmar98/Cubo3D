package pruebaJOGL3;

import com.jogamp.opengl.GL2;

public class Cubo {

    public static void dibujar(GL2 gl) {
    	
        gl.glBegin(GL2.GL_QUADS);


            gl.glColor3f(0.0f, 0.0f, 1.0f);
            gl.glVertex3f(-0.5f, +0.5f, +0.5f);
            gl.glVertex3f(-0.5f, -0.5f, +0.5f);
            gl.glVertex3f(+0.5f, -0.5f, +0.5f);
            gl.glVertex3f(+0.5f, +0.5f, +0.5f);


            gl.glColor3f(0.0f, 1.0f, 0.0f);
            gl.glVertex3f(+0.5f, -0.5f, -0.5f);
            gl.glVertex3f(+0.5f, +0.5f, -0.5f);
            gl.glVertex3f(-0.5f, +0.5f, -0.5f);
            gl.glVertex3f(-0.5f, -0.5f, -0.5f);


            gl.glColor3f(1.0f, 0.0f, 0.0f);
            gl.glVertex3f(-0.5f, +0.5f, +0.5f);
            gl.glVertex3f(-0.5f, +0.5f, -0.5f);
            gl.glVertex3f(-0.5f, -0.5f, -0.5f);
            gl.glVertex3f(-0.5f, -0.5f, +0.5f);


            gl.glColor3f(1.0f, 0.4f, 0.0f);
            gl.glVertex3f(+0.5f, +0.5f, -0.5f);
            gl.glVertex3f(+0.5f, +0.5f, +0.5f);
            gl.glVertex3f(+0.5f, -0.5f, +0.5f);
            gl.glVertex3f(+0.5f, -0.5f, -0.5f);


            gl.glColor3f(1.0f, 1.0f, 1.0f);
            gl.glVertex3f(+0.5f, +0.5f, +0.5f);
            gl.glVertex3f(-0.5f, +0.5f, +0.5f);
            gl.glVertex3f(-0.5f, +0.5f, -0.5f);
            gl.glVertex3f(+0.5f, +0.5f, -0.5f);


            gl.glColor3f(1.0f, 1.0f, 0.0f);
            gl.glVertex3f(+0.5f, -0.5f, +0.5f);
            gl.glVertex3f(+0.5f, -0.5f, -0.5f);
            gl.glVertex3f(-0.5f, -0.5f, -0.5f);
            gl.glVertex3f(-0.5f, -0.5f, +0.5f);

        gl.glEnd();
        gl.glFlush();
    }

}