package ko2ic.spike

import org.springframework.data.annotation.PersistenceConstructor
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Customer @PersistenceConstructor constructor(
        var firstName: String = "",
        var lastName: String = "",
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = -1) {

    override fun toString(): String {
        return "Customer(id=$id, firstName='$firstName', lastName='$lastName')"
    }
}