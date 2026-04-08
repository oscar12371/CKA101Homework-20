package hw1;

public class hw1 {
	public static void main(String[] args) {
		System.out.println("========= 1. ===========");
		System.out.println("請設計一隻Java程式,計算12,6這兩個數值的和與積");
		int num1 = 12;
		int num2 = 6;
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println("========= 2. ===========");
		System.out.println("請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)");
		int num3 = 200;
		System.out.println(num3 / 12 + "打");
		System.out.println(num3 % 12 + "顆");
		System.out.println("========= 3. ===========");
		System.out.println("請由程式算出256559秒為多少天、多少小時、多少分與多少秒");

		int num4 = 256559;
		int all = 24 * 60 * 60;
		int hours = 60 * 60;
		System.out.println(num4 / all + "天");
		System.out.println((num4 % all) / hours + "小時");
		System.out.println(((num4 % all) % hours) % 60 + "分");
		System.out.println("========= 4. ===========");
		System.out.println("請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長");
		double num5 = 3.1415;
		int round = 5;
		System.out.println(round * round * num5);
		System.out.println((round + round) * num5);
		System.out.println("========= 5. ===========");
		System.out.println("某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本\r\n"
				+ "金加利息共有多少錢");
		double num6 = 1500000;
		double num7 = 2.0 / 100;
		double result = num6 * Math.pow((1 + num7), 10);
		System.out.println(result);
		System.out.println("========= 6. ===========");
		System.out.println("請寫一隻程式,利用System.out.println()印出以下三個運算式結果:");
		System.out.println(5 + 5); // 相加 因為型別都是數字 所以10 很正常
		System.out.println(5 + '5'); // 因為它屬於十進制 對照過去是53 相加等於58
		System.out.println(5 + "5"); // ""內屬於字串 String 所以55

	}

}
