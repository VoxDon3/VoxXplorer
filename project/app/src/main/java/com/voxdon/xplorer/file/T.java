/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.content.Context;
import ax.Q2.f;
import ax.V2.b;
import ax.Z2.s;
import ax.c3.K;
import ax.c3.g0;
import ax.u3.B;
import com.voxdon.xplorer.file.D;
import com.voxdon.xplorer.file.H;
import com.voxdon.xplorer.file.I;
import com.voxdon.xplorer.file.L;
import com.voxdon.xplorer.file.OneDriveFileHelper;
import com.voxdon.xplorer.file.Q;
import com.voxdon.xplorer.file.W;
import com.voxdon.xplorer.file.Y;
import com.voxdon.xplorer.file.d;
import com.voxdon.xplorer.file.k;
import com.voxdon.xplorer.file.q;
import com.voxdon.xplorer.file.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class T {
    public static T b(Context context, f f8) {
        if (f8 == f.N0) {
            return k.s0(context);
        }
        if (f8 == f.O0) {
            return r.A0(context);
        }
        if (f8 == f.P0) {
            return OneDriveFileHelper.G0(context);
        }
        if (f8 == f.Q0) {
            return Y.t0(context);
        }
        if (f8 == f.R0) {
            return I.r0(context);
        }
        if (f8 == f.T0) {
            return D.a1(context);
        }
        if (f8 == f.U0) {
            return H.U0(context);
        }
        if (f8 == f.S0) {
            return d.r0(context);
        }
        return null;
    }

    public static List<s> c(Context context) {
        ArrayList<s> arrayList = new ArrayList<s>();
        arrayList.addAll(k.s0(context).o());
        arrayList.addAll(r.A0(context).o());
        arrayList.addAll(OneDriveFileHelper.G0(context).m());
        if (ax.X2.Q.D0()) {
            arrayList.addAll(d.r0(context).n());
        }
        arrayList.addAll(Y.t0(context).m());
        T.h(arrayList);
        return arrayList;
    }

    public static g0 d(Context context, f f8) {
        if (f8 == f.H0) {
            return q.z0(context);
        }
        if (f8 == f.I0) {
            return L.A0(context);
        }
        if (f8 == f.J0) {
            return Q.t0(context);
        }
        if (f8 == f.K0) {
            return W.z0(context);
        }
        return null;
    }

    public static List<s> e(Context context) {
        ArrayList<s> arrayList = new ArrayList<s>();
        arrayList.addAll(q.z0(context).p());
        arrayList.addAll(L.A0(context).n());
        arrayList.addAll(Q.t0(context).n());
        arrayList.addAll(W.z0(context).o());
        T.h(arrayList);
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void h(List<s> list) {
        Comparator<s> comparator = list.iterator();
        boolean bl = false;
        while (comparator.hasNext()) {
            long l8 = comparator.next().g();
            if (l8 >= 1000000L || l8 <= 0L) continue;
            bl = true;
        }
        if (!bl) return;
        try {
            comparator = new Comparator<s>(){

                public int a(s s8, s s9) {
                    return B.c(s8.g(), s9.g());
                }
            };
            Collections.sort(list, comparator);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    public static void i(Context context, List<s> object, List<s> list) {
        if (object != null && list != null) {
            Object object2;
            int n8 = 0;
            int n9 = 0;
            while (true) {
                if (n9 >= object.size()) break;
                K k8 = object.get(n9).e();
                object2 = f.p0(k8.d()) ? T.d(context, k8.d()) : T.b(context, k8.d());
                if (object2 != null) {
                    ((T)object2).j(k8.b(), n9 + 1);
                }
                ++n9;
            }
            for (int i8 = n8; i8 < list.size(); ++i8) {
                object2 = list.get(i8).e();
                object = f.p0(((K)object2).d()) ? T.d(context, ((K)object2).d()) : T.b(context, ((K)object2).d());
                if (object == null) continue;
                ((T)object).a(((K)object2).b());
                b.g(context, (K)object2);
            }
        }
    }

    public abstract void a(int var1);

    public abstract s f(int var1);

    public abstract void g(int var1, String var2);

    public abstract void j(int var1, long var2);
}

