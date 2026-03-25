package Hw2;

public class hw2 {
	public static void main(String[] args) {
		System.out.println("========= 1. ===========");
		System.out.println("請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)");
		int A = 0;
		while (A < 100) {
			System.out.print("  " + (A = A + 2));
		}
		System.out.println("  ");

		System.out.println("========= 2. ===========");
		System.out.println("請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈))");
		int B = 1, C = 1;
		for (B = 1; B <= 10; B++) {
			C = C * B;
		}
		System.out.println(C);

		System.out.println("  ");
		System.out.println("========= 3. ===========");
		System.out.println("請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)");
		int D = 1, E = 1;
		while (D < 10) {
			D = D + 1;
			E = D * E;
		}
		System.out.println(E);

		System.out.println("  ");
		System.out.println("========= 4. ===========");
		System.out.println("請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100");
		int F = 0;
		while (F < 10) {
			F = F + 1;
			System.out.print((F * F) + "  ");
		}
		System.out.println("  ");
		System.out.println("========= 5. ===========");
		System.out.println("阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？");

		
		
		
		System.out.println("  ");
		System.out.println("========= 6. ===========");
		System.out.println("請設計一隻Java程式，輸出結果為以下 12345678910 ...");
		for (int I =10 ; I>=1;I--) {   //第一排要印10個 第二排要印9個 (計算要印幾個)
			for(int J= 1; J<=I; J++) {  // 實際開始列印 按照上面的數量 從1打到需要的數量
				System.out.print(J + " ");
							}
			System.out.println();
				
			}
		System.out.println("  ");
		System.out.println("========= 7. ===========");
		System.out.println("請設計一隻Java程式，輸出結果為以下： A BB CCC DDDD...");
		for(int K = 1; K<6;K++) {
			for(int L=1;L<=K; L++) {
				System.out.print((char)('A' + (K-1)));
		} 
			System.out.println();  //幹好難 救我
		}
		System.out.println("  ");
		System.out.println("========= 8. ===========");
		System.out.println("請建立一個TestNineNine.java程式，可輸出九九乘法表,一：使用for迴圈+ while迴圈");
		int number1 =1 , number2 = 1 ;
		
		for (number1=1;number1<10;number1++) {
			number2 = 1;   //讓他重製
//			System.out.print(number1+" ");
			while (number2 <= 9 ) {
								
				System.out.print(number1+"X"+number2+"="+number1*number2+" ");
				number2++;
			}
			System.out.println("");
		}
		System.out.println("  ");
		System.out.println("========= 9. ===========");
		System.out.println("請建立一個TestNineNine.java程式，可輸出九九乘法表,一：使用for迴圈+ do while迴圈");
		int number3 = 1,number4 = 1;
		for (number3=1 ;number3<10;number3++) {
			number4= 1 ;
			do {System.out.print(number3+"X"+number4+"="+number3*number4+" ");
			number4++;
			
		}	while (number4<= 9);
			 System.out.println();
	
		}	
		
		System.out.println("========= 10. ===========");
		System.out.println("請建立一個TestNineNine.java程式，可輸出九九乘法表,一：使用while迴圈+ do while迴圈");
		int number5 =1 , number6 =1;
		while(number5<10) {
		number6 =1 ;
		do {System.out.print(number5+"X"+number6+"="+number5*number6+" ");
			number6++;
		} while(number6<=9);
		number5++;
		System.out.println();
		}
		
		
		
		}	
		} 
	
	

	

