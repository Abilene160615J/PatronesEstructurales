package structural_pattern.facade

import java.util.*

data class PaymentRequest (
    var customerId: Long,
    var amount: Double,
    var cardNumber: String,
    var cardName: String,
    var cardExpireDate: String,
    var cardSecureNumber: String
)
