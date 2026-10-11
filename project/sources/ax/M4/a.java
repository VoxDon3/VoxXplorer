package ax.M4;

import java.util.Arrays;

/* loaded from: classes.dex */
public class a {
    protected final String a;
    protected final f b;
    protected final String c;
    protected final boolean d;
    protected final String e;
    protected final boolean f;

    public a(String str, f fVar, String str2, boolean z, boolean z2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'accountId' is null");
        }
        if (str.length() < 40) {
            throw new IllegalArgumentException("String 'accountId' is shorter than 40");
        }
        if (str.length() > 40) {
            throw new IllegalArgumentException("String 'accountId' is longer than 40");
        }
        this.a = str;
        if (fVar == null) {
            throw new IllegalArgumentException("Required value for 'name' is null");
        }
        this.b = fVar;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value for 'email' is null");
        }
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = z2;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d), this.e, Boolean.valueOf(this.f)});
    }
}
