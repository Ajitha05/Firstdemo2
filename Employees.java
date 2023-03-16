public class Employees {
    public static void idlogin() {
        System.out.println("Entering into office");
    }

    public static void vechicalpark() {
        System.out.println("Parking vechical");
        ;

    }


    public static class workfromhome extends Employees {
        public static void workbasedoption() {
            System.out.println("work from home");
        }


        public static class Time extends workfromhome {
            public static void time() {
                System.out.println("Flexible time");
            }

            public static class itemployee extends Time {
                public static void work() {
                    System.out.println("work in office");
                }

                public static class developres extends Time {
                    public static void code() {
                        System.out.println("developing");
                    }
                }

                public static class Testers extends Time {
                    public static void time() {
                        System.out.println("debug");

                    }
                }

                public static class intern extends Time {
                    public static void duration() {
                        System.out.println("duration of months");

                    }

                }
            }
        }


        public static class customersupport extends Employees {
            public static void support() {
                System.out.println("supporting");

            }
        }


        public static class customercallsupport extends customersupport {
            public static void call() {
                System.out.println("managing call");

            }
        }

        public static class emailsupport extends customercallsupport {
            public static void call() {
                System.out.println("managing email");

            }
        }
    }

                public static class cannotworkinhome extends Employees {
                    public static void workbased() {
                        System.out.println("can't be work from home");

                    }

                    public static class time1 extends cannotworkinhome {
                        public static void time() {
                            System.out.println("fixed timing");

                        }

                        public static class maintanceworker extends time1 {
                            public static void work() {
                                System.out.println("clean");

                            }
                        }

                        public static class jaintor extends time1 {
                            public static void work() {
                                System.out.println("maintanence");

                            }
                        }

                        public static class laundry extends time1 {
                            public static void wash() {
                                System.out.println("washing");

                            }
                        }
                    }

                    public static class security extends cannotworkinhome {
                        public static void secure() {
                            System.out.println("secure something");

                        }
                    }

                    public static class cybersecurity extends security {
                        public static void securedata() {
                            System.out.println("crimr based");

                        }
                    }

                    public static class physicalsecurity extends security {
                        public static void securepeople() {
                            System.out.println("watchmen");

                        }
                    }
                }
                public static void main(String args[]){
                 workfromhome sc = new workfromhome();
                    sc.workbasedoption();



                }

    }



