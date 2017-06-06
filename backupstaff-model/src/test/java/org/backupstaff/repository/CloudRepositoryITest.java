package org.backupstaff.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.backupstaff.Application;
import org.backupstaff.model.Cloud;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes = {Application.class})

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootConfiguration
//@WebAppConfiguration
public class CloudRepositoryITest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private CloudRepository cloudRepository;

	@Test
	public void testEntityCreatoin() throws Exception {

		Cloud cloud = new Cloud();
		cloud.setName("test");

		Cloud persistedCloud = this.entityManager.persist(cloud);
		assertTrue(persistedCloud.getId() != null && persistedCloud.getId() > 0);
		assertEquals(cloud.getName(), persistedCloud.getName());
		
		Cloud foundCloud = this.cloudRepository.findOne(persistedCloud.getId());
		assertEquals(cloud.getName(), foundCloud.getName());

		//negative test
		foundCloud = this.cloudRepository.findCloudByType("_DOES_NOT_EXIST_");
		assertNull(foundCloud);

	}
	
	@Test
	public void testGetAll(){
		List<Cloud> clouds = cloudRepository.findAll();
		
		assertTrue( clouds.stream().filter(cloud -> "Google".equals(cloud.getName())).findAny().isPresent() );
	}

	
}
