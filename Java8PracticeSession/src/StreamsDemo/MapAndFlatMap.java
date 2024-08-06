package StreamsDemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<CustomerData> data = AmazonCustomerService.getAll();
		
		List<String> name = data.stream().map(CustomerData -> CustomerData.getCustomerName()).collect(Collectors.toList());

		System.out.println(name);
		
		List<String> number = data.stream().flatMap(CustomerData -> CustomerData.getMobileNumber().stream()).collect(Collectors.toList());

		System.out.println(number);
		
	}

}
