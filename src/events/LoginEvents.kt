package events

import AnalyticsEvent
import EVENT_TYPE
import FLOW

val loginFlow = FLOW.LOGIN

enum class LoginEvents(val event: AnalyticsEvent) {
    LOGIN_SCREEN(AnalyticsEvent(flow = loginFlow, eventType = EVENT_TYPE.SCREEN)),
    BACK_CLICK(AnalyticsEvent(flow = loginFlow, eventType = EVENT_TYPE.CLICK, tag = "Voltar")),
    FORGOT_PASSWORD_CLICK(AnalyticsEvent(flow = loginFlow, eventType = EVENT_TYPE.CLICK, tag = "EsqueciASenha")),
    ACCESS_ANOTHER_ACCOUNT_CLICK(AnalyticsEvent(flow = loginFlow, eventType = EVENT_TYPE.CLICK, tag = "AcesseOutraConta")),
    LOGIN_CLICK(AnalyticsEvent(flow = loginFlow, eventType = EVENT_TYPE.CLICK, tag = "Entrar")),
}