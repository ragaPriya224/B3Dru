package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Topic;
import com.example.demo.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	
//	public List<Topic> topicsList =new ArrayList( Arrays.asList(new Topic("1","english","grammar details"),
//			new Topic("2","java","basics"),
//			new Topic("3","b2","c2")
//			));
	
	public List<Topic> getAllTopics(){
//		return topicsList;
		List<Topic> topicList = new ArrayList<>();
		 topicRepository.findAll().forEach(topicList::add);
		 return topicList;
	}

	public Topic getTopic(String id ) {
		
//		return topicsList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id).get();
	}

	public void addParticularTopic(Topic topic) {
//		topicsList.add(topic);
		topicRepository.save(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
//		for(int i= 0; i<topicsList.size();i++) {
////			Topic t=topicsList.get(i);
//			if(topicsList.get(i).getId().equals(id)) {
//				topicsList.set(i, topic);
//			}
//		}
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
//		topicsList.removeIf(t->t.getId().equals(id));
		topicRepository.deleteById(id);
		
		
	}
	

	
	
}
