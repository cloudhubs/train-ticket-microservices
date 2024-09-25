package com.cloudhubs.trainticket.assurance.service;

import com.cloudhubs.trainticket.assurance.entity.Contacts;
import com.cloudhubs.trainticket.assurance.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface ContactsService {

    /**
     * create contacts
     *
     * @param contacts contacts
     * @param headers headers
     * @return Reaponse
     */
    Response createContacts(Contacts contacts, HttpHeaders headers);

    /**
     * create
     *
     * @param addContacts add contacts
     * @param headers headers
     * @return Reaponse
     */
    Response create(Contacts addContacts, HttpHeaders headers);

    /**
     * delete
     *
     * @param contactsId contacts id
     * @param headers headers
     * @return Reaponse
     */
    Response delete(String contactsId, HttpHeaders headers);

    /**
     * modify
     *
     * @param contacts contacts
     * @param headers headers
     * @return Reaponse
     */
    Response modify(Contacts contacts, HttpHeaders headers);

    /**
     * get all contacts
     *
     * @param headers headers
     * @return Reaponse
     */
    Response getAllContacts(HttpHeaders headers);

    /**
     * find contacts by id
     *
     * @param id id
     * @param headers headers
     * @return Reaponse
     */
    Response findContactsById(String id, HttpHeaders headers);

    /**
     * find contacts by account id
     *
     * @param accountId account id
     * @param headers headers
     * @return Reaponse
     */
    Response findContactsByAccountId(String accountId, HttpHeaders headers);

}
