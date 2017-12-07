package pdfCompare;

import java.io.IOException;

import com.utility.CompareMode;
import com.utility.PDFUtil;

public final class Main {

	public static void main(String[] args) throws IOException {
		
			PDFUtil pdfutil = new PDFUtil();
			pdfutil.setCompareMode(CompareMode.VISUAL_MODE);
			pdfutil.highlightPdfDifference(true);
			//pdfutil.setImageDestinationPath("C:\\Users\\rrama3\\Desktop\\Oracle_Cloud_Automation\\");				
			//pdfutil.compare("C:\\Users\\rrama3\\Desktop\\Oracle_Cloud_Automation\\sample1.pdf", "C:\\Users\\rrama3\\Desktop\\Oracle_Cloud_Automation\\sample2.pdf");
			pdfutil.setImageDestinationPath(args[2]);				
			pdfutil.compare(args[0], args[1]);
		
	}
}
