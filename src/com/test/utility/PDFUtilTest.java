package com.test.utility;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.utility.CompareMode;
import com.utility.PDFUtil;
import com.utility.ReporterBaseTest;

public class PDFUtilTest extends ReporterBaseTest{

    PDFUtil pdfutil = new PDFUtil();

    @Parameters({ "PDF_File1", "PDF_File2" })
    @Test
    public void comparePDFImageModeDiff(String PDF_File1, String PDF_File2) throws IOException {
    	
        pdfutil.highlightPdfDifference(true);
        pdfutil.setCompareMode(CompareMode.VISUAL_MODE);
        pdfutil.setImageDestinationPath("C:/ComparePDF/Output");
        test = extent.createTest("Compare PDF Files");
        boolean result = pdfutil.compare(PDF_File1, PDF_File2);
        if(result == true) {
        	test.log(Status.PASS,"No Difference Found while Comparing Files: "+PDF_File1+"  &  "+PDF_File2);
        }
        else
        {
        	Assert.assertFalse(result);
        }
    }

}
