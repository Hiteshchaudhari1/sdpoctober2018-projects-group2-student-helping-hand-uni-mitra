package com.unimitra.dao;

import java.util.List;

import com.unimitra.entity.EventsEntity;
import com.unimitra.entity.EventsRegisterationEntity;
import com.unimitra.exception.UnimitraException;

public interface EventDao {

	List<EventsEntity> getEventDetails() throws UnimitraException;

	EventsEntity getEventDetailById(int eventId) throws UnimitraException;

	String deleteEventById(int eventId) throws UnimitraException;

	EventsEntity postEvent(EventsEntity postEvent);

	List<EventsRegisterationEntity> getUserByUserIdEventId(int userId, int eventId) throws UnimitraException;

	EventsRegisterationEntity updateRegistrationFlag(EventsRegisterationEntity registerForEvent);

	void updateExsistingRegistrationFlag(EventsRegisterationEntity eventsRegistrationEntity1);

}
