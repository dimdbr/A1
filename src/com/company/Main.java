package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Worker worker1 = new Worker("dddd",2222);
	Communal_worker cw1 = new Communal_worker("sss",200,CW_type.ELECTRICITY,false);
	Malfunction mlf = new Malfunction("ddd",88);
	Parking_place p_p_1 = new Parking_place(111,false);
	Client cl1= new Client("QWERTY",123);
	System.out.println(cl1);
	Owner owner = new Owner("Boss",2000000);
	ArrayList<Client> clientArrayList = new ArrayList<Client>();
	clientArrayList.add(cl1);
	Contract_servise contract_servise = new Contract_servise(owner,clientArrayList);
	contract_servise.add_client_p_p(cl1,p_p_1);
	System.out.println(clientArrayList.get(0));

    }
}
