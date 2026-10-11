/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.O;
import ax.Wc.S0;
import ax.Wc.o0;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class m
extends A {
    static final O c0 = new O(m.class, 24){

        @Override
        A d(t0 t02) {
            return m.G(t02.G());
        }
    };
    final byte[] q;

    public m(String charSequence) {
        this.q = j.e((String)charSequence);
        try {
            this.I();
            return;
        }
        catch (ParseException parseException) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("invalid date string: ");
            ((StringBuilder)charSequence).append(parseException.getMessage());
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
        }
    }

    m(byte[] byArray) {
        if (byArray.length >= 4) {
            this.q = byArray;
            if (this.O(0) && this.O(1) && this.O(2) && this.O(3)) {
                return;
            }
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    private SimpleDateFormat C() {
        SimpleDateFormat simpleDateFormat = this.K() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : (this.N() ? new SimpleDateFormat("yyyyMMddHHmmssz") : (this.M() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz")));
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String D(String charSequence) {
        int n8;
        String string;
        int n9;
        block6: {
            TimeZone timeZone = TimeZone.getDefault();
            n9 = timeZone.getRawOffset();
            if (n9 < 0) {
                n9 = -n9;
                string = "-";
            } else {
                string = "+";
            }
            int n10 = n9 / 3600000;
            n8 = (n9 - 3600000 * n10) / 60000;
            n9 = n10;
            try {
                if (!timeZone.useDaylightTime()) break block6;
                CharSequence charSequence2 = charSequence;
                if (this.K()) {
                    charSequence2 = this.P((String)charSequence);
                }
                SimpleDateFormat simpleDateFormat = this.C();
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append("GMT");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append(this.E(n10));
                ((StringBuilder)charSequence).append(":");
                ((StringBuilder)charSequence).append(this.E(n8));
                n9 = n10;
                if (timeZone.inDaylightTime(simpleDateFormat.parse(((StringBuilder)charSequence).toString()))) {
                    boolean bl = string.equals("+");
                    n9 = bl ? 1 : -1;
                    n9 = n10 + n9;
                }
            }
            catch (ParseException parseException) {
                n9 = n10;
            }
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("GMT");
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(this.E(n9));
        ((StringBuilder)charSequence).append(":");
        ((StringBuilder)charSequence).append(this.E(n8));
        return ((StringBuilder)charSequence).toString();
    }

    private String E(int n8) {
        if (n8 < 10) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("0");
            stringBuilder.append(n8);
            return stringBuilder.toString();
        }
        return Integer.toString(n8);
    }

    static m G(byte[] byArray) {
        return new m(byArray);
    }

    private boolean O(int n8) {
        byte[] byArray = this.q;
        return byArray.length > n8 && (n8 = byArray[n8]) >= 48 && n8 <= 57;
    }

    /*
     * Enabled aggressive block sorting
     */
    private String P(String string) {
        StringBuilder stringBuilder;
        int n8;
        int n9;
        String string2 = string.substring(14);
        for (n9 = 1; n9 < string2.length() && 48 <= (n8 = string2.charAt(n9)) && n8 <= 57; ++n9) {
        }
        n8 = n9 - 1;
        if (n8 > 3) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2.substring(0, 4));
            stringBuilder.append(string2.substring(n9));
            string2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
        } else if (n8 == 1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2.substring(0, n9));
            stringBuilder.append("00");
            stringBuilder.append(string2.substring(n9));
            string2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
        } else {
            if (n8 != 2) {
                return string;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2.substring(0, n9));
            stringBuilder.append("0");
            stringBuilder.append(string2.substring(n9));
            string2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
        }
        stringBuilder.append(string.substring(0, 14));
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    @Override
    A A() {
        return new o0(this.q);
    }

    @Override
    A B() {
        return new o0(this.q);
    }

    public Date I() throws ParseException {
        SimpleDateFormat simpleDateFormat;
        String string = j.b(this.q);
        if (string.endsWith("Z")) {
            simpleDateFormat = this.K() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : (this.N() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'") : (this.M() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'")));
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (string.indexOf(45) <= 0 && string.indexOf(43) <= 0) {
            simpleDateFormat = this.K() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : (this.N() ? new SimpleDateFormat("yyyyMMddHHmmss") : (this.M() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH")));
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        } else {
            string = this.J();
            simpleDateFormat = this.C();
        }
        String string2 = string;
        if (this.K()) {
            string2 = this.P(string);
        }
        return S0.a(simpleDateFormat.parse(string2));
    }

    public String J() {
        String string = j.b(this.q);
        if (string.charAt(string.length() - 1) == 'Z') {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string.substring(0, string.length() - 1));
            stringBuilder.append("GMT+00:00");
            return stringBuilder.toString();
        }
        int n8 = string.length();
        int n9 = string.charAt(n8 - 6);
        if ((n9 == 45 || n9 == 43) && string.indexOf("GMT") == n8 - 9) {
            return string;
        }
        int n10 = string.length();
        n9 = n10 - 5;
        n8 = string.charAt(n9);
        if (n8 != 45 && n8 != 43) {
            n8 = string.length() - 3;
            n9 = string.charAt(n8);
            if (n9 != 45 && n9 != 43) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(this.D(string));
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string.substring(0, n8));
            stringBuilder.append("GMT");
            stringBuilder.append(string.substring(n8));
            stringBuilder.append(":00");
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.substring(0, n9));
        stringBuilder.append("GMT");
        n8 = n10 - 2;
        stringBuilder.append(string.substring(n9, n8));
        stringBuilder.append(":");
        stringBuilder.append(string.substring(n8));
        return stringBuilder.toString();
    }

    protected boolean K() {
        byte[] byArray;
        for (int i8 = 0; i8 != (byArray = this.q).length; ++i8) {
            if (byArray[i8] != 46 || i8 != 14) continue;
            return true;
        }
        return false;
    }

    protected boolean M() {
        return this.O(10) && this.O(11);
    }

    protected boolean N() {
        return this.O(12) && this.O(13);
    }

    @Override
    public int hashCode() {
        return a.l(this.q);
    }

    @Override
    boolean r(A a8) {
        if (!(a8 instanceof m)) {
            return false;
        }
        return a.b(this.q, ((m)a8).q);
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 24, this.q);
    }

    @Override
    final boolean t() {
        return false;
    }

    @Override
    int w(boolean bl) {
        return y.g(bl, this.q.length);
    }
}

