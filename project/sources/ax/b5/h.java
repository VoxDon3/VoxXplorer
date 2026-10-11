package ax.b5;

import ax.b5.g;

/* loaded from: classes.dex */
public final class h<F extends g> {
    protected int a;

    protected h(int i) {
        this.a = i;
    }

    public static <F extends g> h<F> a(F[] fArr) {
        if (fArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
        }
        int i = 0;
        for (F f : fArr) {
            if (f.d()) {
                i |= f.h();
            }
        }
        return new h<>(i);
    }

    public h<F> b(F f) {
        int h = f.h() | this.a;
        return h == this.a ? this : new h<>(h);
    }
}
