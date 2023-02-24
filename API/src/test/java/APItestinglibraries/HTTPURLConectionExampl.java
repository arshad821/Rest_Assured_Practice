package APItestinglibraries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPURLConectionExampl {


	public void getreqmethod() throws IOException {
		//1.creating object for url
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
		//2. open url connection and store it in parent clas
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		//giving http method set req type
		connection.setRequestMethod("GET");
		// 4.connect
		connection.connect();
		//5.getting status code
		int statuscode = connection.getResponseCode();
		System.out.println("Getting status code: "+statuscode);
		//6.gett status message.
		String message = connection.getResponseMessage();
		System.out.println("Getting response message: " + message);
		//7.read response using getinputstream
		InputStream inputstream = connection.getInputStream();
		//8.create inputstream reader for reading inputstream..
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		//9.creating buffer reader and passing ip.stream..
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);


		//10.reading line by line..
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line=bufferreader.readLine())!=null) {
			buffer.append(line);                         //important concept
		}
		System.out.println(buffer);
	}

	public void PostMethodExample() throws IOException {

		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("POST");
		//we are giving property like what kind of file llike that
		connection.setRequestProperty("Content-Type", "application/json");
		//for get method by default it is false but for post method we are giving this explicitly as true.
		connection.setDoOutput(true);

		String Jsonbody = "{\"employee_name\":\"Asrahd\",\"employee_salary\":3200,\"employee_age\":55,\"profile_image\":\"\"}";
		byte[] inputjson = Jsonbody.getBytes();

		OutputStream outputstream = connection.getOutputStream();
		outputstream.write(inputjson);

		System.out.println("Getting status code: "+connection.getResponseCode());
		System.out.println("getting connection message: " + connection.getResponseMessage());
		
		InputStream inputstream =  connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);


		String line;
		StringBuffer bufer = new StringBuffer();
		while ((line = bufferreader.readLine())!=null) {
			bufer.append(line);
		}
		System.out.println(bufer);
	}
	
	public void PutMethodExample() throws IOException {

		URL url = new URL("https://dummy.restapiexample.com/api/v1/update/7138");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("POST");
		//we are giving property like what kind of file llike that
		connection.setRequestProperty("Content-Type", "application/json");
		//for get method by default it is false but for post method we are giving this explicitly as true.
		connection.setDoOutput(true);

		String Jsonbody = "{\"employee_name\":\"Asrahd\",\"employee_salary\":3200,\"employee_age\":45,\"profile_image\":\"\"}";
		byte[] inputjson = Jsonbody.getBytes();

		OutputStream outputstream = connection.getOutputStream();
		outputstream.write(inputjson);

		System.out.println("Getting status code: "+connection.getResponseCode());
		System.out.println("getting connection message: " + connection.getResponseMessage());
		
		InputStream inputstream =  connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);


		String line;
		StringBuffer bufer = new StringBuffer();
		while ((line = bufferreader.readLine())!=null) {
			bufer.append(line);
		}
		System.out.println(bufer);
	}
	
	public static void DeleteMethodExample() throws IOException {
		
		URL url = new URL("https://dummy.restapiexample.com/api/v1/delete/100");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("DELETE");
		//we are giving property like what kind of file llike that
		connection.setRequestProperty("Content-Type", "application/json");
		//for get method by default it is false but for post method we are giving this explicitly as true.
		connection.setDoOutput(true);


		System.out.println("Getting status code: "+connection.getResponseCode());
		System.out.println("getting connection message: " + connection.getResponseMessage());
		
		InputStream inputstream =  connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);


		String line;
		StringBuffer bufer = new StringBuffer();
		while ((line = bufferreader.readLine())!=null) {
			bufer.append(line);
		}
		System.out.println(bufer);
		
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HTTPURLConectionExampl urlconnection = new HTTPURLConectionExampl();
		urlconnection.getreqmethod();
		urlconnection.PostMethodExample();
		urlconnection.PutMethodExample();
		urlconnection.DeleteMethodExample();
	}

}
