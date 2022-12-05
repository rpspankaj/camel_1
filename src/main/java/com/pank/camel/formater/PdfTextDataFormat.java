/*
 * package com.pank.camel.formater;
 * 
 * import java.io.InputStream; import java.io.OutputStream;
 * 
 * import org.apache.camel.Exchange; import org.apache.camel.spi.DataFormat;
 * 
 * public class PdfTextDataFormat implements DataFormat {
 * 
 * public void marshal(Exchange exchange, Object graph, OutputStream stream) {
 * 
 * }
 * 
 * public Object unmarshal(Exchange exchange, InputStream stream) throws
 * Exception { byte[] bytes = IOUtils.toByteArray(stream);
 * 
 * // Use a tool like PDFBox to create text from your bytes. String text = ...;
 * 
 * // If we want, we can set the unmarshalled text back into the exchange's out
 * message Message out = exchange.getOut(); out.setBody(text);
 * 
 * // Don't close input stream here
 * 
 * return text; }
 * 
 * @Override public void start() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void stop() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void marshal(Exchange exchange, Object graph, OutputStream
 * stream) throws Exception { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public Object unmarshal(Exchange exchange, InputStream stream)
 * throws Exception { // TODO Auto-generated method stub return null; } }
 * 
 */