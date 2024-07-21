package com.shape;

public class cylinder extends shape{
    cylinder(int dim1, int dim2){
        super(dim1, dim2);
    }
    public int area(){
        return 2 * this.dim1 * (this.dim2 +this.dim1);
    }
}
