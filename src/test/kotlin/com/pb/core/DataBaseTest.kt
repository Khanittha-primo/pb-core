package com.pb.core

import com.pb.core.domain.TestEntity
import com.pb.core.repositories.TestRepository
import org.junit.Assert
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner

@DataJpaTest
@RunWith(SpringRunner::class)
@ActiveProfiles("db")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DataBaseTest(@Autowired val repository: TestRepository) {

	@Test
	fun test() {
		var testEntity = TestEntity()
		testEntity.id = System.currentTimeMillis()
		testEntity.name = "Test-Name"
		testEntity.lastName = "Test-Last_Name"
		repository.save(testEntity);

		var newEntity = repository.getOne(testEntity.id!!)
		Assert.assertEquals(testEntity.id, newEntity.id)
		Assert.assertEquals(testEntity.name, newEntity.name)
		Assert.assertEquals(testEntity.lastName, newEntity.lastName)
	}

}
