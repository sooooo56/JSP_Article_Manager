package com.koreaIT.jsp.am.config;

public class Config {
	public static String getDBUrl() {
		return "jdbc:mysql://localhost:3306/2024_09_jsp_am?useUnicode=true&characterEncoding=utf8&autoReconnect=true&serverTimezone=Asia/Seoul&useOldAliasMetadataBehavior=true&zeroDateTimeNehavior=convertToNull";
	}
	
	public static String getDBUsr() {
		return "root";
	}
	
	public static String getDBUsrPw() {
		return "";
	}
	
	public static String getDBDriverName() {
		return "com.mysql.jdbc.Driver";
	}
}