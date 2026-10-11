/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

import ax.X4.C;
import ax.X4.f;
import ax.X4.i;
import ax.X4.k;
import java.math.BigInteger;

class s
extends f {
    s() {
    }

    private BigInteger d(CharSequence charSequence, int n8, int n9, boolean bl) {
        int n10 = n9 - n8;
        if (n10 > 18) {
            return this.f(charSequence, n8, n9, bl);
        }
        long l8 = i.m(charSequence, n8, n10 = (n10 & 7) + n8);
        n8 = l8 >= 0L ? 1 : 0;
        while (n10 < n9) {
            int n11 = i.f(charSequence, n10);
            int n12 = n11 >= 0 ? 1 : 0;
            n8 &= n12;
            l8 = l8 * 100000000L + (long)n11;
            n10 += 8;
        }
        if (n8 != 0) {
            long l9 = l8;
            if (bl) {
                l9 = -l8;
            }
            return BigInteger.valueOf(l9);
        }
        throw new NumberFormatException("illegal syntax");
    }

    private BigInteger e(CharSequence object, int n8, int n9, boolean bl) {
        int n10 = this.g((CharSequence)object, n8, n9);
        if ((n8 = n9 - n10) <= 0) {
            return BigInteger.ZERO;
        }
        if (n8 <= 0x20000000) {
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            Object object2 = new byte[(n8 + 1 >> 1) + 1];
            if ((n8 & 1) != 0) {
                n8 = f.b(object.charAt(n10));
                object2[1] = (byte)n8;
                n8 = n8 < 0 ? 1 : 0;
                n15 = 2;
                n14 = n10 + 1;
                n13 = n8;
                n10 = n15;
                n8 = n14;
            } else {
                n13 = 0;
                n15 = 1;
                n8 = n10;
                n10 = n15;
            }
            n15 = n8;
            while (true) {
                n14 = n13;
                n12 = n10;
                n11 = n15;
                if (n15 >= (n9 - n8 & 7) + n8) break;
                char c8 = object.charAt(n15);
                char c9 = object.charAt(n15 + 1);
                n12 = f.b(c8);
                n14 = f.b(c9);
                object2[n10] = (byte)(n12 << 4 | n14);
                n14 = n14 >= 0 && n12 >= 0 ? 0 : 1;
                n13 |= n14;
                n15 += 2;
                ++n10;
            }
            while (n11 < n9) {
                long l8 = i.h((CharSequence)object, n11);
                i.n((byte[])object2, n12, (int)l8);
                n8 = l8 < 0L ? 1 : 0;
                n14 |= n8;
                n11 += 8;
                n12 += 4;
            }
            if (n14 == 0) {
                object2 = new BigInteger((byte[])object2);
                object = object2;
                if (bl) {
                    object = ((BigInteger)object2).negate();
                }
                return object;
            }
            throw new NumberFormatException("illegal syntax");
        }
        throw new NumberFormatException("value exceeds limits");
    }

    private BigInteger f(CharSequence object, int n8, int n9, boolean bl) {
        if (n9 - (n8 = this.g((CharSequence)object, n8, n9)) <= 646456993) {
            BigInteger bigInteger = C.b((CharSequence)object, n8, n9, k.e(n8, n9));
            object = bigInteger;
            if (bl) {
                object = bigInteger.negate();
            }
            return object;
        }
        throw new NumberFormatException("value exceeds limits");
    }

    private int g(CharSequence charSequence, int n8, int n9) {
        while (n8 < n9 && charSequence.charAt(n8) == '0') {
            ++n8;
        }
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public BigInteger c(CharSequence object, int n8, int n9, int n10) throws NumberFormatException {
        ArithmeticException arithmeticException2;
        block9: {
            block8: {
                int n11 = n8 + n9;
                if (n8 >= 0 && n11 >= n8) {
                    try {
                        if (n11 > object.length() || n9 > 1292782622) break block8;
                        int n12 = object.charAt(n8);
                        boolean bl = n12 == 45;
                        if (!bl && n12 != 43) {
                            n12 = n8;
                        } else {
                            n12 = n8 + 1;
                            if (f.a((CharSequence)object, n12, n11) == '\u0000') {
                                object = new NumberFormatException("illegal syntax");
                                throw object;
                            }
                        }
                        if (n10 == 10) {
                            return this.d((CharSequence)object, n12, n11, bl);
                        }
                        if (n10 == 16) return this.e((CharSequence)object, n12, n11, bl);
                        return new BigInteger(object.subSequence(n8, n9).toString(), n10);
                    }
                    catch (ArithmeticException arithmeticException2) {
                        break block9;
                    }
                }
            }
            object = new IllegalArgumentException("offset < 0 or length > str.length");
            throw object;
        }
        NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
        numberFormatException.initCause(arithmeticException2);
        throw numberFormatException;
    }
}

