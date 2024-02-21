package Jobsheet2;

public class Dragon {
    int x, y, width, height;

    public Dragon(int x, int y, int width, int height){

    }

    void moveLeft(){
        if(x>0){
        x = x-1;}
        printPosition();
        detectCollision();
    }
    void moveRight(){
        if(x>width){
        x = x+1;}
        printPosition();
        detectCollision();
    }
    void moveUp(){
        if(y>0){
        y = y-1;}
        printPosition();
        detectCollision();
    }
    void moveDown(){
        if(y>height){
        y = y+1;}
        printPosition();
        detectCollision();
    }
    void printPosition(){
        System.out.printf("(%d, %d)",x,y);
    }
    void detectCollision(){
        if (x <= 0 || y <= 0 || x >= width || y >= height){
            System.out.println("Game Over");
        }
    }
    public static void main(String[] args) {
        Dragon d = new Dragon(10,10,25,25);
        d.printPosition();
        d.moveDown();
        d.moveLeft();

    }
}
