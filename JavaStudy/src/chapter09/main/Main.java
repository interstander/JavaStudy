package chapter09.main;

import java.util.Scanner;

import chapter09.contoller.Controller;
import chapter09.dto.Member;

public class Main {
	public static Member[] members = new Member[100];
	public static Scanner in = new Scanner(System.in);
	public static Member flag = null;
	
	public static void main(String[] args) {
		new Controller();
	}
}
