package com.uptech.smarthomeimplmqtt.sensorInfo;

public class CommonSensorInfo {

    /**
     * requestId : uptech_sh_1540522602
     * reported : {"status":245}
     * desired : {"status":245}
     * lastUpdatedTime : {"reported":{"status":1540522603415},"desired":{"status":1540522603415}}
     * profileVersion : 180
     */

    private String requestId;
    private ReportedBean reported;
    private DesiredBean desired;
    private LastUpdatedTimeBean lastUpdatedTime;
    private int profileVersion;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ReportedBean getReported() {
        return reported;
    }

    public void setReported(ReportedBean reported) {
        this.reported = reported;
    }

    public DesiredBean getDesired() {
        return desired;
    }

    public void setDesired(DesiredBean desired) {
        this.desired = desired;
    }

    public LastUpdatedTimeBean getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(LastUpdatedTimeBean lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public int getProfileVersion() {
        return profileVersion;
    }

    public void setProfileVersion(int profileVersion) {
        this.profileVersion = profileVersion;
    }

    public static class ReportedBean {
        /**
         * status : 245
         */

        private int status = -1;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }

    public static class DesiredBean {
        /**
         * status : 245
         */

        private int status;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }

    public static class LastUpdatedTimeBean {
        /**
         * reported : {"status":1540522603415}
         * desired : {"status":1540522603415}
         */

        private ReportedBeanX reported;
        private DesiredBeanX desired;

        public ReportedBeanX getReported() {
            return reported;
        }

        public void setReported(ReportedBeanX reported) {
            this.reported = reported;
        }

        public DesiredBeanX getDesired() {
            return desired;
        }

        public void setDesired(DesiredBeanX desired) {
            this.desired = desired;
        }

        public static class ReportedBeanX {
            /**
             * status : 1540522603415
             */

            private long status;

            public long getStatus() {
                return status;
            }

            public void setStatus(long status) {
                this.status = status;
            }
        }

        public static class DesiredBeanX {
            /**
             * status : 1540522603415
             */

            private long status;

            public long getStatus() {
                return status;
            }

            public void setStatus(long status) {
                this.status = status;
            }
        }
    }
}
