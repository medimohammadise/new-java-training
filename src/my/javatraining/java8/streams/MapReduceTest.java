package my.javatraining.java8.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MapReduceTest {
	static List<BigDecimal> prices = Arrays.asList(new BigDecimal(10), new BigDecimal(30), new BigDecimal(17),
			new BigDecimal(20), new BigDecimal(15), new BigDecimal(18), new BigDecimal(45), new BigDecimal(12));

	private static BigDecimal calcualte10PercentDiscountForMoreThan20() {
		BigDecimal sum10PercentDiscountForMoreThan20 = BigDecimal.valueOf(0);
		for (BigDecimal price : prices) {
			if (price.compareTo(BigDecimal.valueOf(20)) > 0)
				sum10PercentDiscountForMoreThan20=sum10PercentDiscountForMoreThan20.add(price.multiply(BigDecimal.valueOf(.9)));
		}
		return sum10PercentDiscountForMoreThan20;
	}
	private static BigDecimal calcualte10PercentDiscountForMoreThan20Lamda() {
		//map to return other list with discounted values 
		return prices.stream().filter(price->price.compareTo(BigDecimal.valueOf(20))>0).map(price->price.multiply(BigDecimal.valueOf(.9))).reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	public static void main(String[] args) {
		System.out.println("Total discount of prices :"+calcualte10PercentDiscountForMoreThan20());
		
		System.out.println("Total discount of prices  with Lambda:"+calcualte10PercentDiscountForMoreThan20());
	}
}
