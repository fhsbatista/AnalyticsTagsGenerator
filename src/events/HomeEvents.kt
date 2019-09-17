package events

import AnalyticsEvent
import EVENT_TYPE
import FLOW

val homeFlow = FLOW.HOME

enum class HomeEvents(val event: AnalyticsEvent) {
    SCREEN(AnalyticsEvent(flow = homeFlow, eventType = EVENT_TYPE.SCREEN)),
    BALANCE_CLICK(AnalyticsEvent(flow = homeFlow, eventType = EVENT_TYPE.CLICK, tag = "Saldo")),
}