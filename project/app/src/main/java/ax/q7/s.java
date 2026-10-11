/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

public final class s
extends Enum<s> {
    public static final /* enum */ s A0;
    public static final /* enum */ s B0;
    public static final /* enum */ s C0;
    public static final /* enum */ s D0;
    private static final s[] E0;
    public static final /* enum */ s c0;
    public static final /* enum */ s d0;
    public static final /* enum */ s e0;
    public static final /* enum */ s f0;
    public static final /* enum */ s g0;
    public static final /* enum */ s h0;
    public static final /* enum */ s i0;
    public static final /* enum */ s j0;
    public static final /* enum */ s k0;
    public static final /* enum */ s l0;
    public static final /* enum */ s m0;
    public static final /* enum */ s n0;
    public static final /* enum */ s o0;
    public static final /* enum */ s p0;
    public static final /* enum */ s q0;
    public static final /* enum */ s r0;
    public static final /* enum */ s s0;
    public static final /* enum */ s t0;
    @Deprecated
    public static final /* enum */ s u0;
    public static final /* enum */ s v0;
    public static final /* enum */ s w0;
    public static final /* enum */ s x0;
    public static final /* enum */ s y0;
    public static final /* enum */ s z0;
    private final String q;

    static {
        c0 = new s("java.version");
        d0 = new s("java.vendor");
        e0 = new s("java.vendor.url");
        f0 = new s("java.home");
        g0 = new s("java.vm.specification.version");
        h0 = new s("java.vm.specification.vendor");
        i0 = new s("java.vm.specification.name");
        j0 = new s("java.vm.version");
        k0 = new s("java.vm.vendor");
        l0 = new s("java.vm.name");
        m0 = new s("java.specification.version");
        n0 = new s("java.specification.vendor");
        o0 = new s("java.specification.name");
        p0 = new s("java.class.version");
        q0 = new s("java.class.path");
        r0 = new s("java.library.path");
        s0 = new s("java.io.tmpdir");
        t0 = new s("java.compiler");
        u0 = new s("java.ext.dirs");
        v0 = new s("os.name");
        w0 = new s("os.arch");
        x0 = new s("os.version");
        y0 = new s("file.separator");
        z0 = new s("path.separator");
        A0 = new s("line.separator");
        B0 = new s("user.name");
        C0 = new s("user.home");
        D0 = new s("user.dir");
        E0 = s.d();
    }

    private s(String string2) {
        this.q = string2;
    }

    private static /* synthetic */ s[] d() {
        return new s[]{c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0, w0, x0, y0, z0, A0, B0, C0, D0};
    }

    public static s valueOf(String string) {
        return Enum.valueOf(s.class, string);
    }

    public static s[] values() {
        return (s[])E0.clone();
    }

    public String h() {
        return this.q;
    }

    public String j() {
        return System.getProperty(this.q);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h());
        stringBuilder.append("=");
        stringBuilder.append(this.j());
        return stringBuilder.toString();
    }
}

