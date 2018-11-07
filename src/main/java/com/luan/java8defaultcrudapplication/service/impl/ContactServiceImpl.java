package com.luan.java8defaultcrudapplication.service.impl;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.luan.java8defaultcrudapplication.domain.Contact;
import com.luan.java8defaultcrudapplication.repository.ContactRepository;
import com.luan.java8defaultcrudapplication.service.ContactService;
import com.luan.java8defaultcrudapplication.service.dto.ContactDTO;
import com.luan.java8defaultcrudapplication.service.mapper.ContactMapper;

@Service
@Component
public class ContactServiceImpl implements ContactService {

	private static final Logger log = LoggerFactory.getLogger(ContactServiceImpl.class);

	@Autowired
	ContactRepository contactRepository;

	ContactMapper contactMapper;

	private ContactServiceImpl(ContactMapper contactMapper) {
		this.contactMapper = contactMapper;
	}

	@Override
	public ContactDTO save(ContactDTO contactDTO) {
		log.info("Request to save(): {}", contactDTO);
		contactDTO.setAlterationDate(LocalDate.now());
		return contactMapper.toDto(contactRepository.save(contactMapper.toEntity(contactDTO)));
	}

	@Override
	public List<ContactDTO> findAll() {
		log.info("Request to findAll()");
		return contactRepository.findAll().stream().map(contactMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	public ContactDTO update(ContactDTO contactDTO) {
		log.info("Request to update()");
		contactDTO.setAlterationDate(LocalDate.now());
		return contactMapper.toDto(contactRepository.saveAndFlush(contactMapper.toEntity(contactDTO)));
	}

	@Override
	public void delete(Long idContact) {
		log.info("Request to delete()");
		contactRepository.deleteById(idContact);
	}

	@Override
	public Optional<Contact> findById(Long IdContact) {
		log.info("Request to findById(): {}", IdContact);
		return contactRepository.findById(IdContact);
	}

}
