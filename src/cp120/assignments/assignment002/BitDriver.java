package cp120.assignments.assignment002;
public class BitDriver {

	public static void main(String[] args) {

		maskFields(0b0110100100011001);
		maskFields(0b0010101100011101);
		maskFields(0b0110110100011001);
		maskFields(0b0110111100011101);
		
	}

	public static void maskFields(int reg) {

		//Print Binary
		System.out.println(Integer.toBinaryString(reg) + Integer.toBinaryString(reg));
		
		//Print Origin Field Value
		int originMask = 0b0000000000000111;
		int originField = reg & originMask;
		System.out.println("origin = " + originField);
		
		//Print Security Field Value
		int securityMask = 0b0000000000011000;
		int securityField = reg & securityMask;
		securityField = securityField >> 3;
		System.out.println("sec = " + securityField);
				
		//Print Data Field Value
		int dataMask = 0b0000000111100000;
		int dataField = reg & dataMask;
		dataField = dataField >> 5;
		System.out.println("data = " + dataField);
		
		//Print Count Field Value
		int countMask = 0b0000011000000000;
		int countField = reg & countMask;
		countField = countField >> 9;
		System.out.println("count = " + countField);
		
		//Print Start Bit Field Value
		int startMask = 0b0000100000000000;
		int startField = reg & startMask;
		startField = startField >> 11;
		System.out.println("start = " + startField);
		
		//Print Control Field Value
		int controlMask = 0b1111000000000000;
		int controlField = reg & controlMask;
		controlField = controlField >> 12;
		System.out.println("ctrl = " + controlField);
		
		System.out.println("\n");
		

	}

}
