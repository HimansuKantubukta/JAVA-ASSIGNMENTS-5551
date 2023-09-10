package com.example.booksoftware.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.booksoftware.Repository.UserRepo;
import com.example.booksoftware.entity.Users;
import com.login.DBUtil.DBUtil;

@Service
public class UserService implements UserRepo
{
	Connection connection;
	
	
	public UserService() throws SQLException {
		connection =DBUtil.getConnection();
	}
	int flag=0;
	   @Override
	   public int loginValidation(String Username,String Password)
	   {
		   
		   try {
			PreparedStatement statement=connection.prepareStatement("select * from users where username='"+Username+"'");
			
			statement.executeQuery();
			ResultSet rs=statement.executeQuery();
			
			while(rs.next())
			{
				if(rs.getString(1).equals(Username) &&rs.getString(2).equals(Password))
				{
					flag=1;
				}else {
					System.out.println("invalid username/password");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
		   
	   }

}

	