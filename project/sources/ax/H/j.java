package ax.H;

import ax.I.o;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j extends e implements i {
    public e[] L0 = new e[4];
    public int M0 = 0;

    @Override // ax.H.i
    public void b() {
        this.M0 = 0;
        Arrays.fill(this.L0, (Object) null);
    }

    @Override // ax.H.i
    public void c(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i = this.M0 + 1;
        e[] eVarArr = this.L0;
        if (i > eVarArr.length) {
            this.L0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.L0;
        int i2 = this.M0;
        eVarArr2[i2] = eVar;
        this.M0 = i2 + 1;
    }

    public void r1(ArrayList<o> arrayList, int i, o oVar) {
        for (int i2 = 0; i2 < this.M0; i2++) {
            oVar.a(this.L0[i2]);
        }
        for (int i3 = 0; i3 < this.M0; i3++) {
            ax.I.i.a(this.L0[i3], i, arrayList, oVar);
        }
    }

    public int s1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.M0; i4++) {
            e eVar = this.L0[i4];
            if (i == 0 && (i3 = eVar.I0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = eVar.J0) != -1) {
                return i2;
            }
        }
        return -1;
    }

    @Override // ax.H.i
    public void a(f fVar) {
    }
}
