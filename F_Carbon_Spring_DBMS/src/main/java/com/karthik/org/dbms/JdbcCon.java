package com.karthik.org.dbms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.karthik.org.dbms.model.LumenComp;

@Component
public class JdbcCon {

	
	private JdbcTemplate jdbc;

	public JdbcTemplate getJdbc() {
		return jdbc;
	}
@Autowired
	public void setJdbc(JdbcTemplate jdbc) {  
		this.jdbc = jdbc;
	}

String sql = "select * from lumencomp;";
public List<LumenComp> findAll() {
	//String sql = "select * from lumencomp;";
	RowMapper<LumenComp>  map = new RowMapper<LumenComp>() {

		@Override
		public LumenComp mapRow(ResultSet rs, int rowNum) throws SQLException {
			LumenComp lc = new LumenComp();
			lc.setEid(rs.getInt("eid"));
			lc.setEname(rs.getString("ename"));
			lc.setExp(rs.getInt("exp"));
			
			
			return lc;
		}
		
	};
	
	return jdbc.query(sql,map);
}


String insert= "insert into lumencomp(eid,ename,exp) values(?,?,?)";
public int save(LumenComp lc) {
	
	
	
	
	return jdbc.update(insert,lc.getEid(),lc.getEname(),lc.getExp());
}

}
