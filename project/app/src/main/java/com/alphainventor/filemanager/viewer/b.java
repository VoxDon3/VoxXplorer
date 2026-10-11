/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.viewer;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import ax.A3.b;
import ax.Q2.a;
import ax.Z2.c;
import ax.a3.Q;
import ax.c3.A;
import ax.c3.B;
import ax.c3.d0;
import ax.c3.k;
import ax.c3.u;
import ax.c3.v;
import ax.c3.w;
import ax.c3.z;
import ax.d3.M;
import ax.t3.j;
import ax.u3.q;
import ax.z3.a;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import com.alphainventor.filemanager.provider.MyFileProvider;
import com.alphainventor.filemanager.viewer.ImageViewerActivity;
import com.alphainventor.filemanager.viewer.e;
import com.android.ex.photo.c;
import com.android.ex.photo.e;
import com.android.ex.photo.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b
extends com.android.ex.photo.f {
    private List<n> P;
    private List<n> Q;
    private boolean R;
    private boolean S;
    private o T;
    private ax.r3.d U;
    private Cursor V;
    private Cursor W;
    private Boolean X;
    private d Y;

    public b(f.g g8, List<n> list, o o8) {
        super(g8);
        this.P = list;
        this.T = o8;
        this.U = new ax.r3.d(g8.b(), this.T);
    }

    private static void N0(MatrixCursor matrixCursor, n n8) {
        String string = ax.c3.B.P(n8) ? ax.c3.B.W(n8) : ax.c3.B.Y(n8);
        String string2 = string;
        if (ax.c3.B.H(n8)) {
            string2 = string;
            if (n8.p() < 50000L) {
                string2 = null;
            }
        }
        matrixCursor.newRow().add((Object)n8.Q()).add((Object)n8.B()).add((Object)n8.Q()).add((Object)string2).add((Object)n8.s());
    }

    public static MatrixCursor O0(ArrayList<n> arrayList) {
        MatrixCursor matrixCursor = new MatrixCursor(ax.B3.a.a);
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            n n9 = arrayList.get(i8);
            b.N0(matrixCursor, n9);
        }
        return matrixCursor;
    }

    private ArrayList<e.a> Q0(Context object, Uri object2, List<n> list) {
        boolean bl = ax.a3.Q.I3(object, (Uri)object2);
        object2 = new ArrayList();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            object = list.get(i8);
            boolean bl2 = bl ? ax.c3.A.F((n)object) : ax.c3.A.E((n)object);
            if (!bl2) continue;
            ((ArrayList)object2).add(new e.a(u.L((n)object, false), null));
        }
        return object2;
    }

    private n R0(String string) {
        if (string == null) {
            return null;
        }
        List<n> list = this.U0();
        if (list == null) {
            return null;
        }
        for (int i8 = 0; i8 < list.size(); ++i8) {
            n n8 = list.get(i8);
            if (!string.equals(n8.Q())) continue;
            return n8;
        }
        return null;
    }

    private int S0(Uri uri) {
        if (uri == null) {
            return -1;
        }
        List<n> list = this.U0();
        if (list == null) {
            return -1;
        }
        for (int i8 = 0; i8 < list.size(); ++i8) {
            n n8 = list.get(i8);
            if (!ax.c3.B.H(n8) || !uri.equals((Object)u.L(n8, false))) continue;
            return i8;
        }
        return -1;
    }

    private void T0(ax.z3.a a8) {
        if (this.O() != null) {
            this.O().i();
        }
    }

    private List<n> U0() {
        if (this.R) {
            return this.Q;
        }
        return this.P;
    }

    public static Intent W0(Context context, n n8, boolean bl) {
        ax.u3.b.c(ax.c3.B.H(n8));
        String string = ax.c3.v.e(n8, "application/octet-stream");
        n8 = ax.c3.B.H(n8) ? ax.a3.Q.E3(n8) : u.w(n8.Z());
        return ax.a3.Q.z3(context, c.a.d0, (Uri)n8, string, true, bl);
    }

    private View X0() {
        return this.N(2131361973);
    }

    private View Y0(ax.z3.a a8) {
        if (a8.R0() == null) {
            return null;
        }
        return a8.R0().findViewById(2131362067);
    }

    private void Z0(ax.z3.a a8) {
        if ((a8 = this.Y0(a8)) != null) {
            a8.setVisibility(8);
        }
    }

    private boolean a1(int n8) {
        List<n> list = this.U0();
        if (list == null) {
            return false;
        }
        return n8 < list.size() && n8 >= 0;
    }

    private void b1(k k8, c c8) {
        if (this.O() != null) {
            Activity activity = (Activity)this.O().b();
            try {
                k8 = ax.c3.w.e((Context)activity, MyFileProvider.p(k8, c8.c, c8.d, c8.f));
                this.X = this.s();
                activity.startActivityForResult((Intent)k8, 36002);
                return;
            }
            catch (ActivityNotFoundException | IllegalArgumentException | SecurityException throwable) {
                this.X = null;
                Toast.makeText((Context)activity, (int)2131951927, (int)1).show();
            }
        }
    }

    private void c1() {
        if (this.O() instanceof ImageViewerActivity) {
            ((ImageViewerActivity)this.O()).x0();
        }
    }

    private void d1(ax.z3.a a8) {
        Object object = this.Y0(a8);
        if (object == null) {
            ax.u3.b.f();
            return;
        }
        Object object2 = Uri.parse((String)a8.Y2());
        if (this.l((Uri)object2)) {
            a8.U2(false);
            object.setVisibility(0);
            object.setOnClickListener((View.OnClickListener)new ax.g3.c(this, (Uri)object2){
                final Uri c;
                final b d;
                {
                    this.d = b8;
                    this.c = uri;
                }

                @Override
                public void a(View view) {
                    this.d.r(this.c, false);
                }
            });
            object.requestFocus();
        } else {
            object.setVisibility(8);
        }
        if (!this.y(a8)) {
            a8.m3(null);
            return;
        }
        View view = this.X0();
        if (view == null) {
            ax.u3.b.f();
            return;
        }
        object = this.R0(a8.Y2());
        object2 = a8.X2();
        if (ax.c3.B.H((n)object) && object2 != null && object2.g == object && object2.b && object2.c >= 0L && object2.d > 0L) {
            a8.m3(new a.h(){
                final ax.z3.a a;
                final b b;
                {
                    this.b = b8;
                    this.a = a8;
                }

                @Override
                public void a(boolean bl) {
                    if (this.b.y(this.a)) {
                        this.b.g1(bl ^ true);
                    }
                }
            });
            this.g1(a8.e3() ^ true);
            view.setOnClickListener((View.OnClickListener)new ax.g3.c(this, (n)object, (c)object2){
                final n c;
                final c d;
                final b e;
                {
                    this.e = b8;
                    this.c = n8;
                    this.d = c8;
                }

                @Override
                public void a(View view) {
                    this.e.b1((k)this.c, this.d);
                }
            });
            view.requestFocus();
            return;
        }
        a8.m3(null);
        this.g1(false);
    }

    private void g1(boolean bl) {
        if (this.O() instanceof ImageViewerActivity) {
            ((ImageViewerActivity)this.O()).F0(bl);
        }
    }

    @Override
    public void A(ax.z3.a a8, boolean bl) {
        super.A(a8, bl);
        this.d1(a8);
        this.T0(a8);
        if (!bl) {
            this.d1(a8);
            Object object = Uri.parse((String)a8.Y2());
            if (this.l((Uri)object)) {
                if ((object = this.R0(object.toString())) != null && object.n()) {
                    a8.W2().setVisibility(8);
                    return;
                }
                this.Z0(a8);
            }
        }
    }

    @Override
    public void E0(boolean bl) {
        if (bl) {
            this.P0();
            this.R = true;
            this.D0(this.W);
            return;
        }
        Cursor cursor = this.V;
        if (cursor == null) {
            ax.u3.b.f();
            return;
        }
        this.R = false;
        this.D0(cursor);
        cursor = this.W;
        if (cursor != null) {
            cursor.close();
            this.W = null;
            this.Q = null;
        }
    }

    @Override
    public void F0() {
        int n8 = this.n.getCurrentItem();
        int n9 = n8 + 1;
        boolean bl = this.j >= 0;
        Object object = this.U0();
        if (!this.k && bl && n9 > 0 && object != null) {
            if (this.j > 1) {
                this.x = this.O().getResources().getString(2131952497, new Object[]{n9, this.j});
                this.y = this.a1(n8) ? ((object = (n)object.get(n8)) != null ? ((n)object).B() : "") : "";
            } else {
                this.x = (object = object.get(0)) != null ? ((n)object).B() : "";
            }
        } else {
            this.x = null;
        }
        this.x0(this.O().o());
    }

    @Override
    public void K(int n8) {
        this.g1(false);
        super.K(n8);
        d d8 = this.Y;
        if (d8 != null && !d8.isCancelled() && ax.u3.q.n(this.Y)) {
            this.Y.e();
        }
        this.Y = d8 = new d(this, n8);
        d8.i(new Void[0]);
    }

    public void P0() {
        ArrayList<n> arrayList = new ArrayList<n>(this.P);
        Collections.shuffle(arrayList);
        this.Q = arrayList;
        Cursor cursor = this.W;
        if (cursor != null) {
            cursor.close();
        }
        this.W = b.O0(arrayList);
    }

    public Uri V0() {
        int n8 = this.n.getCurrentItem();
        Cursor cursor = this.p.x();
        if (cursor != null && !cursor.isClosed()) {
            cursor.moveToPosition(n8);
            return Uri.parse((String)this.p.E(cursor));
        }
        return null;
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        this.c1();
    }

    @Override
    public void d0(int n8, int n9, Intent intent) {
        if (n8 == 36001 && n9 == -1 && intent != null && (n8 = this.S0(intent.getData())) >= 0) {
            this.V().setCurrentItem(n8);
        }
    }

    public void e1() {
        this.S = true;
        this.k = true;
        this.O().getSupportLoaderManager().g(100, null, this);
    }

    public void f1() {
        e.b b8 = this.P();
        if (b8 != null) {
            b8.k();
        }
    }

    @Override
    public void g(ax.z3.a a8) {
        super.g(a8);
        this.d1(a8);
        this.T0(a8);
    }

    @Override
    public void i(c c8, View object) {
        if (this.O() == null) {
            return;
        }
        Object object2 = object.getTag();
        if (object2 instanceof ax.w3.e) {
            object = (ax.w3.e)object2;
        } else {
            object2 = new ax.w3.e((View)object);
            object.setTag(object2);
            object = object2;
        }
        object2 = c8 == null && (object2 = this.V0()) != null ? this.R0(object2.toString()) : null;
        object.d(this.O().b(), c8, (n)object2);
    }

    @Override
    public void k0(ax.K0.c<Cursor> c8, Cursor cursor) {
        if (cursor == null || cursor != this.V) {
            this.V = cursor;
            try {
                super.k0(c8, cursor);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                ax.Ha.c.h().d("IVOLF:").l(noSuchMethodError).h();
            }
            if (this.S) {
                this.S = false;
                if (this.O() != null) {
                    ((ImageViewerActivity)this.O()).y0();
                    this.F0();
                }
            }
        }
    }

    @Override
    public boolean l(Uri object) {
        return z.e0 == ax.c3.A.g((String)(object = d0.k(object.getPath())));
    }

    @Override
    public void o0() {
        super.o0();
        if (this.O() != null) {
            Boolean bl = this.X;
            if (bl != null) {
                this.y0(bl, false);
                this.X = null;
                return;
            }
            if (!this.O().r()) {
                this.y0(false, false);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void r(Uri var1_1, boolean var2_6) {
        block24: {
            if (this.O() != null && (var8_7 = this.R0(var1_1 /* !! */ .toString())) != null) {
                var5_8 = this.U0();
                if (!ax.c3.B.H(var8_7)) {
                    var7_9 = var8_7.O();
                    var6_10 = var8_7;
                    var4_11 = var5_8;
                    if (var7_9 == null) ** GOTO lbl33
                    try {
                        var3_14 = ax.c3.B.F(var7_9, var8_7);
                        var6_10 = var8_7;
                        var4_11 = var5_8;
                        ** if (!var3_14) goto lbl-1000
                    }
                    catch (ax.b3.j var4_13) {
                        var6_10 = var8_7;
                        var4_11 = var5_8;
                    }
lbl-1000:
                    // 1 sources

                    {
                        try {
                            var4_11 = Collections.singletonList(var7_9);
lbl16:
                            // 2 sources

                            while (true) {
                                var6_10 = var7_9;
                                break;
                            }
                        }
                        catch (ax.b3.j var4_12) {
                            var4_11 = var5_8;
                            ** continue;
                        }
                    }
lbl-1000:
                    // 1 sources

                    {
                    }
                } else {
                    var6_10 = var8_7;
                    var4_11 = var5_8;
                    if (var5_8 == null) {
                        ax.u3.b.e("what case is this?");
                        var4_11 = Collections.singletonList(var8_7);
                        var6_10 = var8_7;
                    }
                }
                var5_8 = (Activity)this.O().b();
                if (ax.c3.B.H(var6_10)) {
                    var6_10 = (k)var6_10;
                    var1_1 /* !! */  = var2_6 != false ? f.q : (ax.a3.Q.K3((Context)var5_8, (c.a)(var1_1 /* !! */  = c.a.c0), var6_10, false) != false && ax.a3.Q.N3((Context)var5_8, (c.a)var1_1 /* !! */ , var6_10, false) == false ? f.c0 : (ax.t3.j.F((Context)var5_8) != false && ax.c3.A.E(var6_10) != false ? f.q : ((var1_1 /* !! */  = b.W0((Context)var5_8, var6_10, true)) != null && u.U((Intent)var1_1 /* !! */ ) != false ? f.q : f.d0)));
                    if (var1_1 /* !! */  == f.q) {
                        var1_1 /* !! */  = u.L(var6_10, false);
                        var4_11 = this.Q0((Context)var5_8, var1_1 /* !! */ , (List<n>)var4_11);
                        try {
                            a.i().m("command", "file_open").c("loc", "ImageViewerActivity").c("ext", var6_10.A()).c("result", "success").e();
                            var5_8.startActivityForResult(ax.c3.w.j((Context)var5_8, var1_1 /* !! */ , (ArrayList<e.a>)var4_11, true, false), 36001);
                            break block24;
                        }
                        catch (NullPointerException var1_2) {
                        }
                        catch (SecurityException var1_4) {
                        }
                        catch (ActivityNotFoundException var1_5) {}
                        Toast.makeText((Context)var5_8, (int)2131951927, (int)1).show();
                        ax.Ha.c.h().f().b("PVI:").l((Throwable)var1_3).h();
                    } else if (var1_1 /* !! */  == f.c0) {
                        var1_1 /* !! */  = this.O().m();
                        if (var1_1 /* !! */  instanceof M) {
                            ((M)var1_1 /* !! */ ).M2(c.a.c0, (k)var6_10, var6_10.s(), false, false);
                        }
                    } else {
                        var1_1 /* !! */  = this.O().m();
                        if (var1_1 /* !! */  instanceof M) {
                            ((M)var1_1 /* !! */ ).M2(c.a.d0, (k)var6_10, var6_10.s(), false, false);
                        }
                    }
                } else {
                    var4_11 = new StringBuilder();
                    var4_11.append("PLAY VIDEO:");
                    var4_11.append(var1_1 /* !! */ .toString());
                    var4_11.append(",fileinfo:");
                    var4_11.append(var6_10.R());
                    var1_1 /* !! */  = var4_11.toString();
                    ax.Ha.c.h().f().b("NOT REACHABLE : IMAGE VIEWER").j().g(var1_1 /* !! */ ).h();
                    Toast.makeText((Context)var5_8, (int)2131951927, (int)1).show();
                }
            }
        }
    }

    @Override
    public ax.K0.c<Cursor> w(int n8, Bundle bundle) {
        if (n8 == 100) {
            return new e(this.O().b(), this.P);
        }
        return super.w(n8, bundle);
    }

    @Override
    public ax.K0.c<b.a> z(int n8, Bundle bundle, String string) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return super.z(n8, bundle, string);
                }
            } else {
                return new ax.w3.f(this.O().b(), this.T, null, string, true, false);
            }
        }
        boolean bl = bundle != null ? bundle.getBoolean("use_factory_if_possible", true) : true;
        return new ax.w3.f(this.O().b(), this.T, this.R0(string), string, false, bl);
    }

    class d
    extends q<Void, Integer, Void> {
        int h;
        final b i;

        d(b b8, int n8) {
            this.i = b8;
            super(q.e.e0);
            this.h = n8;
        }

        private void w(int n8) {
            n n9;
            Object object;
            if (!this.isCancelled() && (object = this.i.U0()) != null && this.i.a1(n8) && (ax.c3.B.P(n9 = (n)object.get(n8)) || n9.P() == ax.Q2.f.b1)) {
                object = ax.c3.B.Y(n9);
                if (ax.r3.d.l(this.i.O().b(), (String)object) == null) {
                    this.i.U.t(n9);
                }
            }
        }

        protected Void x(Void ... voidArray) {
            if (this.i.Y()) {
                return null;
            }
            this.w(this.h - 1);
            this.w(this.h + 1);
            this.w(this.h - 2);
            this.w(this.h + 2);
            return null;
        }
    }

    public static class e
    extends ax.K0.b {
        ArrayList<n> w;

        public e(Context object, List<n> list) {
            super((Context)object);
            this.w = object = new ArrayList();
            if (list != null) {
                ((ArrayList)object).addAll(list);
            }
        }

        @Override
        public Cursor M() {
            return b.O0(this.w);
        }
    }

    private static final class f
    extends Enum<f> {
        public static final /* enum */ f c0;
        public static final /* enum */ f d0;
        private static final f[] e0;
        public static final /* enum */ f q;

        static {
            q = new f();
            c0 = new f();
            d0 = new f();
            e0 = f.d();
        }

        private static /* synthetic */ f[] d() {
            return new f[]{q, c0, d0};
        }

        public static f valueOf(String string) {
            return Enum.valueOf(f.class, string);
        }

        public static f[] values() {
            return (f[])e0.clone();
        }
    }
}

