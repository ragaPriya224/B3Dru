package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.model.Topic;

@Service
public class TopicService {

	public List<Topic> topicsList =new ArrayList( Arrays.asList(new Topic("1","english","grammar details"),
			new Topic("2","java","basics"),
			new Topic("3","b2","c2")
			));
	
	public List<Topic> getAllTopics(){
		return topicsList;
	}

	public Topic getTopic(String id ) {
		// TODO Auto-generated method stub
		return topicsList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addParticularTopic(Topic topic) {
		topicsList.add(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		for(int i= 0; i<topicsList.size();i++) {
//			Topic t=topicsList.get(i);
			if(topicsList.get(i).getId().equals(id)) {
				topicsList.set(i, topic);
			}
		}
		
	}

	public void deleteTopic(String id) {
		topicsList.removeIf(t->t.getId().equals(id));
		
	}
	

	
	
}
