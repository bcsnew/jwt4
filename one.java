import java.util.Scanner;

public class one {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int choice = 0;
int[][] a = {{1, 2}, {3, 4}};
int[][] b = {{5, 6}, {7, 8}};
do {
System.out.println("1. Matrix Addition");
System.out.println("2. Matrix Multiplication");
System.out.println("3. Transpose of Matrix A");
System.out.println("4. Exit");
System.out.print("Enter choice: ");
if (!sc.hasNextInt()) break;
choice = sc.nextInt();
switch (choice) {
case 1:
System.out.println("Result of Addition:");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
System.out.print((a[i][j] + b[i][j]) + " ");
}
System.out.println();
}
break;
case 2:
System.out.println("Result of Multiplication:");
int[][] mul = new int[2][2];
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
mul[i][j] = 0;
for (int k = 0; k < 2; k++) {
mul[i][j] += a[i][k] * b[k][j];
}
System.out.print(mul[i][j] + " ");
}
System.out.println();
}
break;
case 3:
System.out.println("Transpose of Matrix A:");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
System.out.print(a[j][i] + " ");
}
System.out.println();
}
break;
case 4:
System.out.println("Exiting program.");
break;
default:
System.out.println("Invalid choice.");
}
} while (choice != 4);
sc.close();
}
}
