package com.esgis.blogwebservice.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapConfiguration extends WsConfigurerAdapter {
   @Bean
   public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
      MessageDispatcherServlet servlet = new MessageDispatcherServlet();
      servlet.setApplicationContext(applicationContext);
      servlet.setTransformWsdlLocations(true);
      return new ServletRegistrationBean(servlet, "/ws/*");
   }

   @Bean
   public XsdSchema articleSchema() {
      return new SimpleXsdSchema(new ClassPathResource("article.xsd"));
   }

   @Bean(name = "articles")
   public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema articleSchema) {
      DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
      //wsdl11Definition.setPortTypeName("ArticlePort");
      wsdl11Definition.setLocationUri("/ws");

      wsdl11Definition.setTargetNamespace("http://esgis.com.test/blogwebservice/model");
      wsdl11Definition.setSchema(articleSchema);
      return wsdl11Definition;
   }
}
