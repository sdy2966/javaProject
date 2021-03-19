package com.yedam.diary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class StdInputUtil {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static SimpleDateFormat df = new SimpleDateFormat("yyMMdd");

	 static {
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
         } catch (ClassNotFoundException e) {
            e.printStackTrace();
         }
      }

      public static Connection getConnection(String url, String id, String password) {
         Connection conn = null;
         try {
            conn = DriverManager.getConnection(url, id, password);
         } catch (SQLException e) {
            e.printStackTrace();
         }
         return conn;
      }

      public static void close(ResultSet rs, Statement stmt, Connection conn) {
         try {
            if (stmt != null) {
               stmt.close();
            }
            if (conn != null) {
               conn.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
      
	static int readInt() {
		int result = 0;

		do {
			try {
				String temp = br.readLine();
				result = Integer.parseInt(temp);
				break;
			} catch (Exception e) {
//			e.printStackTrace();
				System.out.println("숫자 형식이 아님");
			}
		} while (true);

		return result;
	}

	// 날짜입력
	public static String readDate() {
		String result = "";
		do {
			try {
				result = br.readLine();
				df.parse(result.trim());
				break;
			} catch (Exception e) {
//			e.printStackTrace();
				System.out.println("날짜 형식이 아닙니다.");
			}
		} while (true);
		return result;
	}
	
	public static String readCon() {
		String result = "";
		do {
			try {
				result = br.readLine();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
						
		} while (true);
		return result;
	}
			
	
	
//여러줄입력
	public static String readMultiLine() {
		StringBuffer result = new StringBuffer();
		try {
			while (true) {
				String temp = br.readLine();
				if(temp.equals("end")) {
					break;
				}
				result.append(temp + "\n");
			}			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return result.toString();
	}
}