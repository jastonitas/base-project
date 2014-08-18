/**
 * 
 */
/**
 * @author jean.astonitas
 *
 */
package com.astonitas.demo.service.impl;

import com.astonitas.demo.service.MarshallingPersonService;

@Endpoint
public class PersonEndpoint implements MarshallingPersonService {
    
    /**
     * Gets person list.
     */
    @PayloadRoot(localPart=GET_PERSONS_REQUEST, namespace=NAMESPACE)
    public PersonResponse getPersons(GetPersonsRequest request) {
        return new PersonResponse().withPerson(
                   new Person().withId(1).withFirstName("Joe").withLastName("Smith"),
                   new Person().withId(2).withFirstName("John").withLastName("Jackson"));        
    }

}
       