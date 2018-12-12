package problem1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class AccountDAO {
	private JdbcTemplate jdbcTemplate;
	public AccountDAO() {
		
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	public int saveRecord(Account a) {
		return jdbcTemplate.update("insert into accounts values("+ a.getId()+",'"+a.getName()+"','"+
	a.getAddress()+"',"+a.getAge()+",'"+a.getCity()+"','"+a.getIdentityProof()+"')");
	}
	
	public int deleteRecord(Account a) {
		return jdbcTemplate.update("delete from accounts where id="+a.getId());
	}
	
	public int updateRecord(Account a) {
		return jdbcTemplate.update("update accounts set city='"+a.getCity()+"',address='"+a.getAddress()+"' where id="+a.getId());
	}
	
	public List<Account> listDetails(){
		return jdbcTemplate.query("select * from accounts", new RowMapper<Account>() {
			public Account mapRow(ResultSet r,int n) throws SQLException{ //called anonymous class
				Account a=new Account();
				a.setId(r.getInt(1));
				a.setName(r.getString(2));
				a.setAddress(r.getString(3));
				a.setAge(r.getInt(4));
				a.setCity(r.getString(5));
				a.setIdentityProof(r.getString(6));
				return a;
			}
		});
	}
	
	public List<Account> findByAge(int a){
		return jdbcTemplate.query("select * from accounts where age>"+a, new RowMapper<Account>() {
			public Account mapRow(ResultSet r,int n) throws SQLException{ //called anonymous class
				Account a=new Account();
				a.setId(r.getInt(1));
				a.setName(r.getString(2));
				a.setAddress(r.getString(3));
				a.setAge(r.getInt(4));
				a.setCity(r.getString(5));
				a.setIdentityProof(r.getString(6));
				return a;
			}
		});
	}
	
	public List<Account> findByCity(String c){
		return jdbcTemplate.query("select * from accounts where city='"+c+"'", new RowMapper<Account>() {
			public Account mapRow(ResultSet r,int n) throws SQLException{ //called anonymous class
				Account a=new Account();
				a.setId(r.getInt(1));
				a.setName(r.getString(2));
				a.setAddress(r.getString(3));
				a.setAge(r.getInt(4));
				a.setCity(r.getString(5));
				a.setIdentityProof(r.getString(6));
				return a;
			}
		});
	}
	
	public List<Account> findByProof(String p){
		return jdbcTemplate.query("select * from accounts where identityproof='"+p+"'", new RowMapper<Account>() {
			public Account mapRow(ResultSet r,int n) throws SQLException{ //called anonymous class
				Account a=new Account();
				a.setId(r.getInt(1));
				a.setName(r.getString(2));
				a.setAddress(r.getString(3));
				a.setAge(r.getInt(4));
				a.setCity(r.getString(5));
				a.setIdentityProof(r.getString(6));
				return a;
			}
		});
	}
}
