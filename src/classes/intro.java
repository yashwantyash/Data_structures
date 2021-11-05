package classes;

class intro {
    public static void main(String args[]){
        box mybox = new box();
        double vol;
        mybox.width = 20.5;
        mybox.height = 15.5;
        mybox.depth = 10;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);
    }
}
class box{
    double width;
    double height;
    double depth;
}
