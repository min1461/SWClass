 package wowtest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OracleTest {
	
	public int getMovieSeq(int movieCheck, int timeCheck, int dateCheck ) {
		int result=0;
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
		Statement pstm = null; // SQL 문을 나타내는 객체
		ResultSet rs = null; // 쿼리문을 날린것에 대한 반환값을 담을 객체
		
		String quary = "select seq from movie where movie = "+movieCheck+" and to_char(DATE_CHECK, 'MMDD') = '"+dateCheck + "' and TIME_CHECK = "+timeCheck;

		try {
			// SQL 문장을 만들고 만약 문장이 질의어(SELECT문)라면
			// 그 결과를 담을 ResulSet 객체를 준비한 후 실행시킨다.
			
			conn = DBConnection.getConnection();
			pstm = conn.createStatement();
			rs = pstm.executeQuery(quary);
			/*
			 * EMP 테이블의 데이터 타입
			 * 
			 * seat__number = String; reservation = int;
			 */
			while(rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException sqle) {
			System.out.println("SELECT문에서 예외 발생");
			sqle.printStackTrace();
		} finally {
			// DB 연결을 종료한다.
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
				System.out.println("연결끊어짐");
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}

		}
		return result;
	}
	
	public boolean insertSeat(int movieSeq, List<List<Integer>> list) {
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
		Statement pstm = null; // SQL 문을 나타내는 객체
		ResultSet rs = null; // 쿼리문을 날린것에 대한 반환값을 담을 객체
		

		try {
			// SQL 문장을 만들고 만약 문장이 질의어(SELECT문)라면
			// 그 결과를 담을 ResulSet 객체를 준비한 후 실행시킨다.
			
			conn = DBConnection.getConnection();
			/*
			 * EMP 테이블의 데이터 타입
			 * 
			 * seat__number = String; reservation = int;
			 */
			for(List<Integer> temp : list) {
				String quary = "INSERT INTO SEAT_NUMBER VALUES ("+movieSeq+", "+temp.get(0)+", "+temp.get(1)+")";
				pstm = conn.createStatement();
				rs = pstm.executeQuery(quary);
				
				
			}
		} catch (SQLException sqle) {
			System.out.println("SELECT문에서 예외 발생");
			sqle.printStackTrace();
		} finally {
			// DB 연결을 종료한다.
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
				System.out.println("연결끊어짐");
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}

		}
		return true;
	}
	
	
	public List<List<Integer>> getSeatByMovieSeq(int movieSeq){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
		Statement pstm = null; // SQL 문을 나타내는 객체
		ResultSet rs = null; // 쿼리문을 날린것에 대한 반환값을 담을 객체
		String quary = "SELECT * FROM SEAT_NUMBER WHERE MOVIE_SEQ = "+movieSeq;

		try {
			// SQL 문장을 만들고 만약 문장이 질의어(SELECT문)라면
			// 그 결과를 담을 ResulSet 객체를 준비한 후 실행시킨다.
			conn = DBConnection.getConnection();
			pstm = conn.createStatement();
			rs = pstm.executeQuery(quary);
			/*
			 * EMP 테이블의 데이터 타입
			 * 
			 * seat__number = String; reservation = int;
			 */
			while(rs.next()) {
				List<Integer> tempList = new ArrayList<>();
				tempList.add(rs.getInt(2));
				tempList.add(rs.getInt(3));
				list.add(tempList);
			}
		} catch (SQLException sqle) {
			System.out.println("SELECT문에서 예외 발생");
			sqle.printStackTrace();
		} finally {
			// DB 연결을 종료한다.
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
				System.out.println("연결끊어짐");
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}

		}
		
		
		return list;
	}
	
	public void selectDB() {
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
		Statement pstm = null; // SQL 문을 나타내는 객체
		ResultSet rs = null; // 쿼리문을 날린것에 대한 반환값을 담을 객체
		String quary = "select * from Seat_Number";
		
		try {
			// SQL 문장을 만들고 만약 문장이 질의어(SELECT문)라면
			// 그 결과를 담을 ResulSet 객체를 준비한 후 실행시킨다.
			
			conn = DBConnection.getConnection();
			pstm = conn.createStatement();
			rs = pstm.executeQuery(quary);
			/*
			 * EMP 테이블의 데이터 타입
			 * 
			 * seat__number = String; reservation = int;
			 */
			while(rs.next()) {
			}
		} catch (SQLException sqle) {
			System.out.println("SELECT문에서 예외 발생");
			sqle.printStackTrace();
		} finally {
			// DB 연결을 종료한다.
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
				System.out.println("연결끊어짐");
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}

		}
	}
	
	
}
