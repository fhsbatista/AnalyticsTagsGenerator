package events

import AnalyticsEvent
import FLOW
import EVENT_TYPE
import FlowStep


val receiptsFlow = FLOW.RECEIPTS

enum class ReceiptsEvents(val event: AnalyticsEvent) {
    RECEIPTS_SCREEN(AnalyticsEvent(flow = receiptsFlow, eventType = EVENT_TYPE.SCREEN)),
}