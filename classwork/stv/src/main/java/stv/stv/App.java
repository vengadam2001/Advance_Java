package stv.stv;
import java.sql.*;

/**
 * Hello world!
 *
 */
import java.sql.*;

public class App 
{
    public static void main( String[] args )
    {
       addProduct(3, "hello", 3);
       addProduct(4, "stv", 30);
       addProduct(5, "abcd", 31);
       addProduct(6, "asd", 29);
//       delProduct(1);
//       delProduct(9);
//       display();
//       changeName(10, "scale");
//       display();
//       changePrice(10, 20);
//       display();
       search("scale");
    }

    public static void search(String name) {
    	
    	try {
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {
    			System.out.println("Id \t Name \t Price");
        		java.sql.Statement stmt=con.createStatement();  
        		ResultSet rs=stmt.executeQuery("select * from  products where name like '"+name+"';");  
        		while(rs.next())
        		{
        		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));  
        		}	

    		} catch (Exception e) {
				// TODO: handle exception
			}
    		finally {
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
		
	}
    
    public static void addProduct(int id, String name, int price) {
    	
    	try {
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {

        		java.sql.Statement stmt=con.createStatement();  
        		int a=stmt.executeUpdate("insert into products values('"+id+"','"+name+"','"+price+"');");
        			
			} catch (Exception e) {
				// TODO: handle exception
			}
    		finally {
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
		
	}
    
    public static void  delProduct(int id) {
    	try {
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {

        		java.sql.Statement stmt=con.createStatement();  
        		int a=stmt.executeUpdate("delete from products where id='"+id+"';");
        		if(a==0)
        			System.out.print("No rows deleted");
        			
			} catch (Exception e) {
				// TODO: handle exception
			}
    		finally {
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
	}
    
    public static void changeName(int id, String newName) {
    	try {
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {

        		java.sql.Statement stmt=con.createStatement();  
        		int a=stmt.executeUpdate("update products set name='"+newName+"' where id='"+id+"';");
        		if(a==0)
        			System.out.print("No product is updated");
        		else {
					System.out.print("The product name is updated");
				}
        			
			} catch (Exception e) {
				// TODO: handle exception
			}
    		finally {
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
	}
    
    public static void changePrice(int id, int newPrice) {
    	try {
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {

        		java.sql.Statement stmt=con.createStatement();  
        		int a=stmt.executeUpdate("update products set price='"+newPrice+"' where id='"+id+"';");
        		if(a==0)
        			System.out.print("No product is updated");
        		else {
					System.out.print("The product price is updated");
				}
        			
			} catch (Exception e) {
				// TODO: handle exception
			}
    		finally {
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
    
    public static void display()
    {
    	try {
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {

        		java.sql.Statement stmt=con.createStatement();  
        		
        		ResultSet rs=stmt.executeQuery("select * from products");  
        		while(rs.next())
        		{
        		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));  
        		}	
			} catch (Exception e) {
				// TODO: handle exception
			}
    		finally {
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
	
		}
    }
    		
}