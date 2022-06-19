package connect;

import java.sql.*;

import db.users;

public class PreDAO {

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void setConn() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String info = "jdbc:oracle:thin:@106.10.23.227:1521:xe";
			con = DriverManager.getConnection(info, "scott", "tiger");
			System.out.println("접속성공!!");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 에러 : " + e.getMessage());
		}
	}
	
	
	/**   상대 매칭   **/
	public void matching(String gender, String loc) {
		String sql = "SELECT userno, nickname, gender, age, loc, "
				+ "interest1, interest2, interest3, interest4, interest5\n"
				+ "FROM users001\n"
				+ "where gender=?\n"
				+ "AND loc=?";
		try {
			setConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, gender);
			pstmt.setString(2, loc);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("nickname") + "\t");
				System.out.print(rs.getString("gender") + "\t");
				System.out.print(rs.getInt("age") + "\t");
				System.out.print(rs.getString("loc") + "\t");
				System.out.print(rs.getString("interest1") + "\t");
				System.out.print(rs.getString("interest2") + "\t");
				System.out.print(rs.getString("interest3") + "\t");
				System.out.print(rs.getString("interest4") + "\t");
				System.out.print(rs.getString("interest5") + "\n");
			}
			// 
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**   회원 조회   **/
	public void showUsersInfo(String userno) {
		String sql = "SELECT userno, nickname, gender, age, loc, "
				+ "interest1, interest2, interest3, interest4, interest5\n"
				+ "FROM users001\n"
				+ "WHERE userno = ?";
		try {
			setConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("nickname") + "\t");
				System.out.print(rs.getString("gender") + "\t");
				System.out.print(rs.getInt("age") + "\t");
				System.out.print(rs.getString("loc") + "\t");
				System.out.print(rs.getString("interest1") + "\t");
				System.out.print(rs.getString("interest2") + "\t");
				System.out.print(rs.getString("interest3") + "\t");
				System.out.print(rs.getString("interest4") + "\t");
				System.out.print(rs.getString("interest5") + "\n");
			}
			// 
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**  회원 등록  **/
	public void insertUsers(users ins) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "INSERT INTO users001 \n"
					+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ins.getUserno());
			pstmt.setString(2, ins.getId());
			pstmt.setString(3, ins.getPasswd());
			pstmt.setString(4, ins.getNickname());
			pstmt.setString(5, ins.getGender());
			pstmt.setInt(6, ins.getAge());
			pstmt.setString(7, ins.getLoc());
			pstmt.setString(8, ins.getInterest1());
			pstmt.setString(9, ins.getInterest2());
			pstmt.setString(10, ins.getInterest3());
			pstmt.setString(11, ins.getInterest4());
			pstmt.setString(12, ins.getInterest5());
			pstmt.executeUpdate();
			con.commit();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 에러 : " + e.getMessage());
			// commit 전에 예외가 발생하면 rollback 처리
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/**   회원 정보 수정   **/
	public void updateUsers(users ins) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "UPDATE users001\n"
					+ "    SET id = ?,\n"
					+ "        passwd = ?,\n"
					+ "        nickname= ?, \n"
					+ "        gender = ?,\n"
					+ "        age = ?,\n"
					+ "        loc = ?,\n"
					+ "        interest1 = ?,\n"
					+ "        interest2 = ?,\n"
					+ "        interest3 = ?,\n"
					+ "        interest4 = ?,\n"
					+ "        interest5 = ?\n"
					+ "WHERE userno = ?";
			pstmt = con.prepareStatement(sql);
			
			
			pstmt.setString(1, ins.getId());
			pstmt.setString(2, ins.getPasswd());
			pstmt.setString(3, ins.getNickname());
			pstmt.setString(4, ins.getGender());
			pstmt.setInt(5, ins.getAge());
			pstmt.setString(6, ins.getLoc());
			pstmt.setString(7, ins.getInterest1());
			pstmt.setString(8, ins.getInterest2());
			pstmt.setString(9, ins.getInterest3());
			pstmt.setString(10, ins.getInterest4());
			pstmt.setString(11, ins.getInterest5());
			pstmt.setString(12, ins.getUserno());
			pstmt.executeUpdate();
			con.commit();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 에러 : " + e.getMessage());
			// commit 전에 예외가 발생하면 rollback 처리
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**   회원 삭제   **/
	public void deleteUsers(String userno) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "DELETE FROM users001\n"
					+ "WHERE userno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userno);
			pstmt.executeUpdate();
			con.commit();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 에러 : " + e.getMessage());
			// commit 전에 예외가 발생하면 rollback 처리
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**   공지 조회   **/
	public void showNoticeInfo(String noticeno) {
		String sql = "SELECT nttitle, ntcontent\n"
				+ "FROM notice\n"
				+ "WHERE noticeno = ?";
		try {
			setConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, noticeno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("noticeno") + "\t");
				System.out.print(rs.getString("nttitle") + "\t");
				System.out.print(rs.getString("ntcontent") + "\n");
			}
			// 
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**   FAQ 조회   **/
	public void showFAQInfo(String faqno) {
		String sql = "SELECT question, answer\n"
				+ "FROM faq\n"
				+ "WHERE faqno = ?";
		try {
			setConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, faqno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("faqno") + "\t");
				System.out.print(rs.getString("question") + "\t");
				System.out.print(rs.getString("answer") + "\n");
			}
			// 
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**   리뷰 조회   **/
	public void showReviewInfo(String faqno) {
		String sql = "SELECT question, answer\n"
				+ "FROM faq\n"
				+ "WHERE faqno = ?";
		try {
			setConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, faqno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("noticeno") + "\t");
				System.out.print(rs.getString("nttitle") + "\t");
				System.out.print(rs.getString("ntcontent") + "\n");
			}
			// 
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
