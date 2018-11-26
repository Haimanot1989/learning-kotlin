package kjd
//adding var to the constructor params creates the prop and initializes them with the coming value
class Point(var x:Int, var y:Int)

/*
//equivalent of the code above
class Point{
    int x, y;

    class Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
* */