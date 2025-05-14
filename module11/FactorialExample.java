package module11;

class FactorialExample{

    public static int factorial(int n) {
        int f=1;
        for(int i=1; i<=n; i++){
            f = f * i;

        }
        return f;
    }
}

class BinCoeff{
    public  int binCoeff(int n, int r){
       
       int fact_n =  FactorialExample.factorial(n);
       int fact_r =  FactorialExample.factorial(r);
       int fact_nmr= FactorialExample.factorial(n-r);
        
       int binCoeff= fact_n /(fact_r * fact_nmr);
       return binCoeff;
    }
    public static void main(String[] args) {
        BinCoeff bin = new BinCoeff();
        
        System.out.println(bin.binCoeff(5,2));
    }
}

/*
 i  f  
 1  1
 2  2
 3  6

 */