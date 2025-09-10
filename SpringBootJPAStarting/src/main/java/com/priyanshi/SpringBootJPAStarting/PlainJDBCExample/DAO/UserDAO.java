package com.priyanshi.SpringBootJPAStarting.PlainJDBCExample.DAO;

import com.priyanshi.SpringBootJPAStarting.PlainJDBCExample.DatabaseConnection;

import java.sql.*;

public class UserDAO {

    public void createUserTable(){
        try{
            Connection connection=new DatabaseConnection().getConnection() ;
            Statement statementQuery=connection.createStatement();
            String sql="CREATE TABLE users(user_id INT AUTO_INCREMENT PRIMARY KEY, user_name varchar(50),user_age INT)";
            statementQuery.executeUpdate(sql);

            }

        catch(SQLException e){ }
            finally{
 //close the resources
            }
        }

        public void createUser(String userName,int userAge) {
            try {
                Connection connection = new DatabaseConnection().getConnection();
                String sqlQuery = "INSERT INTO users(user_name,user_age) VALUES(?, ?)";
                PreparedStatement preparedQuery = connection.prepareStatement(sqlQuery);
                preparedQuery.setString(1, userName);
                preparedQuery.setInt(2, userAge);
                preparedQuery.executeUpdate();
            } catch (SQLException e) {

            } finally { //close the resources

            }
        }

            public void readUsers() {
        try {
            Connection connection = new DatabaseConnection().getConnection();
            String sqlQuery = "SELECT * from users";
            PreparedStatement preparedQuery = connection.prepareStatement(sqlQuery);
            ResultSet output = preparedQuery.executeQuery();
            while (output.next()) {
                String userDetails = output.getInt("user_id") +
                        ":" + output.getString("user_name") +
                        ":" + output.getInt("user_age");
                System.out.println(userDetails);

            }
        }

                catch(SQLException e){

                }
                finally {

                }

        }
}
