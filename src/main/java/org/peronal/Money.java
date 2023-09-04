package org.peronal;

public class Money {
    int amount;
    String currencyCode;

    public Money(int x, String y) {
        this.amount = x;
        this.currencyCode = y;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        /*
            if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
            CustomObject other = (CustomObject) obj;
            return this.amount == other.amount && Objects.equals(this.currencyCode, other.currencyCode);
        */

        if (!(o instanceof Money)) return false;
        Money other = (Money) o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null) || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        return this.amount == other.amount && currencyCodeEquals;
    }
}

