package L0Miniproject;

import java.util.*;
import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class LogAnalysis {
	public static void main(String args[]) throws IOException{
        //1. Input the file path:
    		System.out.println("Please enter the log file path:");
        
    		//2. Get the input of file path and file name:
    		Scanner sc=new Scanner(System.in);
    		String filePath=sc.nextLine();   		
    		File f=new File(filePath);
    		
    		System.out.println("Do you want to save console output to file? (Y/N)");
    		Scanner scout=new Scanner(System.in);
    		String ConOut=scout.nextLine();
    		File fout=new File(filePath+"/out.txt");          
    		if(!fout.exists())   					 
			fout.createNewFile();          
    		FileOutputStream fileOutputStream = new FileOutputStream(fout);          
		PrintStream printStream = new PrintStream(fileOutputStream);    
    		if(ConOut.toLowerCase().equals("y"))
    		{
    			System.out.println("Console output will be saved to "+filePath+"/out.txt."); 
    			System.setOut(printStream);    
    		    	
    		}
    		else
    		{
    			System.out.println("Console output will not be saved.");  
    			System.setErr(printStream);    
    		}
    		
		//3. List all the files in the path  		
    		System.out.println("1. File names are:");
    		getFileName(f);   		
    		
    		//4. Check AppInfo.txt
    		System.out.println("2. App info is:");
    		getAppInfo(f);
    		
    		//5. Check the policy
    		System.out.println("3. Network configuration is:");
    		getPolicy(f);
  
    		//6. Check the config
    		System.out.println("4. Policy configuration is:");
    		getConfig(f);
  
    		//7. Get number of Exceptions / Errors / Warning under log files
    		System.out.println("5. Exceptions/Erros/Warning are:");
    		getError(f);
    		
    		sc.close();
    		scout.close();
    }
    
	//Get all the file name including the sub-folder
    public static void getFileName(File filePath) {
    	
    	
    		if(!filePath.exists()) {
			System.out.println(filePath + " not exists");
			return;
		}	
		
		File lf[]=filePath.listFiles();
		for(File f:lf) {
			if(f.isFile()){
				String date=new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(f.lastModified()); 
				System.out.println(f.getName()+" " +f.length()+"Bytes"+" "+date);
				
			}
			else if(f.isDirectory()) {
				System.out.println(f.getName()+"(Folder) " +f.length()+"Bytes");
				//System.out.print("    ");
				getFileName(f);
				
			}
		}
    }
	
    public static void getAppInfo(File filePath) throws IOException {
	    	File lf[]=filePath.listFiles();
			for(File f:lf) {
				//System.out.println(f.getName());	
					if(f.isFile()) {
						FileReader fr = new FileReader(f);
						BufferedReader br = new BufferedReader(fr);
						String str=null;
						if(f.getName().equals("Device_And_AppInfo.txt")) {
								System.out.println("This is android log.");							
								//System.out.println(br.readLine());
								while((str=br.readLine())!=null){
									if(str.contains("Application Info"))
									{
											br.readLine();
											System.out.println(br.readLine());
									}
									if(str.contains("Build.MODEL"))
										System.out.println(str);
									if(str.contains("Version.RELEASE"))	
										System.out.println(str);
									if(str.contains("ToolsVersion"))				
										System.out.println(str);
								}
						}
						
						else if(f.getName().equals("CtxLog_AppInfo.txt")) {
							System.out.println("This is iOS log.");					
							while((str=br.readLine())!=null) {
								if(str.contains("Application"))
									System.out.println(str);
								if(str.contains("Hardware model"))
									System.out.println(str);
								if(str.contains("iOS Version"))	
									System.out.println(str);
								if(str.contains("MDXToolkit"))				
									System.out.println(str);
							}
						}

						br.close();
					}
					else if(f.isDirectory()) {
						getAppInfo(f);
					}
			}
    }
    
    public static void getPolicy(File filePath) throws IOException{
    		File lf[]=filePath.listFiles();
    			for(File f:lf) {
			//System.out.println(f.getName());	
				if(f.isFile()) {
					FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					//String str=null;
					if(f.getName().equals("VpnConfig.xml")) {						
						System.out.println("vpnConfig.xml exists");
						try {
						  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
						  DocumentBuilder builder = factory.newDocumentBuilder();
						  Document document = builder.parse(f);
						  Element rootElement = document.getDocumentElement();

						  NodeList list = rootElement.getElementsByTagName("SplitDNS");						  
						  Element element = (Element) list.item(0);
						  NodeList list0 = rootElement.getElementsByTagName("DNSSuffix");						  
						  Element element0 = (Element) list0.item(0);
						  NodeList list1 = rootElement.getElementsByTagName("State");						  
						  Element element1 = (Element) list1.item(0);
						  System.out.println("SplitDNS:"+element.getChildNodes().item(0).getNodeValue());
						  System.out.println("DNSSuffix:"+element0.getChildNodes().item(0).getNodeValue());
						  System.out.println("SplitTunnel:"+element1.getChildNodes().item(0).getNodeValue());
						}catch (Exception e) {
							   System.out.println("exception:" + e.getMessage());
						}
						
					}
					
					else if(f.getName().equals("CtxLog_VPNConfig.xml")) {
						System.out.println("Ctx_log_VPNConfig.xml exists");
						try {
							  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
							  DocumentBuilder builder = factory.newDocumentBuilder();
							  Document document = builder.parse(f);
							  Element rootElement = document.getDocumentElement();

							  NodeList list = rootElement.getElementsByTagName("SplitDNS");						  
							  Element element = (Element) list.item(0);
							  NodeList list0 = rootElement.getElementsByTagName("DNSSuffix");						  
							  Element element0 = (Element) list0.item(0);
							  NodeList list1 = rootElement.getElementsByTagName("State");						  
							  Element element1 = (Element) list1.item(0);
							  System.out.println("SplitDNS:"+element.getChildNodes().item(0).getNodeValue());
							  System.out.println("DNSSuffix:"+element0.getChildNodes().item(0).getNodeValue());
							  System.out.println("SplitTunnel:"+element1.getChildNodes().item(0).getNodeValue());
							}catch (Exception e) {
								   System.out.println("exception:" + e.getMessage());
							}
					}
					br.close();
				}
				else if(f.isDirectory()) {
					getPolicy(f);
				}
    			}
    }		
    
    public static void getConfig(File filePath) throws IOException{
		File lf[]=filePath.listFiles();
			for(File f:lf) {
		//System.out.println(f.getName());	
			if(f.isFile()) {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				//String str=null;
				if(f.getName().equals("Policies.xml")) {						
					System.out.println("Policies.xml exists");
					try {
					  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
					  DocumentBuilder builder = factory.newDocumentBuilder();
					  Document document = builder.parse(f);
					  Element rootElement = document.getDocumentElement();

					  NodeList list = rootElement.getElementsByTagName("CutAndCopy");						  
					  Element element = (Element) list.item(0);
					  NodeList list1 = rootElement.getElementsByTagName("Paste");						  
					  Element element1 = (Element) list1.item(0);
					  NodeList list2 = rootElement.getElementsByTagName("NetworkAccess");						  
					  Element element2 = (Element) list2.item(0);
					  NodeList list3 = rootElement.getElementsByTagName("InboundDocumentExchange");						  
					  Element element3 = (Element) list3.item(0);
					  System.out.println("CutAndCopy:"+element.getChildNodes().item(0).getNodeValue());
					  System.out.println("Paste:"+element1.getChildNodes().item(0).getNodeValue());
					  System.out.println("NetworkAccess:"+element2.getChildNodes().item(0).getNodeValue());
					  System.out.println("InboundDocumentExchange:"+element3.getChildNodes().item(0).getNodeValue());
					}catch (Exception e) {
						   System.out.println("exception:" + e.getMessage());
					}
					
				}
				
				else if(f.getName().equals("CtxLog_AppPolicies.xml")) {
					System.out.println("Ctx_log_AppPolicies.xml exists");
					try {

						 InputStream in = new FileInputStream(f);
					     XMLInputFactory factory = XMLInputFactory.newInstance();
					     XMLEventReader parser = factory.createXMLEventReader(in);

					     assert parser.nextEvent().isStartDocument();
					     XMLEvent event = parser.nextTag();
					     assert event.isStartElement();
					        final String name1 = event.asStartElement().getName().getLocalPart();

					        if (name1.equals("dict")) {
					            while ((event = parser.nextTag()).isStartElement()) {
					                final String name2 = event.asStartElement().getName().getLocalPart();

					                if (name2.equals("key")) {
					                    String key = parser.getElementText();
					                    System.out.println("key: " + key);

					                } else if (name2.equals("string")) {
					                    String string = parser.getElementText();
					                    System.out.println("string: " + string);		                    		
					                }
					            }
					        }

					        assert parser.nextEvent().isEndDocument();
						
						}catch (Exception e) {
							   System.out.println("exception:" + e.getMessage());
						}
				}

				br.close();
			}
			else if(f.isDirectory()) {
				getConfig(f);
			}
		}
}

    public static void getError(File filePath) throws IOException {
    		int exceptions=0;
    		int errors=0;
    		int warnings=0;
    		File lf[]=filePath.listFiles();
			for(File f:lf) {
		//System.out.println(f.getName());	
			if(f.isFile()) {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String str=null;
				if(f.getName().contains("CtxLog_com")||f.getName().contains("CtxLog_Secure")) {						
					System.out.println("Diagnostics log exists");
					try {
						while((str=br.readLine())!=null){
							if(str.toLowerCase().contains("exception")) {
								exceptions++;
								System.out.println(str);
							}
							if(str.toLowerCase().contains("error"))	{
								errors++;
								System.out.println(str);
							}								
							if(str.toLowerCase().contains("warning")) {				
								warnings++;
								System.out.println(str);
							}
						}
						
					} catch (Exception e) {
						System.out.println("exception:" + e.getMessage());
					}
				
				br.close();
				}
			}
			else if(f.isDirectory()) {
				getError(f);
			}
		}
			System.out.println("Total exceptions:"+exceptions);
			System.out.println("Total errors:"+errors);
			System.out.println("Total warning:"+warnings);
    }
    
}
