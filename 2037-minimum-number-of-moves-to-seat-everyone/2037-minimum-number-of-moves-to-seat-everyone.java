class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<students.length;i++){
            sum+=Math.abs(students[i]-seats[i]);
        }
        return sum;
    }
}