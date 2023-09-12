package smartCityDetails;

import java.util.Scanner;

public class Perform_City_Operation implements City_Operation {

	City_Features features[] = new City_Features[10];
	int count;
	Scanner sc = new Scanner(System.in);

	public int compareFeatureObjects(City_Features c1, City_Features c2) {

		if (c1.city_name.equalsIgnoreCase(c2.city_name)) {

			System.out.println("City Name Already Exists.");
			return 0;

		}

		return 1;
	}

	@Override
	public void add_feature(City_Features c) {

		for (int i = 0; i < count; i++) {

			if (this.compareFeatureObjects(c, this.features[i]) == 0)
				return;
		}

		if (count < 10) {

			features[count] = c;
			count++;

		} else {

			System.out.println("No Space to Add More City.");

		}

	}

	@Override
	public void view_feature() {
		System.out.println("\t\t\t\tCity Details\n");
		System.out.println("City\tCategory\tAddress\t\tContact");
		for (int i = 0; i < count; i++) {

			System.out.println( features[i].city_name+ "\t\t"+ features[i].category + "\t\t" + features[i].address
					+ "\t\t" + features[i].contact);

		}

	}

	@Override
	public String searchCity(String city_name) {

		for (int i = 0; i < count; i++) {

			if (city_name.equals(features[i].city_name)) {
				System.out.println("City detail is available");
				System.out.println("City\tCategory\tAddress\t\tContact");
				System.out.println(features[i].city_name + "\t\t" + features[i].category + "\t\t" + features[i].address
						 + "\t\t" + features[i].contact);

				return city_name;
			}

		}
		System.out.println("City detail is not Unavailable");
		return city_name;

	}

}
