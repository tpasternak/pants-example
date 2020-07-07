for i in $(seq 1 60000);
	 do

x=$(
cat <<EOF
package lib;
public class HelloWorld$i {
    public static void main(String[] args) {
        for (String msg : com.com1.Hellos.hellos()) {
            System.out.println(msg);
        }
    }

    public int main0(String[] args) {
    	   return 0;
    }

    public int main1(String[] args) {
    	   return 0;
    }

    public int main2(String[] args) {
    	   return 0;
    }

    public int main3(String[] args) {
    	   return 0;
    }
    public int main4(String[] args) {
    	   return 0;
    }
    public int main5(String[] args) {
    	   return 0;
    }
    public int main6(String[] args) {
    	   return 0;
    }
    public int main7(String[] args) {
    	   return 0;
    }
    public int main8(String[] args) {
    	   return 0;
    }
    public int main9(String[] args) {
    	   return 0;
    }
    public int main10(String[] args) {
    	   return 0;
    }
    public int main11(String[] args) {
    	   return 0;
    }
    public int main12(String[] args) {
    	   return 0;
    }
    public int main13(String[] args) {
    	   return 0;
    }
    public int main14(String[] args) {
    	   return 0;
    }
    public int main15(String[] args) {
    	   return 0;
    }
    public int main16(String[] args) {
    	   return 0;
    }







    public int mainmain0(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }

    public int mainmain1(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }

    public int mainmain2(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }

    public int mainmain3(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain4(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain5(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain6(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain7(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain8(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain9(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain10(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain11(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain12(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain13(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain14(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain15(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }
    public int mainmain16(String[] args) {
    	   return main1() + main2() + main3() + main4() + main5();;
    }

















}

EOF
 )
printf "$x" > HelloWorld$i.java
done

