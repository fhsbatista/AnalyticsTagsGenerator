import events.*

fun main() {

    TutorialEvents.values().forEach {
        println(it.event.generateTag())
    }

    LoginEvents.values().forEach {
        println(it.event.generateTag())
    }

    ForgotPasswordEvents.values().forEach {
        println(it.event.generateTag())
    }

    HomeEvents.values().forEach {
        println(it.event.generateTag())
    }

    ExtractEvents.values().forEach {
        println(it.event.generateTag())
    }

    AddCreditEvents.values().forEach {
        println(it.event.generateTag())
    }

    VirtualCardEvents.values().forEach {
        println(it.event.generateTag())
    }

    PayBillEvents.values().forEach {
        println(it.event.generateTag())
    }

    TransfersEvents.values().forEach {
        println(it.event.generateTag())
    }

    ReceiptsEvents.values().forEach {
        println(it.event.generateTag())
    }

    ChargeEvents.values().forEach {
        println(it.event.generateTag())
    }

    BenefitsEvents.values().forEach {
        println(it.event.generateTag())
    }





}


