/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assa;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ASSA {

    
    public static void main(String[] args) {
        try {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        
        // root element
        Document doc = docBuilder.newDocument();
	Element rootElement = doc.createElement("FBType");
	doc.appendChild(rootElement);
        // set attributes for root element
        Attr X = doc.createAttribute("X");
	rootElement.setAttribute("X", "0");
        Attr Y = doc.createAttribute("Y");
        rootElement.setAttribute("Y", "0");
        Attr LocNum = doc.createAttribute("LocNum");
        rootElement.setAttribute("LocNum", "0");
        Attr Name = doc.createAttribute("Name");
        rootElement.setAttribute("Name", "cont_logic");
        
        // child elements
        // InterfaceList
        Element interfaceList = doc.createElement("InterfaceList");
        rootElement.appendChild(interfaceList);
        // InputVars
        Element inputvars = doc.createElement("InputVars");
        interfaceList.appendChild(inputvars);
        Element vardeclaration_1 = doc.createElement("VarDeclaration");
        inputvars.appendChild(vardeclaration_1);
        Attr X_invar_1 = doc.createAttribute("X");
	vardeclaration_1.setAttribute("X", "-300");
        Attr Y_invar_1 = doc.createAttribute("Y");
	vardeclaration_1.setAttribute("Y", "-201");
        Attr Num_invar_1 = doc.createAttribute("Num");
	vardeclaration_1.setAttribute("Num", "1");
        Attr LocNum_invar_1 = doc.createAttribute("LocNum");
	vardeclaration_1.setAttribute("LocNum", "-300");
        Attr Name_invar_1 = doc.createAttribute("Name");
	vardeclaration_1.setAttribute("Name", "s");
        Element vardeclaration_2 = doc.createElement("VarDeclaration");
        inputvars.appendChild(vardeclaration_2);
        Attr X_invar_2 = doc.createAttribute("X");
	vardeclaration_2.setAttribute("X", "-300");
        Attr Y_invar_2 = doc.createAttribute("Y");
	vardeclaration_2.setAttribute("Y", "-201");
        Attr Num_invar_2 = doc.createAttribute("Num");
	vardeclaration_2.setAttribute("Num", "1");
        Attr LocNum_invar_2 = doc.createAttribute("LocNum");
	vardeclaration_2.setAttribute("LocNum", "-300");
        Attr Name_invar_2 = doc.createAttribute("Name");
	vardeclaration_2.setAttribute("Name", "s");
        Element vardeclaration_3 = doc.createElement("VarDeclaration");
        inputvars.appendChild(vardeclaration_3);
        Attr X_invar_3 = doc.createAttribute("X");
	vardeclaration_3.setAttribute("X", "-300");
        Attr Y_invar_3 = doc.createAttribute("Y");
	vardeclaration_3.setAttribute("Y", "-201");
        Attr Num_invar_3 = doc.createAttribute("Num");
	vardeclaration_3.setAttribute("Num", "1");
        Attr LocNum_invar_3 = doc.createAttribute("LocNum");
	vardeclaration_3.setAttribute("LocNum", "-300");
        Attr Name_invar_3 = doc.createAttribute("Name");
	vardeclaration_3.setAttribute("Name", "s");
        // EventOutputs
        Element eventoutputs = doc.createElement("EventOutputs");
        interfaceList.appendChild(eventoutputs);
        
        // write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("D:\\Aalto\\Summer Project\\cont_manual.xml"));

		// Output to console for testing
		 //StreamResult result = new StreamResult(System.out);

		transformer.transform(source, result);

		System.out.println("File saved!");

	  } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	  } catch (TransformerException tfe) {
		tfe.printStackTrace();
	  }
    }
    
}
