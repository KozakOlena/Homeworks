package JavaCore8;

import java.util.Scanner;

public class JavaCore8 {
    public static void main(String[] args) {
        Month[] monthArr = Month.values();
        Season[] seasonArr = Season.values();
        Scanner scanner = new Scanner(System.in);

     while (true) {

          switch (scanner.next()) {
                case "1": {
                    boolean flag = false;
                    System.out.println("Enter month : ");
                    scanner = new Scanner(System.in);
                    String month = scanner.next().toUpperCase();


                for (Month m : monthArr) {
                        if (m.name().equals(month)) {
                            System.out.println("Month exists : "+m);
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("Month doesn`t exist");
                    }
                    break;

                }

                case "2": {
                    boolean flag = false;

                    System.out.println("Enter season : ");
                    scanner = new Scanner(System.in);
                    String month = scanner.next().toUpperCase();

                    for (Month m : monthArr) {
                        if (m.getSeason().name().equals(month)) {
                            System.out.println(m);
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("Month doesn`t exist");
                    }
                    break;

                }


                case "4": {
                    boolean flag = false;

                    System.out.println("Enter number of days: ");
                    scanner = new Scanner(System.in);
                    Integer month = scanner.nextInt();

                    for (Month m : monthArr) {
                        if (m.getDays() < month) {
                            System.out.println(m);
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("Month with this amount doesn`t exist");
                    }
                    break;

                }

                case "5": {
                    boolean flag = false;

                    System.out.println("Enter number : ");
                    scanner = new Scanner(System.in);
                    Integer month = scanner.nextInt();



                    for (Month m : monthArr) {
                        if (m.getDays() > month) {
                            System.out.println(m);
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("Month doesn`t exist");
                    }
                    break;

                }

                case "6": {

                    boolean flag = false;

                    System.out.println("Enter season : ");
                    scanner = new Scanner(System.in);
                    String SN = scanner.next().toUpperCase();



                    for (Season s : seasonArr) {
                        if (s.name().equals(SN)) {

                            flag = true;
                        }
                    }
                    if(flag) {
                        Season season2 = Season.valueOf(SN);
                        int ordinal = season2.ordinal();

                        if(ordinal == seasonArr.length -1) {
                            ordinal = 0;
                            System.out.println(seasonArr [ordinal]);
                        }else {
                            System.out.println(seasonArr[ordinal+1]);
                        }
                    }

                    if (!flag) {
                        System.out.println("Season doesn`t exist");
                    }
                    break;

                }

                case "7": {
                    boolean flag = false;

                    System.out.println("Enter season : ");
                    scanner = new Scanner(System.in);
                    String uSeas = scanner.next().toUpperCase();



                    for (Season s : seasonArr) {
                        if (s.name().equals(uSeas)) {

                            flag = true;
                        }
                    }
                    if(flag) {
                        Season season3 = Season.valueOf(uSeas);
                        int ordinal = season3.ordinal();

                        if(ordinal == seasonArr.length -1) {
                            ordinal = 0;
                            System.out.println(seasonArr [ordinal]);
                        }else {
                            System.out.println(seasonArr[ordinal-1]);
                        }
                    }

                    if (!flag) {
                        System.out.println("Season doesn`t exist");
                    }
                    break;

                }

                case "8": {
                    boolean flag = false;

                    System.out.println("Enter number 28 or 30 : ");
                    scanner = new Scanner(System.in);
                    int no = scanner.nextInt();



                    for (Month m : monthArr) {
                        if (m.getDays() % 2 == 0) {
                            System.out.println(m);
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("Month doesn`t exist");
                    }
                    break;

                }

                case "9": {
                    boolean flag = false;

                    System.out.println("Enter number 31 : ");
                    scanner = new Scanner(System.in);
                    int nom = scanner.nextInt();



                    for (Month m : monthArr) {
                        if (m.getDays() % 2 == 1) {
                            System.out.println(m);
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("Month doesn`t exist");
                    }
                    break;

                }

                case "10":{

                    System.out.println("Enter month : ");
                    scanner=new Scanner(System.in);
                    String scs = scanner.next().toUpperCase();

                    boolean flag = false;

                    for (Month m : monthArr) {
                        if (m.name().equalsIgnoreCase(scs)) {
                            if(m.getDays() % 2 == 0) {
                                System.out.println("Month exists and has an even number of days : "+m);
                                flag = true;
                            }else {
                                System.out.println("Month exists and has no even number of days : "+m);
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Mounth doesn`t exist");
                    }
                    break;

                }

            }
        }
   


}
}
