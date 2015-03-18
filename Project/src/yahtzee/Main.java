package yahtzee;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Main {
	public static void main( String[] args ) {
		try {
			for( LookAndFeelInfo lafi: UIManager.getInstalledLookAndFeels() ) {
				if( lafi.getName().equals("Nimbus") ) {
					UIManager.setLookAndFeel( lafi.getClassName() );
					break;
				}
			}
		} catch( Exception e ) {
			e.printStackTrace();
		}
	}
}