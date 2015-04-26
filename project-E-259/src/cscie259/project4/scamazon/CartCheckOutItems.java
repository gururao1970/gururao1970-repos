
package cscie259.project4.scamazon;
import java.util.*;

public class CartCheckOutItems {
   
	private String itemKey = null;
	 private String itemDescription = null;
	 private String typeLabel = null;
	 private String typeKey = null;
	 private String typeDescription = null;
	 private int typePrice = 0;
	 int quantity	= 0;
    
    public CartCheckOutItems (String paramtypeKey, String paramitemDescription, String paramtypeLabel, 
								  String paramtypeDescription, int paramtypePrice, String paramitemKey )  {
								
		
		this.typeKey = paramtypeKey;
		this.itemDescription = paramitemDescription;
		this.typeLabel = paramtypeLabel;
		this.typeDescription = paramtypeDescription;
		this.typePrice = paramtypePrice;
		this.itemKey = paramitemKey;
		
    }

    public String getTypekey() {
        return typeKey;
    }

	public String getItemDes(){
		return itemDescription;
	}
	public String getLabelType(){
	  return typeLabel;
	}
	public String getLabelDes(){
      return typeDescription;
	}
		
    public int  getPrice(){
      return typePrice;
	}
	public int getQuantity(){
		return quantity;
	}
	
	public  void setQuantity(int parmQunatity) {
        this.quantity = parmQunatity;
		return;
    }
    
}
