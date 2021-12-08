package com.dealsandcouponsfinder.profilemanagement.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dealsandcouponsfinder.profilemanagement.exception.ProfileRequestException;
import com.dealsandcouponsfinder.profilemanagement.model.Credentials;
import com.dealsandcouponsfinder.profilemanagement.model.Profile;
import com.dealsandcouponsfinder.profilemanagement.repository.CredentialsRepository;
import com.dealsandcouponsfinder.profilemanagement.repository.ProfileRepository;

@SpringBootTest
public class ProfileServiceTest {

	@Autowired
	ProfileService profileService;

	@MockBean
	private ProfileRepository profileRepository;
	@MockBean
	private CredentialsRepository credentialsRepository;

	@Test
	void saveTest() {
		Profile pro = new Profile("kingston@gmail.com", "keerthaa", "9125966678", "Beverage", "keertaa1452");
		when(profileRepository.save(pro)).thenReturn(pro);
		assertEquals(pro, profileService.save(pro));
	}
	
	@Test 
	 public void deleteByIdTest() throws ProfileRequestException {
		when (profileRepository.findById("kingston1@gmail.com")).thenReturn(Optional.of(new Profile("kingston1@gmail.com", "keerthaa", "9125966678", "Beverage", "keertaa1452")));
		doNothing().when(profileRepository).deleteById("kingston1@gmail.com");
		assertEquals(profileService.deleteById("kingston1@gmail.com"), "Id kingston1@gmail.com deleted!");
	}	
	
	@Test
	public void findByIdTest() throws ProfileRequestException {
		when (profileRepository.findById("kingston1@gmail.com")).thenReturn(Optional.of(new Profile("kingston1@gmail.com", "keerthaa", "9125966678", "Beverage", "keertaa1452")));
		Optional<Profile> profile = profileService.findById("kingston1@gmail.com");
		assertEquals("kingston1@gmail.com",profile.get().getEmailId());
		assertEquals("keerthaa",profile.get().getFullName());
		assertEquals("9125966678",profile.get().getMobileNo());
		assertEquals("Beverage",profile.get().getPreferences());
		assertEquals("keertaa1452",profile.get().getPassword());
		
	}

	/* @Test

	public void loginTest() {
		Credentials c = new Credentials("edna12@gmail.com", "edna145", "user", "0");
		Optional<Credentials> cred = Optional.of(c);
		when(credentialsRepository.findById("edna12@gmai.com")).thenReturn(cred);
		when(credentialsRepository.save(c)).thenReturn(c);
		assertEquals(true, profileService.login(c));
	}

	@Test
	public void logoutTest() {
		Credentials c = new Credentials("edna12@gmail.com", "edna145", "user", "1");
		Optional<Credentials> cred = Optional.of(c);
		when(credentialsRepository.findById("edna12@gmai.com")).thenReturn(cred);
		when(credentialsRepository.save(c)).thenReturn(c);
		assertEquals(true, profileService.login(c));
	}
*/
}
