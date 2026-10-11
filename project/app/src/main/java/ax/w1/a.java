/*
 * Decompiled with CFR 0.152.
 */
package ax.w1;

import ax.P0.E;
import ax.P0.v;
import ax.S0.G;
import ax.q1.U;
import ax.q1.a;
import ax.w1.e;
import java.util.Collections;

final class a
extends e {
    private static final int[] e = new int[]{5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int d;

    public a(U u8) {
        super(u8);
    }

    @Override
    protected boolean b(G object) throws e.a {
        if (!this.b) {
            int n8;
            int n9 = ((G)object).M();
            this.d = n8 = n9 >> 4 & 0xF;
            if (n8 == 2) {
                n8 = e[n9 >> 2 & 3];
                object = new v.b().W("video/x-flv").y0("audio/mpeg").T(1).z0(n8).P();
                this.a.e((v)object);
                this.c = true;
            } else if (n8 != 7 && n8 != 8) {
                if (n8 != 10) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Audio format not supported: ");
                    ((StringBuilder)object).append(this.d);
                    throw new e.a(((StringBuilder)object).toString());
                }
            } else {
                object = n8 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                object = new v.b().W("video/x-flv").y0((String)object).T(1).z0(8000).P();
                this.a.e((v)object);
                this.c = true;
            }
            this.b = true;
        } else {
            ((G)object).c0(1);
        }
        return true;
    }

    @Override
    protected boolean c(G object, long l8) throws E {
        if (this.d == 2) {
            int n8 = ((G)object).a();
            this.a.g((G)object, n8);
            this.a.f(l8, 1, n8, 0, null);
            return true;
        }
        int n9 = ((G)object).M();
        if (n9 == 0 && !this.c) {
            n9 = ((G)object).a();
            byte[] byArray = new byte[n9];
            ((G)object).q(byArray, 0, n9);
            object = ax.q1.a.e(byArray);
            object = new v.b().W("video/x-flv").y0("audio/mp4a-latm").U(((a.b)object).c).T(((a.b)object).b).z0(((a.b)object).a).k0(Collections.singletonList(byArray)).P();
            this.a.e((v)object);
            this.c = true;
            return false;
        }
        if (this.d == 10 && n9 != 1) {
            return false;
        }
        n9 = ((G)object).a();
        this.a.g((G)object, n9);
        this.a.f(l8, 1, n9, 0, null);
        return true;
    }
}

