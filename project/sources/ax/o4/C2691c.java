package ax.o4;

/* renamed from: ax.o4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2691c {
    private int a;
    private long b;

    C2691c(long j, int i) {
        this.b = j;
        this.a = i;
    }

    static C2691c b(String str, int i, int i2) {
        long j;
        int i3;
        if (i >= i2) {
            return null;
        }
        long j2 = 0;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt < '0' || charAt > '9') {
                if (charAt >= 'A' && charAt <= 'F') {
                    j = j2 * 16;
                    i3 = charAt - 'A';
                } else {
                    if (charAt < 'a' || charAt > 'f') {
                        break;
                    }
                    j = j2 * 16;
                    i3 = charAt - 'a';
                }
                j2 = j + i3 + 10;
            } else {
                j2 = (j2 * 16) + (charAt - '0');
            }
            if (j2 > 4294967295L) {
                return null;
            }
            i4++;
        }
        if (i4 == i) {
            return null;
        }
        return new C2691c(j2, i4);
    }

    static C2691c c(String str, int i, int i2, boolean z) {
        if (i >= i2) {
            return null;
        }
        if (z) {
            char charAt = str.charAt(i);
            if (charAt != '+') {
                r1 = charAt == '-';
            }
            i++;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt2 = str.charAt(i3);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            if (r1) {
                j = (j * 10) - (charAt2 - '0');
                if (j < -2147483648L) {
                    return null;
                }
            } else {
                j = (j * 10) + (charAt2 - '0');
                if (j > 2147483647L) {
                    return null;
                }
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new C2691c(j, i3);
    }

    int a() {
        return this.a;
    }

    public int d() {
        return (int) this.b;
    }
}
