package replit08_OOP._04Calc2;

public class Calc {

    private String names;
    private int x, y, result;

    public int getResult(){
        return result;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void plus(){
        result = (x + y);
    }

    public void minus(){
        result = (x - y);
    }

}
/*
This assignment is another calculator class, but it will be encapsulated.
> Attributes
  - String: names
  - int: x, y, result
**Attributes should be encapsulated**
>Instance Methods:
   - getResult() - getter method for private `result`
   - setY(int y) - setter method for private `y`
   - setX(int x) - setter method for private `x`
   - void plus() - adds x and y (x+y) values and assigns to result
   - void minus() - subtracts x and y(x-y) values and assigns to result
Example:
```
  Calc a = new Calc();
  a.setX(10);
  a.setY(5);
  a.minus();
  System.out.println(a.getResult());
  prints: 5
  a.plus();
  System.out.println(a.getResult());
  prints: 15
```
 */