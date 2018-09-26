/**
 * @Class Calculated with Fraction
 * @Author Phạm Thiên Long
 */
public class PS extends Lab03Bt1
{
    private int tuSo;
    private int mauSo;


    public int getTuSo() {return tuSo;}
    public void setTuSo(int i) {this.tuSo = i;}

    public int getMauSo() {return mauSo;}
    public void setMauSo(int i) {this.mauSo = i;}

    public PS(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PS() {
        this.tuSo = 1;
        this.mauSo = 1;
    }

    /*
    * Calculated the Sum of 2 Fractions
    * */
    public static void sumFractions(PS firstFraction, PS secondFraction)
    {
        PS sumFraction = new PS();

        int i = firstFraction.getTuSo()*secondFraction.getMauSo() + firstFraction.getMauSo()*secondFraction.getTuSo();
        sumFraction.setTuSo(i);

        sumFraction.setMauSo(firstFraction.getMauSo() * secondFraction.getMauSo());

        int a = USCLN(sumFraction.getTuSo(), sumFraction.getMauSo());

        sumFraction.setTuSo(sumFraction.getTuSo() / a);
        sumFraction.setMauSo(sumFraction.getMauSo() / a);

        System.out.println(sumFraction.getTuSo() + "/" + sumFraction.getMauSo());
    }

    /*
    * Calculated the Sub of 2 Fractions
    * */
    public static void subFractions(PS firstFraction, PS secondFraction)
    {
        PS subFraction = new PS();

        int i = firstFraction.getTuSo()*secondFraction.getMauSo() - firstFraction.getMauSo()*secondFraction.getTuSo();
        subFraction.setTuSo(i);
        subFraction.setMauSo(firstFraction.getMauSo() * secondFraction.getMauSo());

        int a = USCLN(subFraction.getTuSo(), subFraction.getMauSo());

        subFraction.setTuSo(subFraction.getTuSo() / a);
        subFraction.setMauSo(subFraction.getMauSo() / a);

        System.out.println(subFraction.getTuSo() + "/" + subFraction.getMauSo());
    }

    /*
    * Calculated the Mul of 2 Fractions
    * */
    public static void mulFractions(PS firstFraction, PS secondFraction)
    {
        PS mulFraction = new PS();

        mulFraction.setTuSo(firstFraction.getTuSo()*secondFraction.getTuSo());
        mulFraction.setMauSo(firstFraction.getMauSo()*secondFraction.getMauSo());

        int a = USCLN(mulFraction.getTuSo(), mulFraction.getMauSo());

        mulFraction.setTuSo(mulFraction.getTuSo() / a);
        mulFraction.setMauSo(mulFraction.getMauSo() / a);

        System.out.println(mulFraction.getTuSo() + "/" + mulFraction.getMauSo());
    }

    /*
    * Calculated the Div of 2 Fractions
    * */
    public static void divFractions(PS firstFraction, PS secondFraction)
    {
        PS divFraction = new PS();

        divFraction.setTuSo(firstFraction.getTuSo()*secondFraction.getMauSo());
        divFraction.setMauSo(firstFraction.getMauSo()*secondFraction.getTuSo());

        int a = USCLN(divFraction.getTuSo(), divFraction.getMauSo());

        divFraction.setTuSo(divFraction.getTuSo() / a);
        divFraction.setMauSo(divFraction.getMauSo() / a);

        System.out.println(divFraction.getTuSo() + "/" + divFraction.getMauSo());
    }

    public static void main(String[] args)
    {
        PS firstFraction = new PS(3, 5);
        PS secondFraction = new PS(2, 3);

        sumFractions(firstFraction, secondFraction);
        subFractions(firstFraction, secondFraction);
        mulFractions(firstFraction, secondFraction);
        divFractions(firstFraction, secondFraction);
    }
}
