package com.example.vd_listview_arraylist_object;

public class EmployeePartTime extends Employee{

	@Override
	public double TinhLuong() {
		return 150;
	}
	@Override
	public String toString()
	{
		return super.toString() +"--> FullTime="+TinhLuong();
		
	}
}
