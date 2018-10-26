package studio.forface.ktmdb.entities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @author Davide Giuseppe Farella.
 */
@Serializable
data class ProductionCountry(

    @SerialName("iso_3166_1")
    val iso31661: String, // US

    @SerialName("name")
    val name: String // United States of America
)