package com.github.pnowy.various.java8.interfaces;

/**
 * SubInterface
 */
public interface SubInterface extends MiddleInterface {

	@Override
	default void printName() {
		System.out.println("SUB_INTERFACE");
	}
}
