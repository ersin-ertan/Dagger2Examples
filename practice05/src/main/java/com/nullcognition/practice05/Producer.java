package com.nullcognition.practice05;
// ersin 19/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Producer{

	private List<Subscribers> subscribers = new ArrayList<>();
	public Producer(final Subscribers activity){
		// needed for some reason as part of the construction, but will subscribe itself
	}

	public void subscribe(Subscribers sub){
		subscribers.add(sub);
	}

	public void post(int i){
		for(Subscribers s : subscribers){
			s.get(i);
		}
	}

	public List<Subscribers> getSubscriberList(){return Collections.unmodifiableList(subscribers);}

}


interface Subscribers{

	void get(int i);
}
