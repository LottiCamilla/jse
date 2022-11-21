package com.example.jse.m06.s15.ex;

public class Warrior extends Actor {
	private int potenzaFisica;

	protected Warrior(String name, int potenzaFisica) {
		super(name);
		this.potenzaFisica = potenzaFisica;
	}

	@Override
	public boolean fight(Actor enemy) {
		if (enemy instanceof Warrior && potenzaFisica > ((Warrior) enemy).potenzaFisica) {
			return true;
		} else if (!(enemy instanceof Wizard) && !(enemy instanceof Warrior)) {
			return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Warrior [name=" + super.getName() + ", potenzaFisica=" + potenzaFisica + "]";
	}

}
