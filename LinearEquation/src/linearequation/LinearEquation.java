/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearequation;

/**
 *
 * @author AJO
 */
public class LinearEquation {
private double a;
private double b;
private double c;
private double d;
private double e;
private double f;

public LinearEquation(){
   return;
}

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
public double getA(){
    return this.a;    
}

public void setA(double a){
    this.a = a;
}

public double getB(){
    return this.b;    
}

public void setB(double b){
    this.b = b;
}

public double getC(){
    return this.c;    
}

public void setC(double c){
    this.c = c;
}

public double getD(){
    return this.d;    
}

public void setD(double d){
    this.d = d;
}

public double getE(){
    return this.e;    
}

public void setE(double e){
    this.e = e;
}

public double getF(){
    return this.f;    
}

public void setF(double f){
    this.f = f;
}

public void cekSolusi(){
    if (((a*d)-(b*c))==0){
     System.out.println("Sistem Persamaannya : ");
     System.out.println(a+"x"+" + "+ b+"y"+" = "+e);
     System.out.println(c+"x"+" + "+ d+"y"+" = "+f );
     System.out.println("\nHasilnya : ");
     System.out.println("Sistem tidak memiliki penyelesaian.");
     System.out.println("\n");
    }else{
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("Sistem Persamaannya : ");
        System.out.println(a+"x"+" + "+ b+"y"+" = "+e);
        System.out.println(c+"x"+" + "+ d+"y"+" = "+f);
        System.out.println("\nHasilnya : ");
        System.out.printf("x = %.2f ",x);
        System.out.printf(", y = %.2f ",y);
        System.out.println("\n ");
    }
}
        
    public static void main(String[] args) {
        LinearEquation angka = new LinearEquation();
        angka.setA(12);
        angka.setB(5);
        angka.setC(13);
        angka.setD(0);
        angka.setE(12);
        angka.setF(7);
        angka.cekSolusi();
        
        LinearEquation angka2 = new LinearEquation();
        angka2.setA(-18);
        angka2.setB(9);
        angka2.setC(10.5);
        angka2.setD(11);
        angka2.setE(0);
        angka2.setF(0);
        angka2.cekSolusi();   
    }
}
