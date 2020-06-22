package com.uptech.smarthomeimplmqtt.sensorInfo;

public class SHT11Info {
    /**
     * requestId : uptech_sh_1540522598
     * reported : {"data1":18.55,"data2":29.59}
     * desired : {"data1":18.55,"data2":29.59}
     * lastUpdatedTime : {"reported":{"data1":1540522599588,"data2":1540522599588},"desired":{"data1":1540522599588,"data2":1540522599588}}
     * profileVersion : 439
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
         * data1 : 18.55
         * data2 : 29.59
         */

        private double data1;
        private double data2;

        public double getData1() {
            return data1;
        }

        public void setData1(double data1) {
            this.data1 = data1;
        }

        public double getData2() {
            return data2;
        }

        public void setData2(double data2) {
            this.data2 = data2;
        }
    }

    public static class DesiredBean {
        /**
         * data1 : 18.55
         * data2 : 29.59
         */

        private double data1;
        private double data2;

        public double getData1() {
            return data1;
        }

        public void setData1(double data1) {
            this.data1 = data1;
        }

        public double getData2() {
            return data2;
        }

        public void setData2(double data2) {
            this.data2 = data2;
        }
    }

    public static class LastUpdatedTimeBean {
        /**
         * reported : {"data1":1540522599588,"data2":1540522599588}
         * desired : {"data1":1540522599588,"data2":1540522599588}
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
             * data1 : 1540522599588
             * data2 : 1540522599588
             */

            private long data1;
            private long data2;

            public long getData1() {
                return data1;
            }

            public void setData1(long data1) {
                this.data1 = data1;
            }

            public long getData2() {
                return data2;
            }

            public void setData2(long data2) {
                this.data2 = data2;
            }
        }

        public static class DesiredBeanX {
            /**
             * data1 : 1540522599588
             * data2 : 1540522599588
             */

            private long data1;
            private long data2;

            public long getData1() {
                return data1;
            }

            public void setData1(long data1) {
                this.data1 = data1;
            }

            public long getData2() {
                return data2;
            }

            public void setData2(long data2) {
                this.data2 = data2;
            }
        }
    }
}
