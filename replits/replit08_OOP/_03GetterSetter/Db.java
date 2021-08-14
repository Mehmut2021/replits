package replit08_OOP._03GetterSetter;

public class Db {
    // Do not touch
    public Db(String data, int yint) {
        this.data = data;
        this.yint = yint;
    }
    // Do not touch

    // write your codes here

    private String data;
    private int yint;

    public String getData(){
        return data;
    }

    public int getYint() {
        return yint;
    }

    public void setData(String data){
        this.data = data;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}
/*
The `Db` class will have two private instance variables.
Create those variables and provide public getters and setters for them.
Note: A constructor is provided.
>Instance variables:
   - data (String)
   - name: yint (int)
> Methods:
    - getData()
    - getYint()
    - setData()
    - setYint()
Example:
```
 Db db = new Db("aaa",123);
 System.out.println(db.getData());//aaa
 System.out.println(db.getYint());//123
 db.setData("zzz");
 db.setYint(200);
 System.out.println(db.getData());//zzz
 System.out.println(db.getYint());//200
```
 */