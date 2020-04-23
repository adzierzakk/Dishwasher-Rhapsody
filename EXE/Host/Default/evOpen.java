/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: evOpen
//!	Generated Date	: Fri, 10, Apr 2020 
	File Path	: EXE/Host/Default/evOpen.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evOpen.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evOpen() 
public class evOpen extends RiJEvent implements AnimatedEvent {
    
    public static final int evOpen_Default_id = 18617;		//## ignore 
    
    
    // Constructors
    
    public  evOpen() {
        lId = evOpen_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evOpen_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evOpen");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
    }
    public String toString() {
          String s="evOpen(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/Default/evOpen.java
*********************************************************************/

