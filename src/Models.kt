import com.sun.tools.javac.comp.Flow

enum class EVENT_TYPE(val tag: String) {
    SCREEN("TelaAberta"),
    CLICK("Click"),
    ERROR("Erro")
}

enum class FLOW(val tag: String) {
    TUTORIAL("Tutorial"),
    LOGIN("Login"),
    FORGOT_PASSWORD("EsqueciASenha"),
    HOME("Home"),
    EXTRACT("Extrato"),
    ADD_CREDIT("AdicionarCredito"),
    VIRTUAL_CARD("CartaoVirtual"),
    PAY_BILL("PagarConta"),
    TRANSFER("Transferencias"),
    RECEIPTS("Comprovantes"),
    CHARGE("Cobrança"),
    BENEFITS("Benefícios")
}

data class FlowStep(val tag: String)

data class AnalyticsEvent(val flow: FLOW, val step: FlowStep? = null, val eventType: EVENT_TYPE, val tag: String? = null)

fun AnalyticsEvent.generateTag(): String {
    val seperatorChar = "_"
    val flowText = "${flow.tag}"
    val stepText = if (step != null) "$seperatorChar${step.tag}" else ""
    val eventTypeText = "$seperatorChar${eventType.tag}"
    val customTag = if (tag != null) "${seperatorChar}$tag" else ""

    return "${flowText}${stepText}${eventTypeText}${customTag}"
}

