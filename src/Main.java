import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
            System.out.println("Java Lab 2 ");
            // write your code here

            Scanner scanner = new Scanner(System.in);

            System.out.println("\t\t\t Task 1");

            System.out.print("Введіть ім'я власника: ");
            String ownerName = scanner.next();

            System.out.print("Введіть номер рахунку: ");
            String accountNumber = scanner.next();

            System.out.print("Введіть відсоткову ставку: ");
            double interestRate = scanner.nextDouble();

            System.out.print("Введіть початковий баланс: ");
            double initialBalance = scanner.nextDouble();

            Account account = new Account(ownerName, accountNumber, interestRate, initialBalance);
            account.getAccountInfo();

            System.out.println("\nРахунок успішно створено.");

            boolean isRunning = true;
            while (isRunning) {
                System.out.println("\nОберіть операцію:");
                System.out.println("1. Змінити власника");
                System.out.println("2. Зняти гроші з рахунку");
                System.out.println("3. Покласти гроші на рахунок");
                System.out.println("4. Нарахувати відсотки");
                System.out.println("5. Вивести інформацію про аккаунт");
                System.out.println("6. Вийти");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очищення буфера

                switch (choice) {
                    case 1:
                        System.out.print("Введіть нове прізвище власника: ");
                        String newOwnerName = scanner.nextLine();
                        account.changeOwner(newOwnerName);
                        System.out.println("Прізвище власника успішно змінено на " + newOwnerName);
                        break;
                    case 2:
                        System.out.print("Введіть суму для зняття: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Введіть суму для внесення: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 4:
                        account.accrueInterest();
                        break;
                    case 5:
                        account.getAccountInfo();
                        break;
                    case 6:
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Неправильний вибір. Спробуйте ще раз.");
                }



        }


/////////////////////////////////////////////////////////////////////////////////////////////////////////


            System.out.println("\t\t\t Task 2");


            System.out.print("Введіть довжину ребра куба: ");
            double n = scanner.nextDouble();

            Cube cube = new Cube(n);

            double surfaceArea = cube.getSurfaceArea();
            double volume = cube.getVolume();
            double longDiagonal = cube.getLongDiagonal();

            System.out.println("Сумарна площа граней: " + surfaceArea);
            System.out.println("Об'єм куба: " + volume);
            System.out.println("Довжина великої діагоналі: " + longDiagonal);




/////////////////////////////////////////////////////////////////////////////////////////////////////////

            System.out.println("\n\t\t\t Task 3");

            System.out.print("Введіть кількість елементів масиву: ");
            int k = scanner.nextInt();

            int[] x = new int[k];
            Random random = new Random();

            for (int i = 0; i < k; i++) {
                x[i] = random.nextInt(200)-100; // Generate random numbers from 0 to 99
            }

            System.out.println("Початковий масив:");
            System.out.println(Arrays.toString(x));

            int low = 0;
            int high = x.length - 1;

            QuickSort.quickSort(x, low, high); // Виклик методу quickSort з класу QuickSort

            System.out.println("Відсортований масив:");
            System.out.println(Arrays.toString(x));

            scanner.close();


        }

        }


