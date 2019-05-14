package com.nit.CRUD_Opration.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nit.CRUD_Opration.domain.Product;

@Repository()
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private JdbcTemplate jt;
	

//	public void setJt(JdbcTemplate jt) {
//		this.jt = jt;
//	}
	private final static String GET_ALL = "select * from products";

	@Override
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		List<Product> list =null;
		 list = jt.query(GET_ALL, new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p = new Product();
				p.setId(rs.getLong(1));
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

}
