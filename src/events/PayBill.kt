package events

import AnalyticsEvent
import FLOW
import EVENT_TYPE
import FlowStep


val payBillFlow = FLOW.PAY_BILL

private enum class PAY_BILL_STEPS(val step: FlowStep) {
    SCAN_BAR_CODE(FlowStep("EscanearBarCode")),
    TYPE_BAR_CODE(FlowStep("DigitarBarCode")),
}

enum class PayBillEvents(val event: AnalyticsEvent) {
    SCAN_BAR_CODE(AnalyticsEvent(flow = payBillFlow, step = PAY_BILL_STEPS.SCAN_BAR_CODE.step, eventType = EVENT_TYPE.SCREEN)),
    TYPE_BAR_CODE(AnalyticsEvent(flow = payBillFlow, step = PAY_BILL_STEPS.TYPE_BAR_CODE.step,eventType = EVENT_TYPE.SCREEN)),
    TYPE_BAR_CODE_CLICK(AnalyticsEvent(flow = payBillFlow, step = PAY_BILL_STEPS.SCAN_BAR_CODE.step, eventType = EVENT_TYPE.CLICK, tag = "DigitarBarCode")),
}