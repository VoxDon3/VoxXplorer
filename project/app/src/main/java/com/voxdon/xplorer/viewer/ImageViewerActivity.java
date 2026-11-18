/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.viewer;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import ax.W2.h;
import ax.W2.o;
import ax.X2.Q;
import ax.X2.v;
import ax.Z2.c;
import ax.Z2.h;
import ax.Z2.t;
import ax.b3.j;
import ax.c3.A;
import ax.c3.B;
import ax.c3.K;
import ax.c3.u;
import ax.c3.w;
import ax.c3.z;
import ax.d3.M;
import ax.d3.n;
import ax.d3.s;
import ax.i.r;
import ax.r3.d;
import ax.u3.q;
import ax.x3.E;
import ax.x3.d;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import com.voxdon.xplorer.viewer.b;
import com.voxdon.xplorer.viewer.c;
import com.android.ex.photo.a;
import com.android.ex.photo.f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ImageViewerActivity
extends com.voxdon.xplorer.activity.a
implements f.g,
ax.R2.a {
    public static int G = 36102;
    public static String H = "IMAGE_INFO_KEY";
    private long A;
    private boolean B;
    private String C;
    private String D;
    private boolean E;
    r F;
    private f j;
    private com.android.ex.photo.b k;
    private E l;
    private final HashMap<String, Boolean> m = new HashMap();
    List<com.voxdon.xplorer.file.n> n;
    private ax.Q2.f o;
    private int p;
    com.voxdon.xplorer.file.o q;
    int r;
    ax.x3.d s;
    View t;
    boolean u;
    View v;
    View w;
    M x;
    private HashMap<ComponentName, m> y = new HashMap();
    private com.voxdon.xplorer.file.n z;

    public ImageViewerActivity() {
        this.F = new r(this, true){
            final ImageViewerActivity d;
            {
                this.d = imageViewerActivity;
                super(bl);
            }

            @Override
            public void c() {
                ImageViewerActivity.X(this.d, false);
                this.d.p();
            }

            @Override
            public void d() {
                this.d.j.e0();
                ImageViewerActivity.X(this.d, false);
                this.d.p();
            }

            @Override
            public void f(ax.i.b b8) {
                ImageViewerActivity.X(this.d, true);
            }
        };
    }

    private void A0() {
        if (this.j() != null && this.j().V() != null) {
            if (!this.j().s()) {
                this.j().n();
            }
            this.l.z();
        }
    }

    private void B0(com.voxdon.xplorer.file.n object) {
        if (!(object instanceof y)) {
            if (object == null) {
                object = "loc:null";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("loc:");
                stringBuilder.append(((com.voxdon.xplorer.file.n)object).P().I());
                object = stringBuilder.toString();
            }
            ax.u3.b.g((String)object);
            return;
        }
        if (!(this.q.u() instanceof x)) {
            ax.u3.b.f();
            return;
        }
        K k8 = ((y)object).B0();
        if (k8 != null && k8.e() != null) {
            new n(this, (com.voxdon.xplorer.file.n)object).i(new Void[0]);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean C0(com.voxdon.xplorer.file.n n8) {
        Throwable throwable2;
        ParcelFileDescriptor parcelFileDescriptor;
        block17: {
            long l8;
            Object object;
            ParcelFileDescriptor parcelFileDescriptor2;
            ParcelFileDescriptor parcelFileDescriptor3;
            Object object2;
            block16: {
                Exception exception2;
                block18: {
                    object2 = null;
                    parcelFileDescriptor = parcelFileDescriptor3 = null;
                    parcelFileDescriptor2 = object2;
                    try {
                        object = ((y)n8).B0();
                        if (object == null) return false;
                        parcelFileDescriptor = parcelFileDescriptor3;
                        parcelFileDescriptor2 = object2;
                        if (((K)object).e() == null) {
                            return false;
                        }
                        parcelFileDescriptor = parcelFileDescriptor3;
                        parcelFileDescriptor2 = object2;
                        if (!this.i0((K)object)) {
                            return false;
                        }
                        parcelFileDescriptor = parcelFileDescriptor3;
                        parcelFileDescriptor2 = object2;
                        l8 = n8.q();
                        parcelFileDescriptor = parcelFileDescriptor3;
                        parcelFileDescriptor2 = object2;
                        object = (x)this.q.u();
                        parcelFileDescriptor = parcelFileDescriptor3;
                        parcelFileDescriptor2 = object2;
                        parcelFileDescriptor3 = ((x)object).U0((y)n8);
                        if (parcelFileDescriptor3 != null) break block16;
                        if (parcelFileDescriptor3 == null) return false;
                    }
                    catch (Throwable throwable2) {
                        break block17;
                    }
                    catch (Exception exception2) {
                        break block18;
                    }
                    try {
                        parcelFileDescriptor3.close();
                        return false;
                    }
                    catch (IOException iOException) {
                        return false;
                    }
                }
                parcelFileDescriptor = parcelFileDescriptor2;
                {
                    exception2.printStackTrace();
                    if (parcelFileDescriptor2 == null) return false;
                }
                try {
                    parcelFileDescriptor2.close();
                    return false;
                }
                catch (IOException iOException) {
                    return false;
                }
            }
            parcelFileDescriptor = parcelFileDescriptor3;
            parcelFileDescriptor2 = parcelFileDescriptor3;
            parcelFileDescriptor = parcelFileDescriptor3;
            parcelFileDescriptor2 = parcelFileDescriptor3;
            object2 = new ax.y0.a(parcelFileDescriptor3.getFileDescriptor());
            parcelFileDescriptor = parcelFileDescriptor3;
            parcelFileDescriptor2 = parcelFileDescriptor3;
            if (((ax.y0.a)object2).l("Orientation", 1) == 0) {
                parcelFileDescriptor = parcelFileDescriptor3;
                parcelFileDescriptor2 = parcelFileDescriptor3;
                ((ax.y0.a)object2).f0();
            }
            parcelFileDescriptor = parcelFileDescriptor3;
            parcelFileDescriptor2 = parcelFileDescriptor3;
            ((ax.y0.a)object2).h0(-90);
            parcelFileDescriptor = parcelFileDescriptor3;
            parcelFileDescriptor2 = parcelFileDescriptor3;
            ((ax.y0.a)object2).i0();
            parcelFileDescriptor = parcelFileDescriptor3;
            parcelFileDescriptor2 = parcelFileDescriptor3;
            ((x)object).d(n8, l8);
            parcelFileDescriptor = parcelFileDescriptor3;
            parcelFileDescriptor2 = parcelFileDescriptor3;
            ((x)object).Q1(n8);
            parcelFileDescriptor = parcelFileDescriptor3;
            parcelFileDescriptor2 = parcelFileDescriptor3;
            d.B((Context)this, this.q.H(n8));
            {
                parcelFileDescriptor3.close();
                return true;
            }
        }
        if (parcelFileDescriptor == null) throw throwable2;
        try {}
        catch (IOException iOException) {
            throw throwable2;
        }
        parcelFileDescriptor.close();
        throw throwable2;
    }

    private void D0() {
        if (this.r0()) {
            this.E = true;
            ax.c3.u.s0(this, Uri.fromFile((File)new File(this.C)), this.D);
            this.finish();
            return;
        }
        ax.u3.b.f();
        Toast.makeText((Context)this, (int)2131951927, (int)1).show();
    }

    private void E0(com.voxdon.xplorer.file.n n8) {
        ax.Q2.a.i().m("menu_image_viewer", "set_as").e();
        if (ax.c3.B.H(n8)) {
            ax.c3.u.g0((Context)this.s(), (ax.c3.k)n8);
            return;
        }
        File file = n8.Z();
        if (ax.c3.B.G(file, n8)) {
            ax.Z2.t.b().e(file);
            ax.c3.u.h0((Context)this.s(), n8.s(), file);
            return;
        }
        this.h0(n8, new n.p(){
            final com.voxdon.xplorer.file.n a;
            final File b;
            final ImageViewerActivity c;
            {
                this.c = imageViewerActivity;
                this.a = n8;
                this.b = file;
            }

            @Override
            public void a() {
                if (this.c.s() == null) {
                    return;
                }
                ax.c3.u.h0((Context)this.c.s(), this.a.s(), this.b);
            }
        });
    }

    private void G0(com.voxdon.xplorer.file.n n8) {
        this.z = n8;
        this.A = n8.q();
    }

    private void H0(com.voxdon.xplorer.file.n n8) {
        ax.Q2.a.i().m("menu_image_viewer", "share").c("loc", "image_viewer").c("type", "file").e();
        if (ax.c3.B.H(n8)) {
            ax.c3.u.j0((Context)this.s(), (ax.c3.k)n8);
            return;
        }
        File file = n8.Z();
        if (ax.c3.B.G(file, n8)) {
            ax.Z2.t.b().e(file);
            ax.c3.u.m0((Context)this.s(), n8.s(), file);
            return;
        }
        this.h0(n8, new n.p(){
            final com.voxdon.xplorer.file.n a;
            final File b;
            final ImageViewerActivity c;
            {
                this.c = imageViewerActivity;
                this.a = n8;
                this.b = file;
            }

            @Override
            public void a() {
                if (this.c.s() == null) {
                    return;
                }
                ax.c3.u.m0((Context)this.c.s(), this.a.s(), this.b);
            }
        });
    }

    private void I0(com.voxdon.xplorer.file.n n8) {
        this.j().c(true);
        if (!this.j().s()) {
            this.j().n();
        }
    }

    private void L0(com.voxdon.xplorer.file.n n8) {
        if (this.j() != null && this.j().V() != null) {
            if (!this.j().s()) {
                this.j().n();
            }
            this.l.D();
        }
    }

    private boolean M0(com.voxdon.xplorer.file.n n8) {
        if (ax.c3.B.H(n8)) {
            return true;
        }
        Q.r0();
        return false;
    }

    static /* synthetic */ boolean X(ImageViewerActivity imageViewerActivity, boolean bl) {
        imageViewerActivity.B = bl;
        return bl;
    }

    private void d0() {
        ax.g3.c c8 = new ax.g3.c(this, 400L){
            final ImageViewerActivity c;
            {
                this.c = imageViewerActivity;
                super(l8);
            }

            @Override
            public void a(View view) {
                this.c.w0(view.getId());
            }
        };
        this.s = new ax.x3.d(this.s(), this.findViewById(2131361934), null);
        if (this.r0()) {
            this.s.d(2131362536, 2131952296, 2131231212, c8);
            this.s.d(2131362516, 2131952269, 2131231156, c8);
            this.s.d(2131362543, 2131952576, 2131231086, c8);
            return;
        }
        this.s.d(2131362545, 2131952304, 2131231220, c8);
        this.s.d(2131362535, 2131952295, 2131231211, c8);
        this.s.d(2131362506, 2131952255, 2131231124, c8);
        this.s.d(2131362516, 2131952269, 2131231156, c8);
        this.s.e();
        this.s.l(2131689492);
        this.s.n(new d.f(this){
            final ImageViewerActivity a;
            {
                this.a = imageViewerActivity;
            }

            @Override
            public boolean a(int n8) {
                this.a.w0(n8);
                return true;
            }
        });
        this.s.x(new d.g(this){
            final ImageViewerActivity a;
            {
                this.a = imageViewerActivity;
            }

            @Override
            public void a() {
                Object object = this.a;
                Object object2 = ((b)((ImageViewerActivity)object).j()).V0();
                boolean bl = (object2 = this.a.k0(object2)) != null ? ax.c3.B.H((com.voxdon.xplorer.file.n)object2) : false;
                this.a.s.t(2131362524, bl);
                if (bl && (object = b.W0((Context)object, (com.voxdon.xplorer.file.n)object2, true)) != null && (object = this.a.n0((Intent)object)) != null) {
                    this.a.s.s(2131362522, ((m)object).a);
                    this.a.s.q(2131362522, ((m)object).b);
                    bl = true;
                } else {
                    bl = false;
                }
                this.a.s.t(2131362522, bl);
                this.a.s.t(2131362547, true);
                this.a.s.t(2131362507, false);
            }

            @Override
            public void b(boolean bl) {
                this.a.j.a(bl);
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e0() {
        com.voxdon.xplorer.file.n n8 = this.z;
        if (n8 == null) {
            return;
        }
        if (n8 instanceof ax.c3.k) {
            try {
                long l8 = ax.c3.x.e(n8.R()).z(this.z.E()).q();
                long l9 = this.A;
                if (l8 != l9) {
                    ((b)this.j()).f1();
                }
            }
            catch (j j8) {}
        }
        this.z = null;
        this.A = 0L;
    }

    private void g0(com.voxdon.xplorer.file.n n8) {
        ax.Q2.a.i().m("menu_image_viewer", "delete").c("loc", "image_viewer").c("type", "file").e();
        ArrayList<com.voxdon.xplorer.file.n> arrayList = new ArrayList<com.voxdon.xplorer.file.n>();
        arrayList.add(n8);
        boolean bl = ax.c3.B.a(arrayList) && ax.Q2.f.l(n8.P());
        this.j().L();
        ax.W2.o.m(this.q, arrayList, 0, bl, this, false, new h.a(){
            final com.voxdon.xplorer.file.n a;
            final ImageViewerActivity b;
            {
                this.b = imageViewerActivity;
                this.a = n8;
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                if (b8 == h.b.c0) {
                    int n8 = this.b.n.indexOf(this.a);
                    this.b.n.remove(this.a);
                    if (this.b.n.isEmpty()) {
                        Toast.makeText((Context)this.b, (CharSequence)string, (int)1).show();
                        this.b.finish();
                        return;
                    }
                    ((b)this.b.j()).e1();
                    if (arrayList.size() > 0 && n8 >= 0) {
                        this.b.K0(this.a, n8, string, arrayList);
                        return;
                    }
                    this.b.J0(string, -1);
                    return;
                }
                this.b.J0(string, 0);
            }

            @Override
            public void b() {
                this.b.j().t0();
            }
        }, new DialogInterface.OnCancelListener(this){
            final ImageViewerActivity a;
            {
                this.a = imageViewerActivity;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.a.j().t0();
            }
        });
    }

    private void h0(com.voxdon.xplorer.file.n object, n.p p8) {
        ArrayList<com.voxdon.xplorer.file.n> arrayList = new ArrayList<com.voxdon.xplorer.file.n>();
        arrayList.add((com.voxdon.xplorer.file.n)object);
        object = ax.W2.r.l();
        ((ax.W2.r)object).k(this.q, arrayList, true, new h.a(){
            final n.p a;
            final ImageViewerActivity b;
            {
                this.b = imageViewerActivity;
                this.a = p8;
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                int n8 = c.a[b8.ordinal()];
                if (n8 != 1) {
                    if (n8 != 2 && n8 != 3) {
                        return;
                    }
                    Toast.makeText((Context)this.b.s(), (CharSequence)string, (int)1).show();
                    return;
                }
                this.a.a();
            }

            @Override
            public void b() {
            }
        });
        try {
            this.l((ax.W2.h)object, true);
            return;
        }
        catch (ax.b3.c c8) {
            Toast.makeText((Context)this, (int)2131951927, (int)0).show();
            return;
        }
    }

    private boolean i0(K k8) {
        String string = k8.e();
        if (this.m.containsKey(string)) {
            return this.m.get(string);
        }
        boolean bl = ax.c3.B.t(k8);
        this.m.put(string, bl);
        return bl;
    }

    private void j0(com.voxdon.xplorer.file.n n8) {
        if (ax.c3.B.H(n8)) {
            try {
                ax.c3.u.o0((Context)this, ax.c3.u.e((Context)this, (ax.c3.k)n8, false));
                return;
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                this.J0(this.getString(2131952449), -1);
            }
        }
    }

    private com.voxdon.xplorer.file.n k0(Uri uri) {
        if (uri == null) {
            return null;
        }
        for (com.voxdon.xplorer.file.n n8 : this.n) {
            if (!uri.toString().equals(n8.Q())) continue;
            return n8;
        }
        return null;
    }

    private void m0(int n8) {
        View view = n8 == 20 ? this.s.j() : this.l0();
        if (view != null) {
            if (!this.q0()) {
                this.j().u0();
            } else {
                this.j().n();
            }
            view.requestFocus();
        }
    }

    private m n0(Intent object) {
        ComponentName componentName = object.getComponent();
        if (this.y.containsKey(componentName)) {
            return this.y.get(componentName);
        }
        PackageManager packageManager = this.getPackageManager();
        object = packageManager.queryIntentActivities((Intent)object, 65536);
        if (object != null && object.size() > 0) {
            object = (ResolveInfo)object.get(0);
            CharSequence charSequence = ((ResolveInfo)object).activityInfo.loadLabel(packageManager);
            packageManager = h.n(packageManager, (ResolveInfo)object, 0);
            object = packageManager;
            if (packageManager != null) {
                int n8 = ax.u3.B.e((Context)this, ax.x3.d.n);
                object = ax.u3.z.f((Drawable)packageManager, n8, n8);
                object = new BitmapDrawable(this.getResources(), (Bitmap)object);
            }
            object = new m(charSequence, (Drawable)object);
            this.y.put(componentName, (m)object);
            return object;
        }
        return null;
    }

    private boolean o0(ViewGroup viewGroup, View view) {
        return ax.u3.z.s(viewGroup, view);
    }

    private boolean p0(String string) {
        return "webp".equals(string) || "png".equals(string) || "jpg".equals(string) || "jpeg".equals(string);
        {
        }
    }

    private boolean q0() {
        return this.s.k() != 0;
    }

    private boolean r0() {
        return this.C != null;
    }

    /*
     * WARNING - void declaration
     */
    private void s0(com.voxdon.xplorer.file.n n8) {
        Intent intent = b.W0((Context)this, n8, false);
        if (intent != null && ax.c3.u.U(intent)) {
            n8 = Uri.parse((String)n8.Q());
            ((b)this.j()).r((Uri)n8, true);
            return;
        }
        if (intent != null) {
            Throwable var1_5;
            try {
                ax.c3.u.o0((Context)this, intent);
                this.G0(n8);
                return;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (SecurityException securityException) {
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                // empty catch block
            }
            Toast.makeText((Context)this, (int)2131951927, (int)1).show();
            ax.Ha.c.h().f().b("ImageViewer openDefault").l((Throwable)var1_5).h();
        }
    }

    private void t0(ax.c3.k k8, String string, String string2, boolean bl, boolean bl2) {
        Uri uri = ax.a3.Q.E3(k8);
        ax.a3.Q.R3(this.m(), c.a.d0, uri, string, string2, bl, bl2);
        this.G0(k8);
    }

    private void u0(com.voxdon.xplorer.file.n n8) {
        if (this.isFinishing()) {
            return;
        }
        String string = n8.s();
        if (ax.c3.w.a((Context)this, n8, string, false)) {
            if (ax.c3.B.H(n8)) {
                this.t0((ax.c3.k)n8, string, string, true, true);
                return;
            }
            ax.u3.b.f();
            return;
        }
        Toast.makeText((Context)this, (int)2131952449, (int)1).show();
    }

    /*
     * WARNING - void declaration
     */
    private void v0() {
        Object object = ((b)this.j()).V0();
        if (object != null && (object = this.k0((Uri)object)) != null && this.l.x() && !this.l.w() && ax.c3.B.H((com.voxdon.xplorer.file.n)object) && ((com.voxdon.xplorer.file.n)object).G() == ax.c3.z.e0 && ax.c3.A.E((com.voxdon.xplorer.file.n)object)) {
            Throwable var2_5;
            this.l.y();
            int n8 = this.l.s() ? 0 : this.l.r();
            try {
                this.startActivityForResult(ax.c3.w.i((Context)this, (ax.c3.k)object, n8, false), G);
                return;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (SecurityException securityException) {
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                // empty catch block
            }
            Toast.makeText((Context)this, (int)2131951927, (int)1).show();
            ax.Ha.c.h().f().b("PVI:").l((Throwable)var2_5).h();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean w0(int n8) {
        this.j().u0();
        Object object = ((b)this.j()).V0();
        if (object == null) {
            return false;
        }
        if ((object = this.k0((Uri)object)) == null) {
            return false;
        }
        switch (n8) {
            case 2131362506: 
            case 2131362507: {
                if (com.voxdon.xplorer.file.x.E1((Context)this, (com.voxdon.xplorer.file.n)object, false)) {
                    object = (y)object;
                    this.R(3, ((y)object).B0(), ((y)object).M0(), false, true);
                    return true;
                } else {
                    break;
                }
            }
        }
        switch (n8) {
            default: {
                return false;
            }
            case 2131362547: {
                this.L0((com.voxdon.xplorer.file.n)object);
                return true;
            }
            case 2131362545: {
                this.H0((com.voxdon.xplorer.file.n)object);
                return true;
            }
            case 2131362543: {
                this.E0((com.voxdon.xplorer.file.n)object);
                return true;
            }
            case 2131362536: {
                this.D0();
                return true;
            }
            case 2131362535: {
                this.B0((com.voxdon.xplorer.file.n)object);
                return true;
            }
            case 2131362524: {
                this.u0((com.voxdon.xplorer.file.n)object);
                return true;
            }
            case 2131362522: {
                this.s0((com.voxdon.xplorer.file.n)object);
                return true;
            }
            case 2131362516: {
                this.I0((com.voxdon.xplorer.file.n)object);
                return true;
            }
            case 2131362507: {
                this.j0((com.voxdon.xplorer.file.n)object);
                return true;
            }
            case 2131362506: 
        }
        this.g0((com.voxdon.xplorer.file.n)object);
        return true;
    }

    public void F0(boolean bl) {
        if (this.v != null && this.w != null && this.j() != null) {
            this.u = bl;
            View view = this.v;
            int n8 = bl ? 0 : 8;
            view.setVisibility(n8);
            this.x0();
        }
    }

    void J0(CharSequence charSequence, int n8) {
        ax.u3.B.T(this.t, charSequence, n8).a0();
    }

    void K0(com.voxdon.xplorer.file.n n8, int n9, CharSequence charSequence, List<String> list) {
        ax.u3.B.O(this.t, charSequence, 0, 2131952309, false, new ax.g3.c(this, list, n9, n8){
            final List c;
            final int d;
            final com.voxdon.xplorer.file.n e;
            final ImageViewerActivity f;
            {
                this.f = imageViewerActivity;
                this.c = list;
                this.d = n8;
                this.e = n9;
            }

            @Override
            public void a(View object) {
                ax.Q2.a.i().m("menu_image_viewer", "undo_delete").c("loc", "image_viewer").e();
                object = this.f;
                ax.W2.x.m((s)object, object.q, this.c, new h.a(this){
                    final k a;
                    {
                        this.a = k8;
                    }

                    @Override
                    public void a(h.b object, String string, String string2, ArrayList<String> arrayList, Object object2) {
                        if (object == h.b.c0) {
                            object = this.a;
                            int n8 = object.d > object.f.n.size() ? this.a.f.n.size() : this.a.d;
                            object = this.a;
                            object.f.n.add(n8, object.e);
                            this.a.f.j().A0(n8);
                            ((b)this.a.f.j()).e1();
                            this.a.f.J0(string, -1);
                            return;
                        }
                        this.a.f.J0(string, 0);
                    }

                    @Override
                    public void b() {
                    }
                });
            }
        }).a0();
    }

    @Override
    public boolean d() {
        return this.l.u();
    }

    @Override
    public void e(int n8) {
        if (n8 == 1) {
            this.l.p();
        }
    }

    @Override
    public void f() {
        this.l.q();
    }

    protected f f0() {
        Object object = this.getIntent().getStringExtra(H);
        object = com.voxdon.xplorer.viewer.c.b().a((String)object);
        if (object != null) {
            this.n = ((c.a)object).a;
            this.r = ((c.a)object).b;
        }
        this.getIntent().putExtra("photo_index", this.r);
        return new b(this, this.n, this.q);
    }

    @Override
    public View findViewById(int n8) {
        return this.getDelegate().l(n8);
    }

    @Override
    public void i() {
        com.voxdon.xplorer.file.n n8;
        Object object = ((b)this.j()).V0();
        if (object == null || (n8 = this.k0((Uri)object)) == null) {
            return;
        }
        object = n8.G();
        z z8 = ax.c3.z.e0;
        boolean bl = true;
        if (object == z8 && !this.M0(n8)) {
            this.s.t(2131362516, false);
        } else {
            this.s.t(2131362516, true);
        }
        if (!this.r0()) {
            if (this.q.e0(n8)) {
                this.s.o(2131362506, true);
            } else {
                this.s.o(2131362506, false);
            }
            if (!(Q.E1() && n8 instanceof y && n8.G() == ax.c3.z.f0 && this.p0(n8.A()) && this.i0(((y)n8).B0()))) {
                bl = false;
            }
            this.s.t(2131362535, bl);
        }
        this.v0();
    }

    @Override
    public f j() {
        return this.j;
    }

    View l0() {
        Toolbar toolbar = (Toolbar)this.findViewById(2131362981);
        toolbar.setTouchscreenBlocksFocus(false);
        View view = toolbar.getChildAt(0);
        if (view instanceof p) {
            if (toolbar.getNavigationContentDescription() != null && toolbar.getNavigationContentDescription().equals(view.getContentDescription())) {
                view.setId(16908332);
                return view;
            }
            ax.u3.b.e("not work anymore");
            return view;
        }
        ax.u3.b.e("not work anymore");
        return view;
    }

    @Override
    public Fragment m() {
        return this.x;
    }

    @Override
    public a o() {
        if (this.k == null) {
            this.setSupportActionBar((Toolbar)this.findViewById(2131362981));
            this.k = new com.android.ex.photo.b(this.getSupportActionBar());
        }
        return this.k;
    }

    @Override
    protected void onActivityResult(int n8, int n9, Intent intent) {
        super.onActivityResult(n8, n9, intent);
        this.j.d0(n8, n9, intent);
        if (n8 == G) {
            if (n9 == -1) {
                this.A0();
                return;
            }
            if (n9 == 0) {
                this.l.p();
                if (this.j.s()) {
                    this.j.n();
                }
            }
        }
    }

    @Override
    public void onConfigurationChanged(Configuration object) {
        super.onConfigurationChanged((Configuration)object);
        object = this.j().V();
        if (object != null) {
            int n8 = ((ViewPager)((Object)object)).getCurrentItem();
            ((ViewPager)((Object)object)).setAdapter(((ViewPager)((Object)object)).getAdapter());
            ((ViewPager)((Object)object)).setCurrentItem(n8);
        }
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        Object object2 = (M)this.getSupportFragmentManager().k0("headless_fragment");
        this.x = object2;
        if (object2 == null) {
            this.x = M.K2("ImageViewerActivity");
            this.getSupportFragmentManager().o().e(this.x, "headless_fragment").i();
        }
        this.o = (ax.Q2.f)((Object)this.getIntent().getSerializableExtra("location"));
        object2 = this.getIntent();
        boolean bl = false;
        boolean bl2 = false;
        this.p = object2.getIntExtra("location_key", 0);
        if (this.o == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("");
            bl = bl2;
            if (this.getIntent().getExtras() == null) {
                bl = true;
            }
            ((StringBuilder)object).append(bl);
            ((StringBuilder)object).append(",key:");
            ((StringBuilder)object).append(this.p);
            object = ((StringBuilder)object).toString();
            ax.Ha.c.h().d("ImageViewer no location").g(object).h();
            Toast.makeText((Context)this, (int)2131951927, (int)1).show();
            this.finish();
            return;
        }
        this.C = this.getIntent().getStringExtra("extra_temp_file_path");
        this.D = this.getIntent().getStringExtra("extra_temp_file_type");
        this.q = object2 = ax.c3.x.d(this.o, this.p);
        ((com.voxdon.xplorer.file.o)object2).n0();
        this.j = object2 = this.f0();
        ((f)object2).f0((Bundle)object);
        this.l = new E(this.findViewById(2131362846), this.j.V(), new E.d(this){
            final ImageViewerActivity a;
            {
                this.a = imageViewerActivity;
            }

            @Override
            public void a(boolean bl) {
                if (bl) {
                    this.a.j.E0(false);
                }
                if (this.a.j.s()) {
                    this.a.j.n();
                }
                if (this.a.getWindow() != null) {
                    this.a.getWindow().clearFlags(128);
                }
            }

            @Override
            public void b(boolean bl) {
                if (bl) {
                    this.a.j.E0(false);
                }
                if (this.a.getWindow() != null) {
                    this.a.getWindow().clearFlags(128);
                }
            }

            @Override
            public void c(boolean bl) {
                if (bl) {
                    this.a.j.E0(true);
                }
                this.a.v0();
                if (this.a.getWindow() != null) {
                    this.a.getWindow().addFlags(128);
                }
            }
        });
        object2 = this.n;
        if (object2 != null && object2.size() != 0) {
            if (!this.q.a()) {
                if (this.q.u() instanceof com.voxdon.xplorer.file.b && !((com.voxdon.xplorer.file.b)this.q.u()).e1()) {
                    object2 = ax.Ha.c.h().f().b("IMAGEVIEWER NOT CONNECTED OPERATOR ARCHIVE");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("location:");
                    stringBuilder.append(this.o.I());
                    stringBuilder.append(",");
                    stringBuilder.append(this.p);
                    stringBuilder.append(",");
                    if (object != null) {
                        bl = true;
                    }
                    stringBuilder.append(bl);
                    ((ax.Ha.b)object2).g(stringBuilder.toString()).h();
                    Toast.makeText((Context)this, (int)2131951927, (int)1).show();
                    this.finish();
                    return;
                }
                object2 = ax.Ha.c.h().f().b("IMAGEVIEWER NOT CONNECTED OPERATOR");
                object = new StringBuilder();
                ((StringBuilder)object).append("location:");
                ((StringBuilder)object).append(this.o.I());
                ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
            }
            this.d0();
            this.t = this.findViewById(2131362848);
            this.v = this.findViewById(2131361973);
            this.w = this.findViewById(2131361990);
            this.getOnBackPressedDispatcher().h(this, this.F);
            return;
        }
        this.finish();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        f f8 = this.j;
        return f8 != null && f8.g0(menu) || super.onCreateOptionsMenu(menu);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void onDestroy() {
        Object object = this.j;
        if (object != null) {
            ((f)object).h0();
        }
        if ((object = this.q) != null) {
            ((com.voxdon.xplorer.file.o)object).k0(false);
        }
        try {
            super.onDestroy();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        if (!this.r0()) return;
        if (this.E) return;
        try {
            object = new File(this.C);
            ((File)object).delete();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    @Override
    public boolean onKeyDown(int n8, KeyEvent keyEvent) {
        block10: {
            block11: {
                block12: {
                    block13: {
                        if (this.l.u()) {
                            return super.onKeyDown(n8, keyEvent);
                        }
                        this.l.p();
                        if (keyEvent.isMetaPressed() || keyEvent.isShiftPressed() || keyEvent.isAltPressed()) break block10;
                        if (n8 == 112) break block11;
                        switch (n8) {
                            default: {
                                break;
                            }
                            case 21: 
                            case 22: {
                                View view;
                                boolean bl = super.onKeyDown(n8, keyEvent);
                                if (!this.q0() && (view = this.getCurrentFocus()) != null) {
                                    Toolbar toolbar = (Toolbar)this.findViewById(2131362981);
                                    keyEvent = (ViewGroup)this.findViewById(2131361934);
                                    if (this.o0(toolbar, view) || this.o0((ViewGroup)keyEvent, view)) {
                                        this.j().u0();
                                    }
                                }
                                return bl;
                            }
                            case 19: 
                            case 20: {
                                if (this.j().s()) {
                                    this.m0(n8);
                                    return true;
                                }
                                View view = this.getCurrentFocus();
                                if (view == null) break block12;
                                Toolbar toolbar = (Toolbar)this.findViewById(2131362981);
                                ViewGroup viewGroup = (ViewGroup)this.findViewById(2131361934);
                                if (this.o0(toolbar, view)) {
                                    if (n8 != 20) break;
                                    this.j().n();
                                    return true;
                                }
                                if (this.o0(viewGroup, view)) {
                                    if (n8 != 19) break;
                                    this.j().n();
                                    return true;
                                }
                                break block13;
                            }
                        }
                        return super.onKeyDown(n8, keyEvent);
                    }
                    this.m0(n8);
                    return true;
                }
                this.m0(n8);
                return true;
            }
            this.w0(2131362506);
            return true;
        }
        return super.onKeyDown(n8, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.j.l0(menuItem) && !super.onOptionsItemSelected(menuItem)) {
            return this.w0(menuItem.getItemId());
        }
        return true;
    }

    @Override
    protected void onPause() {
        this.j.m0();
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        f f8 = this.j;
        return f8 != null && f8.n0(menu) || super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.j.o0();
        this.e0();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.j.p0(bundle);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.j.q0();
        if (Q.N1()) {
            ax.X2.v.s(this.getWindow(), -1157627904);
            ax.X2.v.r(this.getWindow(), -1157627904);
        }
    }

    @Override
    protected void onStop() {
        this.j.r0();
        this.l.p();
        super.onStop();
    }

    @Override
    public void p() {
        f f8 = this.j;
        if (f8 != null && !this.B) {
            this.F.j(f8.b0());
        }
    }

    @Override
    public void q(boolean bl) {
        if (this.getSupportActionBar() != null && this.s != null) {
            if (bl) {
                this.getSupportActionBar().n();
                this.s.y(8);
            } else {
                this.getSupportActionBar().J();
                this.s.y(0);
                this.s.A();
                if (this.j() != null && this.j().B()) {
                    this.j().c(false);
                }
                this.l.p();
            }
            this.x0();
            return;
        }
        ax.u3.b.f();
    }

    @Override
    public boolean r() {
        return this.l.v();
    }

    @Override
    public ax.n.c s() {
        return this;
    }

    public void x0() {
        if (this.j() == null) {
            return;
        }
        boolean bl = this.j().B();
        int n8 = 0;
        int n9 = !bl && this.u ? 1 : 0;
        View view = this.w;
        n9 = n9 != 0 ? n8 : 8;
        view.setVisibility(n9);
    }

    public void y0() {
        this.z0();
    }

    void z0() {
        Fragment fragment = this.getSupportFragmentManager().k0("dialog");
        if (fragment != null) {
            androidx.fragment.app.t t8 = this.getSupportFragmentManager().o();
            t8.q(fragment);
            t8.j();
        }
    }

    static class m {
        CharSequence a;
        Drawable b;

        m(CharSequence charSequence, Drawable drawable) {
            this.a = charSequence;
            this.b = drawable;
        }
    }

    class n
    extends q<Void, Integer, Boolean> {
        private com.voxdon.xplorer.file.n h;
        final ImageViewerActivity i;

        n(ImageViewerActivity imageViewerActivity, com.voxdon.xplorer.file.n n8) {
            this.i = imageViewerActivity;
            super(q.e.e0);
            this.h = n8;
        }

        @Override
        protected void o() {
        }

        @Override
        protected void r() {
            super.r();
        }

        protected Boolean w(Void ... voidArray) {
            return this.i.C0(this.h);
        }

        protected void x(Boolean bl) {
            if (bl.booleanValue()) {
                ((b)this.i.j()).f1();
                return;
            }
            Toast.makeText((Context)this.i, (int)2131951927, (int)0).show();
        }
    }
}

