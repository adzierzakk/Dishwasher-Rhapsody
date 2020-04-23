/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: Heater
//!	Generated Date	: Thu, 23, Apr 2020 
	File Path	: EXE/Host/com/telelogic/dishwasher/Heater.java
*********************************************************************/

package com.telelogic.dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/dishwasher/Heater.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::dishwasher 


//## class Heater 
public class Heater implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassHeater = new AnimClass("com.telelogic.dishwasher.Heater",false);
    //#]
    
    
    // Constructors
    
    //## auto_generated 
    public  Heater() {
        try {
            animInstance().notifyConstructorEntered(animClassHeater.getUserClass(),
               new ArgData[] {
               });
        
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassHeater; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
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
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Heater.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Heater.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Heater.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/dishwasher/Heater.java
*********************************************************************/

