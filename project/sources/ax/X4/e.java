package ax.X4;

/* loaded from: classes.dex */
abstract class e extends AbstractC1172a {
    e() {
    }

    private long e(CharSequence charSequence, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        boolean z3;
        int i9;
        e eVar;
        int i10;
        boolean z4;
        int i11;
        int compare;
        int i12 = -1;
        int i13 = i;
        long j2 = 0;
        char c = 0;
        boolean z5 = false;
        while (true) {
            if (i13 >= i3) {
                break;
            }
            c = charSequence.charAt(i13);
            if (!i.b(c)) {
                if (c != '.') {
                    break;
                }
                z5 |= i12 >= 0;
                i12 = i13;
            } else {
                j2 = ((j2 * 10) + c) - 48;
            }
            i13++;
        }
        if (i12 < 0) {
            i6 = i13 - i;
            i5 = i13;
            i4 = 0;
        } else {
            i4 = (i12 - i13) + 1;
            i5 = i12;
            i6 = (i13 - i) - 1;
        }
        if ((c | ' ') == 101) {
            i7 = i13 + 1;
            char a = f.a(charSequence, i7, i3);
            boolean z6 = a == '-';
            if (z6 || a == '+') {
                i7 = i13 + 2;
                a = f.a(charSequence, i7, i3);
            }
            boolean z7 = z5 | (!i.b(a));
            int i14 = 0;
            do {
                if (i14 < 1024) {
                    i14 = ((i14 * 10) + a) - 48;
                }
                i7++;
                a = f.a(charSequence, i7, i3);
            } while (i.b(a));
            if (z6) {
                i14 = -i14;
            }
            i4 += i14;
            int i15 = i14;
            c = a;
            i8 = i15;
            z5 = z7;
        } else {
            i7 = i13;
            i8 = 0;
        }
        if ((c == 'd') | (c == 'D') | (c == 'f') | (c == 'F')) {
            i7++;
        }
        int j3 = j(charSequence, i7, i3);
        if (z5 || j3 < i3 || (!z2 && i6 == 0)) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i6 > 19) {
            int i16 = i;
            int i17 = 0;
            long j4 = 0;
            while (i16 < i13) {
                char charAt = charSequence.charAt(i16);
                if (charAt != '.') {
                    compare = Long.compare(j4 ^ Long.MIN_VALUE, 1000000000000000000L ^ Long.MIN_VALUE);
                    if (compare >= 0) {
                        break;
                    }
                    j4 = ((j4 * 10) + charAt) - 48;
                } else {
                    i17++;
                }
                i16++;
            }
            i9 = (i5 - i16) + i17 + i8;
            j = j4;
            z3 = i16 < i13;
            eVar = this;
            z4 = z;
            i11 = i4;
            i10 = i2;
        } else {
            j = j2;
            z3 = false;
            i9 = 0;
            eVar = this;
            i10 = i2;
            z4 = z;
            i11 = i4;
        }
        return eVar.k(charSequence, i10, i3, z4, j, i11, z3, i9);
    }

    private long g(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        int min;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        boolean z2;
        int compare;
        int i10 = -1;
        int i11 = i;
        long j2 = 0;
        char c = 0;
        boolean z3 = false;
        while (true) {
            if (i11 >= i3) {
                break;
            }
            c = charSequence.charAt(i11);
            int b = f.b(c);
            if (b < 0) {
                if (b != -4) {
                    break;
                }
                z3 |= i10 >= 0;
                int i12 = i11;
                while (i12 < i3 - 8) {
                    long h = i.h(charSequence, i12 + 1);
                    if (h < 0) {
                        break;
                    }
                    j2 = (j2 << 32) + h;
                    i12 += 8;
                }
                int i13 = i11;
                i11 = i12;
                i10 = i13;
            } else {
                j2 = (j2 << 4) | b;
            }
            i11++;
        }
        if (i10 < 0) {
            i5 = i11 - i;
            i4 = i11;
            min = 0;
        } else {
            min = Math.min((i10 - i11) + 1, 1024) * 4;
            i4 = i10;
            i5 = (i11 - i) - 1;
        }
        boolean z4 = (c | ' ') == 112;
        if (z4) {
            i6 = i11 + 1;
            char a = f.a(charSequence, i6, i3);
            boolean z5 = a == '-';
            if (z5 || a == '+') {
                i6 = i11 + 2;
                a = f.a(charSequence, i6, i3);
            }
            boolean z6 = z3 | (!i.b(a));
            int i14 = 0;
            do {
                if (i14 < 1024) {
                    i14 = ((i14 * 10) + a) - 48;
                }
                i6++;
                a = f.a(charSequence, i6, i3);
            } while (i.b(a));
            if (z5) {
                i14 = -i14;
            }
            min += i14;
            int i15 = i14;
            c = a;
            i7 = i15;
            z3 = z6;
        } else {
            i6 = i11;
            i7 = 0;
        }
        if ((c == 'F') | (c == 'D') | (c == 'd') | (c == 'f')) {
            i6++;
        }
        int j3 = j(charSequence, i6, i3);
        if (z3 || j3 < i3 || i5 == 0 || !z4) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i5 > 16) {
            int i16 = i;
            int i17 = 0;
            long j4 = 0;
            while (i16 < i11) {
                int b2 = f.b(charSequence.charAt(i16));
                if (b2 >= 0) {
                    compare = Long.compare(j4 ^ Long.MIN_VALUE, 1000000000000000000L ^ Long.MIN_VALUE);
                    if (compare >= 0) {
                        break;
                    }
                    j4 = (j4 << 4) | b2;
                } else {
                    i17++;
                }
                i16++;
            }
            boolean z7 = i16 < i11;
            j3 = i16;
            i9 = i17;
            i8 = i7;
            j = j4;
            z2 = z7;
        } else {
            i8 = i7;
            j = j2;
            i9 = 0;
            z2 = false;
        }
        return l(charSequence, i2, i3, z, j, min, z2, (((i4 - j3) + i9) * 4) + i8);
    }

    private long h(CharSequence charSequence, int i, int i2, boolean z) {
        if (charSequence.charAt(i) == 'N') {
            int i3 = i + 2;
            if (i3 < i2 && charSequence.charAt(i + 1) == 'a' && charSequence.charAt(i3) == 'N' && j(charSequence, i + 3, i2) == i2) {
                return c();
            }
        } else {
            int i4 = i + 7;
            if (i4 < i2 && charSequence.charAt(i) == 'I' && charSequence.charAt(i + 1) == 'n' && charSequence.charAt(i + 2) == 'f' && charSequence.charAt(i + 3) == 'i' && charSequence.charAt(i + 4) == 'n' && charSequence.charAt(i + 5) == 'i' && charSequence.charAt(i + 6) == 't' && charSequence.charAt(i4) == 'y' && j(charSequence, i + 8, i2) == i2) {
                return z ? d() : i();
            }
        }
        throw new NumberFormatException("illegal syntax");
    }

    private static int j(CharSequence charSequence, int i, int i2) {
        while (i < i2 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        return i;
    }

    abstract long c();

    abstract long d();

    public final long f(CharSequence charSequence, int i, int i2) {
        int i3;
        e eVar;
        CharSequence charSequence2;
        int i4;
        int i5 = i + i2;
        if (i < 0 || i5 < i || i5 > charSequence.length() || i2 > 2147483643) {
            throw new IllegalArgumentException("offset < 0 or length > str.length");
        }
        int j = j(charSequence, i, i5);
        if (j == i5) {
            throw new NumberFormatException("illegal syntax");
        }
        char charAt = charSequence.charAt(j);
        boolean z = charAt == '-';
        if ((z || charAt == '+') && (charAt = f.a(charSequence, (j = j + 1), i5)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        if (charAt >= 'I') {
            return h(charSequence, j, i5, z);
        }
        boolean z2 = charAt == '0';
        if (z2) {
            int i6 = j + 1;
            char a = f.a(charSequence, i6, i5);
            if (a == 'x' || a == 'X') {
                return g(charSequence, j + 2, i, i5, z);
            }
            i3 = i6;
            charSequence2 = charSequence;
            i4 = i;
            eVar = this;
        } else {
            i3 = j;
            eVar = this;
            charSequence2 = charSequence;
            i4 = i;
        }
        return eVar.e(charSequence2, i3, i4, i5, z, z2);
    }

    abstract long i();

    abstract long k(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    abstract long l(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);
}
