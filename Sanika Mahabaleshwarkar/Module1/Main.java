

public class Main {
    
        static int firstNum = 15 , max;
        static int secondNum = 3;
        static int thirdNum = 10;
        static int fourthNum = 10;
        static int count = 0;
        static boolean ischeck=true;
        static int uAdd , uSub;
        static int firstBit , secondBit, thirdBit, fourthBit, leftShift, rightShift;
        static int sum = firstNum + secondNum + thirdNum;
        static String[] myHobbies = {"Dancing" , "Painting" , "Watching movies"};

// Arithmetic Operators        
public static void operators(){
        System.out.println(" Addition: " + (firstNum + secondNum));
        System.out.println(" Subtraction: " + (firstNum - secondNum));
        System.out.println(" Multiplication: " + (firstNum * secondNum));
        System.out.println(" Division: " + (firstNum / secondNum));
        System.out.println(" Mod: " + (firstNum % secondNum));

// Relational Operators

        if(firstNum > secondNum){
            System.out.println(firstNum + " is greater than " + secondNum);
        }
        if(secondNum < thirdNum){
            System.out.println(secondNum + " is less than " + thirdNum);
        }
        if(thirdNum == fourthNum){
            System.out.println(thirdNum + " is equal to" + fourthNum);
        }
        if(secondNum != thirdNum){
            System.out.println(secondNum + " is not equal to" + thirdNum);
        }

        if(thirdNum >= fourthNum){
            System.out.println(thirdNum + " is greater than or equal to" + fourthNum);
        }
        if(thirdNum <= fourthNum){
            System.out.println(thirdNum + " is less than or equal to" + fourthNum);
        }
// Logical Operators

        if(firstNum > secondNum && firstNum > thirdNum){
            System.out.println(firstNum + " is the largest number");
        }
        if(firstNum > secondNum || firstNum < thirdNum){
            System.out.println(firstNum + " is the largest number");
        }
        
        System.out.println(!ischeck);

// Assignment Operators
        System.out.println("Assigned a value : " + firstNum);
        thirdNum += sum;
        System.out.println(thirdNum);

        secondNum -= sum;
        System.out.println(secondNum);

        firstNum *= sum;
        System.out.println(firstNum);

        secondNum /= sum;
        System.out.println(secondNum);

        fourthNum %= sum;
        System.out.println(fourthNum);

// Bitwise Operators
    firstBit = firstNum & secondNum;
    System.out.println(" & operator :" + firstBit);

    secondBit = firstNum | secondNum;
    System.out.println(" | operator : " + secondBit);

    thirdBit = firstNum ^ secondNum;
    System.out.println(" ^ operator : " + thirdBit);

    fourthBit = ~ secondNum;
    System.out.println(" ~ operator : " + fourthBit);

// Unary Operators

        if(firstNum > secondNum){
            count++;
            System.out.println(count);
        }
        if(secondNum > thirdNum){
            count--;
            System.out.println(count);
        }
        if(!ischeck){
            System.out.println(ischeck);
        }
        uAdd = +firstNum;
        System.out.println("+" + uAdd);

        uSub = -firstNum;
        System.out.println("+" + uSub);

        leftShift = firstNum << secondNum;
        System.out.println("<< " + leftShift);

        rightShift = firstNum << secondNum;
        System.out.println(">> " + rightShift);
        
// Ternary Operator    
        max = (firstNum > secondNum) ? firstNum : secondNum;
        System.out.println("Largest number is: "+ max);
    
}



// LOOPS
public static void loops(){

// IF ELSE

if(firstNum > secondNum){
    System.out.println(firstNum + " is greater than " + secondNum);
}
else{
    System.out.println(firstNum + " is greater than " + secondNum);
}

// FOR LOOP

    for(int i=0;i<myHobbies.length;i++){
        System.out.println(myHobbies[i]);
    }
// FOR EACH LOOP

    for(String i : myHobbies){
        System.out.println(i + " ");
    }

// WHILE LOOP
while(secondNum > thirdNum){
    System.out.println("Second Number is less than Third Number");
}
    // DO WHILE LOOP
    int i = 0;
    do{
        System.out.println(myHobbies[i]);
        i++;
    } while(i<myHobbies.length);
}


public static int GenerateRandomNumber(){
    double randomNumber;
    randomNumber = Math.random();
    return (int)randomNumber;
}

public static void DaysWeek(int day){
    switch(day){
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
    }
}


public static void main(String[] args){
    operators();
    loops();
    int randomNumber = GenerateRandomNumber();
    DaysWeek(randomNumber);
}
}



