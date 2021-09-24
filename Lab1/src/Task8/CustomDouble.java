package Task8;

import Task7.User;

import java.awt.geom.QuadCurve2D;

public class CustomDouble {
    private int integer;
    private double fraction;

    public CustomDouble() {}

    public CustomDouble(final double numeric) {
        this.integer = (int) numeric;
        this.fraction = numeric - this.integer;
    }

    public CustomDouble(final int numeric1, final double numeric2){
        setInteger(numeric1);
        setFraction(numeric2);
    }

    public int getInteger() { return integer; }

    public void  setInteger(final int integer) { this.integer = integer; }

    public  double getFraction() { return fraction; }

    public void setFraction(final double fraction) {
        if((int) fraction == 0) {
            this.fraction = fraction;
        } else {
            this.integer += (int) fraction;
            this.fraction = fraction - (int) fraction;
        }
    }

    public CustomDouble plus(final CustomDouble numeric2) {
        final double sum = this.integer + this.fraction + numeric2.integer + numeric2.fraction;

        final CustomDouble numericFinal = new CustomDouble(sum);
        return numericFinal;
    }

    public CustomDouble minus(final CustomDouble numeric2) {
        final double difference = this.integer + this.fraction - (numeric2.integer + numeric2.fraction);

        final CustomDouble numericFinal = new CustomDouble(difference);
        return numericFinal;
    }

    public boolean comparisonMore(final CustomDouble numeric2) {
        return this.integer + this.fraction > numeric2.integer + numeric2.fraction;
    }
    public boolean comparisonMoreEquals(final CustomDouble numeric2) {
        return this.integer + this.fraction >= numeric2.integer + numeric2.fraction;
    }
    public boolean comparisonLess(final CustomDouble numeric2) {
        return !this.comparisonMoreEquals(numeric2);
    }
    public boolean comparisonLessEquals(final CustomDouble numeric2) {
        return !this.comparisonMore(numeric2);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final CustomDouble student = (CustomDouble) o;

        return (this.integer == student.integer) && (this.fraction == student.fraction) ;
    }

    @Override
    public int hashCode() {
        return (int) (13 * integer +
                 13 * fraction);
    }

    public Double toDouble() { return integer + fraction; }
}
