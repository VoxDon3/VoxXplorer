package ax.sc;

import ax.oc.C2743a;

/* renamed from: ax.sc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3085b {
    ONE(1),
    TWO(2);

    private int q;

    EnumC3085b(int i) {
        this.q = i;
    }

    public static EnumC3085b d(int i) throws C2743a {
        for (EnumC3085b enumC3085b : values()) {
            if (enumC3085b.q == i) {
                return enumC3085b;
            }
        }
        throw new C2743a("Unsupported Aes version");
    }
}
