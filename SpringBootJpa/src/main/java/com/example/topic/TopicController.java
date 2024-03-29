package com.example.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping(value ="/topics",method = RequestMethod.GET)
	public List<Topic> getAllTopic() {
		return topicservice.getAllTopics();
	}

	
	@RequestMapping(value ="/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
		
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		 topicservice.addTopic(topic);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopics(@RequestBody Topic topic,@PathVariable String id) {
		 topicservice.updateTopic(id,topic);
		
	}
}
