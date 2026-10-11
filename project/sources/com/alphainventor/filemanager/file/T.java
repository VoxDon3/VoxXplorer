package com.voxdon.xplorer.file;

import android.content.Context;
import ax.c3.g0;
import ax.u3.C3180B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class T {

    class a implements Comparator<ax.Z2.s> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ax.Z2.s sVar, ax.Z2.s sVar2) {
            return C3180B.c(sVar.g(), sVar2.g());
        }
    }

    public static T b(Context context, ax.Q2.f fVar) {
        if (fVar == ax.Q2.f.N0) {
            return C3592k.s0(context);
        }
        if (fVar == ax.Q2.f.O0) {
            return r.A0(context);
        }
        if (fVar == ax.Q2.f.P0) {
            return OneDriveFileHelper.G0(context);
        }
        if (fVar == ax.Q2.f.Q0) {
            return Y.t0(context);
        }
        if (fVar == ax.Q2.f.R0) {
            return I.r0(context);
        }
        if (fVar == ax.Q2.f.T0) {
            return D.a1(context);
        }
        if (fVar == ax.Q2.f.U0) {
            return H.U0(context);
        }
        if (fVar == ax.Q2.f.S0) {
            return C3585d.r0(context);
        }
        return null;
    }

    public static List<ax.Z2.s> c(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C3592k.s0(context).o());
        arrayList.addAll(r.A0(context).o());
        arrayList.addAll(OneDriveFileHelper.G0(context).m());
        if (ax.X2.Q.D0()) {
            arrayList.addAll(C3585d.r0(context).n());
        }
        arrayList.addAll(Y.t0(context).m());
        h(arrayList);
        return arrayList;
    }

    public static g0 d(Context context, ax.Q2.f fVar) {
        if (fVar == ax.Q2.f.H0) {
            return C3598q.z0(context);
        }
        if (fVar == ax.Q2.f.I0) {
            return L.A0(context);
        }
        if (fVar == ax.Q2.f.J0) {
            return Q.t0(context);
        }
        if (fVar == ax.Q2.f.K0) {
            return W.z0(context);
        }
        return null;
    }

    public static List<ax.Z2.s> e(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C3598q.z0(context).p());
        arrayList.addAll(L.A0(context).n());
        arrayList.addAll(Q.t0(context).n());
        arrayList.addAll(W.z0(context).o());
        h(arrayList);
        return arrayList;
    }

    private static void h(List<ax.Z2.s> list) {
        Iterator<ax.Z2.s> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            long g = it.next().g();
            if (g < 1000000 && g > 0) {
                z = true;
            }
        }
        if (z) {
            try {
                Collections.sort(list, new a());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public static void i(Context context, List<ax.Z2.s> list, List<ax.Z2.s> list2) {
        if (list == null || list2 == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            ax.c3.K e = list.get(i).e();
            T d = ax.Q2.f.p0(e.d()) ? d(context, e.d()) : b(context, e.d());
            if (d != null) {
                d.j(e.b(), i + 1);
            }
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ax.c3.K e2 = list2.get(i2).e();
            T d2 = ax.Q2.f.p0(e2.d()) ? d(context, e2.d()) : b(context, e2.d());
            if (d2 != null) {
                d2.a(e2.b());
                ax.V2.b.g(context, e2);
            }
        }
    }

    public abstract void a(int i);

    public abstract ax.Z2.s f(int i);

    public abstract void g(int i, String str);

    public abstract void j(int i, long j);
}
