package com.uptech.smarthomeimplmqtt.mqtt;

public class SensorBean {

    /**
     * requestId : {request1517442736180}
     * desired : {"status":4}
     */

    private String requestId;
    private DesiredBean desired;

    public SensorBean()
    {
        requestId = "-1";
        desired = new DesiredBean();
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public DesiredBean getDesired() {
        return desired;
    }

    public static class DesiredBean {
        /**
         * status : 4
         */

        private int status;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return"\"desired\":{\"status\":"+status + "}";
        }
    }
    @Override
    public String toString() {
        return "{" +
                "\"requestId\":\"{" + requestId + "}\"," +
                desired.toString() + '}';
    }
}
