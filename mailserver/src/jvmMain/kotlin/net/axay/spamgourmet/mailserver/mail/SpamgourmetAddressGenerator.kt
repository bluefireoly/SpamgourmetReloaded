package net.axay.spamgourmet.mailserver.mail

import org.bson.conversions.Bson
import java.security.MessageDigest
import javax.xml.bind.DatatypeConverter

object SpamgourmetAddressGenerator {

    fun generateAnswerAddress(username: String, answerAsAddress: String, answerToAddress: String, alternativeAllowed: String?): String {

        /*return "${
            findKeyOrGenerateNewOneFromStringWhile(
                    username + answerToAddress,
                    Manager.dataManager.answerAddressCollection,
                    and(
                            AnswerAddressData::forUser eq username,
                            AnswerAddressData::answerAsAddress eq answerAsAddress,
                            AnswerAddressData::answerToAddress eq answerToAddress
                    ),
                    { "${it.address}.${Constants.ANSWER_ADDRESS_KEY}" },
                    { AnswerAddressData::address eq it },
                    { key -> AnswerAddressData(key, answerAsAddress, answerToAddress, username, alternativeAllowed?.let { listOf(it) }) }
            )
        }.${Constants.ANSWER_ADDRESS_KEY}"*/

        TODO("rebuild address generation")

    }

    fun generateSpamBounceAddress(username: String, spamgourmetUserAddress: String, userAddress: String): String {

        /*return "${
            findKeyOrGenerateNewOneFromStringWhile(
                    username + spamgourmetUserAddress,
                    Manager.dataManager.spamBounceAddressCollection,
                    and(
                            BounceAddressData::informUser eq username,
                            BounceAddressData::forAddress eq spamgourmetUserAddress
                    ),
                    { "${it.address}.${Constants.SPAM_BOUNCE_ADDRESS_KEY}" },
                    { BounceAddressData::address eq it },
                    { BounceAddressData(it, username, spamgourmetUserAddress, userAddress) }
            )
        }.${Constants.SPAM_BOUNCE_ADDRESS_KEY}"*/

        TODO("rebuild address generation")

    }

    fun generateAnswerBounceAddress(username: String, spammerAddress: String): String {

        /*return "${
            findKeyOrGenerateNewOneFromStringWhile(
                    username + spammerAddress,
                    Manager.dataManager.answerBounceAddressCollection,
                    and(
                            BounceAddressData::informUser eq username,
                            BounceAddressData::forAddress eq spammerAddress
                    ),
                    { "${it.address}.${Constants.ANSWER_BOUNCE_ADDRESS_KEY}" },
                    { BounceAddressData::address eq it },
                    { BounceAddressData(it, username, spammerAddress, spammerAddress) }
            )
        }.${Constants.ANSWER_BOUNCE_ADDRESS_KEY}"*/

        TODO("rebuild address generation")

    }

    private inline fun <E> findKeyOrGenerateNewOneFromStringWhile(
            string: String,
            //collection: MongoCollection<E>,
            filter: Bson,
            crossinline ifFound: (foundObject: E) -> String,
            crossinline generateWhile: (currentKey: String) -> Bson,
            crossinline objectToInsert: (key: String) -> E
    ): String {

/*        // TODO multithreading critical point

        collection.findOne(filter)?.let { return ifFound.invoke(it) }

        val key = generateKeyFromStringWhile(string) {
            collection.contains(generateWhile.invoke(it))
        }
        collection.insertOne(objectToInsert.invoke(key))

        return key*/

        TODO("rebuild address generation")

    }

    private fun generateKeyFromStringWhile(string: String, condition: (currentKey: String) -> Boolean): String {

/*        var key = string.md5()

        while (condition.invoke(key))
            key = (key + key.hashCode()).md5()

        return key*/

        TODO("rebuild address generation")

    }

    private fun String.md5(): String = hashWith("MD5")

    private fun String.hashWith(algorithm: String): String {
        MessageDigest.getInstance(algorithm).let {
            it.update(this.toByteArray())
            return DatatypeConverter.printHexBinary(it.digest())
        }
    }

}
