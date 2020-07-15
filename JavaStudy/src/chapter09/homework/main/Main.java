package chapter09.homework.main;

import java.util.Scanner;

import chapter09.homework.contoller.Controller;
import chapter09.homework.dto.Member;

public class Main {
	public static Member[] members = new Member[100];
	public static Scanner in = new Scanner(System.in);
	public static Member flag = null;
	
	public static void main(String[] args) {
		new Controller();
	}
}
