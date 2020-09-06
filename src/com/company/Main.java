package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Worker worker1 = new Worker("first worker",2222);
	Worker worker = new Worker("second worker",2222);
	Communal_worker cw1 = new Communal_worker("sss",200,CW_type.ELECTRICITY,false);
	Malfunction mlf = new Malfunction("ddd",88);


	Contract cntr2 = new Contract();
	Parking_place p_p_1 = new Parking_place(111,false);
	Client cl1= new Client("QWERTY",123);
	Client cl2 = new Client("cdcd",56846,cntr2);
	//System.out.println(cl1);
	Owner owner = new Owner("Boss",2000000);
	ArrayList<Client> clientArrayList = new ArrayList<Client>();

	clientArrayList.add(cl1);
	clientArrayList.add(cl2);

	Contract_servise contract_servise = new Contract_servise(owner,clientArrayList);
	Contract_servise usless = new Contract_servise(worker,clientArrayList);
	contract_servise.add_client_p_p(cl1,p_p_1);

	for (Client client:clientArrayList)
	System.out.println(client);
		System.out.println(owner);

	contract_servise.collect_money();
		System.out.println(owner);
    }

}
