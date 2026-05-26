public class Problem4 extends VersionControl{
    Problem4(int n, int first){
        super(n,first);
    }

    public int firstBadVersion(int n) {
        // write your code here
        return 0;
    }

    static void main(String[] args) {
        // test your code here
        int n = 1000;
        int first = 100;
        Problem4 problem4 = new Problem4(n,first);
        System.out.println(problem4.firstBadVersion(n)); // correct answer is 100
        System.out.println(problem4.getCount()+" API calls to isBadVersion()"); // minimize it
    }
}


/*
The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version);
*/

class VersionControl{ // not supposed to be changed
    private int n;
    private int firstBadVersion;
    private int count = 0;

    public VersionControl(int n, int firstBadVersion){
        this.n = n;
        this.firstBadVersion = firstBadVersion;
    }

    public boolean isBadVersion(int version){
        count++;
        return version>=firstBadVersion;
    }

    public int getCount() {
        return count;
    }
}
