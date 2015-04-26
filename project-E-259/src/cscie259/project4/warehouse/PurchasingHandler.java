package cscie259.project4.warehouse;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import cscie259.project4.warehouse.PurchaseObject;	

/**
 * This class is treated by Tomcat (or, more specifically,
 * by Axis) as a web service; it processes purchase orders.
 * <p/>
 * Any references to the local file system are resolved
 * with respect to project4-7.0/.
 * <p/>
 * The class does not utilize a javax.xml.transform.URIResolver, 
 * since it's not technically a servlet (i.e., it doesn't extend 
 * javax.servlet.http.HttpServlet).
 * <p/>
 * You MAY modify this file.
 *
 * @author  Computer Science E-259
 * @version 8.0
 *
 * @author  YOUR NAME GOES HERE
 **/

public class PurchasingHandler extends DefaultHandler{

  private List<PurchaseObject> purchasedObjectList = null;


  private PurchaseObject PO = null;
  public String typeKeyVal;

  PurchasingHandler(){
      super();
     purchasedObjectList = new ArrayList<PurchaseObject>();
     System.out.println("PurchasingHandler Constructor.....");

  }

  public List<PurchaseObject> getPurchaseList(){
    return purchasedObjectList;
  }	

  public void destroyPurchaseList(){
   // TPDO: Check does ti requre to release element of array?
  	purchasedObjectList = null;
  }	
  
  boolean typeKeyFlag = false;
  boolean itemDesFlag = false;
  boolean labelTypeFlag = false;
  boolean descriptionFlag = false;
  boolean priceFlag = false;
  boolean quantiyFlag = false;
 
// Override method 

  public void startElement(String uri, String localname, 
						 String qName, Attributes attributes)
						 throws SAXException {
      if(qName.equalsIgnoreCase("item")){

          PO = new PurchaseObject();
          System.out.println("startElement:item create new purchase pbject");
      }
      else if (qName.equalsIgnoreCase("typeKey")){
          typeKeyFlag = true;
          //  System.out.println("startElement:typeKey");
      }			
      else if (qName.equalsIgnoreCase("itemDes")){
          itemDesFlag = true;
          // System.out.println("startElement:itemDes");
      }
      else if (qName.equalsIgnoreCase("labelType")){
          labelTypeFlag = true;
          //System.out.println("startElement:labelTypeFlag");
      }
      else if (qName.equalsIgnoreCase("description")){
          descriptionFlag = true;
          //System.out.println("startElement:description");
      }
      else if (qName.equalsIgnoreCase("Price")){
	priceFlag = true;
	//System.out.println("startElement:Price");
      }
      else if (qName.equalsIgnoreCase("Quantity")){
        quantiyFlag = true;
	// System.out.println("startElement:Quantity");
      }
  }

//override method
  public void endElement(String uri, String localName, String qName)
		throws SAXException {
		if (qName.equalsIgnoreCase("item")){	
		  purchasedObjectList.add(PO);	
                  System.out.println("endElement: item adding PO to List");
		  
		}  
  }

   public void characters (char ch[], int start, int length) throws SAXException {

   //System.out.print("charcters:");
	if (typeKeyFlag){
		// String id = attributes.getValue("id");
          typeKeyVal = new String(ch, start, length);
	  System.out.println(typeKeyVal);	
	  PO.SetTypeKey(typeKeyVal);
	 // System.out.println("String:typeKeyval:" + typeKeyVal);
         // System.out.println("String: PO.getTypeKey:" +  PO.getTypeKey());
          typeKeyFlag = false;
  	}
	else if (itemDesFlag){
	  PO.SetItemDes(new String(ch, start, length));
	  itemDesFlag = false;
	 // System.out.println(PO.getItemDes());
	}
	else if (labelTypeFlag){
	  PO.SetLabelType(new String (ch, start, length));
	  labelTypeFlag = false;
	 // System.out.println(PO.getLabelType());
	}
	else if (descriptionFlag){
		PO.SetDescription(new String(ch, start, length));
		descriptionFlag = false;
		// System.out.println(PO.getDescription());
	}
	else if (priceFlag){
		PO.SetPrice(new String (ch, start, length));
		priceFlag = false;
		// System.out.println(PO.getPrice());
	}
	else if (quantiyFlag){
		PO.SetQuantity(new String (ch, start, length));
		quantiyFlag = false;
		//System.out.println(PO.getQuantity());
		}
  	}
	
	  
}	

		

