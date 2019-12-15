package com.pb.core.repositories

import com.pb.core.domain.TestEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository : JpaRepository<TestEntity, Long> {
}