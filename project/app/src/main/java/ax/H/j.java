/*
 * Decompiled with CFR 0.152.
 */
package ax.H;

import ax.H.e;
import ax.H.f;
import ax.H.i;
import ax.I.o;
import java.util.ArrayList;
import java.util.Arrays;

public class j
extends e
implements i {
    public e[] L0 = new e[4];
    public int M0 = 0;

    @Override
    public void a(f f8) {
    }

    @Override
    public void b() {
        this.M0 = 0;
        Arrays.fill(this.L0, null);
    }

    @Override
    public void c(e e8) {
        if (e8 != this && e8 != null) {
            int n8 = this.M0;
            e[] eArray = this.L0;
            if (n8 + 1 > eArray.length) {
                this.L0 = Arrays.copyOf(eArray, eArray.length * 2);
            }
            eArray = this.L0;
            n8 = this.M0;
            eArray[n8] = e8;
            this.M0 = n8 + 1;
        }
    }

    public void r1(ArrayList<o> arrayList, int n8, o o8) {
        int n9 = 0;
        int n10 = 0;
        while (true) {
            if (n10 >= this.M0) break;
            o8.a(this.L0[n10]);
            ++n10;
        }
        for (int i8 = n9; i8 < this.M0; ++i8) {
            ax.I.i.a(this.L0[i8], n8, arrayList, o8);
        }
    }

    public int s1(int n8) {
        for (int i8 = 0; i8 < this.M0; ++i8) {
            int n9;
            e e8 = this.L0[i8];
            if (n8 == 0 && (n9 = e8.I0) != -1) {
                return n9;
            }
            if (n8 != 1 || (n9 = e8.J0) == -1) continue;
            return n9;
        }
        return -1;
    }
}

