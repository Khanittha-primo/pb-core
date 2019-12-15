package com.pb.core.domain

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "test")
class TestEntity {

    @Id
    var id: Long? = null
    var name: String? = null
    var lastName: String? = null

}

