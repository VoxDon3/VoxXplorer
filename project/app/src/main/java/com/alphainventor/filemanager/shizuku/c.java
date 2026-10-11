/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.shizuku;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.util.AndroidRuntimeException;
import androidx.fragment.app.Fragment;
import ax.Q2.d;
import ax.Q2.i;
import ax.X2.L;
import ax.X2.Q;
import ax.c3.K;
import ax.c3.u;
import ax.g3.g;
import ax.ne.i;
import ax.u3.B;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.x;
import com.alphainventor.filemanager.file.y;
import com.alphainventor.filemanager.shizuku.ShizukuUserService;
import com.alphainventor.filemanager.shizuku.a;
import com.alphainventor.filemanager.shizuku.b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class c {
    private static c m;
    private a a;
    private Context b;
    private Boolean c;
    private boolean d = false;
    private int e = 0;
    private boolean f = false;
    private i.a g;
    private final i.f h = new i.f(new ComponentName("com.voxdon.xplorer", ShizukuUserService.class.getName())).c(false).g("service").d(false).h(278);
    private final i.d i = new ax.p3.b(this);
    private final i.c j = new ax.p3.c();
    private final i.e k = new i.e(this){
        final c a;
        {
            this.a = c8;
        }

        @Override
        public void a(int n8, int n9) {
            if (n9 == 0) {
                this.a.k();
            } else if (this.a.g != null) {
                this.a.g.c();
                com.alphainventor.filemanager.shizuku.c.f(this.a, null);
            }
            com.alphainventor.filemanager.shizuku.c.g(this.a, false);
        }
    };
    private final ServiceConnection l = new ServiceConnection(this){
        final c q;
        {
            this.q = c8;
        }

        public void onServiceConnected(ComponentName object, IBinder iBinder) {
            if (iBinder != null && iBinder.pingBinder()) {
                object = a.a.r(iBinder);
                this.q.J((a)object);
                if (this.q.g != null) {
                    this.q.g.b();
                    com.alphainventor.filemanager.shizuku.c.f(this.q, null);
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.q.n();
        }
    };

    private c(Context context) {
        this.b = context;
        ax.Q2.b.h().e(new g(this){
            final c a;
            {
                this.a = c8;
            }

            @Override
            public void J(String string) {
                com.alphainventor.filemanager.shizuku.c.c(this.a, null);
            }
        });
    }

    private boolean D() {
        return this.a != null;
    }

    private void J(a a8) {
        this.a = a8;
    }

    private void K() {
        try {
            if (ax.ne.i.C() < 10) {
                return;
            }
            ax.ne.i.Q(this.h, this.l, true);
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            throwable.toString();
            return;
        }
    }

    public static /* synthetic */ void a(c c8) {
        c8.getClass();
        ax.ne.i.D();
        if (c8.e > 0 && !c8.D()) {
            c8.k();
        }
    }

    public static /* synthetic */ void b() {
    }

    static /* synthetic */ Boolean c(c c8, Boolean bl) {
        c8.c = bl;
        return bl;
    }

    static /* synthetic */ i.a f(c c8, i.a a8) {
        c8.g = a8;
        return a8;
    }

    static /* synthetic */ boolean g(c c8, boolean bl) {
        c8.f = bl;
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void k() {
        try {
            ax.ne.i.y();
        }
        catch (RuntimeException runtimeException) {
            return;
        }
        try {
            if (ax.ne.i.C() < 10) return;
            ax.ne.i.x(this.h, this.l);
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private void n() {
        this.a = null;
    }

    public static c t() {
        if (m == null) {
            ax.Q2.d.b(new Exception("Shizuku not initialized"));
        }
        return m;
    }

    public static void z(Context context) {
        if (m == null) {
            m = new c(context);
        }
    }

    public boolean A() {
        return this.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean B() {
        boolean bl = false;
        try {
            int n8 = ax.ne.i.B();
            if (n8 == -1) return bl;
            return true;
        }
        catch (Exception exception) {
            return bl;
        }
    }

    public boolean C() {
        if (!Q.F1()) {
            return false;
        }
        if (this.c == null) {
            this.c = B.L(this.b, "moe.shizuku.privileged.api");
        }
        return this.c;
    }

    public List<y> E(x x8, K k8, String arrayList) {
        Exception exception2;
        block5: {
            Object object;
            block4: {
                object = this.a.d1((String)((Object)arrayList));
                if (object != null) break block4;
                return null;
            }
            try {
                arrayList = new ArrayList<y>();
                object = object.iterator();
                while (object.hasNext()) {
                    ax.p3.a a8 = (ax.p3.a)object.next();
                    y y8 = new y(x8, k8, a8);
                    arrayList.add(y8);
                }
            }
            catch (Exception exception2) {}
            break block5;
            return arrayList;
        }
        exception2.printStackTrace();
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void F(Fragment fragment) {
        block7: {
            if (fragment.b() != null) {
                ActivityNotFoundException activityNotFoundException2;
                block9: {
                    RuntimeException var1_6;
                    PackageManager packageManager = fragment.b().getPackageManager();
                    packageManager = packageManager.getLaunchIntentForPackage("moe.shizuku.privileged.api");
                    if (packageManager == null) break block7;
                    try {
                        u.p0(fragment, (Intent)packageManager);
                        return;
                    }
                    catch (AndroidRuntimeException androidRuntimeException) {
                    }
                    catch (NullPointerException nullPointerException) {
                    }
                    catch (SecurityException securityException) {
                    }
                    catch (ActivityNotFoundException activityNotFoundException2) {
                        break block9;
                    }
                    var1_6.printStackTrace();
                    break block7;
                }
                activityNotFoundException2.printStackTrace();
            }
        }
    }

    public void G() {
        int n8;
        this.e = n8 = this.e - 1;
        if (n8 <= 0) {
            ax.ne.i.H(this.i);
            ax.ne.i.G(this.j);
            ax.ne.i.I(this.k);
            this.K();
        }
    }

    public boolean H(String string, String string2) {
        try {
            boolean bl = this.a.X0(string, string2);
            return bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public boolean I(String string, long l8) {
        try {
            boolean bl = this.a.l0(string, l8);
            return bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public void j() {
        if (this.e == 0) {
            ax.ne.i.r(this.i);
            ax.ne.i.o(this.j);
            ax.ne.i.t(this.k);
            this.k();
        }
        ++this.e;
    }

    public boolean l() {
        if (!this.C()) {
            return false;
        }
        if (!this.B()) {
            return false;
        }
        return this.D();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean m(i.a a8) {
        block8: {
            block7: {
                this.f = false;
                if (!this.B()) {
                    return false;
                }
                if (ax.ne.i.D()) {
                    return false;
                }
                try {
                    if (ax.ne.i.y() != 0) break block7;
                    return true;
                }
                catch (Throwable throwable) {
                    return false;
                }
            }
            if (!ax.ne.i.P()) break block8;
            return false;
        }
        this.g = a8;
        ax.ne.i.J(65001);
        this.f = true;
        return false;
    }

    public boolean o(String string) {
        try {
            boolean bl = this.a.W1(string);
            return bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public boolean p(String string) {
        try {
            boolean bl = this.a.x1(string);
            return bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public boolean q(String string) {
        try {
            boolean bl = this.a.h(string);
            return bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public n r(x object, K k8, String string) {
        try {
            object = new y((x)object, k8, this.a.z(string));
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public InputStream s(String object, long l8) throws IOException {
        IllegalStateException illegalStateException2;
        block11: {
            IOException iOException2;
            block10: {
                Exception exception2;
                block9: {
                    block8: {
                        ParcelFileDescriptor parcelFileDescriptor = this.a.z0((String)object);
                        object = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                        if (l8 <= 0L) break block8;
                        try {
                            if (((InputStream)object).skip(l8) != l8) {
                                object = new IOException("AutoCloseInputStream skip failed");
                                throw object;
                            }
                        }
                        catch (Exception exception2) {
                            break block9;
                        }
                        catch (IOException iOException2) {
                            break block10;
                        }
                        catch (IllegalStateException illegalStateException2) {
                            break block11;
                        }
                    }
                    return object;
                }
                throw new IOException(exception2);
            }
            throw iOException2;
        }
        object = com.alphainventor.filemanager.shizuku.b.e(illegalStateException2);
        if (object != null) {
            if (((b.c)object).a == com.alphainventor.filemanager.shizuku.b.d) {
                throw new FileNotFoundException(((b.c)object).b);
            }
            throw new IOException(((b.c)object).b);
        }
        throw new IOException(illegalStateException2);
    }

    public int u(String string, boolean bl) {
        try {
            int n8 = this.a.K1(string, bl);
            return n8;
        }
        catch (Exception exception) {
            return -2;
        }
    }

    public OutputStream v(String string, boolean bl) throws IOException {
        IllegalStateException illegalStateException2;
        block4: {
            try {
                string = new ParcelFileDescriptor.AutoCloseOutputStream(this.a.G1(string, bl));
                return string;
            }
            catch (Exception exception) {
            }
            catch (IllegalStateException illegalStateException2) {
                break block4;
            }
            throw new IOException(exception);
        }
        b.c c8 = com.alphainventor.filemanager.shizuku.b.e(illegalStateException2);
        if (c8 != null) {
            throw new IOException(c8.b);
        }
        throw new IOException(illegalStateException2);
    }

    public ParcelFileDescriptor w(String string) throws IOException {
        IllegalStateException illegalStateException2;
        block5: {
            try {
                string = this.a.z0(string);
                return string;
            }
            catch (Exception exception) {
            }
            catch (IllegalStateException illegalStateException2) {
                break block5;
            }
            throw new IOException(exception);
        }
        b.c c8 = com.alphainventor.filemanager.shizuku.b.e(illegalStateException2);
        if (c8 != null) {
            if (c8.a == com.alphainventor.filemanager.shizuku.b.d) {
                throw new FileNotFoundException(c8.b);
            }
            throw new IOException(c8.b);
        }
        throw new IOException(illegalStateException2);
    }

    public ParcelFileDescriptor x(String string) throws IOException {
        IllegalStateException illegalStateException2;
        block4: {
            try {
                string = this.a.w0(string);
                return string;
            }
            catch (Exception exception) {
            }
            catch (IllegalStateException illegalStateException2) {
                break block4;
            }
            throw new IOException(exception);
        }
        b.c c8 = com.alphainventor.filemanager.shizuku.b.e(illegalStateException2);
        if (c8 != null) {
            throw new IOException(c8.b);
        }
        throw new IOException(illegalStateException2);
    }

    public L y(String object) throws IOException {
        try {
            ax.p3.a a8 = this.a.L0((String)object);
            object = new L();
            ((L)object).e = a8.d0;
            ((L)object).b = a8.e0;
            ((L)object).a = a8.i0;
            ((L)object).c = a8.j0;
            return object;
        }
        catch (Exception exception) {
            throw new IOException(exception);
        }
    }
}

