/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: evClose
//!	Generated Date	: Thu, 23, Apr 2020 
	File Path	: EXE/Host/com/telelogic/dishwasher/evClose.java
*********************************************************************/

package com.telelogic.dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/dishwasher/evClose.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::dishwasher 


//## event evClose() 
public class evClose extends RiJEvent implements AnimatedEvent {
    
    public static final int evClose_dishwasher_telelogic_com_id = 6616;		//## ignore 
    
    
    // Constructors
    
    public  evClose() {
        lId = evClose_dishwasher_telelogic_com_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evClose_dishwasher_telelogic_com_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("com.telelogic.dishwasher.evClose");
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
          String s="evClose(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/dishwasher/evClose.java
*********************************************************************/

