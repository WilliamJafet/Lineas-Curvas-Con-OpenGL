package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/**
 * GTemaOne.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class GTemaTwo1 implements GLEventListener {
    static GL gl;
    static GLU glu;
    
    public static void main(String[] args) {
        Frame frame = new Frame("Líneas curvas");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new GTemaTwo1());
        frame.add(canvas);
        frame.setSize(500, 500);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {

        glu = new GLU();
            gl = drawable.getGL();
            gl.glClearColor(0, 0, 0, 1);
            gl.glMatrixMode(gl.GL_PROJECTION);
            glu.gluOrtho2D(-500, 500, -500, 500);  
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        
    }

    public void display(GLAutoDrawable drawable) {
        gl.glColor3f(1, 0, 0);
        gl.glLineWidth(2);
            gl.glBegin(GL.GL_LINES);
                //Eje y
                gl.glVertex2f(-400, 400);
                gl.glVertex2f(-400, -400);
                //Eje x
                gl.glVertex2f(-400, -400);
                gl.glVertex2f(400, -400);
                for (int x = -400; x < 400; x+=20) {
                    gl.glVertex2f(-400, -x+20);
                    gl.glVertex2f(x+20, -400);
                }
            gl.glEnd();
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
        
    }
}

