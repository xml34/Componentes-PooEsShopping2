package tiendavirtual.tienda_minima_v13.org.pl.eshopping.bd;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import tiendavirtual.tienda_minima_v13.org.pl.eshopping.general.ConfigNueva;
/*** added by dConexionNueva
 */
public class Conexion {
	private static final String SERVIDOR = ConfigNueva.SERVIDOR;
	private static final int PUERTO = ConfigNueva.PUERTO;
	private static final String BD = ConfigNueva.BD;
	private static final String NOMBRE_USUARIO = ConfigNueva.NOMBRE_USUARIO;
	private static final String CONTRASENA_USUARIO =
	ConfigNueva.CONTRASENA_USUARIO;
	public static Connection getConexion() throws SQLException {
		MysqlDataSource ds = new MysqlDataSource();
		ds.setServerName(SERVIDOR);
		ds.setPortNumber(PUERTO);
		ds.setDatabaseName(BD);
		ds.setUser(NOMBRE_USUARIO);
		ds.setPassword(CONTRASENA_USUARIO);
		return ds.getConnection();
	}
}