package com.satishit.service;

import java.util.List;

import com.satishit.entity.Contact;

public interface IContactService {
//These methods will be called from the Controller
	public Boolean saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(Integer contactId);

	public boolean deleteContactById(Integer contactId);

}
