package com.example.topic
;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
	
	
	public List<Topic> getAllTopics(){
		List<Topic> topics=new ArrayList<Topic>();
		
		 topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);
	}

	public void updateTopic(String id,Topic topic) {
		// TODO Auto-generated method stub
		
		topicRepository.save(topic);
	}

}
