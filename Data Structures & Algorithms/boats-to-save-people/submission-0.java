class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int light = 0, heavy = people.length - 1;
        int boats = 0;
        Arrays.sort(people);

        while(light <= heavy) {
            if(people[light] + people[heavy] <= limit) {
                light++;
            }
            heavy--;
            boats++;
        }
        return boats;
    }
}