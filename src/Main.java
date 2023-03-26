import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int m, d;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay : ");
        m = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        d = input.nextInt();

        if ((m >= 1 && m <= 12)){
            if (m == 3) {
                if (d >= 1 && d <= 31){
                    if (d >= 21) {
                        horoscope = "Aries";
                    }else if (d <= 20) {
                        horoscope = "Pisces";
                    }else {
                        isError = true;
                    }
                }else {
                    isError = true;
                }

            }
            if (m == 4) {
                if (d >= 1 && d <= 30){
                    if (d >= 21) {
                        horoscope = "Taurus";
                    } else if (d <= 20) {
                        horoscope = "Aries";
                    }else {
                        isError = true;
                    }
                }else {
                    isError = true;
                }

            }
            if ((m == 5)) {
                if (d >= 1 && d <= 31){
                    if (d >= 22) {
                        horoscope = "Gemini";
                    } else if (d <= 21) {
                        horoscope = "Taurus";
                    }else {
                        isError = true;
                    }
                }else {
                    isError = true;
                }

            }

            if (m == 6) {
                if (d >= 1 && d <= 30){
                    if (d >= 23) {
                        horoscope = "Cancer";
                    } else if (d <= 22) {
                        horoscope = "Gemini";
                    }else {
                        isError = true;
                    }
                }else {
                    isError = true;
                }

            }
            if (m == 7) {
                if (d >= 1 && d <= 31){
                    if (d >= 23) {
                        horoscope = "Leo";
                    } else if (d <= 22) {
                        horoscope = "Cancer";
                    }else {
                        isError = true;
                    }
                }else {
                    isError = true;
                }

            }
            if (m == 8) {
                if (d >= 1 && d <= 31){
                    if (d >= 23) {
                        horoscope = "Virgo";
                    } else if (d <= 22) {
                        horoscope = "Leo";
                    }else {
                        isError = true;
                    }
                }else {
                    isError = true;
                }

            }
            if (m == 9) {
                if (d >= 1 && d <= 30){
                    if (d >= 23) {
                        horoscope = "Libra";
                    } else if (d <= 22) {
                        horoscope = "Virgo";
                    }else {
                        isError = true;
                    }
                }else {
                    isError = true;
                }

            }
            if (m == 10) {
                if (d >= 1 && d <= 31){
                    if (d >= 23) {
                        horoscope = "Scorpio";
                    } else if (d <= 22) {
                        horoscope = "Libra";
                    }else {
                        isError = true;
                    }
                }else {
                    isError = true;
                }

            }
            if (m == 11) {
                if (d >= 1 && d <= 30){
                    if (d >= 22) {
                        horoscope = "Sagittarius";
                    } else if (d <= 22) {
                        horoscope = "Scorpio";
                    }else {
                        isError = true;
                    }
                }else {
                    isError = true;
                }

            }
            if (m == 12 ) {
                if (d >= 1 && d <= 31){
                    if (d >= 22) {
                        horoscope = "Capricorn";
                    } else if (d <= 21) {
                        horoscope = "Sagittarius";
                    }else {
                        isError = true;
                    }
                }else {
                    isError = true;
                }

            }
            if (m == 1) {
                if (d >= 1 && d <= 31){
                    if (d >= 22) {
                        horoscope = "Aquarius";
                    } else if (d <= 21) {
                        horoscope = "Capricorn";
                    }else {
                        isError = true;
                    }
                }else {
                    isError =true;
                }

            }
            if (m == 2) {
                if (d >= 1 && d <= 28){
                    if (d >= 20) {
                        horoscope = "Pisces";
                    } else if (d <= 19) {
                        horoscope = "Aquarius";
                    }else {
                        isError = true;

                    }
                }else {
                    isError =true;
                }

            }
        }else {
            isError = true;
        }

           if (isError) {
                    System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
                } else {
                    System.out.println("Burcunuz : " + horoscope);
                }
        }
    }













































