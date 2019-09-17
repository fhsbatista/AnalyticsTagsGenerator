package events

import AnalyticsEvent
import EVENT_TYPE
import FLOW

val tutorialFlow = FLOW.TUTORIAL

enum class TutorialEvents(val event: AnalyticsEvent) {
    TUTORIAL_SCREEN(AnalyticsEvent(flow = tutorialFlow, eventType = EVENT_TYPE.SCREEN)),
    CLOSE_CLICK(AnalyticsEvent(flow = tutorialFlow, eventType = EVENT_TYPE.CLICK, tag = "Fechar")),
    SIGNUP_CLICK(AnalyticsEvent(flow = tutorialFlow, eventType = EVENT_TYPE.CLICK, tag = "Cadastrar")),
    LOGIN_CLICK(AnalyticsEvent(flow = tutorialFlow, eventType = EVENT_TYPE.CLICK, tag = "Entrar")),
}