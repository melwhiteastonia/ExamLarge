//Melanie WHite
//Melanie WHite
//Melanie White
public class Main 
{
  public static void main(String[] args)
  
  {
    Range my_Range = new Range(1,10);

    
   	System.out.println("Is the number 5 within the range 1-10? : " + my_Range.contains(5));

    System.out.println("Is the number 11 within the range 1-10? : " + my_Range.contains(11));

    System.out.println("How many integers are in the range 1-10? : " + my_Range.size());

     Range other = new Range(9,15);

    System.out.println("How many integers are in the range 9-15? : " + other.size());

    System.out.println("Does the aforementioned range overlap with the range 1-10? : " + my_Range.overlaps(other));

    Range other2 = new Range(16,17);

    System.out.println("Does the range 16-17 overlap with the range 9-15? : " + other.overlaps(other2));






			
		}

    
    

   
  
}

/*
 * A Range represents an integer range, such as
 * 1-10 or 50701-50799. The lower and upper bounds of
 * a Range are given at the time the object is created.
 */
