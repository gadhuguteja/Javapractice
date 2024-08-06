package com.collection.assignment;

import java.util.Arrays;
import java.util.*;
import java.util.List;

public class ConverArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []players = {"Messi", "Demaria", "santo", "Agston"};
		
		System.out.println("Before Converting to list :" +Arrays.toString(players));
		
		List<String> footBallPlayers = new ArrayList<>();
				
				Collections.addAll(footBallPlayers, players);
				
				System.out.println("After coversion :" + footBallPlayers);
		
		

	}

}
