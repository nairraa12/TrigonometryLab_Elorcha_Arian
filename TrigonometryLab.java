
package trigonometrylab;

import java.util.Scanner;
import static java.lang.Math.*;   

public class TrigonometryLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        // Problem 1: TRIGONOMETRIC FUNCTION CALCULATOR
        
        System.out.println("\n=== TRIGONOMETRIC FUNCTION CALCULATOR ===");
        
        // Ask the user to input an angle in degrees
        System.out.print("Enter an angle in Degrees: ");
         double degrees = input.nextDouble();
         
        // Ask the user to choose a function
        System.out.println("Choose a function: ");
        System.out.println("1: Sine ");
        System.out.println("2: Cosine ");
        System.out.println("3: Tangent ");
        System.out.println("4: All three");
              
        System.out.println("Enter your Choice (1-4): ");
        int choice = input.nextInt();
        
        
        // Convert the angle from degrees to radians.      
        double radians = Math.toRadians(degrees);              
        double normalizedDegrees = ((degrees % 360) + 360) % 360;
               
        // Calculate and display selected functions using control structures
        if (choice == 1 || choice == 4) {
            System.out.println("Sine: " + Math.sin(radians));
        }        
        if (choice == 2 || choice == 4) {
            System.out.println("Cosine: " + Math.cos(radians));
        }        
        if (choice == 3 || choice == 4) {
            
        // Check if the angle is close to 90 or 270 (+/- 1 degree)           
        if ((normalizedDegrees >= 89 && normalizedDegrees <= 91) || (normalizedDegrees >= 269 && normalizedDegrees <= 271)) {
            System.out.println("Tangent: Warning! The value is undefined or close to undefined, near 90 or 270 degrees.");
        } else {
            System.out.println("Tangent: " + Math.tan(radians));               
        }        
        
        /*
       PROBLEM 1 - CRITICAL THINKING QUESTIONS

       1. Why do we need to convert angles from degrees to radians?
       Answer: Java's trigonometric functions use radians, so degrees must be converted
       to radians before using sin(), cos(), and tan().

       2. What makes tangent undefined at certain angles?
       Answer: Tangent is sin(theta) divided by cos(theta). When cosine is zero,
       division by zero occurs, making tangent undefined.

       3. How could you modify this program to also calculate reciprocal functions?
       Answer: I could add options 5, 6, and 7 to the menu for Cosecant, Secant, and Cotangent. 
       Then, compute them as (1 / Math.sin()), (1 / Math.cos()), and (1 / Math.tan()) respectively, 
       while adding checks to ensure the denominator is not zero.
       */
         
         
         
                 
        // Problem 2: ANGLE QUADRANT DETECTOR
               
        System.out.println("\n=== ANGLE QUADRANT DETECTOR ===");
        
        // Ask the user to input an angle in degrees
        System.out.print("Enter an angle in degrees: ");
        double angleInput = input.nextDouble();
        
        //Normalize the angle to a value betweeen 0 ang 360 degreees
        double normalizedAngle = angleInput % 360;

        if (normalizedAngle < 0) {
        normalizedAngle += 360;
        }

          System.out.println("Normalized angle: " + normalizedAngle + " degrees");
       
        //Handle angle that falls exactly on the axis
        if (normalizedAngle == 0.0){
          System.out.println("The angle is on the positive X-axis");
          System.out.println("Sine: 0");
          System.out.println("Cosine: Positive");
          System.out.println("Tangent: 0");

        } else if (normalizedAngle == 90.0){
          System.out.println("The angle is on the positive Y-axis");
          System.out.println("Sine: Positive");
          System.out.println("Cosine: 0");
          System.out.println("Tangent: Undefined");
        } else if (normalizedAngle ==180.0){
          System.out.println("The angle is on the negative X-axis");
          System.out.println("Sine: 0");
          System.out.println("Cosine: Negative");
          System.out.println("Tangent: 0");
        } else if (normalizedAngle == 270.0){
          System.out.println("The angle is on the negative Y-axis");
          System.out.println("Sine: Negative");
          System.out.println("Cosine: 0");
          System.out.println("Tangent: Undefined");
                
        //Determine which quadrant the angle falls into and display the signs  
        } else if (normalizedAngle > 0.0 && normalizedAngle < 90.0){
          System.out.println("The angle is in Quadrant I. ");
          System.out.println("Sine: Positive");
          System.out.println("Cosine: Positive");
          System.out.println("Tangent: Positive");
        } else if (normalizedAngle > 90.0 && normalizedAngle < 180.0){
          System.out.println("The angle is in Quadrant II. ");
          System.out.println("Sine: Positive");
          System.out.println("Cosine: Negative");
          System.out.println("Tangent: Negative");

        } else if (normalizedAngle > 180.0 && normalizedAngle < 270.0){
          System.out.println("The angle is in Quadrant III. ");
          System.out.println("Sine: Negative");
          System.out.println("Cosine: Negative");
          System.out.println("Tangent: Positive");

        } else if (normalizedAngle > 270.0 && normalizedAngle < 360.0){
          System.out.println("The angle is in Quadrant IV. ");
          System.out.println("Sine: Negative");
          System.out.println("Cosine: Positive");
          System.out.println("Tangent: Negative");
        }
        
        
        /* 
        PROBLEM 2 - CRITICAL THINKING QUESTIONS  
    
        1. Why is it important to normalize angles before determining their quadrant?
        Answer: Normalizing makes equivalent angles easier to compare by putting them
        within the standard 0° to 360° range.

        2. How does the sign of trigonometric functions change across different quadrants?
        Answer: The signs change depending on the quadrant. In Quadrant I all are
        positive, in Quadrant II sine is positive, in Quadrant III tangent is positive,
        and in Quadrant IV cosine is positive.
      
        3. What special considerations are needed for angles exactly on the axes?
        Answer: Angles on the axes are not inside a quadrant. Also, tangent is undefined
        at 90° and 270° because cosine is zero.
        */   
        
        
        
              
        // Problem 3: RIGHT TRIANGLE SOLVER
        
         System.out.println("\n=== RIGHT TRIANGLE SOLVER ===");        
         System.out.println("Choose the information you know:");
         System.out.println("1. Two sides");
         System.out.println("2. One side and one angle");
         System.out.print("Enter your choice: ");

        int triangleChoice = input.nextInt();

        double opposite = 0;
        double adjacent = 0;
        double hypotenuse = 0;
        double angleA = 0;
        double angleB = 0;
        double area = 0;

        if (triangleChoice == 1) {

          System.out.println("\nWhich two sides do you know?");
          System.out.println("1. Opposite and Adjacent");
          System.out.println("2. Opposite and Hypotenuse");
          System.out.println("3. Adjacent and Hypotenuse");

          System.out.print("Enter your choice: ");         
        int sideChoice = input.nextInt();
     
        if (sideChoice == 1) {

          System.out.print("Enter opposite side: ");
          opposite = input.nextDouble();

          System.out.print("Enter adjacent side: ");
          adjacent = input.nextDouble();

        if (opposite <= 0 || adjacent <= 0) {
          System.out.println("Invalid input. Side lengths must be positive.");

        } else {
            // Pythagorean theorem:
            // hypotenuse² = opposite² + adjacent²
            hypotenuse = sqrt(opposite * opposite + adjacent * adjacent);

            // Calculate the two acute angles.
            angleA = toDegrees(atan(opposite / adjacent));
            angleB = 90 - angleA;
            area = 0.5 * opposite * adjacent;
      
            System.out.println("\n--- Triangle Results ---");        
            System.out.println("Opposite: " + opposite);
            System.out.println("Adjacent: " + adjacent);
            System.out.println("Hypotenuse: " + hypotenuse);
            System.out.println("Angle A: " + angleA + " degrees");
            System.out.println("Angle B: " + angleB + " degrees");
            System.out.println("Right angle: 90 degrees");
            System.out.println("Area: " + area);
        }

        } else if (sideChoice == 2) {
          
            System.out.print("Enter opposite side: ");         
            opposite = input.nextDouble();
                      
            System.out.print("Enter hypotenuse: ");           
            hypotenuse = input.nextDouble();

        if (opposite <= 0 || hypotenuse <= 0) {       
            System.out.println("Invalid input. Side lengths must be positive.");

        } else if (opposite >= hypotenuse) {        
            System.out.println("Invalid triangle. The hypotenuse must be longer than the opposite side.");

        } else {
            adjacent = sqrt(hypotenuse * hypotenuse
                    - opposite * opposite);

            angleA = Math.toDegrees(Math.asin(opposite / hypotenuse));
            angleB = 90 - angleA;
            area = 0.5 * opposite * adjacent;

            System.out.println("\n--- Triangle Results ---");
            System.out.println("Opposite: " + opposite);
            System.out.println("Adjacent: " + adjacent);
            System.out.println("Hypotenuse: " + hypotenuse);
            System.out.println("Angle A: " + angleA + " degrees");
            System.out.println("Angle B: " + angleB + " degrees");
            System.out.println("Right angle: 90 degrees");
            System.out.println("Area: " + area);
        }

        } else if (sideChoice == 3) {        
            System.out.print("Enter adjacent side: ");       
            adjacent = input.nextDouble();
            
            System.out.print("Enter hypotenuse: ");       
            hypotenuse = input.nextDouble();

        if (adjacent <= 0 || hypotenuse <= 0) {
            System.out.println("Invalid input. Side lengths must be positive.");

        } else if (adjacent >= hypotenuse) {
            System.out.println("Invalid triangle. The hypotenuse must be longer than the adjacent side.");

        } else {
            opposite = sqrt(hypotenuse * hypotenuse
                    - adjacent * adjacent);

            angleA = Math.toDegrees(Math.acos(adjacent / hypotenuse));
            angleB = 90 - angleA;
            area = 0.5 * opposite * adjacent;

            System.out.println("\n--- Triangle Results ---");
            System.out.println("Opposite: " + opposite);
            System.out.println("Adjacent: " + adjacent);
            System.out.println("Hypotenuse: " + hypotenuse);
            System.out.println("Angle A: " + angleA + " degrees");
            System.out.println("Angle B: " + angleB + " degrees");
            System.out.println("Right angle: 90 degrees");
            System.out.println("Area: " + area);
        }  
        } else {       
            System.out.println("Invalid choice.");
    
        }   
        } else if (triangleChoice == 2) {   
            System.out.println("\nWhich side do you know?");    
            System.out.println("1. Opposite");   
            System.out.println("2. Adjacent");   
            System.out.println("3. Hypotenuse");
 
            System.out.print("Enter your choice: ");   
            int knownSideChoice = input.nextInt();
   
            System.out.print("Enter the known side: ");   
            double knownSide = input.nextDouble();
    
            System.out.print("Enter the known angle in degrees: ");   
            double knownAngle = input.nextDouble();
   
        if (knownSide <= 0) {      
            System.out.println("Invalid input. The side must be positive.");
    
        } else if (knownAngle <= 0 || knownAngle >= 90) {        
            System.out.println("Invalid angle. The angle must be greater than 0 and less than 90 degrees.");

        } else {  
           double radians3 = Math.toRadians(knownAngle);

        if (knownSideChoice == 1) {

            // sin(theta) = opposite / hypotenuse
            opposite = knownSide;
            hypotenuse = opposite / sin(radians3);
            // cos(theta) = adjacent / hypotenuse
            adjacent = hypotenuse * cos(radians3);

        } else if (knownSideChoice == 2) {

            // cos(theta) = adjacent / hypotenuse
            adjacent = knownSide;
            hypotenuse = adjacent / cos(radians3);
            // sin(theta) = opposite / hypotenuse
            opposite = hypotenuse * sin(radians3);

        } else if (knownSideChoice == 3) {

            // The hypotenuse is known.
            hypotenuse = knownSide;
            // sin(theta) = opposite / hypotenuse
            opposite = hypotenuse * sin(radians3);
            // cos(theta) = adjacent / hypotenuse
            adjacent = hypotenuse * cos(radians3);

        } else {
            System.out.println("Invalid side choice.");
            opposite = -1;
        }
        if (opposite > 0) {
            angleA = knownAngle;
            angleB = 90 - angleA;
            area = 0.5 * opposite * adjacent;

            System.out.println("\n--- Triangle Results ---");
            System.out.println("Opposite: " + opposite);
            System.out.println("Adjacent: " + adjacent);
            System.out.println("Hypotenuse: " + hypotenuse);
            System.out.println("Angle A: " + angleA + " degrees");
            System.out.println("Angle B: " + angleB + " degrees");
            System.out.println("Right angle: 90 degrees");
            System.out.println("Area: " + area);
        }
        }
        } else {
            System.out.println("Invalid choice.");
}


        /*

        PROBLEM 3 - CRITICAL THINKING QUESTIONS

        1. Why must we validate that angles in a right triangle are less than 90°?
        Answer: A right triangle already has one 90° angle. Therefore, its other two
        angles must both be greater than 0° and less than 90°.

        2. How does your program handle the different cases of known values?
        Answer: The program uses conditional statements to determine which sides or
        angle are known and then uses the appropriate trigonometric or Pythagorean
        formula to calculate the missing values.

        3. What would happen if a user entered values that don't form a valid right triangle?
        Answer: The program checks for invalid side lengths and invalid relationships
        between the sides. It displays an error instead of performing an invalid calculation.
        */                                               
      
      
        }        
        
        
        // Problem 4: TRIGONOMETRIC IDENTITY VERIFIER
        System.out.println("\n=== TRIGONOMETRIC IDENTITY VERIFIER ===");

        System.out.print("Enter an angle in degrees: ");
        double angle4 = input.nextDouble();
        double radians4 = Math.toRadians(angle4);

        // A small tolerance is used because floating-point calculations
        // may produce very small rounding differences.
        double tolerance = 0.000001;

        // Identity 1:
        // sin²(theta) + cos²(theta) = 1
        double left1 = sin(radians4) * sin(radians4)
        + cos(radians4) * cos(radians4);

        double right1 = 1;
        double difference1 = abs(left1 - right1);

        System.out.println("\nIdentity 1: sin²(theta) + cos²(theta) = 1");
        System.out.println("Left side: " + left1);
        System.out.println("Right side: " + right1);
  
        if (difference1 <= tolerance) {
        System.out.println("Identity holds true.");
  
        } else {
        System.out.println("Identity does not hold.");
        System.out.println("Difference: " + difference1); 
        }
        // Identity 2:
        // 1 + tan²(theta) = sec²(theta)  
        // sec(theta) = 1 / cos(theta)
   
        if (abs(cos(radians4)) < tolerance) {
        System.out.println("\nIdentity 2: 1 + tan²(theta) = sec²(theta)");
        System.out.println("Cannot verify this identity because tangent and secant are undefined or extremely large at this angle.");
  
        } else {     
        double left2 = 1 + tan(radians4) * tan(radians4);     
        double right2 = 1 / (cos(radians4) * cos(radians4));     
        double difference2 = abs(left2 - right2);
        
        System.out.println("\nIdentity 2: 1 + tan²(theta) = sec²(theta)");
        System.out.println("Left side: " + left2);
        System.out.println("Right side: " + right2);
  
        if (difference2 <= tolerance) {
        System.out.println("Identity holds true.");
   
        } else {
        System.out.println("Identity does not hold.");
        System.out.println("Difference: " + difference2);
    
        }  
        }
       // Identity 3:
       // sin(2theta) = 2sin(theta)cos(theta)
   
       double left3 = sin(2 * radians4);   
       double right3 = 2 * sin(radians4) * cos(radians4);    
       double difference3 = abs(left3 - right3);

       System.out.println("\nIdentity 3: sin(2theta) = 2sin(theta)cos(theta)");
       System.out.println("Left side: " + left3);
       System.out.println("Right side: " + right3);
   
       if (difference3 <= tolerance) {
       System.out.println("Identity holds true.");
    
       } else {
       System.out.println("Identity does not hold.");
       System.out.println("Difference: " + difference3);
       
       }


    
       /*   
       PROBLEM 4 - CRITICAL THINKING QUESTIONS  
       1. Why do we need a tolerance when comparing floating-point values?  
       Answer: Floating-point calculations can have very small rounding errors.    
       Therefore, two mathematically equal values may not be exactly equal in Java.
    
       2. Which identity might be most susceptible to floating-point precision issues and why?    
       Answer: The identity involving tangent and secant can have larger precision   
       issues near 90° and 270° because cosine is close to zero and the values of 
       tangent and secant become very large.
  
       3. How could you extend this program to verify more complex identities? 
       Answer: More identities could be added by calculating their left and right   
       sides and comparing them using the same tolerance.
       */
        
               
        
        // Problem 5
        

        System.out.println("\n=== WAVE PROPERTIES ANALYZER ===");
        
        System.out.print("Enter amplitude: ");
        double amplitude = input.nextDouble();
        System.out.print("Enter frequency: ");
        double frequency = input.nextDouble();
        System.out.print("Enter phase shift in degrees: ");
        double phaseDegrees = input.nextDouble();
        System.out.print("Enter time: ");
        double time = input.nextDouble();


        if (amplitude <= 0) {    
            System.out.println("Invalid amplitude. Amplitude must be positive.");

        } else if (frequency <= 0) {   
            System.out.println("Invalid frequency. Frequency must be positive.");

        } else if (time < 0) {   
            System.out.println("Invalid time. Time cannot be negative.");

        } else {

        // Convert phase shift from degrees to radians.
        double phaseRadians = toRadians(phaseDegrees);

        // Wave equation:
        // y = A sin(2*pi*f*t + phase)
        double waveAngle = 2 * PI * frequency * time + phaseRadians;   
        double waveValue = amplitude * sin(waveAngle);
        
        System.out.println("\n--- Wave Results ---");  
        System.out.println("Instantaneous value: " + waveValue);

        // Small tolerance for floating-point calculations.  
        double waveTolerance = 0.000001;

        // Determine whether the wave is at a peak, trough, or zero-crossing.
   
        if (abs(waveValue - amplitude) <= waveTolerance) {
       
            System.out.println("The wave is at a peak.");
   
        } else if (abs(waveValue + amplitude) <= waveTolerance) {       
            System.out.println("The wave is at a trough.");
  
        } else if (abs(waveValue) <= waveTolerance) {       
            System.out.println("The wave is at a zero-crossing.");
   
        } else {      
            System.out.println("The wave is not exactly at a peak, trough, or zero-crossing.");
    
        }

        // A sine wave reaches a peak when:
        // angle = PI/2 + 2*PI*k
        //
        // Solve:
        // 2*PI*f*t + phase = PI/2 + 2*PI*k
        // for the next time after the current time.]
        
        double currentCyclePosition =
            (waveAngle - PI / 2) / (2 * PI);
  
        double nextPeakCycle = ceil(currentCyclePosition + waveTolerance);   
        double nextPeakTime =
            ((PI / 2) + 2 * PI * nextPeakCycle - phaseRadians)
            / (2 * PI * frequency);

        // If the calculated peak is not after the current time,
        // move to the following peak.    
        if (nextPeakTime <= time + waveTolerance) {
        
         nextPeakCycle += 1;
         nextPeakTime =
                ((PI / 2) + 2 * PI * nextPeakCycle - phaseRadians)
                / (2 * PI * frequency);   
        }   
        System.out.println("Next peak time: " + nextPeakTime);


        /*
        PROBLEM 5 - CRITICAL THINKING QUESTIONS
        1. How did you determine if the wave is at a peak or trough?
        Answer: A sine wave reaches a peak when its value is equal to the amplitude
        and a trough when its value is equal to the negative amplitude. A small
        tolerance is used because of floating-point precision.

        2. What mathematical approach did you use to find the next peak?
        Answer: A sine wave reaches a peak when its angle is PI/2 + 2*PI*k.
        The wave equation was rearranged to solve for the next time that satisfies
        this condition.      
        
        3. How would you modify this program to handle non-sinusoidal waves?
        Answer: The program would need to use a different mathematical equation or
        model depending on the type of non-sinusoidal waveform.
        */
                                                           
        }                       
        input.close();
  
   }   
} 

 
