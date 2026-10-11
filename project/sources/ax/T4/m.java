package ax.T4;

/* loaded from: classes.dex */
public enum m {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);

    final char[] c0;
    final byte[] d0;
    final int e0;
    final boolean f0;
    final boolean g0;
    final boolean h0;
    final boolean i0;
    final boolean j0;
    final String q;

    m(String str, int i) {
        boolean z = false;
        if (str == null) {
            this.q = null;
            this.c0 = null;
            this.d0 = null;
        } else {
            this.q = str;
            char[] charArray = str.toCharArray();
            this.c0 = charArray;
            int length = charArray.length;
            this.d0 = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.d0[i2] = (byte) this.c0[i2];
            }
        }
        this.e0 = i;
        this.i0 = i == 10 || i == 9;
        this.h0 = i == 7 || i == 8;
        boolean z2 = i == 1 || i == 3;
        this.f0 = z2;
        boolean z3 = i == 2 || i == 4;
        this.g0 = z3;
        if (!z2 && !z3 && i != 5 && i != -1) {
            z = true;
        }
        this.j0 = z;
    }

    public final String d() {
        return this.q;
    }

    public final int h() {
        return this.e0;
    }

    public final boolean j() {
        return this.j0;
    }

    public final boolean l() {
        return this.g0;
    }

    public final boolean n() {
        return this.f0;
    }
}
