package com.simplecode.jdb;

import java.io.File;
import org.apache.commons.io.FileUtils;
import com.taguru.utility.PDFUtil;

/**
 * @author ashok.hottin
 *
 */
public class CompareFileContent {

	public static void main(String[] args) throws Exception 
    {
            /* Get the files to be compared first */
/*            File file1 = new File(args[0]);
            File file2 = new File(args[1]);
*/
            File file1 = new File("C:\\Profile\\BCRF_V2.pdf");
            File file2 = new File("C:\\Profile\\BCRF_V3.pdf");

            boolean compareResult = FileUtils.contentEquals(file1, file2);
            System.out.println("Are the files are same? " + compareResult);
            PDFUtil pdfUtil = new PDFUtil();
            String file3 ="C:\\Profile\\Reciept_16343692_22_04_2016_V2.pdf";
            String file4 ="C:\\Profile\\Reciept_16343692_22_04_2016_V3.pdf";
             
            // compares the pdf documents & returns a boolean
            // true if both files have same content. false otherwise.
            pdfUtil.comparePdfFilesBinaryMode(file3, file4);
             
            // compare the 3rd page alone
            pdfUtil.comparePdfFilesBinaryMode(file3, file4, 3, 3);
             
            // compare the pages from 1 to 5
            pdfUtil.comparePdfFilesBinaryMode(file3, file4, 1, 5);
             
            //if you need to store the result
            pdfUtil.highlightPdfDifference(true);
            pdfUtil.setImageDestinationPath("c:\\Profile"); 
            pdfUtil.comparePdfFilesBinaryMode(file3, file4);
            pdfUtil.savePdfAsImage("c:\\Profile\\sample.pdf");

            
    }

 }
