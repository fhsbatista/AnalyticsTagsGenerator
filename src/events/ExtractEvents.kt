package events

import AnalyticsEvent
import FLOW
import EVENT_TYPE
import FlowStep


val extractFlow = FLOW.EXTRACT

private enum class EXTRACTSTEPS(val step: FlowStep) {
    EXTRACT_LISTING(FlowStep("ListagemExtrato")),
    EXTRACT_EXPORTING(FlowStep("ExportarExtrato"))
}

enum class ExtractEvents(val event: AnalyticsEvent) {
    EXTRACT_LISTING_SCREEN(AnalyticsEvent(flow = addCreditFlow, step = EXTRACTSTEPS.EXTRACT_LISTING.step, eventType = EVENT_TYPE.SCREEN)),
    EXTRACT_EXPORTING_SCREEN(AnalyticsEvent(flow = addCreditFlow, step = EXTRACTSTEPS.EXTRACT_EXPORTING.step, eventType = EVENT_TYPE.SCREEN)),
}