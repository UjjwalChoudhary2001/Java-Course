import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException{

         /*
            import java.sql package
            load & register driver (done automatically by driver in jdbc-4 & above)
            create connection
            create & execute statement
            process results
            close connection
         */

        //Class.forName("org.postgresql.Driver"); - optional as using jdbc 4.2

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String user = "postgres";
        String password = "postgres";

        Connection conn = null;
        conn = DriverManager.getConnection(url,user,password);

        System.out.println("Connection to database established");

        //Fetching sname of sid=1
        String sql1 = "select sname from student where sid = 1";
        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery(sql1); //executeQuery() is only used for Select Statements.
        boolean hasNext = rs.next();
        System.out.println("Has next row? " + hasNext);

        String name = rs.getString("sname");
        //String name = rs.getString(1); Fetching using column no. in the order of select query
        System.out.println("Name: " + name);

        //Fetching all rows
        System.out.println("Printing All Rows");
        String sql2 = "select * from student";
        rs = st.executeQuery(sql2);
        while(rs.next()){
            System.out.println(rs.getInt(1)+"-"
                    +rs.getString(2)+"-"
                    +rs.getString(3));
        }


        //Insert , Update and Delete and Select using execute()
        //'execute' Method give 'true' only in case of select query ie when it produces a ResultSet

        String insertQuery = "insert into student values('5','John',48)";
        boolean status = st.execute(insertQuery);
        System.out.println("Insert Status: " + status);

        String updateQuery = "update student set sname='Max' where sid = 5";
        status = st.execute(updateQuery);
        System.out.println("Update Status: " + status);

        String deleteQuery = "delete from student where sid = 4";
        status = st.execute(deleteQuery);
        System.out.println("Delete Status: " + status);

        String selectQuery = "select sname from student where sid = 1";
        status = st.execute(selectQuery);
        System.out.println("Select Status: " + status);

        if (status) {
            rs = st.getResultSet();
        }
        if(rs.next()){
            System.out.println("Sname using execute() : " + rs.getString(1));
        }

        //Inserting Data using PreparedStatement
        String psQuery = "insert into student values(?,?,?)";

        PreparedStatement ps = conn.prepareStatement(psQuery);
        ps.setInt(1, 6);
        ps.setString(2, "Shawn");
        ps.setInt(3, 35);

        ps.execute();

        conn.close();
        System.out.println("Connection closed");
    }
}