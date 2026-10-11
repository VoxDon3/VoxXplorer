/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.activity;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.Q2.f;
import ax.X2.Q;
import ax.X2.v;
import ax.Z2.k;
import ax.b3.j;
import ax.c3.B;
import ax.c3.G;
import ax.c3.U;
import ax.c3.W;
import ax.c3.d0;
import ax.c3.u;
import ax.d3.E;
import ax.d3.l;
import ax.d3.n;
import ax.u3.q;
import ax.u3.z;
import ax.x3.A;
import ax.x3.h;
import com.alphainventor.filemanager.bookmark.Bookmark;
import com.alphainventor.filemanager.file.o;
import com.alphainventor.filemanager.file.x;
import com.alphainventor.filemanager.file.y;
import com.alphainventor.filemanager.provider.MyFileProvider;
import com.alphainventor.filemanager.shizuku.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ArchiveActivity
extends com.alphainventor.filemanager.activity.b {
    private A A;
    private ArrayList<ParcelFileDescriptor> B = new ArrayList();
    private boolean C;
    private l y;
    h z;

    static /* synthetic */ boolean O0(ArchiveActivity archiveActivity) {
        return archiveActivity.C;
    }

    private void S0(Uri uri, String string, ParcelFileDescriptor parcelFileDescriptor, Uri uri2) {
        l l8 = new l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("archive_uri", (Parcelable)uri);
        bundle.putInt("archive_file_type", 3);
        bundle.putString("archive_name", string);
        bundle.putInt("file_descriptor", parcelFileDescriptor.getFd());
        bundle.putInt("location_key", com.alphainventor.filemanager.file.b.M0(uri));
        l8.v2(bundle);
        this.T0(l8, uri2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void T0(l l8, Uri object) {
        block5: {
            this.y = l8;
            if (object != null) {
                try {
                    object = k.a((Uri)object);
                    if (((k)object).d() == l8.A3()) {
                        l8.Z3(((k)object).e());
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {}
                break block5;
                ax.u3.b.g("location unit does not match");
            }
        }
        if (!this.isFinishing() && !this.getSupportFragmentManager().I0()) {
            this.getSupportFragmentManager().o().s(2131362331, this.y, "archive").g("archive").j();
        }
    }

    private void U0(String string, Uri uri, int n8, Uri uri2, o o8) {
        l l8 = new l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("archive_uri", (Parcelable)uri);
        bundle.putInt("archive_file_type", n8);
        bundle.putString("archive_name", string);
        bundle.putParcelable("open_uri", (Parcelable)uri2);
        if (o8 != null) {
            l8.Ea(o8);
            bundle.putInt("location_key", o8.y());
        } else {
            bundle.putInt("location_key", com.alphainventor.filemanager.file.b.M0(uri));
        }
        l8.v2(bundle);
        this.T0(l8, uri2);
    }

    private void V0(String string, File file, int n8, Uri uri) {
        this.U0(string, u.w(file), n8, uri, null);
    }

    private boolean W0(File comparable) {
        block5: {
            block4: {
                try {
                    comparable = com.alphainventor.filemanager.file.y.I0(((File)comparable).getAbsolutePath());
                    if (((y)comparable).a1()) break block4;
                    return false;
                }
                catch (Exception exception) {
                    return false;
                }
            }
            if (c.t().l()) break block5;
            return false;
        }
        boolean bl = ((y)comparable).n();
        return bl;
    }

    private File Y0(String string) {
        File file = ax.Z2.a.m((Context)this, "archive-tmp");
        Comparable<StringBuilder> comparable = new StringBuilder();
        ((StringBuilder)comparable).append("");
        ((StringBuilder)comparable).append(System.currentTimeMillis());
        comparable = new File(file, ((StringBuilder)comparable).toString());
        ((File)comparable).mkdir();
        return new File((File)comparable, string);
    }

    @Override
    public void L0() {
        this.invalidateOptionsMenu();
    }

    public n X0() {
        return this.y;
    }

    @Override
    public void a0(f f8, int n8, String string) {
        this.finish();
    }

    @Override
    public n d0() {
        return this.y;
    }

    @Override
    public h e0() {
        return this.z;
    }

    @Override
    public A h0() {
        if (this.A == null) {
            A a8;
            this.A = a8 = new A(this, (View)this.findViewById(2131362675), (View)this.findViewById(2131362676));
            a8.D();
        }
        return this.A;
    }

    @Override
    public boolean isContentClipToPadding(boolean bl) {
        A a8;
        return this.m0() || (a8 = this.A) != null && a8.m();
        {
        }
    }

    @Override
    public void onApplyWindowsInsets(ax.T.b b8, boolean bl) {
    }

    @Override
    public void onBackPressed() {
        l l8 = this.y;
        if (l8 != null && l8.V2()) {
            return;
        }
        this.finish();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void onCreate(Bundle object) {
        Uri var4_4;
        Object object2;
        super.onCreate((Bundle)object);
        this.setContentView(2131558428);
        if (Q.N1() && ax.u3.z.w((Context)this)) {
            v.r(this.getWindow(), -16777216);
        }
        this.z = new h(this, (ViewGroup)this.findViewById(2131362982));
        Uri uri = this.getIntent().hasExtra("open_uri") ? (Uri)this.getIntent().getParcelableExtra("open_uri") : null;
        if (this.getIntent().hasExtra("data_uri")) {
            Uri uri2 = (Uri)this.getIntent().getParcelableExtra("data_uri");
        } else {
            Uri uri3 = this.getIntent().getData();
        }
        boolean bl = object != null;
        this.C = bl;
        if (object != null && (object = this.getSupportFragmentManager().j0(2131362331)) != null) {
            this.getSupportFragmentManager().o().q((Fragment)object).j();
        }
        this.k0();
        if (uri != null && k.h(uri.getScheme(), f.X0) && ((o)(object2 = ax.c3.x.e(k.a(uri).d()))).a()) {
            object = ((com.alphainventor.filemanager.file.b)((o)object2).u()).W0();
            this.U0((String)object, (Uri)var4_4, 4, uri, (o)object2);
            this.z.q((String)object);
            if (!this.getIntent().getBooleanExtra("open_uri_release", false)) return;
            ((o)object2).k0(false);
            return;
        }
        if (var4_4 == null) {
            Toast.makeText((Context)this, (int)2131951945, (int)1).show();
            this.finish();
            return;
        }
        object = var4_4.getPath();
        object2 = var4_4.getScheme();
        if ("content".equals(object2)) {
            block23: {
                if (!MyFileProvider.B((Uri)var4_4)) {
                    object = ax.c3.B.x((Context)this, (Uri)var4_4, "zip");
                    object2 = ((W)object).a();
                    new a(this, (Context)this, (Uri)var4_4, (String)object2, ((W)object).b, uri).h(new Void[0]);
                    this.z.q((String)object2);
                    return;
                }
                object = MyFileProvider.m((Uri)var4_4);
                object2 = ((File)object).getName();
                if (!((File)object).exists() && this.W0((File)object)) {
                    block22: {
                        b b8;
                        y y8;
                        try {
                            y8 = com.alphainventor.filemanager.file.y.I0(((File)object).getAbsolutePath());
                        }
                        catch (j j8) {
                            break block22;
                        }
                        try {
                            b8 = new b(this, (Context)this, (Uri)var4_4, y8, uri);
                        }
                        catch (j j9) {
                            break block22;
                        }
                        {
                            b8.h(new Void[0]);
                            break block23;
                        }
                    }
                    this.V0((String)object2, (File)object, 1, uri);
                } else {
                    this.V0((String)object2, (File)object, 1, uri);
                }
            }
            this.z.q((String)object2);
            return;
        }
        if ("file".equals(object2) && d0.B((String)object)) {
            String string = d0.h((String)object);
            this.V0(string, new File((String)object), 1, uri);
            this.z.q(string);
            return;
        }
        if (!k.h((String)object2, f.X0)) {
            ax.Ha.c.h().d("AA").g(var4_4.toString()).h();
            Toast.makeText((Context)this, (int)2131951945, (int)1).show();
            this.finish();
            return;
        }
        ax.u3.b.g("Archive LocationUri");
        object2 = ax.c3.x.e(k.a((Uri)var4_4).d());
        if (((o)object2).a()) {
            object = ((com.alphainventor.filemanager.file.b)((o)object2).u()).W0();
            this.U0((String)object, (Uri)var4_4, 4, uri, (o)object2);
            this.z.q((String)object);
            return;
        }
        Toast.makeText((Context)this, (int)2131951945, (int)1).show();
        this.finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ArrayList<ParcelFileDescriptor> arrayList = this.B;
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            ParcelFileDescriptor parcelFileDescriptor = arrayList.get(n9);
            ++n9;
            try {
                parcelFileDescriptor.close();
            }
            catch (IOException iOException) {}
        }
    }

    @Override
    public boolean onKeyDown(int n8, KeyEvent keyEvent) {
        if (this.X0() != null && this.X0().Y3(n8, keyEvent)) {
            return true;
        }
        return super.onKeyDown(n8, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem object) {
        if (object.getItemId() != 16908332) {
            return super.onOptionsItemSelected((MenuItem)object);
        }
        object = this.y;
        if (object == null) {
            this.finish();
        } else {
            ((E)object).na("toolbar_back");
        }
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void p0() {
        this.e0().b();
    }

    @Override
    public void q0(String string) {
        this.finish();
    }

    @Override
    public void r0(Bookmark bookmark) {
    }

    @Override
    public void t0(f f8, int n8, String string, boolean bl) {
    }

    @Override
    public void w0(f f8, int n8, String string, boolean bl) {
        if (bl) {
            this.M0();
        }
    }

    @Override
    public void x0() {
    }

    private class a
    extends q<Void, Void, Boolean> {
        private Context h;
        private Uri i;
        private File j;
        private o k;
        private Throwable l;
        private long m;
        private ParcelFileDescriptor n;
        private String o;
        private Uri p;
        final ArchiveActivity q;

        public a(ArchiveActivity archiveActivity, Context context, Uri uri, String string, long l8, Uri uri2) {
            this.q = archiveActivity;
            super(q.e.d0);
            this.h = context;
            this.i = uri;
            this.j = archiveActivity.Y0(string);
            this.m = l8;
            this.o = string;
            this.p = uri2;
        }

        @Override
        protected void o() {
            this.k.k0(true);
        }

        @Override
        protected void r() {
            o o8;
            this.k = o8 = ax.c3.x.f(this.j);
            o8.n0();
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean w(Void ... var1_1) {
            block40: {
                block42: {
                    block36: {
                        block37: {
                            block41: {
                                block39: {
                                    block38: {
                                        block35: {
                                            block32: {
                                                block34: {
                                                    block33: {
                                                        var5_25 = this.h.getContentResolver();
                                                        try {
                                                            var1_1 = var5_25.openFileDescriptor(this.i, "r");
                                                            this.n = var1_1;
                                                            if (var1_1 != null) {
                                                                return Boolean.TRUE;
                                                            }
                                                            break block32;
                                                        }
                                                        catch (SQLiteException var1_2) {
                                                        }
                                                        catch (IllegalStateException var1_3) {
                                                            break block33;
                                                        }
                                                        catch (IllegalArgumentException var1_4) {
                                                            break block33;
                                                        }
                                                        catch (NullPointerException var1_5) {
                                                            break block33;
                                                        }
                                                        catch (SecurityException var1_6) {
                                                            break block33;
                                                        }
                                                        catch (FileNotFoundException var1_7) {
                                                            break block34;
                                                        }
                                                        var6_26 = ax.Ha.c.h().f().d("!! openFileDescriptor SQLiteException in ArchiveActivity !!").l(var1_2);
                                                        var1_1 = new StringBuilder();
                                                        var1_1.append("uri : ");
                                                        var1_1.append(this.i);
                                                        var6_26.g(var1_1.toString()).h();
                                                        break block32;
                                                    }
                                                    var1_1 = ax.Ha.c.h().f().d("!! openFileDescriptor in ArchiveActivity !!").l((Throwable)var1_1);
                                                    var6_26 = new StringBuilder();
                                                    var6_26.append("uri : ");
                                                    var6_26.append(this.i);
                                                    var1_1.g(var6_26.toString()).h();
                                                    break block32;
                                                }
                                                var1_7.printStackTrace();
                                                break block32;
                                                catch (RuntimeException var1_24) {}
                                            }
                                            var1_1 = this.k.z(this.j.getAbsolutePath());
                                            var2_27 = var1_1.n();
                                            if (!var2_27) break block35;
                                            try {
                                                this.k.P((com.alphainventor.filemanager.file.n)var1_1);
                                            }
                                            catch (j var1_8) {
                                                break block36;
                                            }
                                        }
                                        try {
                                            var1_1 = var5_25.openInputStream(this.i);
                                            break block37;
                                        }
                                        catch (RuntimeException var1_9) {
                                        }
                                        catch (IllegalStateException var1_10) {
                                            break block38;
                                        }
                                        catch (NullPointerException var1_11) {
                                            break block38;
                                        }
                                        catch (IllegalArgumentException var1_12) {
                                            break block38;
                                        }
                                        catch (SecurityException var1_13) {
                                            break block38;
                                        }
                                        catch (FileNotFoundException var1_14) {
                                            break block39;
                                        }
                                        this.l = var1_9;
                                        break block41;
                                    }
                                    this.l = var1_1;
                                    var5_25 = ax.Ha.c.h().d("ARCHTEMP2").l((Throwable)var1_1);
                                    var1_1 = new StringBuilder();
                                    var1_1.append("Restored:");
                                    var1_1.append(ArchiveActivity.O0(this.q));
                                    var1_1.append(",uri=");
                                    var1_1.append(this.i.toString());
                                    var5_25.g(var1_1.toString()).h();
                                    break block41;
                                }
                                this.l = var1_14;
                                var1_1 = this.i.toString();
                                if (var1_1 != null && !var1_1.startsWith("content://downloads/")) {
                                    ax.Ha.c.h().d("ARCHTEMP1").g(this.i.toString()).h();
                                }
                            }
                            var1_1 = null;
                        }
                        if (var1_1 == null) {
                            return Boolean.FALSE;
                        }
                        var6_26 = this.k.z(this.j.getAbsolutePath());
                        var5_25 = new U((InputStream)var1_1, -1L);
                        var7_28 = this.k;
                        var1_1 = var6_26.s();
                        var3_29 = this.m;
                        try {
                            var7_28.D((com.alphainventor.filemanager.file.n)var6_26, (G)var5_25, (String)var1_1, var3_29, null, null, true, this, null);
                            var5_25.e();
                            var1_1 = Boolean.TRUE;
                        }
                        catch (Throwable var1_15) {
                            break block40;
                        }
                        catch (j var1_16) {
                        }
                        catch (ax.b3.a var1_17) {
                            ** GOTO lbl-1000
                        }
                        if (Q.X1() == false) return var1_1;
                        if (this.k.Y() == false) return var1_1;
                        this.k.n(null);
                        return var1_1;
                        catch (Throwable var1_18) {
                            break block40;
                        }
                        catch (j var1_19) {
                            ** GOTO lbl-1000
                        }
                        catch (ax.b3.a var1_20) {
                            ** GOTO lbl-1000
                        }
                        catch (j var1_22) {
                            // empty catch block
                        }
                    }
                    var1_23.printStackTrace();
                    return Boolean.FALSE;
lbl-1000:
                    // 2 sources

                    {
                        var1_1.printStackTrace();
                    }
                    if (Q.X1() == false) return Boolean.FALSE;
                    if (this.k.Y() == false) return Boolean.FALSE;
                    break block42;
lbl-1000:
                    // 2 sources

                    {
                        var1_1.printStackTrace();
                    }
                    if (Q.X1() == false) return Boolean.FALSE;
                    if (this.k.Y() == false) return Boolean.FALSE;
                }
                this.k.n(null);
                return Boolean.FALSE;
            }
            if (Q.X1() == false) throw var1_21;
            if (this.k.Y() == false) throw var1_21;
            this.k.n(null);
            throw var1_21;
        }

        protected void x(Boolean serializable) {
            this.k.k0(true);
            if (!serializable.booleanValue()) {
                serializable = this.l;
                if (serializable != null && serializable instanceof FileNotFoundException) {
                    Toast.makeText((Context)this.q, (int)2131952548, (int)1).show();
                } else {
                    Toast.makeText((Context)this.q, (int)2131951945, (int)1).show();
                }
                this.q.finish();
                return;
            }
            if (this.n != null) {
                this.q.B.add(this.n);
                this.q.S0(this.i, this.o, this.n, this.p);
                return;
            }
            this.q.V0(this.o, this.j, 2, this.p);
        }
    }

    private class b
    extends q<Void, Void, Boolean> {
        private Context h;
        private File i;
        private o j;
        private long k;
        private ParcelFileDescriptor l;
        private String m;
        private y n;
        private Uri o;
        private Uri p;
        final ArchiveActivity q;

        public b(ArchiveActivity archiveActivity, Context object, Uri uri, y y8, Uri uri2) {
            this.q = archiveActivity;
            super(q.e.d0);
            this.h = object;
            object = y8.B();
            this.m = object;
            this.i = archiveActivity.Y0((String)object);
            this.k = y8.p();
            this.n = y8;
            this.o = uri;
            this.p = uri2;
        }

        @Override
        protected void o() {
            this.j.k0(true);
        }

        @Override
        protected void r() {
            o o8;
            this.j = o8 = ax.c3.x.f(this.i);
            o8.n0();
        }

        protected Boolean w(Void ... object) {
            block3: {
                object = (x)this.j.u();
                object = ((x)object).U0(this.n);
                this.l = object;
                if (object == null) break block3;
                try {
                    object = Boolean.TRUE;
                    return object;
                }
                catch (j j8) {
                    j8.printStackTrace();
                }
            }
            return Boolean.FALSE;
        }

        protected void x(Boolean bl) {
            this.j.k0(true);
            if (!bl.booleanValue()) {
                Toast.makeText((Context)this.q, (int)2131951945, (int)1).show();
                this.q.finish();
                return;
            }
            this.q.B.add(this.l);
            this.q.S0(this.o, this.m, this.l, this.p);
        }
    }
}

