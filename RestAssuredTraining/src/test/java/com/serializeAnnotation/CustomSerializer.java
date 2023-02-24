package com.serializeAnnotation;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CustomSerializer extends StdSerializer<JsonSerializerPOJO >{

	public CustomSerializer(Class<JsonSerializerPOJO> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
	
	public CustomSerializer() {
		// TODO Auto-generated constructor stub
		this(null); 
	}

	@Override
	public void serialize(JsonSerializerPOJO value, 
			JsonGenerator generator, 
			SerializerProvider provider) throws IOException {
		// TODO Auto-generated method stub
		
		generator.writeStartObject();
		
		generator.writeStringField("first_Name", value.getFirst_Name());
		generator.writeStringField("last_Name", value.getLast_Name());
		generator.writeStringField("email", value.getEmail());
		
		generator.writeEndObject();
		
	}

}
