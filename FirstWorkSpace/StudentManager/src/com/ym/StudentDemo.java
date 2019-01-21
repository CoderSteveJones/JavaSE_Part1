package com.ym;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("---- 欢迎来到学生管理系统 ----");
			System.out.println("1. 查看所有学生");
			System.out.println("2. 添加学生");
			System.out.println("3. 删除学生");
			System.out.println("4. 修改学生");
			System.out.println("5. 退出");
			
			
			int inputNum = s.nextInt();
			switch (inputNum) {
			case 1:
			{
				selectedAllStudent(students);
			}
				break;
			case 2:
			{
				
				addStudentToList(students);
			}
				break;
			case 3:
			{
				deleteStudentFromList(students);
			}
				break;
			case 4:
			{
				modifyStudentWithList(students);
			}
				break;
				
			default:
				System.out.println("谢谢你的使用！");
				System.exit(0);
				break;
			}
		}
	}
	
	// 查看所有学生
	public static void selectedAllStudent(ArrayList<Student> students) {
		
		if (students.size() == 0) {
			System.out.println("暂时无学生信息");
		}else {
			System.out.println("学号  " + "姓名  " + "年龄  " + "居住地 " );
			for (int i = 0; i < students.size(); i++) {
				Student getS = students.get(i);
				System.out.println(getS.getNum() + "  " + getS.getName() + "  " + getS.getAge() + "  " + getS.getAddress());
			}
		}
	}
	
	// 添加学生
	public static void addStudentToList(ArrayList<Student> students) {
		
		System.out.println("请输入学号：");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		
		System.out.println("请输入姓名：");
		String name = scanner.nextLine();
		
		System.out.println("请输入年龄：");
		String age = scanner.nextLine();
		
		System.out.println("请输入居住地：");
		String address = scanner.nextLine();
		
		Student newStudent = new Student(num, name, age, address);
		students.add(newStudent);
		System.out.println("添加成功！");
	}
	
	// 删除学生
	public static void deleteStudentFromList(ArrayList<Student> students) {
		
		if (students.size() == 0) {
			System.out.println("暂无相关学生信息，不可进行删除操作");
		}else {
			System.out.println("请输入需要删除的学号：");
			Scanner scanner = new Scanner(System.in);
			String num = scanner.nextLine();
			for (int i = 0; i < students.size(); i++) {
				Student getStudent = students.get(i);
				if (getStudent.getNum().equals(num)) {
					students.remove(getStudent);
				}else {
					System.out.println("无此学号的学生");
				}
			}
		}
	}
	
	// 修改学生
	public static void modifyStudentWithList(ArrayList<Student> students) {
		System.out.println("请输入要修改学生的学号：");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if (num.equals(student.getNum())) {
				System.out.println("请输入要修改学生的姓名：");
				String name = scanner.nextLine();
				student.setName(name);
			}
		}
	}
	
	
	
	
	
	
}
