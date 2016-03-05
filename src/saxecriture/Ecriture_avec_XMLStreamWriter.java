package saxecriture;


import java.io.FileWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

public class Ecriture_avec_XMLStreamWriter 
{
    public static void main(String[] args) throws Exception 
    {
        FileWriter f1=new FileWriter("doc.xml");
        XMLStreamWriter out = XMLOutputFactory.newInstance().createXMLStreamWriter(f1);
        
        out.writeStartDocument("UTF-8","1.0");out.writeCharacters("\n");
            out.writeStartElement("doc");  out.writeCharacters("\n");
                out.writeComment("Commentaire"); out.writeCharacters("\n");
                    out.writeStartElement("title");
                       out.writeAttribute("attribut1", "valeur 1"); out.writeCharacters("\n");
                    out.writeCharacters("Document Title"); out.writeCharacters("\n");
                out.writeEndElement(); out.writeCharacters("\n");
            out.writeEndElement(); out.writeCharacters("\n");
        out.writeEndDocument(); out.writeCharacters("\n");
        out.close();
    }
}
