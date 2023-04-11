package Part2_wrappers;

public class main {
    public static void main(String[] args) {
        //2. Use valueOf
        Integer intObj = Integer.valueOf(5);
        Double doubleObj = Double.valueOf(11.04);
        Boolean boolObj = Boolean.valueOf(true);
        Character charObj = Character.valueOf('v');

        //3. Use parseInt
        String str = "3536";
        int intVal = Integer.parseInt(str);

        //4. Use intValue and doubleValue
        int  i = intObj.intValue();
        double k = doubleObj.doubleValue();

        //5. Use method toString
        String intStr = intObj.toString();
        String doubleStr = doubleObj.toString();

        //6. Use hashCode
        int intHash = intObj.hashCode();
        int doubleHash = doubleObj.hashCode();
        int boolHash = boolObj.hashCode();
        int charHash = charObj.hashCode();

        //7. Use compareTo
        Integer a = Integer.valueOf(8);
        Integer b = Integer.valueOf(12);
        int compareInt = a.compareTo(b);
        int compareStr = "hat".compareTo("cat");

        //8. Compare outputs
        Integer x = Integer.valueOf(2);
        Integer y = Integer.valueOf(7);
        int sumInts = x + y;
        String sumStrings = x.toString() + y.toString();


        System.out.println("intObj: " + intObj);
        System.out.println("doubleObj: " + doubleObj);
        System.out.println("boolObj: " + boolObj);
        System.out.println("charObj: " + charObj);
        System.out.println("intVal: " + intVal);
        System.out.println("int: " + i);
        System.out.println("double: " + k);
        System.out.println("intStr: " + intStr);
        System.out.println("doubleStr: " + doubleStr);
        System.out.println("intHash: " + intHash);
        System.out.println("doubleHash: " + doubleHash);
        System.out.println("boolHash: " + boolHash);
        System.out.println("charHash: " + charHash);
        System.out.println("compareInt: " + compareInt);
        System.out.println("compareStrings: " + compareStr);
        System.out.println("sumInts: " + sumInts);
        System.out.println("sumStrings: " + sumStrings);
            }
        }


