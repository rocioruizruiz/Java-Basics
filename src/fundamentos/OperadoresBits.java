package fundamentos;

public class OperadoresBits {
	
	/*
	 * Literales binarios, octales, hexadecimales, operadores de bits & (and), | (or), ^(xor) y mascaras
	 */
	public static void main(String[] args) {
		int binario = 0b10111010;                       //0xBA, 186
		int octal = 010;                                //0x08, 8
		int hexadecimal = 0x2F;                         //0x2F, 47
		int total = (binario + octal + hexadecimal);    //0xF1, 241
		
		System.out.println("Binario \t0x" + String.format("%x", binario).toUpperCase() + "\t" + binario + "\t 0b" + Integer.toBinaryString(binario));
		System.out.println("Octal \t\t0x" + String.format("%x", octal).toUpperCase() + "\t" + octal + "\t 0b" + Integer.toBinaryString(octal));
		System.out.println("Hexadecimal \t0x" + String.format("%x", hexadecimal).toUpperCase() + "\t" + hexadecimal + "\t 0b" + Integer.toBinaryString(hexadecimal));
		System.out.println("Total \t\t0x" + String.format("%x", total).toUpperCase() + "\t" + total + "\t 0b" + Integer.toBinaryString(total) + "\n");
		
		/*
		 * en los operadores de bits: and(&), or(|), xor(^);
		 * en los aritmeticos and(&¬), or(||), not(!);
		 */
		
		int r1 = total & 0xD8; //0xF1& 0xD8 = 0xD0
		int r2 = total | 0xA7; //0xF1& 0xA7 = 0xF7
		int r3 = total ^ 0x5A; //0xF1& 0x5A = 0xAB
		
		System.out.println("Total & 0xD8 \t0x" + String.format("%x", r1).toUpperCase() + "\t" + (r1));
		System.out.println("Total & 0xA7 \t0x" + String.format("%x", r2).toUpperCase() + "\t" + (r2));
		System.out.println("Total & 0x5A \t0x" + String.format("%x", r3).toUpperCase() + "\t" + (r3));
		System.out.println("");
		//Uso de desplazaiento de bits y mascaras para extraer las direcciones de una ip
		
		long ip = 3232235778L;
		System.out.println("ip decimal \t" + ip);
		String bin = Long.toBinaryString(ip);
		System.out.println("ip binario \t" + bin);
		
		short []ips = new short[4];
		
		ips[3] = (short) (ip >> 24 & 0xFF);
		ips[2] = (short) (ip >> 16 & 0xFF);
		ips[1] = (short) (ip >> 8 & 0xFF);
		ips[0] = (short) (ip & 0xFF);
		
		System.out.println("ip hexadecimal \t0x" + String.format("%x", ip).toUpperCase());
		
		System.out.println("ip \t\t");
		System.out.println(ips[3]+ ".");
		System.out.println(ips[2]+ ".");
		System.out.println(ips[1]+ ".");
		System.out.println(ips[0]);
		
	}
}
