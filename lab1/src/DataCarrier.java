import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DataCarrier {
	
	public DataCarrier( 
						int     p0, 
						int     p1, 
						int     p2, 
						int     p3, 
						int     p4,
						String  sV 
						) 
	{
		stateParams = new int[5]; 
		stateValues = new String[32]; 
		
		setState( p0, p1, p2, p3, p4 );
		setValue( sV );
	}

	private int[]    stateParams;
	private String[] stateValues; 

	private int getMethodId() {
		return this.getP0() + (int)Math.pow(this.getP1(),2) + (int)Math.pow(this.getP2(),3) + (int)Math.pow(this.getP4(),4);
	}
	
	// Getters 
	private int    getP0()  { return stateParams[0];  }
	private int    getP1()  { return stateParams[1];  }
	private int    getP2()  { return stateParams[2];  }
	private int    getP3()  { return stateParams[3];  }
	private int    getP4()  { return stateParams[4];  }
	private String getV0()  { return stateValues[0];  }
	private String getV1()  { return stateValues[1];  }
	private String getV2()  { return stateValues[2];  }
	private String getV3()  { return stateValues[3];  }
	private String getV4()  { return stateValues[4];  }
	private String getV5()  { return stateValues[5];  }
	private String getV6()  { return stateValues[6];  }
	private String getV7()  { return stateValues[7];  }
	private String getV8()  { return stateValues[8];  }
	private String getV9()  { return stateValues[9];  }
	private String getV10() { return stateValues[10]; }
	private String getV11() { return stateValues[11]; }
	private String getV12() { return stateValues[12]; }
	private String getV13() { return stateValues[13]; }
	private String getV14() { return stateValues[14]; }
	private String getV15() { return stateValues[15]; }
	private String getV16() { return stateValues[16]; }
	private String getV17() { return stateValues[17]; }
	private String getV18() { return stateValues[18]; }
	private String getV19() { return stateValues[19]; }
	private String getV20() { return stateValues[20]; }
	private String getV21() { return stateValues[21]; }
	private String getV22() { return stateValues[22]; }
	private String getV23() { return stateValues[23]; }
	private String getV24() { return stateValues[24]; }
	private String getV25() { return stateValues[25]; }
	private String getV26() { return stateValues[26]; }
	private String getV27() { return stateValues[27]; }
	private String getV28() { return stateValues[28]; }
	private String getV29() { return stateValues[29]; }
	private String getV30() { return stateValues[30]; }
	private String getV31() { return stateValues[31]; }

	public  String getValue() {
		/* Your code here */
		
		int methodId = this.getMethodId();
		String methodName = "getV" + methodId;
		String result = "";
		
		try {
			Method m = DataCarrier.class.getDeclaredMethod(methodName);
			m.setAccessible(true);
			result = (String)m.invoke(this);
			m.setAccessible(false);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return result;
		}
	}


	// Setters 
	private void setP0(  int    i ) { stateParams[0]  = i; }
	private void setP1(  int    i ) { stateParams[1]  = i; }
	private void setP2(  int    i ) { stateParams[2]  = i; }
	private void setP3(  int    i ) { stateParams[3]  = i; }
	private void setP4(  int    i ) { stateParams[4]  = i; }
	private void setV0(  String s ) { stateValues[0]  = s; } 
	private void setV1(  String s ) { stateValues[1]  = s; } 
	private void setV2(  String s ) { stateValues[2]  = s; } 
	private void setV3(  String s ) { stateValues[3]  = s; } 
	private void setV4(  String s ) { stateValues[4]  = s; } 
	private void setV5(  String s ) { stateValues[5]  = s; } 
	private void setV6(  String s ) { stateValues[6]  = s; } 
	private void setV7(  String s ) { stateValues[7]  = s; } 
	private void setV8(  String s ) { stateValues[8]  = s; } 
	private void setV9(  String s ) { stateValues[9]  = s; } 
	private void setV10( String s ) { stateValues[10] = s; } 
	private void setV11( String s ) { stateValues[11] = s; } 
	private void setV12( String s ) { stateValues[12] = s; } 
	private void setV13( String s ) { stateValues[13] = s; } 
	private void setV14( String s ) { stateValues[14] = s; } 
	private void setV15( String s ) { stateValues[15] = s; } 
	private void setV16( String s ) { stateValues[16] = s; } 
	private void setV17( String s ) { stateValues[17] = s; } 
	private void setV18( String s ) { stateValues[18] = s; } 
	private void setV19( String s ) { stateValues[19] = s; } 
	private void setV20( String s ) { stateValues[20] = s; } 
	private void setV21( String s ) { stateValues[21] = s; } 
	private void setV22( String s ) { stateValues[22] = s; } 
	private void setV23( String s ) { stateValues[23] = s; } 
	private void setV24( String s ) { stateValues[24] = s; } 
	private void setV25( String s ) { stateValues[25] = s; } 
	private void setV26( String s ) { stateValues[26] = s; } 
	private void setV27( String s ) { stateValues[27] = s; } 
	private void setV28( String s ) { stateValues[28] = s; } 
	private void setV29( String s ) { stateValues[29] = s; } 
	private void setV30( String s ) { stateValues[30] = s; } 
	private void setV31( String s ) { stateValues[31] = s; } 

	public  void setState( 
					   int p0,
					   int p1, 
					   int p2,
					   int p3,
					   int p4
					   ) 
	{ 
		setP0( p0 ); 
		setP1( p1 ); 
		setP2( p2 ); 
		setP3( p3 ); 
		setP4( p4 ); 
	}

	public  void setValue( String sV ) {
		/* Your code here */
		
		int methodId = this.getMethodId();
		String methodName = "setV" + methodId;
		
		try {
			Method m = DataCarrier.class.getDeclaredMethod(methodName,String.class);
			m.setAccessible(true);
			m.invoke(this, sV);
			m.setAccessible(false);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}