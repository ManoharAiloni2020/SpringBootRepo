package com.example.topic
;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class TopicService {
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring","Spring FrameWork"),
			new Topic("SpringBoot","SpringBoot","Spring Boot"),
			new Topic("Java","Java","Core Java  FrameWork"),
			new Topic("Struts","Struts","Struts FrameWork"),
			new Topic("Perl","Perl","Perl Boot"),
			new Topic("C","C++","C++  FrameWork")));
	
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
	topics.add(topic);
	}

	public void updateTopic(String id,Topic topic) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		
		}
		
	}

}
