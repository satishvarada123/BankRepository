package com.satishit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satishit.entity.Contact;
import com.satishit.repository.ContactRepository;
import com.satishit.service.IContactService;

@Service
public class ContactServiceImpl implements IContactService {

	@Autowired
	private ContactRepository contactRepo;

	public Boolean saveContact(Contact contact) {
		Contact savedEntity = contactRepo.save(contact);
		if (savedEntity != null && savedEntity.getConatctId() != null) {
			return true;
		}
		return false;
	}

	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = contactRepo.findById(contactId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	public boolean deleteContactById(Integer contactId) {
		boolean existsById = contactRepo.existsById(contactId);
		if (existsById) {
			contactRepo.deleteById(contactId);
		}

		return false;
	}

}
