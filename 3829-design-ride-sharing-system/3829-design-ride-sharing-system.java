class RideSharingSystem {
    Queue<Integer> rider;
    Queue<Integer> driver;
    Queue<Integer> te;

    public RideSharingSystem() {
        rider=new LinkedList<>();
        driver=new LinkedList<>();
        te=new LinkedList<>();
    }
    
    public void addRider(int riderId) {
        rider.add(riderId);
    }
    
    public void addDriver(int driverId) {
        driver.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(!rider.isEmpty() && !driver.isEmpty()){
            int a=driver.remove();
            int b=rider.remove();
            return new int[]{a,b};
        }
        return new int[]{-1,-1};
    }
    
    public void cancelRider(int riderId) {
        if(rider.contains(riderId)){
            while(!rider.isEmpty() && rider.peek()!=riderId){
                te.add(rider.remove());
            }
            int x=rider.remove();
            while(!rider.isEmpty()){
                te.add(rider.remove());
            }
            while(!te.isEmpty()){
                rider.add(te.remove());
            }
        }
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna