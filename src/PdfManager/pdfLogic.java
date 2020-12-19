package com.itextpdf.pdfconverter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 
import com.itextpdf.layout.Document;
import com.itextpdf.html2pdf.HtmlConverter;
import java.io.FileInputStream;

public class pdfLogic {
    
    public static void main(String pdfname) throws Exception{              
      String dest = "C:/" + pdfname + ".pdf";       
      PdfWriter writer = new PdfWriter(dest); 
   
      // Creating a PdfDocument       
      PdfDocument pdfDoc = new PdfDocument(writer);              
   
      // Adding a new page 
      pdfDoc.addNewPage();               
   
      // Creating a Document        
      Document document = new Document(pdfDoc);               
   
      // Closing the document    
      document.close();              
      System.out.println("PDF Created");    
   }
    public static void HTMLtext( String HTML ) throws FileNotFoundException, IOException{
        HtmlConverter.convertToPdf(HTML, new FileOutputStream("html-to-pdf.pdf"));
    	
      
        System.out.println( "PDF Created!" );
    }
    public static void HTMLfile(String filename) throws FileNotFoundException, IOException  
    {
    	HtmlConverter.convertToPdf(new FileInputStream(filename), 
            new FileOutputStream("index-to-pdf.pdf"));

        System.out.println( "PDF Created!" );
    }
} 

