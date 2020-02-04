/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herocreator;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import javax.xml.xpath.*;
import java.io.IOException;
import org.xml.sax.SAXException;


/**
 *
 * @author stephen
 */
public class XMLHandler {
    
    public void XMLHandler(String filename){
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setNamespaceAware(true);
        docFactory.setIgnoringComments(true);
        docFactory.setIgnoringElementContentWhitespace(true);
        Document doc = null;
        
        try {
            
        DocumentBuilder builder = docFactory.newDocumentBuilder();
        doc = builder.parse(filename);
        
        }
        catch (SAXException | IOException e){
            e.printStackTrace();
        }
        catch (ParserConfigurationException e){
            e.printStackTrace();
        }
        
        XPath xpath = XPathFactory.newInstance().newXPath();
        
    }
    
}
