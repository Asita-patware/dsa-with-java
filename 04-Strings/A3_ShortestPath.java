public class A3_ShortestPath {

    // Method to calculate shortest distance from origin
    public static float getShortestPath(String path){
        int x = 0, y = 0; // current coordinates

        for(int i = 0; i<path.length(); i++){
            char direction = path.charAt(i);

            // Move North
            if (direction == 'N') {
                y++;

            // Move South
            }else if (direction == 'S') {
                y--;
            
            // Move West
            }else if (direction == 'W') {
                x--;
            
            // Move East
            }else {
                x++;
            }
        }

        int X2 = x*x; 
        int Y2 = y*y;

        // distance = √(x² + y²)
        return (float)Math.sqrt(X2 + Y2);

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
