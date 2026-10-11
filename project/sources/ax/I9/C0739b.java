package ax.I9;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: ax.I9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0739b extends u {
    private ArrayList<u> h = new ArrayList<>();
    private final LinkedHashMap<String, ax.H9.m> i = new LinkedHashMap<>();

    public void A(ax.H9.m mVar, String str) {
        this.i.put(str.toLowerCase(), mVar);
    }

    @Override // ax.I9.u
    public void j() {
        ArrayList<u> arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            u uVar = arrayList.get(i);
            i++;
            uVar.j();
        }
    }

    @Override // ax.I9.u
    public void k(int i, int i2) {
        ArrayList<u> arrayList = this.h;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            u uVar = arrayList.get(i3);
            i3++;
            uVar.k(i, i2);
        }
    }

    @Override // ax.I9.u
    public ax.H9.m o(String str) {
        ax.H9.m o = super.o(str);
        return o == null ? this.i.get(str.toLowerCase()) : o;
    }

    @Override // ax.I9.u
    public void w(boolean z) {
        super.w(z);
        ArrayList<u> arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            u uVar = arrayList.get(i);
            i++;
            uVar.w(z);
        }
    }

    @Override // ax.I9.u
    public void x(ax.D9.b bVar) {
        super.x(bVar);
        ArrayList<u> arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            u uVar = arrayList.get(i);
            i++;
            uVar.x(bVar);
        }
    }

    public void z(u uVar) {
        this.h.add(uVar);
        uVar.v(this);
        uVar.w(t());
    }
}
