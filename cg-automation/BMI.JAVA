class BMI {
        public static void main(String[] args) {
        double weight=60;
        double height =150;
        double bmi=(weight / (height*height))*10000;
             if(bmi>=30 && bmi<=39.9) {
                      System.out.println("you are in a obese range");
                      }
             else if(bmi>=25 && bmi<=29.9) {
                      System.out.println(" you are in a overweight range");
                      }
             else if (bmi>=18.5 && bmi<=24.9) {
                      System.out.println("you are in a healthy weight range");
                      }
             else if(bmi<=18.5) {
                      System.out.println("you are under weight range");
                      }
             else {
                      System.out.println("invalid");
                  }   
        System.out.println("bmi is "+bmi);
        }
}