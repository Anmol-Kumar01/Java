package MyPackages;
import MyPackages.datastructures.*;
import MyPackages.search.*;
import MyPackages.sort.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        Scanner scnr = new Scanner(System.in);
        System.out.println("What do you want to do ?");
        System.out.println("1. Searching \n2. Sorting\n3. Data Structures ");
        System.out.println();
        int in = scnr.nextInt();
        if (in==1){
            System.out.println("Which Algorithm you want to apply :\n1. Linear Search\n2. Binary Search");
            System.out.println();
            int searchInput = scnr.nextInt();
            if (searchInput==1){
                System.out.println("Enter the SIZE of your Array ");
                int inputSize = scnr.nextInt();
                int[] arr = new int[inputSize];
                int i=0;
                while (i<inputSize) {
                    System.out.println("Enter "+ i +"th index element of Array:  ");
                    arr[i] = scnr.nextInt();
                    i++;
                }
                System.out.println();
                System.out.println("Which Element you want to Search : ");
                int target = scnr.nextInt();
                LinearSearch linearSearch = new LinearSearch();
                int output = linearSearch.linearSearch(arr, target);
                if (output!=-1){
                    System.out.println("Element found at: "+ output+"th index in the Array");
                }
                else{
                    System.out.println("Element not found in the array");
                }
            }
            else if (searchInput==2){
                System.out.println("Enter the SIZE of your Array ");
                int inputSize = scnr.nextInt();
                int[] arr = new int[inputSize];
                System.out.println("Enter the Arrays Elements in sorted manner: ");
                int i=0;
                while (i<inputSize) {
                    System.out.println("Enter "+ i +"th index element of Array:");
                    arr[i] = scnr.nextInt();
                    i++;
                }
                System.out.println();
                System.out.println("Which Element you to Search : ");
                int target = scnr.nextInt();
                QuickSort qs = new QuickSort();
                qs.quickSort(arr, 0, arr.length-1);
                System.out.print("Input Array : ");
                for( int sss = 0; sss<arr.length; sss++){
                    System.out.print(arr[sss]+" ");
                }
                BinarySearch binarySearch = new BinarySearch();
                int output = binarySearch.binarySearch(arr, target);
                if (output!=-1){
                    System.out.println("Element found at: "+ output+"th index in the Array");
                }
                else{
                    System.out.println("Element not found in the array");
                }
            }
            else{
                System.out.println("Invalid Input ");
                System.exit(0);
            }
        }
        else if (in==2){
            System.out.println("Enter the SIZE of Your :");
            int inputSize = scnr.nextInt();
            int[] arr = new int[inputSize];
            int i=0;
            while (i<inputSize) {
                System.out.println("Enter "+ i +"th index element of Array:");
                arr[i] = scnr.nextInt();
                i++;
            }
            System.out.println();
            System.out.println("Input Array : ");
            for( int input = 0; input< arr.length; input++){
                System.out.print(arr[input]+" ");
            }
            System.out.println();

            System.out.println("Which Sorting Algorithm you want ?:\n1. Quick Sort\n2. Merge Sort\n3. Selection sort\n4. Insertion Sort\n5. Bubble Sort");
            int sortType = scnr.nextInt();
            if (sortType==5){
                BubbleSort bs = new BubbleSort();
                int[] num2 = bs.bubbleSort(arr);
                System.out.println("Your Array has been Sorted using Bubble Sort : ");
                for( int bsk = 0; bsk< num2.length; bsk++){
                    System.out.print(num2[bsk]+" ");
                }
            }
            else if (sortType==4){
                InsertionSort iss = new InsertionSort();
                iss.insertionSort(arr);
                System.out.println("Your Array has been Sorted using Insertion Sort : ");
                for( int isk = 0; isk< arr.length; isk++){
                    System.out.print(arr[isk]+" ");
                }
            }
            else if (sortType==3){
                SelectionSort ss = new SelectionSort();
                int[] selarr2 = ss.selectionSort(arr);
                System.out.println("Your Array has been Sorted using Selection Sort : ");
                for( int ssk = 0; ssk< selarr2.length; ssk++){
                    System.out.print(selarr2[ssk]+" ");
                }
            }
            else if (sortType==2){
                MergeSort ms = new MergeSort();
                ms.mergeSort(arr, 0, arr.length-1);
                System.out.println("Your Array has been Sorted using Merge Sort : ");
                for( int msk  = 0; msk<arr.length; msk++){
                    System.out.print(arr[msk]+" ");
                }
            }
            else if (sortType==1){
                QuickSort qs = new QuickSort();
                qs.quickSort(arr, 0, arr.length-1);
                System.out.println("Your Array has been Sorted using Quick Sort : ");
                for( int qsk  = 0; qsk<arr.length; qsk++){
                    System.out.print(arr[qsk]+" ");
                }
            }
            else{
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        else if (in==3){
                System.out.println("Which Data Structure You want ? ");
                System.out.println();
                System.out.println("Enter : \n1. Stack\n2. Queue\n3. LinkedList");
                int inp = scnr.nextInt();
                if (inp==1){
                System.out.println("You have Choosen Stack : ");
                System.out.println();
                Stack st = new Stack(10);
                while (true) {
                    System.out.println("Which Operation you want to perform\n1. Push\n2. Pop\n3. isEmpty \n4. Peek\n5. Size");
                    int st_inpt = scnr.nextInt();
                    if(st_inpt==1){
                        System.out.println("Enter Element want to push ");
                        int ele = scnr.nextInt();
                        st.push(ele);
                    }
                    else if(st_inpt==2){
                        int ele = st.pop();
                        if (ele!=-1){
                            System.out.println("Your Popped Out Element: "+ele);
                        }
                        else{
                            continue;
                        }   
                    }
                    else if(st_inpt==4){
                        int peek = st.peek();
                        System.out.println("Peek of Stack: "+ peek);
                    }
                    else if(st_inpt==5){
                        int size = st.size();
                        System.out.println("Size of Stack: "+ size);
                    }
                    else if(st_inpt==3){
                        boolean empt = st.isEmpty();
                        if (empt){
                            System.out.println("Your Queue is empty");
                        }else{
                            System.out.println("Your Queue is not empty");
                        }
                    }
                    else{
                        System.out.println("Invalid input");
                        break;
                    }
                }
            }
            else if (inp==2){
                System.out.println("You have choosen Queue");
                System.out.println();
                System.out.println("Enter the SIZE of the Queue : ");
                int size = scnr.nextInt();
                Queue qu = new Queue(size);
                while (true) {
                    System.out.println();
                    System.out.println("Which Operation you want to Perform\n1. Enqueue\n2. Dequeue\n3. isEmpty\n4. Display Queue");
                    int qu_inpt = scnr.nextInt();

                    if(qu_inpt==1){
                        System.out.println("Enter the element you want to enqueued int Queue");
                        int ele = scnr.nextInt();
                        qu.enQueue(ele);
                    }
                    else if(qu_inpt==2){
                        qu.deQueue();
                    }
                    else if(qu_inpt==3){
                        boolean empty = qu.isEmpty();
                        if (empty){
                            System.out.println("Currently Queue is empty");
                        }else{
                            System.out.println("Curently Queue is not empty");
                        }
                    }
                    else if(qu_inpt==4){
                        boolean empty = qu.isEmpty();
                        if (empty){
                            System.out.println("Currently Queue is empty");
                        }else{
                            qu.show();
                        }
                    }
                    else{
                        System.out.println("Invalid input");
                        break;
                    }
                }
            }
            // LINKEDLIST
            else if (inp==3){
                System.out.println("You have choosen Linked List");
                LinkedList ls = new LinkedList();
                while (true) {
                    System.out.println();
                    System.out.println("Which Operation you want to perform \n1. Add First\n2. Add Last\n3. Delete First\n4. Delete Last\n5. Add at Position\n6. Size of Linked List\n7. Viewing all Linked List");
                    int link_inpt = scnr.nextInt();

                    if(link_inpt==1){
                        System.out.println("Enter Element you want to Add at First");
                        int ele = scnr.nextInt();
                        ls.insertNodeAtFirst(ele);
                    }
                    else if(link_inpt==2){
                        System.out.println("Enter Element you want to Add at Last");
                        int ele = scnr.nextInt();
                        ls.insertNodeAtLast(ele);
                    }
                    else if(link_inpt==3){
                        ls.deleteAtFirst();
                    }
                    else if(link_inpt==4){
                        ls.deleteAtLast();
                    }
                    else if(link_inpt==5){
                        System.out.println("Enter the Element you want to add");
                        int ele = scnr.nextInt();
                        System.out.println("Enter the Position Where you want to add Element ");
                        int pos = scnr.nextInt();
                        ls.insertNodeAtPosition(ele, pos);
                    }
                    else if(link_inpt==6){
                        int size = ls.getSize();
                        System.out.println("SIZE of the LinkedList is: "+ size);
                    }
                    else if(link_inpt==7){
                        System.out.println("Your Linked List");
                        ls.showElements();
                    }
                    else{
                        System.out.println("Invalid input");
                        break;
                    }
                    
                }
    
            }
        }
        else{
            System.out.println();
            System.out.println("You have Entered an Invalid input,\nPlease Run the Program Again ");
            System.exit(0);
        }
        scnr.close();
    }
    
}