package events

import AnalyticsEvent
import EVENT_TYPE
import FLOW
import FlowStep

val forgotPasswordFlow = FLOW.FORGOT_PASSWORD

private enum class STEPS(val tag: String) {
    TYPE_CPF("DigitarCpf"),
    TYPE_NEW_PASSWORD("DigitarNovaSenha")
}

enum class ForgotPasswordEvents(val event: AnalyticsEvent) {
    SCREEN(AnalyticsEvent(flow = forgotPasswordFlow, eventType = EVENT_TYPE.SCREEN)),
    TYPE_CPF_BACK_CLICK(
        AnalyticsEvent(
            flow = forgotPasswordFlow,
            step = FlowStep(STEPS.TYPE_CPF.tag),
            eventType = EVENT_TYPE.CLICK,
            tag = "Voltar"
        )
    ),
    TYPE_CPF_CONTINUE_CLICK(
        AnalyticsEvent(
            flow = forgotPasswordFlow,
            step = FlowStep(STEPS.TYPE_CPF.tag),
            eventType = EVENT_TYPE.CLICK,
            tag = "Continuar"
        )
    ),
    TYPE_PASSWORD_BACK_CLICK(
        AnalyticsEvent(
            flow = forgotPasswordFlow,
            step = FlowStep(STEPS.TYPE_NEW_PASSWORD.tag),
            eventType = EVENT_TYPE.CLICK,
            tag = "Voltar"
        )
    ),
    TYPE_PASSWORD_CPF_CONTINUE_CLICK(
        AnalyticsEvent(
            flow = forgotPasswordFlow,
            step = FlowStep(STEPS.TYPE_NEW_PASSWORD.tag),
            eventType = EVENT_TYPE.CLICK,
            tag = "Continuar"
        )
    ),
}