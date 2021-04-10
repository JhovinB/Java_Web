package com.jbac.web.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Programa_Map {
	public static void main(String[] args) {
		
		Map<String, String> teams= new HashMap<String, String>();
		teams.put("EG", "Evil Genisus");
		teams.put("NG", "Nigma");
		teams.put("VP", "Virtus Pro");
		teams.put("TS", "Secrect");
		teams.put("TP", "Thunder");
		
		
//		for (String llave: teams.keySet()) {
//			System.out.println(llave);
//		}
//
//		for (String clave: teams.values()) {
//			System.out.println(clave);
//		}
		for (Entry<String, String> team: teams.entrySet()) {
			System.out.println("Team Dota 2: '"+team.getKey()+"' "+team.getValue());
		}
	}
}
