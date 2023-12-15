/** Mark Deegan
@author <a href = "mailto: mark.deegan@tudublin.ie">Mark Deegan</a><br>
Thu 30 Nov 2023 10:45:50 GMT<br>
asset interface to make things into assets
*/
public interface asset
{
	/** this declartes a data member, value, that is inheritedf by all classes 
	that will implement this interface. <br>
 	Initial value will be 0.0f, but that can be changed by public setter and getter methods*/
	float value =0.0f;
	
	/** declare the getValue method<br>
 	This must be overridden by any classes thaty implement this interface<br>
  	If implementing classes do not override this method, they will remain abstract and <br>
   	that means we cannot create instances of those classes*/
	public float getValue();

	/** declare the getValue method<br>
 	This must be overridden by any classes thaty implement this interface<br>
  	If implementing classes do not override this method, they will remain abstract and <br>
   	that means we cannot create instances of those classes*/
	public void setValue(float assetValue);
}
