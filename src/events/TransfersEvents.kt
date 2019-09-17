package events

import AnalyticsEvent
import FLOW
import EVENT_TYPE
import FlowStep


val transferFlow = FLOW.TRANSFER

enum class TransfersEvents(val event: AnalyticsEvent) {
    TRANSFERS_SCREEN(AnalyticsEvent(flow = transferFlow, eventType = EVENT_TYPE.SCREEN)),
}