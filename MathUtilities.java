 

public class MathUtilities{
    
  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd number
   * @return the sum of the two numbers
   */
  public Integer add(Integer baseValue, Integer valueToAdd){
      int x = baseValue;
      int y = valueToAdd;
      
      int sum = x + y;
      return sum;
  }

  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd second number
   * @return the sum of the two numbers
   */
  public Double add(Double baseValue, Double valueToAdd){
      double x = baseValue;
      double y = valueToAdd;
      
      double sum = x + y;
      return sum;
  }

  /**
   * Get half the value of the number
   * @param number the number given
   * @return the half of the number in double
   */
  public Double half(Integer number) {
      double x = number;
      double y = 2;
      
      double result = x / y;
      return result;
  }

  /**
   * Determine if the number is odd
   * @param number the number given
   * @return true if the number is odd, false if it is even
   */
  public Boolean isOdd(Integer number){
      if (number % 2 == 1){
          return true;
        }
        else{
            return false; 
        }
  }


  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public Integer square(Integer number) {
      int x = number;
      int y = number;
      
      int result = x * y;
      return result;
  }

}
