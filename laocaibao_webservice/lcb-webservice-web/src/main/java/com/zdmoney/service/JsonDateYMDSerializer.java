package com.zdmoney.service;

import java.io.IOException;
import java.text.SimpleDateFormat; 
import java.util.Date; 

import org.codehaus.jackson.JsonGenerator; 
import org.codehaus.jackson.JsonProcessingException; 
import org.codehaus.jackson.map.JsonSerializer; 
import org.codehaus.jackson.map.SerializerProvider; 
import org.springframework.stereotype.Component; 

@Component
public class JsonDateYMDSerializer extends JsonSerializer<Date>{
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 

    public void serialize(Date date, JsonGenerator gen, SerializerProvider provider) 
            throws IOException, JsonProcessingException {
        String formattedDate = dateFormat.format(date); 
        gen.writeString(formattedDate); 
    }
}
