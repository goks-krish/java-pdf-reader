package com.goks;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        try {
        	
			PdfReader reader = new PdfReader("barts.pdf");
			System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
	        String page = PdfTextExtractor.getTextFromPage(reader, 4);
	        System.out.println("Page Content:\n\n"+page+"\n\n");
	        
	        //System.out.println("Is this document tampered: "+reader.isTampered());
	        //System.out.println("Is this document encrypted: "+reader.isEncrypted());
	        
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
