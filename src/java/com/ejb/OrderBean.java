package com.ejb;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.ejb.Stateless;

@Stateless
public class OrderBean implements OrderBeanLocal {
private Boolean orderMsg = true;
private PreparedStatement ps;
private final SQLConnection aSQLConn = new SQLConnection();

public Boolean addOrder(Orderitem orderItem) {
try{
ps = aSQLConn.getSQLConnection().prepareStatement("INSERT INTO ORDERITEM VALUES (?,?,?,?)");
ps.setString(1, orderItem.getOid());
ps.setString(2, orderItem.getName());
ps.setInt(3, orderItem.getQuantity());
ps.setString(4, orderItem.getComment());
ps.executeUpdate();
orderMsg = true;
System.out.println("Insert okay");
}
catch(SQLException e){
System.out.println(e.toString());
orderMsg = false;
}
return orderMsg;
}
}