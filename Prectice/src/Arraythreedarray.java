//3-D array
public class Arraythreedarray {
    public static void main(String[] args) {
        int arr[][][]={{{50,51,52},{60,61,62}},
                {{70,71,72},{80,81,82}},
                {{65,66,67},{75,76,77}}};

        int dept,student,marks,tot =0;

        for (dept=0;dept<3;dept++){
            System.out.println("Department "+(dept+1)+" :");
            for(student=0;student<2;student++){
                System.out.print("Student "+(student+1)+" :");
                for (marks=0;marks<3;marks++){
                    System.out.print(arr[dept][student][marks] +" ");
                    tot = tot + arr[dept][student][marks];
                }
                System.out.println("Total :"+tot);
                tot =0;
            }
            System.out.println();
        }
    }

}
