package problem2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ProductDAO {
	private JdbcTemplate jdbcTemplate;
	public ProductDAO() {
		
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	public int saveRecord(Product a) {
		return jdbcTemplate.update("insert into products values("+ a.getId()+",'"+a.getName()+"','"+
	a.getDescription()+"',"+a.getQuantity()+",'"+a.getPrice()+"','"+a.getCategory()+"')");
	}
	
	public int deleteRecord(Product a) {
		return jdbcTemplate.update("delete from products where id="+a.getId());
	}
	
	public int updateRecord(Product a) {
		return jdbcTemplate.update("update products set description='"+a.getDescription()+"',quantity="+a.getQuantity()+" where id="+a.getId());
	}
	
	public List<Product> listDetails(){
		return jdbcTemplate.query("select * from products", new RowMapper<Product>() {
			public Product mapRow(ResultSet r,int n) throws SQLException{ //called anonymous class
				Product a=new Product();
				a.setId(r.getInt(1));
				a.setName(r.getString(2));
				a.setDescription(r.getString(3));
				a.setQuantity(r.getInt(4));
				a.setPrice(r.getDouble(5));
				a.setCategory(r.getString(6));
				return a;
			}
		});
	}
	
	public List<Product> findByQuantity(int a){
		return jdbcTemplate.query("select * from products where quantity<"+a, new RowMapper<Product>() {
			public Product mapRow(ResultSet r,int n) throws SQLException{ //called anonymous class
				Product a=new Product();
				a.setId(r.getInt(1));
				a.setName(r.getString(2));
				a.setDescription(r.getString(3));
				a.setQuantity(r.getInt(4));
				a.setPrice(r.getDouble(5));
				a.setCategory(r.getString(6));
				return a;
			}
		});
	}
	
	public List<Product> findByPrice(double n1,double n2){
		return jdbcTemplate.query("select * from products where (price>"+n1+" and price<"+n2+")", new RowMapper<Product>() {
			public Product mapRow(ResultSet r,int n) throws SQLException{ //called anonymous class
				Product a=new Product();
				a.setId(r.getInt(1));
				a.setName(r.getString(2));
				a.setDescription(r.getString(3));
				a.setQuantity(r.getInt(4));
				a.setPrice(r.getDouble(5));
				a.setCategory(r.getString(6));
				return a;
			}
		});
	}
	
	public List<Product> findByCategory(String p){
		return jdbcTemplate.query("select * from products where category='"+p+"'", new RowMapper<Product>() {
			public Product mapRow(ResultSet r,int n) throws SQLException{ //called anonymous class
				Product a=new Product();
				a.setId(r.getInt(1));
				a.setName(r.getString(2));
				a.setDescription(r.getString(3));
				a.setQuantity(r.getInt(4));
				a.setPrice(r.getDouble(5));
				a.setCategory(r.getString(6));
				return a;
			}
		});
	}
}
