class Volume{
    double length,width,height;
    //construtor overloading
    Volume(int l,int w,int h){
        length = l;
        width = w;
        height = h;
    }
    Volume(int l){
        length = width = height = l;
    }
    double print(){
        return length * width * height ;
    }
    //changing number of parameters and type of paramters
    int csa(int l,int w){
        int p = l * w ;
        return p;
    }
    double csa(double l){
        double p = l* l;
        return p;
    }
}
public class Q1{
    public static void main(String[] args) {
        Volume cuboid = new Volume(1,2,3);
        Volume cube = new Volume(2);

        System.out.println("Volume of Cuboid: "+cuboid.print());
        System.out.println("Volume of Cube: " +cube.print());
        System.out.println("CSA of Cuboid : " +cuboid.csa(1,2));
        System.out.println("CSA of Cube : " +cube.csa(2));

    }
}