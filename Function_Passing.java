class Function_Passing {

  // calculate the sum
  public int add(int a, int b) {

    // calculate sum
    int sum = a + b;
    return sum;
  }

  // calculate the square
  public void square(int num) {
    int result = num * num;
    System.out.println(result);    // prints 576
  }
  public static void main(String[] args) {

    Function_Passing obj = new Function_Passing();

    // call the square() method
    // passing add() as parameter
    obj.square(obj.add(15, 9));

  }
}