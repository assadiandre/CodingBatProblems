public class Main {

    // Logic-1 > in1To10
    static public boolean in1To10(int n, boolean outsideMode) {
        return (outsideMode == false && n >= 1 && n <= 10 )? true : (n <= 1 && outsideMode)? true: (n >= 10 && outsideMode)? true: false;
    }

    // Logic-1 > answerCell
    static public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return (isAsleep)? false: (isMorning && isMom)? true: (isMorning)? false: true;
    }

    // Warmup-2 > stringBits
    static public String stringBits(String str) {
        String myString = "";
        for (int x = -1; x<=str.length(); x+=2){
            if (x - 1 >= 0) {
                myString = myString + str.substring(x -1,x);
            }
        }
        return myString;
    }

    // Warmup-2 > last2
    static public int last2(String str) {
        String myString = "";
        int myCount = -1;
        if (str.length() - 2 >= 0) {
            myString = str.substring(str.length() - 2,str.length());
        }
        for (int x = 0; x<= str.length(); x++){
            if ( x + 2 <= str.length() ) {
                if ( (str.substring(x,x+2)).equals(myString) ) {
                    myCount += 1;
                }
            }
        }
        return (myCount == -1)? 0: myCount ;
    }

    // Warmup-2 > stringTimes
    static public String stringTimes(String str, int n) {
        String newString = "";
        for (int x=0;x<n;x++){
            newString = newString + str;
        }
        return newString;
    }

    // String-3 > countYZ
    static public int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase() + " ";
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z')
                    && !Character.isLetter(str.charAt(i + 1))) {
                count++;
            }
        }
        return count;
    }

    // String-3 > withoutString
    static public String withoutString(String base, String remove) {
        String lowRemove = remove.toLowerCase();
        String upRemove = remove.toUpperCase();
        base = base.replace(lowRemove, "");
        base = base.replace(upRemove, "");
        base = base.replace(remove, "");
        return base;
    }

    // Array-2 > lucky13
    static public boolean lucky13(int[] nums) {
        for (int value:nums) {
            if (value == 1 || value == 3) {
                return false;
            }
        }
        return true;
    }

    // Array-2 > countEvens
    static public int countEvens(int[] nums) {
        int returnValue = 0;

        for (int item:nums) {

            if (item % 2 == 0) {
                returnValue++;
            }

        }
        return returnValue;
    }

    // String-1 > minCat
    static public String minCat(String a, String b) {
        if (a.length() == b.length() ) {
            return a + b;
        }
        else if (a.length() < b.length()){
            return a + b.substring(b.length() - a.length(),b.length());
        }
        else if (a.length() > b.length()) {
            return a.substring(a.length() - b.length(),a.length()) + b;
        }
        else {
            return "nothing";
        }
    }


    public static void main(String[] args) {
        System.out.println( in1To10(5, false) ); // → true
        System.out.println( answerCell(false, false, false) ); // → true
        System.out.println( stringBits("Hello") ); // → "Hlo"
        System.out.println( last2("hixxhi") ); // → 1
        System.out.println( stringTimes("Hi", 2) );  // → "HiHi"
        System.out.println( countYZ("fez day") ); //→ 2
        System.out.println( withoutString("Hello there", "llo") ); //→ "He there"
        System.out.println( lucky13(new int[]{0, 2, 4}) ); // → true
        System.out.println( countEvens(new int[]{2, 1, 2, 3, 4}) ); // → 3
        System.out.println( minCat("Hello", "Hi") ); // → "loHi"
    }


}
