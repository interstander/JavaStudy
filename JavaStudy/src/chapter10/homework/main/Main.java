package chapter10.homework.main;

import java.util.Scanner;

import chapter10.homework.controller.Controller;
import chapter10.homework.dto.Member;

public class Main {
	public static Member[] members = new Member[100];
	public static Scanner in = new Scanner(System.in);
	public static Member flag = null;
	
	public static void main(String[] args) {
		new Controller();
	}
}
