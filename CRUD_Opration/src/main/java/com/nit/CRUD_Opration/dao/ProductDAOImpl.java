package com.nit.CRUD_Opration.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nit.CRUD_Opration.domain.Product;

@Repository()
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private JdbcTemplate jt;

	/*
	 * public void setJt(JdbcTemplate jt) { this.jt = jt; }
	 */

	private final static String GET_ALL = "select * from products";
	private final static String SAVE_PRODUCT = " insert into products values (?,?,?,?,?,?,?)";
	private static final String DELETE_PRODUCT_BY_ID = "delete from products where p_id = ?";
	private static final String SHOW_PRODUCT_BY_ID = "select * from products where p_id = ?";

	public List<Product> listAll() {
		List<Product> list = null;

		// using RowMapper
		list = jt.query(GET_ALL, new RowMapper<Product>() {
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p = new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				p.setQuantity(rs.getShort(4));
				p.setDescription(rs.getString(5));
				p.setPhoto(rs.getString(6));
				p.setAvailable(rs.getBoolean(7));
				return p;
			}
		});
		return list;
	}

	// PreparedStatementCallback
	public String insertProduct(final Product product) {

		boolean insertaion = jt.execute(SAVE_PRODUCT, new PreparedStatementCallback<Boolean>() {
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, product.getId());
				ps.setString(2, product.getName());
				ps.setDouble(3, product.getPrice());
				ps.setInt(4, product.getQuantity());
				ps.setString(5, product.getDescription());
				ps.setString(6, product.getPhoto());
				ps.setBoolean(7, product.isAvailable());
				return ps.execute();
			}
		});
		if (insertaion == true) {
			return "Sorry can not save";
		} else {
			return "Product saved";
		}
	}

	public String deleteProductById(final int id) {
		int update = 0;
		update = jt.update(DELETE_PRODUCT_BY_ID, new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, id);
			}
		});
		if (update == 1) {
			return "deleted product id is::" + id;
		} else {
			return "product id::" + id + " not found";
		}
	}

	public Product getByID(int id) {
//		//Product product = new Product();
		Product product = jt.queryForObject(SHOW_PRODUCT_BY_ID, new RowMapper<Product>() {
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p = new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				p.setQuantity(rs.getInt(4));
				p.setDescription(rs.getString(5));
				p.setPhoto(rs.getString(6));
				p.setAvailable(rs.getBoolean(7));
				return p;
			}
		}, id);
		return product;

		/*
		 * return jt.queryForObject( SHOW_PRODUCT_BY_ID, new UserRowMapper(),id); }
		 * class UserRowMapper implements RowMapper<Product>{ public Product
		 * mapRow(ResultSet rs, int runNumber) throws SQLException { Product product=new
		 * Product(); product.setId(rs.getInt(1)); product.setName(rs.getString(2));
		 * product.setPrice(rs.getDouble(3)); product.setQuantity(rs.getInt(4));
		 * product.setDescription(rs.getString(5)); product.setPhoto(rs.getString(6));
		 * product.setAvailable(rs.getBoolean(7));
		 * 
		 * return product; } }
		 */
	}
}
