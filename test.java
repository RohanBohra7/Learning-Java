// public class inheritance{
    //Single Inheritance
    class Vehicle
    {
        void StartEngine()
        {
            System.out.println("Engine Started");
        }
    }

    class Car extends Vehicle
        {
            void acceleration()
            {
                System.out.println("Car accelerating");
            }
        }
    public class test
    {
        public static void main(String[] args) {
            Car mycar=new Car();
            mycar.StartEngine();
            mycar.acceleration();
        }
    }

