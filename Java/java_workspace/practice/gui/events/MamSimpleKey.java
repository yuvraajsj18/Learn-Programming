import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class SimpleKey extends Applet
implements KeyListener, FocusListener {
String msg = "Key Listener Demo";
int X = 50, Y = 100; // output coordinates

public void init() {
System.out.println( "init" );	
addKeyListener(this);
addFocusListener(this);

}

public void keyPressed(KeyEvent ke) {
showStatus("Key Down");
}
public void keyReleased(KeyEvent ke) {
showStatus("Key Up");
}
public void keyTyped(KeyEvent ke) {
msg += ke.getKeyChar();
System.out.println( "keyTyped" );
repaint();

}

/*public void windowActivated(WindowEvent we){
	System.out.println( "windowActivated" );
	setFocusable(true);
	requestFocusInWindow();
}

public void windowClosed(WindowEvent we){
	
}

public void windowClosing(WindowEvent we){
	
}

public void windowDeactivated(WindowEvent we){
	
}

public void windowDeiconified(WindowEvent we){
	
}

public void windowIconified(WindowEvent we){
	
}

public void windowOpened(WindowEvent we){
	requestFocus();
}*/

public void focusGained(FocusEvent we){
	System.out.println( "focusGained" );
}

public void focusLost(FocusEvent we){
	
}



// Display keystrokes.
public void paint(Graphics g) {
g.setColor(Color.black);
g.drawString(msg, X, Y);
}
}