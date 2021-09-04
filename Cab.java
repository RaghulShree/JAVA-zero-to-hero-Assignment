import java.util.Scanner;
class Cab {
    int fare;
    int d;
   

    public Cab(){
        fare=30;
    }

    public Cab(int amt){
        fare = amt;
    }    
    void showfare(){
        System.out.println("Total  fare: RS "+ fare);
    }
}
class RideCab{
public static void main(String[] args){
    int cd;
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the distance for user:");
    cd = sc.nextInt();
    if(cd > 5){
        Cab ob = new Cab(30+10*(cd - 5));
        System.out.println("Enter the distance travelled:");
        ob.d = sc.nextInt();
        ob.fare = ob.fare + 10 * ob.d;
        ob.showfare ();
    }
    else{
        Cab ob = new Cab();
        System.out.println("Enter the distance travelled:");
        ob.d = sc.nextInt();
        ob.fare = ob.fare + 10*ob.d;
        ob.showfare ();
    }
  }
}