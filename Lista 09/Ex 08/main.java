import java.util.Scanner;
import java.text.DecimalFormat;
public class main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		df.setMinimumFractionDigits(2);
		int num;
		float acm = 0.0f;
		float qtd = 0.0f;
		boolean isNegative = false;
		float media = 0.0f;
		while(isNegative == false) {
			num = scanner.nextInt();
			if(num >= 0) {
				acm += num;
				qtd++;
			} else {
				isNegative = true;
			}
		}
		if(qtd > 0){
			media = acm / qtd;
		}
		System.out.println(df.format(media)); 
		scanner.close();
	}
}