//Date
package ie.gmit;

public class Calculator {
    public Calculator()
    {
    }

    public int subtract(int firstNum, int secondNum) {
        if (firstNum >= 0 && firstNum < 1000)
        {
            int result = firstNum - secondNum;
            return result;
        }
        else
        {
            String message = "Invalid input";
            throw new IllegalArgumentException(message);
        }
    }








    /*
    public void validate(int number)
    {
      if (number >= 0 && number < 1000)
      {
      }
      else
      {
          String message = "Invalid input" + number;
        throw new IllegalArgumentException(message);
      }
    }


     */
}
