package events

import AnalyticsEvent
import FLOW
import EVENT_TYPE
import FlowStep


val chargeFlow = FLOW.CHARGE

enum class ChargeEvents(val event: AnalyticsEvent) {
    TRANSFERS_SCREEN(AnalyticsEvent(flow = chargeFlow, eventType = EVENT_TYPE.SCREEN)),
}