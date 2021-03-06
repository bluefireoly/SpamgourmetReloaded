package net.axay.spamgourmet.common.data

import kotlinx.serialization.Serializable

@Serializable
class DomainInformation(
    val mainAddressDomain: String,
    val alternativeAddressDomains: Set<String> = LinkedHashSet()
)