package tw.brad.bs2;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.cfg.JdbcSettings;


// static always here
public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static StandardServiceRegistry registry;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {// 整份專案一份工廠,沒有我創,有就用原本的
			Configuration conf = new Configuration();// 組汰檔路線
			conf.configure("hibernate.cfg.xml");

			conf.addAnnotatedClass(Member.class);		
			
			registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
			sessionFactory = conf.buildSessionFactory(registry);
		}

		return sessionFactory;
	}

	public static SessionFactory getSessionFactoryV2() {
		if (sessionFactory == null) {
			Configuration conf = new Configuration();

			Properties prop = new Properties();
			prop.put(JdbcSettings.JAKARTA_JDBC_DRIVER, "com.mysql.cj.jdbc.Driver");
			prop.put(JdbcSettings.JAKARTA_JDBC_URL, "jdbc:mysql://localhost/ispan");
			prop.put(JdbcSettings.JAKARTA_JDBC_USER, "root");
			prop.put(JdbcSettings.JAKARTA_JDBC_PASSWORD, "root");

			prop.put(Environment.SHOW_SQL, "true");
			prop.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

			 conf.setProperties(prop);

			conf.addAnnotatedClass(Member.class);
			

			registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
			sessionFactory = conf.buildSessionFactory(registry);
		}

		return sessionFactory;
	}

}
