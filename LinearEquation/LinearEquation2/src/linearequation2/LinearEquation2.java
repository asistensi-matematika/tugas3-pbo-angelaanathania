/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearequation2;

/**
 *
 * @author AJO
 */
public class LinearEquation2 {
private int a;
private int b;
private int c;
private int d;
private int e;
private int f;
private double g;
private double h;
private double i;


public LinearEquation2(){
   return;
}

    public LinearEquation2(int a, int b, int c, int d, int e, int f, double g, double h, double i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
public int getA(){
    return this.a;    
}

public void setA(int a){
    this.a = a;
}

public int getB(){
    return this.b;    
}

public void setB(int b){
    this.b = b;
}

public int getC(){
    return this.c;    
}

public void setC(int c){
    this.c = c;
}

public int getD(){
    return this.d;    
}

public void setD(int d){
    this.d = d;
}

public int getE(){
    return this.e;    
}

public void setE(int e){
    this.e = e;
}

public int getF(){
    return this.f;    
}

public void setF(int f){
    this.f = f;
}

public double getG(){
    return this.g;    
}

public void setG(double g){
    this.g = g;
}

public double getH(){
    return this.h;    
}

public void setH(double h){
    this.h = h;
}

public double getI(){
    return this.i;    
}

public void setI(double i){
    this.i = i;
}

public void cekSolusi(){
    if ((((a*d)-(b*c))==0)||(((a*f)-(b*e))==0)||(((c*f)-(d*e))==0)){
     System.out.println("Sistem Persamaannya : ");
     System.out.println(a+"x"+" + "+ b+"y"+" = "+g);
     System.out.println(c+"x"+" + "+ d+"y"+" = "+h);
     System.out.println(e+"x"+" + "+ f+"y"+" = "+i );
     System.out.println("\nHasilnya : ");
     System.out.println("Sistem tidak memiliki penyelesaian.");
    }else{
        double x1 = ((g*d)-(b*h))/((a*d)-(b*c));
        double y1 = ((a*h)-(g*c))/((a*d)-(b*c));
        double x2 = ((g*f)-(b*i))/((a*f)-(b*e));
        double y2 = ((a*i)-(g*e))/((a*f)-(b*e));
        double x3 = ((h*f)-(d*i))/((c*f)-(d*e));
        double y3 = ((c*i)-(h*e))/((c*f)-(d*e));
     System.out.println("Sistem Persamaannya : ");
     System.out.println(a+"x"+" + "+ b+"y"+" = "+g);
     System.out.println(c+"x"+" + "+ d+"y"+" = "+h);
     System.out.println(e+"x"+" + "+ f+"y"+" = "+i );
     System.out.println("\nHasilnya : ");
     System.out.printf("x = %.2f ",x1);
     System.out.printf(", y = %.2f ",y1);
     System.out.printf("\nx = %.2f ",x2);
     System.out.printf(", y = %.2f ",y2);
     System.out.printf("\nx = %.2f ",x3);
     System.out.printf(", y = %.2f ",y3);
    }
}
        
    public static void main(String[] args) {
        LinearEquation2 angka = new LinearEquation2();
        angka.setA(2);
        angka.setB(3);
        angka.setC(5);
        angka.setD(-6);
        angka.setE(7);
        angka.setF(2);
        angka.setG(8);
        angka.setH(2);
        angka.setI(0);
        angka.cekSolusi();
    }
    
}

