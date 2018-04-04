public class UniqueSum {

    private int first;
    private int second;
    private int third;
   // private int[] all;

    public UniqueSum(int first, int second, int third) {
       // all[0] =
                this.first = first;
       // all[1] =
                this.second = second;
        //all[2] =
                this.third = third;
    }

    public int huhMathsIfs() {

        int total = first + second + third;

        if (first == second || first  == third || second == third) {

            if (first == second ) {

                total -= first ;

                if(first == third) {

                    total -= first ;

                    if(second  == third) {

                        total -= second ;

                    }

                }


            } else if (first == third) {

                total -= first;

                if (second == third) {

                    total -= second;

                }

            }




            return total;


        } else {return total;}

    }
    
    public int huhMathsBools() {



        int[] inputArray = {first,second,third};
        int total = 0;
        for (int i = 0; i<3;i++) {

        }
        return total;
    }

}

