package kjd
//adding var to the constructor params creates the prop and initializes them with the coming value
class Point(val x:Int, val y:Int)

/*
//equivalent of the code above
class Point{
    private int x, y;

    class Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}
* */