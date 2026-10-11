/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

public final class z
extends Enum<z> {
    public static final /* enum */ z c0 = new z("Audio");
    public static final /* enum */ z d0 = new z("AudioExtra");
    public static final /* enum */ z e0 = new z("Video");
    public static final /* enum */ z f0 = new z("Image");
    public static final /* enum */ z g0 = new z("ImageExtra");
    public static final /* enum */ z h0 = new z("Text");
    public static final /* enum */ z i0 = new z("PlainText");
    public static final /* enum */ z j0 = new z("AppText");
    public static final /* enum */ z k0 = new z("Word");
    public static final /* enum */ z l0 = new z("Excel");
    public static final /* enum */ z m0 = new z("PowerPoint");
    public static final /* enum */ z n0 = new z("PDF");
    public static final /* enum */ z o0 = new z("Presentation");
    public static final /* enum */ z p0 = new z("Spreadsheet");
    public static final /* enum */ z q0 = new z("Ebook");
    public static final /* enum */ z r0 = new z("Archive");
    public static final /* enum */ z s0 = new z("Apk");
    public static final /* enum */ z t0 = new z("Link");
    public static final /* enum */ z u0 = new z("Others");
    public static final /* enum */ z v0 = new z("Document");
    private static final z[] w0 = z.d();
    String q;

    private z(String string2) {
        this.q = string2;
    }

    private static /* synthetic */ z[] d() {
        return new z[]{c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0};
    }

    public static z valueOf(String string) {
        return Enum.valueOf(z.class, string);
    }

    public static z[] values() {
        return (z[])w0.clone();
    }

    public String h() {
        return this.q;
    }
}

