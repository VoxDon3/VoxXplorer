package ax.v2;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import ax.v2.AbstractC3268k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class v extends AbstractC3268k {
    int P0;
    ArrayList<AbstractC3268k> N0 = new ArrayList<>();
    private boolean O0 = true;
    boolean Q0 = false;
    private int R0 = 0;

    class a extends s {
        final /* synthetic */ AbstractC3268k a;

        a(AbstractC3268k abstractC3268k) {
            this.a = abstractC3268k;
        }

        @Override // ax.v2.AbstractC3268k.f
        public void a(AbstractC3268k abstractC3268k) {
            this.a.d0();
            abstractC3268k.Z(this);
        }
    }

    static class b extends s {
        v a;

        b(v vVar) {
            this.a = vVar;
        }

        @Override // ax.v2.AbstractC3268k.f
        public void a(AbstractC3268k abstractC3268k) {
            v vVar = this.a;
            int i = vVar.P0 - 1;
            vVar.P0 = i;
            if (i == 0) {
                vVar.Q0 = false;
                vVar.t();
            }
            abstractC3268k.Z(this);
        }

        @Override // ax.v2.s, ax.v2.AbstractC3268k.f
        public void g(AbstractC3268k abstractC3268k) {
            v vVar = this.a;
            if (vVar.Q0) {
                return;
            }
            vVar.k0();
            this.a.Q0 = true;
        }
    }

    private void A0() {
        b bVar = new b(this);
        ArrayList<AbstractC3268k> arrayList = this.N0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AbstractC3268k abstractC3268k = arrayList.get(i);
            i++;
            abstractC3268k.b(bVar);
        }
        this.P0 = this.N0.size();
    }

    private void q0(AbstractC3268k abstractC3268k) {
        this.N0.add(abstractC3268k);
        abstractC3268k.s0 = this;
    }

    @Override // ax.v2.AbstractC3268k
    public void X(View view) {
        super.X(view);
        int size = this.N0.size();
        for (int i = 0; i < size; i++) {
            this.N0.get(i).X(view);
        }
    }

    @Override // ax.v2.AbstractC3268k
    public void b0(View view) {
        super.b0(view);
        int size = this.N0.size();
        for (int i = 0; i < size; i++) {
            this.N0.get(i).b0(view);
        }
    }

    @Override // ax.v2.AbstractC3268k
    protected void cancel() {
        super.cancel();
        int size = this.N0.size();
        for (int i = 0; i < size; i++) {
            this.N0.get(i).cancel();
        }
    }

    @Override // ax.v2.AbstractC3268k
    protected void d0() {
        if (this.N0.isEmpty()) {
            k0();
            t();
            return;
        }
        A0();
        int i = 0;
        if (this.O0) {
            ArrayList<AbstractC3268k> arrayList = this.N0;
            int size = arrayList.size();
            while (i < size) {
                AbstractC3268k abstractC3268k = arrayList.get(i);
                i++;
                abstractC3268k.d0();
            }
            return;
        }
        for (int i2 = 1; i2 < this.N0.size(); i2++) {
            this.N0.get(i2 - 1).b(new a(this.N0.get(i2)));
        }
        AbstractC3268k abstractC3268k2 = this.N0.get(0);
        if (abstractC3268k2 != null) {
            abstractC3268k2.d0();
        }
    }

    @Override // ax.v2.AbstractC3268k
    public void f0(AbstractC3268k.e eVar) {
        super.f0(eVar);
        this.R0 |= 8;
        int size = this.N0.size();
        for (int i = 0; i < size; i++) {
            this.N0.get(i).f0(eVar);
        }
    }

    @Override // ax.v2.AbstractC3268k
    public void h0(AbstractC3264g abstractC3264g) {
        super.h0(abstractC3264g);
        this.R0 |= 4;
        if (this.N0 != null) {
            for (int i = 0; i < this.N0.size(); i++) {
                this.N0.get(i).h0(abstractC3264g);
            }
        }
    }

    @Override // ax.v2.AbstractC3268k
    public void i(x xVar) {
        if (N(xVar.b)) {
            ArrayList<AbstractC3268k> arrayList = this.N0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                AbstractC3268k abstractC3268k = arrayList.get(i);
                i++;
                AbstractC3268k abstractC3268k2 = abstractC3268k;
                if (abstractC3268k2.N(xVar.b)) {
                    abstractC3268k2.i(xVar);
                    xVar.c.add(abstractC3268k2);
                }
            }
        }
    }

    @Override // ax.v2.AbstractC3268k
    public void i0(u uVar) {
        super.i0(uVar);
        this.R0 |= 2;
        int size = this.N0.size();
        for (int i = 0; i < size; i++) {
            this.N0.get(i).i0(uVar);
        }
    }

    @Override // ax.v2.AbstractC3268k
    void k(x xVar) {
        super.k(xVar);
        int size = this.N0.size();
        for (int i = 0; i < size; i++) {
            this.N0.get(i).k(xVar);
        }
    }

    @Override // ax.v2.AbstractC3268k
    public void l(x xVar) {
        if (N(xVar.b)) {
            ArrayList<AbstractC3268k> arrayList = this.N0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                AbstractC3268k abstractC3268k = arrayList.get(i);
                i++;
                AbstractC3268k abstractC3268k2 = abstractC3268k;
                if (abstractC3268k2.N(xVar.b)) {
                    abstractC3268k2.l(xVar);
                    xVar.c.add(abstractC3268k2);
                }
            }
        }
    }

    @Override // ax.v2.AbstractC3268k
    String l0(String str) {
        String l0 = super.l0(str);
        for (int i = 0; i < this.N0.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(l0);
            sb.append("\n");
            sb.append(this.N0.get(i).l0(str + "  "));
            l0 = sb.toString();
        }
        return l0;
    }

    @Override // ax.v2.AbstractC3268k
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public v b(AbstractC3268k.f fVar) {
        return (v) super.b(fVar);
    }

    @Override // ax.v2.AbstractC3268k
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public v c(View view) {
        for (int i = 0; i < this.N0.size(); i++) {
            this.N0.get(i).c(view);
        }
        return (v) super.c(view);
    }

    @Override // ax.v2.AbstractC3268k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC3268k clone() {
        v vVar = (v) super.clone();
        vVar.N0 = new ArrayList<>();
        int size = this.N0.size();
        for (int i = 0; i < size; i++) {
            vVar.q0(this.N0.get(i).clone());
        }
        return vVar;
    }

    public v p0(AbstractC3268k abstractC3268k) {
        q0(abstractC3268k);
        long j = this.d0;
        if (j >= 0) {
            abstractC3268k.e0(j);
        }
        if ((this.R0 & 1) != 0) {
            abstractC3268k.g0(x());
        }
        if ((this.R0 & 2) != 0) {
            C();
            abstractC3268k.i0(null);
        }
        if ((this.R0 & 4) != 0) {
            abstractC3268k.h0(B());
        }
        if ((this.R0 & 8) != 0) {
            abstractC3268k.f0(w());
        }
        return this;
    }

    public AbstractC3268k r0(int i) {
        if (i < 0 || i >= this.N0.size()) {
            return null;
        }
        return this.N0.get(i);
    }

    @Override // ax.v2.AbstractC3268k
    void s(ViewGroup viewGroup, y yVar, y yVar2, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        long F = F();
        int size = this.N0.size();
        for (int i = 0; i < size; i++) {
            AbstractC3268k abstractC3268k = this.N0.get(i);
            if (F > 0 && (this.O0 || i == 0)) {
                long F2 = abstractC3268k.F();
                if (F2 > 0) {
                    abstractC3268k.j0(F2 + F);
                } else {
                    abstractC3268k.j0(F);
                }
            }
            abstractC3268k.s(viewGroup, yVar, yVar2, arrayList, arrayList2);
        }
    }

    public int s0() {
        return this.N0.size();
    }

    @Override // ax.v2.AbstractC3268k
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public v Z(AbstractC3268k.f fVar) {
        return (v) super.Z(fVar);
    }

    @Override // ax.v2.AbstractC3268k
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public v a0(View view) {
        for (int i = 0; i < this.N0.size(); i++) {
            this.N0.get(i).a0(view);
        }
        return (v) super.a0(view);
    }

    @Override // ax.v2.AbstractC3268k
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public v e0(long j) {
        ArrayList<AbstractC3268k> arrayList;
        super.e0(j);
        if (this.d0 >= 0 && (arrayList = this.N0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.N0.get(i).e0(j);
            }
        }
        return this;
    }

    @Override // ax.v2.AbstractC3268k
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public v g0(TimeInterpolator timeInterpolator) {
        this.R0 |= 1;
        ArrayList<AbstractC3268k> arrayList = this.N0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.N0.get(i).g0(timeInterpolator);
            }
        }
        return (v) super.g0(timeInterpolator);
    }

    public v y0(int i) {
        if (i == 0) {
            this.O0 = true;
            return this;
        }
        if (i == 1) {
            this.O0 = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
    }

    @Override // ax.v2.AbstractC3268k
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public v j0(long j) {
        return (v) super.j0(j);
    }
}
