import java.util.Scanner;

public class ClassDemo {

    public static float metricConverter(String sourceMetric, String targetMetric, float sourceNum) {
        float targetNum = 0;
        switch (sourceMetric) {
            case "km":
                switch (targetMetric) {
                    case "m":
                        targetNum = sourceNum * 1000;
                        break;
                    case "mile":
                        targetNum = sourceNum / (float) 0.62137;
                        break;
                    default:
                        System.out.println("Your input is not handled, please try again.");
                        return targetNum;
                }
                case "kg":
                switch (targetMetric) {
                    case "lb":
                        targetNum = sourceNum * 2;
                        break;
                    case "gram":
                        targetNum = sourceNum / (float) 0.0010000;
                        break;
                    case "oz":
                        targetNum = sourceNum * (float) 35.274;
                        break;
                    case "mg":
                        targetNum = sourceNum / (float) 0.0000010000;
                        break;
                    default:
                        System.out.println("Your input is not handled, please try again.");
                        return targetNum;
                }
                case "mm":
                switch (targetMetric) {
                    case "in":
                        targetNum = sourceNum * (float) 0.039370;
                        break;
                    case "ft":
                        targetNum = sourceNum * (float) 0.0032808;
                        break;
                    default:
                        System.out.println("Your input is not handled, please try again.");
                        return targetNum;
                }
            case "ton":
                switch (targetMetric) {
                    case "lb":
                        targetNum = sourceNum * (float) 2204.6;
                        break;
                    case "gram":
                        targetNum = sourceNum / (float) 0.0000010000;
                        break;
                    default:
                        System.out.println("Your input is not handled, please try again.");
                        return targetNum;

                }
        }
        System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
        return targetNum;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str;
        String[] strArray;
        float sourceNum;
        String sourceMetric;
        String targetMetric;
        while (true) {
            System.out.println("Welcome to metric converter!");
            System.out.println("Please input your metric to be converted, for example 1 kg = lb");
            str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("Thank you. Goodbye!");
                scanner.close();
                break;
            }
            strArray = str.split(" ");
            if (strArray.length != 4) {
                System.out.println("Your input is not valid. Please try again!");
                continue;
            } else {
                sourceNum = Float.parseFloat(strArray[0]);
                sourceMetric = strArray[1];
                targetMetric = strArray[3];
                metricConverter(sourceMetric, targetMetric, sourceNum);

            }

        }

        scanner.close();
    }
}