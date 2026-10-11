package ax.E;

import java.util.Arrays;
import java.util.HashSet;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class i implements Comparable<i> {
    private static int s0 = 1;
    private String c0;
    public float g0;
    a k0;
    public boolean q;
    public int d0 = -1;
    int e0 = -1;
    public int f0 = 0;
    public boolean h0 = false;
    float[] i0 = new float[9];
    float[] j0 = new float[9];
    b[] l0 = new b[16];
    int m0 = 0;
    public int n0 = 0;
    boolean o0 = false;
    int p0 = -1;
    float q0 = 0.0f;
    HashSet<b> r0 = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.k0 = aVar;
    }

    static void j() {
        s0++;
    }

    public final void d(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.m0;
            if (i >= i2) {
                b[] bVarArr = this.l0;
                if (i2 >= bVarArr.length) {
                    this.l0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.l0;
                int i3 = this.m0;
                bVarArr2[i3] = bVar;
                this.m0 = i3 + 1;
                return;
            }
            if (this.l0[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.d0 - iVar.d0;
    }

    public final void l(b bVar) {
        int i = this.m0;
        int i2 = 0;
        while (i2 < i) {
            if (this.l0[i2] == bVar) {
                while (i2 < i - 1) {
                    b[] bVarArr = this.l0;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.m0--;
                return;
            }
            i2++;
        }
    }

    public void n() {
        this.c0 = null;
        this.k0 = a.UNKNOWN;
        this.f0 = 0;
        this.d0 = -1;
        this.e0 = -1;
        this.g0 = 0.0f;
        this.h0 = false;
        this.o0 = false;
        this.p0 = -1;
        this.q0 = 0.0f;
        int i = this.m0;
        for (int i2 = 0; i2 < i; i2++) {
            this.l0[i2] = null;
        }
        this.m0 = 0;
        this.n0 = 0;
        this.q = false;
        Arrays.fill(this.j0, 0.0f);
    }

    public void p(d dVar, float f) {
        this.g0 = f;
        this.h0 = true;
        this.o0 = false;
        this.p0 = -1;
        this.q0 = 0.0f;
        int i = this.m0;
        this.e0 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.l0[i2].A(dVar, this, false);
        }
        this.m0 = 0;
    }

    public void q(a aVar, String str) {
        this.k0 = aVar;
    }

    public final void r(d dVar, b bVar) {
        int i = this.m0;
        for (int i2 = 0; i2 < i; i2++) {
            this.l0[i2].B(dVar, bVar, false);
        }
        this.m0 = 0;
    }

    public String toString() {
        if (this.c0 != null) {
            return HttpUrl.FRAGMENT_ENCODE_SET + this.c0;
        }
        return HttpUrl.FRAGMENT_ENCODE_SET + this.d0;
    }
}
