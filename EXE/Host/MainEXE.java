/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: Host
//!	Generated Date	: Thu, 23, Apr 2020 
	File Path	: EXE/Host/MainEXE.java
*********************************************************************/


//## auto_generated
import com.telelogic.dishwasher.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// MainEXE.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class MainEXE {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("com.telelogic.dishwasher.evClose");
            Class.forName("com.telelogic.dishwasher.evKeyPress");
            Class.forName("com.telelogic.dishwasher.evOpen");
            Class.forName("com.telelogic.dishwasher.evStart");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         java.lang.System.err.println(e.toString());
         e.printStackTrace(java.lang.System.err);
      }
    }
    //#]
    
    protected static DishwasherBuilder p_DishwasherBuilder = null;
    
    //## configuration EXE::Host 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        MainEXE initializer_EXE = new MainEXE();
        p_DishwasherBuilder = new DishwasherBuilder(RiJMainThread.instance());
        p_DishwasherBuilder.startBehavior();
        //#[ configuration EXE::Host 
        //#]
        RiJOXF.Start();
        p_DishwasherBuilder=null;
    }
    
}
/*********************************************************************
	File Path	: EXE/Host/MainEXE.java
*********************************************************************/

