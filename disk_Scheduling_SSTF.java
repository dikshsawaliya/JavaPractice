class node {


    int distance = 0;
    boolean accessed = false;
}

public class disk_Scheduling_SSTF {


    public static void calcDiff(int queue[],
                                           int head, node diff[])

    {
        for (int i = 0; i < diff.length; i++)
            diff[i].distance = Math.abs(queue[i] - head);
    }


    public static int findingMinimum(node diff[])
    {
        int index = -1, minimum = Integer.MAX_VALUE;

        for (int i = 0; i < diff.length; i++) {
            if (!diff[i].accessed && minimum > diff[i].distance) {

                minimum = diff[i].distance;
                index = i;
            }
        }
        return index;
    }

    public static void sstf(int request[],
                                             int head)

    {
        if (request.length == 0)
            return;

        node diff[] = new node[request.length];

        for (int i = 0; i < diff.length; i++)

            diff[i] = new node();

        int seek_count = 0;

        int[] seek_sequence = new int[request.length + 1];

        for (int i = 0; i < request.length; i++) {

            seek_sequence[i] = head;
            calcDiff(request, head, diff);

            int index = findingMinimum(diff);

            diff[index].accessed = true;

            seek_count += diff[index].distance;

            head = request[index];
        }

        seek_sequence[seek_sequence.length - 1] = head;

        System.out.println("Total Seek Operations : "
                + seek_count);

        System.out.println("Your Seek Sequence Will be : ");

        for (int i = 0; i < seek_sequence.length; i++)
            System.out.println(seek_sequence[i]);
    }

    public static void main(String[] args)
    {
        int arr[] = { 82,170,43,140,24,16,190 };
        sstf(arr, 50);
    }
}