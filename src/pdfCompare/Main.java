package pdfCompare;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;


public final class Main {

	public static void main(String[] args) throws IOException {

		String PDF_File1 = args[0];
		String PDF_File2 = args[1];

		ArrayList<String> testcase = new ArrayList<String>();
		testcase.add("com.test.utility.PDFUtilTest");

		Integer numberOfHosts = 1;

		// Creating a new Suite
		XmlSuite suite = new XmlSuite();
		suite.setName("PDF Files Comparison");

		for (Integer i = 0; i < numberOfHosts; i++) {

			// Creating a new Test
			XmlTest test = new XmlTest(suite);

			// Set Test name
			test.setName("Comparing PDF Files");

			// New list for the parameters
			Map<String, String> testParams = new HashMap<String, String>();

			// Add parameter to the list
			testParams.put("PDF_File1", PDF_File1);
			testParams.put("PDF_File2", PDF_File2);
			
			// Add parameters to test
			test.setParameters(testParams);

			// New list for the classes
			List<XmlClass> classes = new ArrayList<XmlClass>();

			// Putting the classes to the list
			classes.add(new XmlClass(testcase.get(i)));

			// Add classes to test
			test.setClasses(classes);

		}

		// New list for the Suites
		List<XmlSuite> suites = new ArrayList<XmlSuite>();

		// Add suite to the list
		suites.add(suite);

		// Creating the xml

		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);

		System.out.println(suite.toXml());

		tng.run();

	}
}
