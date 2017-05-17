package com.example.vd_listview_arraylist_object;

public class EmpoyeeFullTime extends Employee{
	@Override
	public double TinhLuong() {
		return 500;
	}
	@Override
	public String toString()
	{
		return super.toString() +"--> FullTime="+TinhLuong();
		
	}

}
