package com.property.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.ServiceKind;
import com.property.service.ServiceKindService;

/**
 * @author wz
 * @category 监听控制器
 */
@WebListener
public class ApplicationListener implements ServletContextListener {

	
    public ApplicationListener() {
    }

    public void contextDestroyed(ServletContextEvent event)  { 
    }

    public void contextInitialized(ServletContextEvent event)  { 
    	System.out.println("启动监听器");
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
    	ServiceKindService kindService = context.getBean(ServiceKindService.class);
    	ServletContext application = event.getServletContext();
    	List<ServiceKind> serviceKind =kindService.selectAll();
    	application.setAttribute("serviceKind", serviceKind);
    }
	
}
