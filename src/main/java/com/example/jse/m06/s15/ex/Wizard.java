package com.example.jse.m06.s15.ex;

public class Wizard extends Actor{
	private int potenzaMagica;
	
	protected Wizard(String name, int potenzaMagica) {
		super(name);
		this.potenzaMagica = potenzaMagica;
	}
	
	@Override
	public boolean fight(Actor enemy) {
		if (enemy instanceof Wizard && potenzaMagica < ((Wizard) enemy).potenzaMagica) {
			return false;
		} else if (!(enemy instanceof Wizard) && !(enemy instanceof Warrior)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Wizard [name=" + super.getName() +  ", potenzaMagica=" + potenzaMagica + "]";
	}

}
