package events

import AnalyticsEvent
import FLOW
import EVENT_TYPE
import FlowStep


val addCreditFlow = FLOW.ADD_CREDIT

private enum class ADD_CREDIT_STEPS(val step: FlowStep) {
    ADD_CREDIT_OPTIONS(FlowStep("AdicionarSaldoOpções")),
    ADD_CREDIT_BY_TRANSFER(FlowStep("AdicionarSaldoTransferencia")),
    ADD_CREDIT_BT_TICKET(FlowStep("AdicionarSaldoBoleto"))
}

enum class AddCreditEvents(val event: AnalyticsEvent) {
    ADD_CREDIT_SCREEN(AnalyticsEvent(flow = addCreditFlow, step = ADD_CREDIT_STEPS.ADD_CREDIT_OPTIONS.step, eventType = EVENT_TYPE.SCREEN)),
    TRANSFER_CLICK(AnalyticsEvent(flow = addCreditFlow, step = ADD_CREDIT_STEPS.ADD_CREDIT_OPTIONS.step, eventType = EVENT_TYPE.CLICK, tag = "SelecionadoTransferencia")),
    TICKET_CLICK(AnalyticsEvent(flow = addCreditFlow, step = ADD_CREDIT_STEPS.ADD_CREDIT_OPTIONS.step, eventType = EVENT_TYPE.CLICK, tag = "SelecionadoBoleto")),
    VISUALIZE_TICKET(AnalyticsEvent(flow = addCreditFlow, step = ADD_CREDIT_STEPS.ADD_CREDIT_BT_TICKET.step, eventType = EVENT_TYPE.CLICK, tag = "VisualizarBoleto")),
    SHARE_TICKET(AnalyticsEvent(flow = addCreditFlow, step = ADD_CREDIT_STEPS.ADD_CREDIT_BT_TICKET.step, eventType = EVENT_TYPE.CLICK, tag = "Compartilhar")),
    COPY_TICKET_CODE(AnalyticsEvent(flow = addCreditFlow, step = ADD_CREDIT_STEPS.ADD_CREDIT_BT_TICKET.step, eventType = EVENT_TYPE.CLICK, tag = "CopiarCódigo")),
}