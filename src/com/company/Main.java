package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//Worker worker1 = new Worker("first worker",2222);
	Worker worker2 = new Worker("second worker",2222);
	//Worker worker3 = new Worker("third worker",4444);
	CommunalWorker cw1 = new CommunalWorker("El_worker",200,CWType.ELECTRICITY,false);
	CommunalWorker сw2 = new CommunalWorker("Gas_worker",1000,CWType.GAS,true);

	ArrayList<CommunalWorker> communalWorkers = new ArrayList<CommunalWorker>();
	communalWorkers.add(cw1);
	communalWorkers.add(сw2);

	Tariff tariff = new Tariff(1111,888,444,555);

	Malfunction mlf = new Malfunction("problem 1",8888);

	ArrayList<String> carNames= new ArrayList<String>();
	carNames.add("aaa");
	carNames.add("bbb");

	Contract contract1 = new Contract();
	Contract contract2 = new Contract();

	ParkingPlace p_p_1 = new ParkingPlace(111,false);
	ParkingPlace p_p_2 = new ParkingPlace(222,false);
	ParkingPlace p_p_3 = new ParkingPlace(333,false);
	ArrayList<ParkingPlace> parking_places_for_test = new ArrayList<ParkingPlace>();
	parking_places_for_test.add(p_p_1);
	parking_places_for_test.add(p_p_2);

	Client cl1= new Client("client 1",1235);
	Client cl2 = new Client("client 2 ",56846);

	//Contract useless_contract=  new Contract(1,parking_places_for_client3,car_names);// для проверки неправильности аргументов

	Owner owner = new Owner("Boss",2000000);
	ArrayList<Client> clientArrayList = new ArrayList<Client>();

	Accountant accountant = new Accountant("Accountant",4444,clientArrayList);
	ArrayList<Accountant> accountants= new ArrayList<>();
	accountants.add(accountant);
	clientArrayList.add(cl1);
	clientArrayList.add(cl2);


	ContractServise useless = new ContractServise(worker2,clientArrayList);//для проверки неправильности аргументов

	Parking parking = new Parking(clientArrayList,parking_places_for_test,owner,communalWorkers,accountants,true);

	ContractServise contractServise = new ContractServise(parking.getOwner(), parking.getClients());
	contractServise.add_client_p_p(cl1,p_p_1);
	contractServise.add_client_p_p(cl2,p_p_2);

	TariffServise tariffServise= new TariffServise(owner,tariff);
		System.out.println(tariffServise.getTariff());
	tariffServise.changeTariff(1000,4574,5656,6156);
		System.out.println(tariffServise.getTariff());



	ExpensesIncomeService expensesIncomeService = new ExpensesIncomeService(parking.getAccountants().get(0),parking.getC_workers(),parking.getClients(),tariff);
	expensesIncomeService.getCommunal_workers().get(0).setMalfunction(mlf);
	expensesIncomeService.billing();

	for (Client client:parking.getClients())
		System.out.println(client);

	contractServise.add_client_car(cl1,"123");

	contractServise.add_client_p_p(parking.getClients().get(1),new ParkingPlace(14,false,null));

	System.out.println(owner);
	owner.getMoney(expensesIncomeService.ownerEarnings());
	System.out.println(owner);

	for (Client client:parking.getClients())
			System.out.println(client);

		System.out.println("next billing");
	expensesIncomeService.billing();
		for (Client client:parking.getClients())
			System.out.println(client);
    }

}
