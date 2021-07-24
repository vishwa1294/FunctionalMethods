package com.xworkz.fishTester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.xworkz.fishdto.FishDTO;

public class FishTester {

	public static void main(String[] args) {

		FishDTO dto = new FishDTO("OscarFish", "Orange", "Oranda", "5years", "200", "Male");
		FishDTO dto1 = new FishDTO("SalmonFish", "Dark Red", "Channel fish", "10years", "500", "Female");
		FishDTO dto2 = new FishDTO("Flounder", "Gray", "Mermaid", "8years", "400", "FeMale");
		FishDTO dto3 = new FishDTO("CatFish", "Olive Brown", "Channel fish", "15years", "1500", "Male");

		List<FishDTO> temp = new ArrayList<FishDTO>();
		temp.add(dto1);
		temp.add(dto);
		temp.add(dto3);
		temp.add(dto2);

		Comparator<FishDTO> fishName = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("     ");
				System.out.println("Name Sorting in Ascending order");
				return o1.getName().compareTo(o2.getName());
			}
		};

		Collections.sort(temp, fishName);

		Iterator<FishDTO> itr = temp.iterator();
		while (itr.hasNext()) {
			FishDTO fishdto = (FishDTO) itr.next();
			System.out.println(fishdto.getName());
		}

		Comparator<FishDTO> fishNameDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("     ");
				System.out.println("Name sorting in Deseding order");

				return o2.getName().compareTo(o1.getName());
			}

		};

		Collections.sort(temp, fishNameDesc);

		Iterator<FishDTO> itr1 = temp.iterator();
		while (itr1.hasNext()) {
			FishDTO fishdto = (FishDTO) itr1.next();
			System.out.println(fishdto.getName());
		}

		Comparator<FishDTO> fishColour = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("     ");
				System.out.println("Colour sorting ");

				return o1.getColour().compareTo(o2.getColour());
			}

		};

		Collections.sort(temp, fishColour);

		Iterator<FishDTO> itr2 =temp.iterator();
		while (itr2.hasNext()) {
			FishDTO fishdto = (FishDTO) itr2.next();
			System.out.println(fishdto.getColour());
		}

		Comparator<FishDTO> lifeSpan = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("     ");
				System.out.println("Lifespan Desending");

				return o1.getLifeSpan().compareTo(o2.getLifeSpan());
			}
		};

		Collections.sort(temp, lifeSpan);

		Iterator<FishDTO> itr3 = temp.iterator();
		while (itr3.hasNext()) {
			FishDTO fishdto = (FishDTO) itr3.next();
			System.out.println(fishdto.getLifeSpan());
		}

		Comparator<FishDTO> fishlife = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("     ");
				System.out.println("LifeSpan Asending");

				return o2.getLifeSpan().compareTo(o1.getLifeSpan());
			}

		};

		Collections.sort(temp, fishlife);

		Iterator<FishDTO> itr4 = temp.iterator();
		while (itr4.hasNext()) {
			FishDTO fishdto = (FishDTO) itr4.next();
			System.out.println(fishdto.getLifeSpan());
		}

		Comparator<FishDTO> cost = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("     ");
				System.out.println("cost Desending");

				return o1.getCost().compareTo(o2.getCost());
			}

		};

		Collections.sort(temp, cost);

		Iterator<FishDTO> itr5 = temp.iterator();
		while (itr5.hasNext()) {
			FishDTO fishdto = (FishDTO) itr5.next();
			System.out.println(fishdto.getCost());
		}

	}

}