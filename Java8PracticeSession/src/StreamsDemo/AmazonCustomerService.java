package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AmazonCustomerService {
	
	public static List<CustomerData> getAll() {
		
		return Stream.of(
				new CustomerData(101, "Saradhi", "saradhi@gamil.com", Arrays.asList("7654565","5465465")),
				new CustomerData(102, "vinodh", "v@gamil.com", Arrays.asList("1455564","64846561")),
				new CustomerData(103, "Raghu", "Raghu@gamil.com", Arrays.asList("7846543","45454321")),
				new CustomerData(104, "Partha", "partha@gamil.com", Arrays.asList("4654651","7821321")),
				new CustomerData(105, "Nandh Kumar", "nandh7@gamil.com", Arrays.asList("6553562","454321")))
				.collect(Collectors.toList());
				
				
	}

}
