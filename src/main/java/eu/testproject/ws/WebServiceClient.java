package eu.testproject.ws;


//import eu.testproject.dto.SayHiDTO;
//import eu.testproject.ws.HelloWorld;

import eu.testproject.ws.HelloWorld;
import eu.testproject.ws.HelloWorldImplService;
import eu.testproject.ws.SayHiDTO;

public class WebServiceClient {
	
	public static void main(String[] args){
//		SpringContext context = SpringContext.getInstance();
		
//		HelloWorld hello = (HelloWorld)context.getBean("helloClient");
//		String response = hello.sayHi(new SayHiDTO("geiaaa", false));
//		System.out.println(response);
		
//		URL url = null;
//		try {
//			url = new URL("http://localhost:8081/testproject-ws-web/ws/HelloWorld?wsdl");
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        QName qname = new QName("http://ws.testproject.eu/", "HelloWorldImplService");
//        Service service = Service.create(url, qname);
//        HelloWorld hello = service.getPort(HelloWorld.class);
//        System.out.println(hello.sayHi(new SayHiDTO("geiaaa", false)));
		
		
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();
 
		String response = hello.sayHi(new SayHiDTO("geia marikaki", false));
//		String response = hello.sayHi(new SayHiDTO());
		System.out.println(response);
		
	}

}
