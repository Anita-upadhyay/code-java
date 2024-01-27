    package oops;
 class encapsulation{
     private String name;
     private int id;
     private int ph;
     encapsulation( String name, int id,int ph) // constructor
     { this.id=id;
        this.name=name;             
        this.ph=ph;
      /* THis keyword refers to the current object in method or constructor . the main use of This pointer is eliminate the confusion between class attribute and parameters with same name . */
     }
     void print()
      {
        System.out.println("the information of person is :" + " =" + name +" " + id + " " + ph);
      }
      /*use of getter or setter for encapsulation we use getter for return the value and setter for upgrade the value and initilized the value.*/
       
       int getph()
       {
         return ph;
       }
        String getname()
        {
            return name;

        }
 }