package APItestinglibraries;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestExample {

	public void GetReqExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
		System.out.println("Staus Code: "+ jsonResponse.getStatus() );
		System.out.println("Staus Message: "+ jsonResponse.getStatusText())	;
		System.out.println("Response Body: "+ jsonResponse.getBody());
	}

	public void PostReqExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.post("https://dummy.restapiexample.com/api/v1/create").
				body("{\\\"employee_name\\\":\\\"Arshadarsh\\\",\\\"employee_salary\\\":2800,\\\"employee_age\\\":23,\\\"profile_image\\\":\\\"\\\"}").asJson();
		System.out.println("Staus Code: "+ jsonResponse.getStatus() );
		System.out.println("Staus Message: "+ jsonResponse.getStatusText())	;
		System.out.println("Response Body: "+ jsonResponse.getBody());

	}

	public void PutReqExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.put("https://dummy.restapiexample.com/api/v1/update/2570").
				body("{\\\"employee_name\\\":\\\"Arshadarsh\\\",\\\"employee_salary\\\":280000,\\\"employee_age\\\":25,\\\"profile_image\\\":\\\"\\\"}").asJson();
		System.out.println("Staus Code: "+ jsonResponse.getStatus());
		System.out.println("Staus Message: "+ jsonResponse.getStatusText())	;
		System.out.println("Response Body: "+ jsonResponse.getBody());

	}

	public void DeleteReqExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.delete("https://dummy.restapiexample.com/api/v1/delete/2570").
				asJson();
		System.out.println("Staus Code: "+ jsonResponse.getStatus());
		System.out.println("Staus Message: "+ jsonResponse.getStatusText())	;
		System.out.println("Response Body: "+ jsonResponse.getBody());

	}


	public static void main( String[] args) throws UnirestException {

		UnirestExample unirestexample = new UnirestExample();
		//unirestexample.GetReqExample();
		//unirestexample.PostReqExample();
		//unirestexample.PutReqExample();
		unirestexample.DeleteReqExample();
	}

}
