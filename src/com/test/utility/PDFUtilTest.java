package com.test.utility;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.utility.CompareMode;
import com.utility.PDFUtil;

public class PDFUtilTest {

    PDFUtil pdfutil = new PDFUtil();


    @Test(priority = 1)
    public void comparePDFImageModeDiff() throws IOException {
        String file1 = "C:/Users/rrama3/Desktop/Oracle_Cloud_Automation/1SamplePDFFile_5mb.pdf";
        String file2 = "C:/Users/rrama3/Desktop/Oracle_Cloud_Automation/2SamplePDFFile_5mb.pdf";
        pdfutil.highlightPdfDifference(true);
        pdfutil.setCompareMode(CompareMode.VISUAL_MODE);
        pdfutil.setImageDestinationPath("C:/Users/rrama3/Desktop/Oracle_Cloud_Automation/Output");
        boolean result = pdfutil.compare(file1, file2);
        Assert.assertFalse(result);
    }

}
