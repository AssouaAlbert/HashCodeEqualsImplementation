package org.peronal;

class WrongVoucher extends Money {

    private String store;

    public WrongVoucher(int x, String y, String z) {
        super(x, y);
        this.store = z;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof WrongVoucher))
            return false;
        WrongVoucher other = (WrongVoucher)o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        boolean storeEquals = (this.store == null && other.store == null)
                || (this.store != null && this.store.equals(other.store));
        return this.amount == other.amount && currencyCodeEquals && storeEquals;
    }

    // other methods
}
