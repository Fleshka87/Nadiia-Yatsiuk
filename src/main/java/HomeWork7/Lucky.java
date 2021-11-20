package HomeWork7;
    import java.util.Random;


    public class Lucky {

        public boolean checkInteger(int [] array, int index) throws ExceptionForLucky, ExceptionArrayLength {

           if (array == null)
               throw new ExceptionForLucky();
            if (index > array.length)
                throw new ExceptionArrayLength();
            if (index < 0)
                throw new ExceptionArrayLength();

            int indexRandom = array[index];

            if (indexRandom % 2 == 0)
            {
                System.out.println("I am lucky");
                return true;
            }
                System.out.println("try again");
                return false;


        }
    }


