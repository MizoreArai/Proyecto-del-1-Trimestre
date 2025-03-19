import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class NumeroDeOrdenMayorAMenor {
    public static void main(String[] args) { 
        Scanner Scanner = new Scanner(System.in); 
        int[] numeros = new int[10];
        
        System.out.println("Introduzca 10 números enteros positivos: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = Scanner.nextInt();
            if (numeros[i] < 0) {
                System.out.println("\nEl número no es positivo. Inténtalo de nuevo:");
                i--;
            }
        }

        //Ordenar los números
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        // Demostrar los números ordenados
        System.out.print("\nEl orden de mayor a menor es: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }   
}


/* FOR LOOP:
for (initialization; condition; update) {
    * initialization -> This is executes once at the start
                        It's usually used to declased initialize a loop control variable
                        Ex. int i = 0

    * condition ->  This is used to check, before each itineration, if the loop should continue (true)
                    If the condition is false, the loop will terminate
                    Ex. i < 10

    * update -> This is executed after each itineration
                Ex. i++ -> This increments the value of i by 1

    * block ->  This is the code that will be executed in each itineration
                It can include any number of statements
                Ex. System.out.println(i);
}
EXAMPLES:
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
    * The variable i is initialized to 1 before the loop starts.
        After each loop iteration, Java checks if i is less than or equal to 5.

    * Before each loop iteration, Java checks if i is less than or equal to 5.
        If this condition is true, the loop body executes. If false, the loop ends.
        In this example, the loop will print the numbers 1 through 5.
        The loop continues until i becomes 6, at which point the condition becomes false, and the loop ends.
        Note: The loop will print 1, 2, 3, 4, and 5.
        The loop control variable i is updated after each iteration to make it ready for the next iteration.

    * After each iteration of the loop body, i is incremented by 1 (using the ++ operator).
        The loop continues until i becomes 6, at which point the condition becomes false, and the loop ends.

    *Loop Execution:
        First iteration: i = 1, prints 1
        Second iteration: i = 2, prints 2
        Third iteration: i = 3, prints 3
        Fourth iteration: i = 4, prints 4
        Fifth iteration: i = 5, prints 5
        Sixth iteration: i = 6, condition i <= 5 is false, so the loop exits.

    *OUTPUT:
                i: 1
                i: 2
                i: 3
                i: 4
                i: 5

MULTIPLE VARIABLES:
for (int i = 1, j = 5; i <= 5; i++, j--) {
    System.out.println("i: " + i + ", j: " + j);
}
    
    * The variable i is initialized to 1 before the loop starts.

    * The variable j is initialized to 5 before the loop starts.

    * Before each loop iteration, Java checks if i is less than or equal to 5.

    * If this condition is true, the loop body executes. If false, the loop ends.

    * In this example, the loop body prints the values of i and j.

    * The loop continues until i becomes 6, at which point the condition becomes false, and the loop ends.

    * Loop Execution:
        First iteration: i = 1, j = 5, prints "i: 1, j: 5"
        Second iteration: i = 2, j = 4, prints "i: 2, j: 4"
        Third iteration: i = 3, j = 3, prints "i: 3, j: 3"
        Fourth iteration: i = 4, j = 2, prints "i: 4, j: 2"
        Fifth iteration: i = 5, j = 1, prints "i: 5, j: 1"
        Sixth iteration: i = 6, condition i <= 5 is false, so the loop exits.

    Note: The loop control variables i and j are updated after each iteration to make them ready for the next iteration.

    *OUTPUT:
                i: 0, j: 10
                i: 1, j: 9
                i: 2, j: 8
                i: 3, j: 7
                i: 4, j: 6
 */
/* EXPLAIN THE CODE BELOW:

for (int i = 0; i < numeros.length - 1; i++) {
    for (int j = i + 1; j < numeros.length; j++) {
        if (numeros[i] < numeros[j]) {
            int temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        }
    }
}

* Outer Loop (for (int i = 0; i < numeros.length - 1; i++)):

    * This loop goes through each element in the numeros array, except the very last element.
        - The variable i is the index of the "current" element we’re comparing in the numeros array.
        - We stop at numeros.length - 1 because each element will have been compared with all elements that come after it by the time the outer loop finishes.
        - Inner Loop (for (int j = i + 1; j < numeros.length; j++)):

    * For each element at index i in the outer loop, the inner loop (with j as the index) compares this element to each subsequent element in the array.
        - The inner loop starts at i + 1, which means it begins right after the element at index i, and goes until the end of the array (numeros.length).
        - This ensures that each pair of elements is compared only once, making the sort more efficient.
        - Condition (if (numeros[i] < numeros[j])):

    * This condition checks if the element at index i is less than the element at index j.
        - Since we want to sort in descending order, we are looking for cases where numeros[i] < numeros[j]. If this condition is true, it means the 
        element at j is larger and should come before the element at i.
    
    * Swapping Elements:
        - If numeros[i] is less than numeros[j], we swap them so that the larger number (numeros[j]) comes before the smaller number (numeros[i]).
        - This swapping is done using a temporary variable (temp), which holds the value of numeros[i] temporarily while we assign numeros[j] to numeros[i]. 
        Then, we put the value of temp (original numeros[i]) into numeros[j].
        - This way, the two values are swapped, moving the larger number to the i position.
    
    OUTER LOOP i = 0: 
        * Inner Loop j = 1: Compares numeros[0] (3) with numeros[1] (1). Since 3 > 1, no swap occurs.
        * Inner Loop j = 2: Compares numeros[0] (3) with numeros[2] (4). Since 3 < 4, a swap occurs. The array now looks like:
            Ex. {4, 1, 3, 2}
        * Inner Loop j = 3: Compares numeros[0] (4) with numeros[3] (2). Since 4 > 2, no swap occurs.
    
    OUTER LOOP i = 1:
        *Inner Loop j = 2: Compares numeros[1] (1) with numeros[2] (3). Since 1 < 3, a swap occurs. The array now looks like:
            Ex. {4, 3, 1, 2}
    
    OUTER LOOP i = 2:
        * Inner Loop j = 3: Compares numeros[2] (1) with numeros[3] (2). Since 1 < 2, a swap occurs. The array now looks like:
            Ex. {4, 3, 2, 1}
    
    OUTER LOOP i = 3: 
        *The inner loop doesn’t run because there are no elements left to compare.
        * After these iterations, the array is fully sorted in descending order: {4, 3, 2, 1}.
    
    In Java, numeros.length is used to get the length (or the number of elements) in the array named numeros.
        - Here’s a breakdown:
            * Array Length: Every array in Java has a property called length, which holds the size of the array — that is, the number of elements it can hold.
            * In the example code, numeros.length returns the number of elements in the numeros array.
            * numeros.length - 1 in the outer loop ensures the loop stops before the last element, as the last element doesn’t need to be compared with itself.
            * numeros.length in the inner loop ensures that j can go up to the last element.
            * By using numeros.length, the code works for arrays of any size, not just for a specific length like 10 or 20. This way, you don’t have to hard-code 
            the array length, which makes the code more flexible and adaptable to arrays of varying sizes.
 */