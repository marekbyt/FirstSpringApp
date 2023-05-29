package pl.sda.firstspringapp.service;

import java.util.List;

public interface AddressBookService {
    void saveAddress(String userName, String emailAddress);
    List<String> findByUserNamePattern(String pattern);
    List<String> findAll();
}
