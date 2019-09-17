package events

import AnalyticsEvent
import FLOW
import EVENT_TYPE
import FlowStep


val benefitsFlow = FLOW.BENEFITS

enum class BenefitsEvents(val event: AnalyticsEvent) {
    BENEFITS_SCREEN(AnalyticsEvent(flow = benefitsFlow, eventType = EVENT_TYPE.SCREEN)),
}