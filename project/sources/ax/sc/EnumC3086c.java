package ax.sc;

import ax.oc.C2743a;

/* renamed from: ax.sc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3086c {
    STORE(0),
    DEFLATE(8),
    AES_INTERNAL_ONLY(99);

    private int q;

    EnumC3086c(int i) {
        this.q = i;
    }

    public static EnumC3086c h(int i) throws C2743a {
        for (EnumC3086c enumC3086c : values()) {
            if (enumC3086c.d() == i) {
                return enumC3086c;
            }
        }
        throw new C2743a("Unknown compression method", C2743a.EnumC0408a.UNKNOWN_COMPRESSION_METHOD);
    }

    public int d() {
        return this.q;
    }
}
