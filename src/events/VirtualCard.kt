package events

import AnalyticsEvent
import FLOW
import EVENT_TYPE
import FlowStep


val virtualCardFlow = FLOW.VIRTUAL_CARD

enum class VirtualCardEvents(val event: AnalyticsEvent) {
    VIRTUAL_CARD_SCREEN(AnalyticsEvent(flow = virtualCardFlow, eventType = EVENT_TYPE.SCREEN)),
    COPY_CARD_CODE(AnalyticsEvent(flow = virtualCardFlow, eventType = EVENT_TYPE.CLICK, tag = "CopiarCodigoCartao")),
    DELETE_CARD(AnalyticsEvent(flow = virtualCardFlow, eventType = EVENT_TYPE.CLICK, tag = "ApagarCartao")),
    BLOCK_CARD(AnalyticsEvent(flow = virtualCardFlow, eventType = EVENT_TYPE.CLICK, tag = "BloquearCartao")),
    UNBLOCK_CARD(AnalyticsEvent(flow = virtualCardFlow, eventType = EVENT_TYPE.CLICK, tag = "DesbloquearCartao")),
}