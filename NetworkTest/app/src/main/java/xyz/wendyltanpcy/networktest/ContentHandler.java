package xyz.wendyltanpcy.networktest;

import android.util.Log;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by Wendy on 2017/9/14.
 */

public class ContentHandler extends DefaultHandler {

    private String nodeName;
    private StringBuilder to;
    private StringBuilder from;
    private StringBuilder heading;
    private StringBuilder body;

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        to = new StringBuilder();
        from = new StringBuilder();
        heading = new StringBuilder();
        body = new StringBuilder();

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        nodeName = localName;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if ("to".equals(nodeName)){
            to.append(ch,start,length);
        }else if("from".equals(nodeName)){
            from.append(ch,start,length);
        }else if("heading".equals(nodeName)){
            heading.append(ch,start,length);
        }else if("body".equals(nodeName)){
            body.append(ch,start,length);
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("note".equals(localName)){
            Log.d("ContentHandler","to is " + to.toString().trim());
            Log.d("ContentHandler","from is "+ from.toString().trim());
            Log.d("ContentHandler","heading is "+ heading.toString().trim());
            Log.d("ContentHandler","body is "+ body.toString().trim());
            to.setLength(0);
            from.setLength(0);
            heading.setLength(0);
            body.setLength(0);
        }
    }


    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }
}
