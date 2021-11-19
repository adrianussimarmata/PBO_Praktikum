package com.StudiKasus2;

import java.util.*;

public class AvengedSimulator {
	
	public static void main(String args[]) {
		List<SuperHero> hero = new ArrayList<SuperHero>();
		hero.add(new ManRay("Gyoubu Masataka Oniwa", 553));
		hero.add(new FlyingDutchMan("Tatenari", 36556));
		hero.add(new DirtyBubble("Arnastria", 666));
		hero.add(new ManRay("Gennichiro", 0));
		hero.add(new FlyingDutchMan("Shirai", 225));
		
		Collections.sort(hero);
		for(SuperHero sh : hero) {
			System.out.println("===============================");
			sh.Identity();
			sh.showPower();
			System.out.println("===============================");
		}
	}
}
