/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.v4.f;
import java.io.IOException;

public final class r
extends Enum<r> {
    public static final /* enum */ r c0;
    public static final /* enum */ r d0;
    public static final /* enum */ r e0;
    public static final /* enum */ r f0;
    public static final /* enum */ r g0;
    public static final /* enum */ r h0;
    public static final /* enum */ r i0;
    public static final /* enum */ r j0;
    public static final /* enum */ r k0;
    public static final /* enum */ r l0;
    private static final r[] m0;
    public static final /* enum */ r q;

    static {
        r r8;
        r r9;
        r r10;
        r r11;
        r r12;
        r r13;
        r r14;
        r r15;
        r r16;
        r r17;
        r r18;
        q = r18 = new r();
        c0 = r17 = new r();
        d0 = r16 = new r();
        e0 = r15 = new r();
        f0 = r14 = new r();
        g0 = r13 = new r();
        h0 = r12 = new r();
        i0 = r11 = new r();
        j0 = r10 = new r();
        k0 = r9 = new r();
        l0 = r8 = new r();
        m0 = new r[]{r18, r17, r16, r15, r14, r13, r12, r11, r10, r9, r8};
    }

    public static r valueOf(String string) {
        return Enum.valueOf(r.class, string);
    }

    public static r[] values() {
        return (r[])m0.clone();
    }

    static class b
    extends f<r> {
        public static final b b = new b();

        b() {
        }

        public r s(j j8) throws IOException, i {
            boolean bl;
            Object object;
            if (j8.j() == m.r0) {
                object = c.i(j8);
                j8.H();
                bl = true;
            } else {
                c.h(j8);
                object = ax.v4.a.q(j8);
                bl = false;
            }
            if (object != null) {
                object = "image".equals(object) ? q : ("document".equals(object) ? c0 : ("pdf".equals(object) ? d0 : ("spreadsheet".equals(object) ? e0 : ("presentation".equals(object) ? f0 : ("audio".equals(object) ? g0 : ("video".equals(object) ? h0 : ("folder".equals(object) ? i0 : ("paper".equals(object) ? j0 : ("others".equals(object) ? k0 : l0)))))))));
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(r r8, g g8) throws IOException, ax.T4.f {
            switch (a.a[r8.ordinal()]) {
                default: {
                    g8.s0("other");
                    return;
                }
                case 10: {
                    g8.s0("others");
                    return;
                }
                case 9: {
                    g8.s0("paper");
                    return;
                }
                case 8: {
                    g8.s0("folder");
                    return;
                }
                case 7: {
                    g8.s0("video");
                    return;
                }
                case 6: {
                    g8.s0("audio");
                    return;
                }
                case 5: {
                    g8.s0("presentation");
                    return;
                }
                case 4: {
                    g8.s0("spreadsheet");
                    return;
                }
                case 3: {
                    g8.s0("pdf");
                    return;
                }
                case 2: {
                    g8.s0("document");
                    return;
                }
                case 1: 
            }
            g8.s0("image");
        }
    }
}

