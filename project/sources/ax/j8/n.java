package ax.j8;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class n implements ax.i8.l {
    private final String a;
    private final int b;

    n(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private String e() {
        return d().trim();
    }

    private void f() {
        if (this.a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // ax.i8.l
    public int a() {
        return this.b;
    }

    @Override // ax.i8.l
    public long b() {
        if (this.b == 0) {
            return 0L;
        }
        String e = e();
        try {
            return Long.valueOf(e).longValue();
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", e, "long"), e2);
        }
    }

    @Override // ax.i8.l
    public boolean c() throws IllegalArgumentException {
        if (this.b == 0) {
            return false;
        }
        String e = e();
        if (k.f.matcher(e).matches()) {
            return true;
        }
        if (k.g.matcher(e).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", e, "boolean"));
    }

    public String d() {
        if (this.b == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        f();
        return this.a;
    }
}
