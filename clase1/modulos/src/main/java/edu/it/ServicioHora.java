package edu.it;

import javax.mispec.menu.MenuItem;

public class ServicioHora implements MenuItem {

	@Override
	public void ejecutarOpcionMenu() {
		System.out.println(System.currentTimeMillis());
		System.out.println();
	}
}
