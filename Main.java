import java.sql.*;

public class Main {
public static void main(String[]args) throws Exception{
    String url="jdbc:mysql://localhost:3306/srbbhxx";
    String uName="root";
    String pass="SRBBHXX";
    String query="select id,name,status from main_table";
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con= DriverManager.getConnection(url, uName,pass);
    Statement st=con.createStatement();
    ResultSet rs= st.executeQuery(query);
    while(rs.next()){
        System.out.println( rs.getInt("id")+" - "+ rs.getString("name")+ " - "+ rs.getInt("STATUS") );
    }
    st.close();
    con.close();

}
        }