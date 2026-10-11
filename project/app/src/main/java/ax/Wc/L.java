/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.O;
import ax.Wc.S0;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class L
extends A {
    static final O c0 = new O(L.class, 23){

        @Override
        A d(t0 t02) {
            return L.C(t02.G());
        }
    };
    final byte[] q;

    public L(String string) {
        this.q = j.e(string);
        try {
            this.E();
            return;
        }
        catch (ParseException parseException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid date string: ");
            stringBuilder.append(parseException.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    L(byte[] byArray) {
        if (byArray.length >= 2) {
            this.q = byArray;
            if (this.I(0) && this.I(1)) {
                return;
            }
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    static L C(byte[] byArray) {
        return new L(byArray);
    }

    private boolean I(int n8) {
        byte[] byArray = this.q;
        return byArray.length > n8 && (n8 = byArray[n8]) >= 48 && n8 <= 57;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String D() {
        String string;
        StringBuilder stringBuilder;
        String string2 = this.G();
        if (string2.charAt(0) < '5') {
            stringBuilder = new StringBuilder();
            string = "20";
        } else {
            stringBuilder = new StringBuilder();
            string = "19";
        }
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public Date E() throws ParseException {
        return S0.a(new SimpleDateFormat("yyMMddHHmmssz").parse(this.G()));
    }

    /*
     * Enabled aggressive block sorting
     */
    public String G() {
        CharSequence charSequence;
        CharSequence charSequence2 = j.b(this.q);
        if (((String)charSequence2).indexOf(45) < 0 && ((String)charSequence2).indexOf(43) < 0) {
            if (((String)charSequence2).length() == 11) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(((String)charSequence2).substring(0, 10));
                String string = "00GMT+00:00";
                charSequence2 = charSequence;
                charSequence = string;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(((String)charSequence2).substring(0, 12));
                charSequence = "GMT+00:00";
                charSequence2 = stringBuilder;
            }
        } else {
            int n8;
            int n9 = n8 = ((String)charSequence2).indexOf(45);
            if (n8 < 0) {
                n9 = ((String)charSequence2).indexOf(43);
            }
            charSequence = charSequence2;
            if (n9 == ((String)charSequence2).length() - 3) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append("00");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            if (n9 == 10) {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(((String)charSequence).substring(0, 10));
                ((StringBuilder)charSequence2).append("00GMT");
                ((StringBuilder)charSequence2).append(((String)charSequence).substring(10, 13));
                ((StringBuilder)charSequence2).append(":");
                charSequence = ((String)charSequence).substring(13, 15);
            } else {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(((String)charSequence).substring(0, 12));
                ((StringBuilder)charSequence2).append("GMT");
                ((StringBuilder)charSequence2).append(((String)charSequence).substring(12, 15));
                ((StringBuilder)charSequence2).append(":");
                charSequence = ((String)charSequence).substring(15, 17);
            }
        }
        ((StringBuilder)charSequence2).append((String)charSequence);
        return ((StringBuilder)charSequence2).toString();
    }

    @Override
    public int hashCode() {
        return a.l(this.q);
    }

    @Override
    boolean r(A a8) {
        if (!(a8 instanceof L)) {
            return false;
        }
        return a.b(this.q, ((L)a8).q);
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 23, this.q);
    }

    @Override
    final boolean t() {
        return false;
    }

    public String toString() {
        return j.b(this.q);
    }

    @Override
    int w(boolean bl) {
        return y.g(bl, this.q.length);
    }
}

