package com.infinite.pdf;
//program to send java output to a pdf 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PdfDoc {
 
	public static String generatePDFFileName(){				// to generate file Name which consists of Date
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	try{
		String formattedDate = dateFormat.format(currentDate);
		String nameafterDate = "Infi";
		String pdfFileName = "D:/"+formattedDate + "_"+ nameafterDate + ".pdf";
		return pdfFileName;
		} catch (Exception e){
			System.out.println(e);
			return null;
		}	
	}
//	public static char atoz() {	
//		char a='a';			
//		while(a=='z')
//		System.out.println(a+" ");
//				a++;
//			return a;
//}
	public static void main (String args[]) throws IOException {	
		char a='a';			
		while(a=='z'){
		System.out.println(a+" ");
				a++;
		}

		PDDocument document = new PDDocument();   		//Creating new Document
		File file=new File(generatePDFFileName());		//Naming the Document
//	    PDDocument document= PDDocument.load(file);
	
		document.addPage(new PDPage());  				//Create a Page in the Document
		PDPage page=document.getPage(0);				
		PDPageContentStream contentStream= new PDPageContentStream(document,page);	//Stream Content into Document and given page
		contentStream.beginText();							//Begin the Text 
		contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);			//Sets the font and size of text
		contentStream.setLeading(14.5f);				//Sets the space between each line
		contentStream.newLineAtOffset(25, 725);			
		String text="Infinite Computer Solutions ";				//The Text we want to Print into the PDF
//		String a="A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
		
		contentStream.showText(text);			//printing Infinite Computer Solutions in Pdf
		contentStream.newLine();
		contentStream.newLine();
//		contentStream.showText(a);				//Printing a to z in pdf
		String b=String.valueOf(a++);
		contentStream.showText(b);
		
		contentStream.endText();
		System.out.println("Content Added");
		contentStream.close();													
	    document.save(new File(generatePDFFileName())); 	//Saving the document
	    document.close();				 //Closing the document     
	}
}