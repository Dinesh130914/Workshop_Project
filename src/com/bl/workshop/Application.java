package com.bl.workshop;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.stylesheets.MediaList;

public class Application {

	MedicineStore medicineStore = new MedicineStore();
	UserInterface userInterface = new UserInterface();
	public static void main(String[] args) 
	{

		Application application = new Application();

		int option = 0;

		while (option != 9) {

			System.out.println("\n");
			option = application.userInterface.showMainMenu();
			application.handleUserSelection(option);
		}
	}

	void handleUserSelection(int option) 
	{
		switch (option) {
		case 1:
			addMedicine();
			break;
		case 2:
			removeMedicine();
			break;
		case 3:

			updatemedicine();
			break;
		case 4:
			userInterface.print(medicineStore.getMedicineList());
			break;
		case 5:

			break;
		case 6:

			break;
		case 7:
			break;
		default:
			break;

		}
	}

	void addMedicine()
	{

		Acolic acolic = new Acolic();
		acolic.mfgDate = new Date ("11/2/2020");
		acolic.expDate = new Date("13/5/2021");
		Crocin crocin = new Crocin();
		crocin.mfgDate = new Date("28/06/2020");
		crocin.expDate = new Date("08/04/2021");

		Disprin disprin = new Disprin();
		disprin.mfgDate = new Date("21/02/2020");
		disprin.expDate = (Date) new Date("2/02/2021");

		Glugond gluconD = new Glugond();
		gluconD.mfgDate = new Date("23/05/2020");
		gluconD.expDate = new Date("28/06/2021");

		medicineStore.add(gluconD);
		medicineStore.add(disprin);
		medicineStore.add(acolic);
	}

	void removeMedicine()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the medicine name want to delete");
		String medicineName = scanner.nextLine();
		Medicine medicine = medicineStore.getMedicine(medicineName);
		medicineStore.remove(medicine);
	}

	void updatemedicine()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Search the medicine name");
		String medicineName = scanner.nextLine();
		Medicine medicine = medicineStore.getMedicine(medicineName);
		System.out.println("\n");

		userInterface.update(medicine);

		System.out.print("\n");
		System.out.println("Succesfully Updated");
	}

}
