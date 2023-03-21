package parameterization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ExecutParameter extends Parameterization {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ExecutParameter n = new ExecutParameter();
		n.retrieve2();
	}

}
