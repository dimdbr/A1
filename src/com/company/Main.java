package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//Worker worker1 = new Worker("first worker",2222);
	Worker worker2 = new Worker("second worker",2222);

	System.out.println("Работники комунальных служб");
	CommunalWorker cw1 = new CommunalWorker("El_worker",200,CWType.ELECTRICITY,false);
		System.out.println(cw1);
	CommunalWorker cw2 = new CommunalWorker("Gas_worker",1000,CWType.GAS,true);
		System.out.println(cw2);
	ArrayList<CommunalWorker> communalWorkers = new ArrayList<CommunalWorker>();
	communalWorkers.add(cw1);
	communalWorkers.add(cw2);

		System.out.println("Тарифы:\n");
	Tariff tariff = new Tariff(1111,888,444,555);
		System.out.println(tariff);

		System.out.println("Неполадка\n");
	Malfunction mlf = new Malfunction("problem 1",8888);
		System.out.println(mlf);

	ArrayList<String> carNames= new ArrayList<String>();
	carNames.add("aaa");
	carNames.add("bbb");

	Contract contract1 = new Contract();
	Contract contract2 = new Contract();
		System.out.println("Создание паркомест");
	ParkingPlace p_p_1 = new ParkingPlace(111,false);
	ParkingPlace p_p_2 = new ParkingPlace(222,false);
	ParkingPlace p_p_3 = new ParkingPlace(333,false);
	ArrayList<ParkingPlace> parking_places_for_test = new ArrayList<ParkingPlace>();

	parking_places_for_test.add(p_p_1);
	parking_places_for_test.add(p_p_2);
	System.out.println(p_p_1);
		System.out.println(p_p_2);
		System.out.println(p_p_3);

		System.out.println("создаем клиентов\n");
	Client cl1= new Client("client 1",1235);
	Client cl2 = new Client("client 2 ",56846);

	//Contract useless_contract=  new Contract(1,parking_places_for_client3,car_names);// для проверки неправильности аргументов


		System.out.println("создаем владельца\n");
	Owner owner = new Owner("Boss",2000000);
		System.out.println(owner);



	ArrayList<Client> clientArrayList = new ArrayList<Client>();

	Accountant accountant = new Accountant("Accountant",4444,clientArrayList);
	ArrayList<Accountant> accountants= new ArrayList<>();
	accountants.add(accountant);
	clientArrayList.add(cl1);
	clientArrayList.add(cl2);

		System.out.println("создание сервисов\n");
	ContractService useless = new ContractService(worker2,clientArrayList);//для проверки неправильности аргументов

	Parking parking = new Parking(
	        clientArrayList,
            parking_places_for_test,
            owner,communalWorkers,
            accountants,
            true);

	ContractService contractService = new ContractService(parking.getOwner(), parking.getClients());
	contractService.add_client_p_p(cl1,p_p_1);
	contractService.add_client_p_p(cl2,p_p_2);

	TariffService tariffServise= new TariffService(owner,tariff);
		System.out.println(tariffServise.getTariff());
	tariffServise.changeTariff(1000,4574,5656,6156);
		System.out.println(tariffServise.getTariff());



	ExpensesIncomeService expensesIncomeService = new ExpensesIncomeService(
	        parking.
            getAccountants().get(0),
            parking.getC_workers(),
            parking.getClients(),
            tariff
    );
	System.out.println("завершение создания сервисов\n");

		System.out.println("рабочий добавляет неполадку\n");
	expensesIncomeService.
            getCommunal_workers().
            get(0).setMalfunction(mlf);
		System.out.println("расчет оплаты для клиентов");
	expensesIncomeService.billing();

	for (Client client:parking.getClients())
		System.out.println(client);
		System.out.println("добавляем 1 клиенту новую машину");
	contractService.add_client_car(cl1,"123");
		for (Client client:parking.getClients())
			System.out.println(client);

		System.out.println("добавляем 2 клиенту паркоместо");
	contractService.add_client_p_p(
	        parking.getClients().get(1),
            new ParkingPlace(14,false,null));

	System.out.println(owner);
	owner.getMoney(expensesIncomeService.ownerEarnings());
	System.out.println(owner);

	for (Client client:parking.getClients())
			System.out.println(client);

		System.out.println("расчет оплаты для клиентов");
		owner.getMoney(expensesIncomeService.ownerEarnings());
		System.out.println(owner);
	expensesIncomeService.billing();
		for (Client client:parking.getClients())
			System.out.println(client);
    }


}
