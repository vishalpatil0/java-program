/*
 * javac -d . create a folder of compiled file means .class files
 * -d is used for destination directory 
 * . is used for location
 * for this to work we have to mention the package name in our class java file
 * package com.zeal.vishal; 
 * com is directory which have zeal sub-direcotry which have vishal sub-directory
 *
    import com.zeal.vishal.BasicsOfPackage;
    public class Experiment1{
    public static void main(String[] args) {
            new BasicsOfPackage().show();
        }
    } 

    this is how we can use our package
*/

package com.zeal.vishal;

public class BasicsOfPackage {
    public void show(){
        System.out.println("showing form imported pakcage......");
    }
}
