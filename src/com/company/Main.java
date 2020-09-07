package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//Worker worker1 = new Worker("first worker",2222);
	Worker worker2 = new Worker("second worker",2222);
	//Worker worker3 = new Worker("third worker",4444);
	Communal_worker cw1 = new Communal_worker("El_worker",200,CW_type.ELECTRICITY,false);
	Communal_worker сw2 = new Communal_worker("Gas_worker",1000,CW_type.GAS,true);

	ArrayList<Communal_worker> communalWorkers = new ArrayList<Communal_worker>();
	communalWorkers.add(cw1);
	communalWorkers.add(сw2);

	Tariff tariff = new Tariff(1111,888,444,555);

	Malfunction mlf = new Malfunction("problem 1",8888);

	ArrayList<String> car_names= new ArrayList<String>();
	car_names.add("aaa");
	car_names.add("bbb");

	Contract contract1 = new Contract();
	Contract contract2 = new Contract();

	Parking_place p_p_1 = new Parking_place(111,false);
	Parking_place p_p_2 = new Parking_place(222,false);
	ArrayList<Parking_place> parking_places_for_test = new ArrayList<Parking_place>();
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


	Contract_servise useless = new Contract_servise(worker2,clientArrayList);//для проверки неправильности аргументов

	Parking parking = new Parking(clientArrayList,parking_places_for_test,owner,communalWorkers,accountants,true);

	Contract_servise contract_servise = new Contract_servise(parking.getOwner(), parking.getClients());
	contract_servise.add_client_p_p(cl1,p_p_1);
	contract_servise.add_client_p_p(cl2,p_p_2);

	Tariff_servise tariffServise= new Tariff_servise(owner,tariff);
		System.out.println(tariffServise.getTariff());
	tariffServise.change_tariff(1000,4574,5656,6156);
		System.out.println(tariffServise.getTariff());



	Expenses_income_service expensesIncomeService = new Expenses_income_service(parking.getAccountants().get(0),parking.getC_workers(),parking.getClients(),tariff);
	expensesIncomeService.getCommunal_workers().get(0).setMalfunction(mlf);
	expensesIncomeService.billing();

	for (Client client:parking.getClients())
		System.out.println(client);

	System.out.println(owner);
	owner.getMoney(expensesIncomeService.ownerEarnings());
	System.out.println(owner);
    }


}
