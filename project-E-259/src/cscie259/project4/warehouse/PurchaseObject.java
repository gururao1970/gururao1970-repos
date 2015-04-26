package cscie259.project4.warehouse;



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

public class PurchaseObject
{
  private String TypeKey;
  private String ItemDes;
  private String LabelType;
  private String Description;
  private String Price;
  private String Quantity;

  public void SetTypeKey(String typeKey){
    this.TypeKey =  typeKey;
  }
  
  public void SetItemDes(String ItemDes){
  	this.ItemDes =  ItemDes;
  }

  public void SetLabelType(String LabelType){
  	this.LabelType =  LabelType;
  }
  public void SetDescription(String Description){
  	this.Description =  Description;
  }
  
  public void SetPrice(String Price){
  	this.Price =  Price;
  }
  
  public void SetQuantity(String Quantity){
  	this.Quantity =  Quantity;
  }
  
   public String getTypeKey(){
  	return TypeKey;
  }
  
   public String getItemDes(){
  	return ItemDes;
  }
  
  public String getLabelType(){
  	return LabelType;
  }

  public String getDescription(){
  	return Description;
  }

  
  public String getPrice(){
  	return Price;
  }

  public String getQuantity(){
  	return Quantity;
  }
    
   
}
