package fundamentos;

public class TiposNumericos {

	public static void main(String[] args) {
		
		byte b;  // 1 byte  complementos a 2 (7 bits sin signo/ 8 con signo) [-128 a 127]
		short s; // 2 bytes complementos a 2 (15 bits sin signo/ 16 con signo) [-32768, +32767]
		int i;   // 4 bytes complementos a 2 (31 bits sin signo/ 32 con signo) [-2147483648, +2147483648]
		
		b = -1;
		System.out.println("byte   " + b);
		b ++;
		System.out.println("byte   " + b);
		b ++;
		System.out.println("byte   " + b);
		b = 127;
		System.out.println("byte   " + b);
		b ++;
		System.out.println("byte   " + b);
		b ++;
		System.out.println("byte   " + b);
		b --;
		System.out.println("byte   " + b);
		b --;
		System.out.println("byte   " + b);
		
		s = -1;
		System.out.println("byte   " + s);
		s ++;
		System.out.println("byte   " + s);
		s ++;
		System.out.println("byte   " + s);
		s = 32767;
		System.out.println("byte   " + s);
		s ++;
		System.out.println("byte   " + s);
		s ++;
		System.out.println("byte   " + s);
		s --;
		System.out.println("byte   " + s);
		s --;
		System.out.println("byte   " + s);
		
		i = -1;
		System.out.println("byte   " + i);
		i ++;
		System.out.println("byte   " + i);
		i ++;
		System.out.println("byte   " + i);
		i = 214748364;
		System.out.println("byte   " + i);
		i ++;
		System.out.println("byte   " + i);
		i ++;
		System.out.println("byte   " + i);
		i --;
		System.out.println("byte   " + i);
		i --;
		System.out.println("byte   " + i);
		
	}
	

}
