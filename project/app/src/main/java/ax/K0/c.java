/*
 * Decompiled with CFR 0.152.
 */
package ax.K0;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class c<D> {
    private int a;
    private b<D> b;
    private Context c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = true;
    private boolean g = false;
    private boolean h = false;

    public c(Context context) {
        this.c = context.getApplicationContext();
    }

    public boolean A() {
        boolean bl = this.g;
        this.g = false;
        this.h |= bl;
        return bl;
    }

    public void B(b<D> b8) {
        b<D> b9 = this.b;
        if (b9 != null) {
            if (b9 == b8) {
                this.b = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public void a() {
        this.r();
    }

    public void c() {
        this.e = true;
        this.o();
    }

    public boolean d() {
        return this.p();
    }

    public void e() {
        this.h = false;
    }

    public String f(D object) {
        StringBuilder stringBuilder = new StringBuilder(64);
        if (object == null) {
            stringBuilder.append("null");
        } else {
            object = object.getClass();
            stringBuilder.append(((Class)object).getSimpleName());
            stringBuilder.append("{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(object)));
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }

    public void g() {
    }

    public void h(D d8) {
        b<D> b8 = this.b;
        if (b8 != null) {
            b8.a(this, d8);
        }
    }

    @Deprecated
    public void i(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        printWriter.print(string);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.d || this.g || this.h) {
            printWriter.print(string);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.h);
        }
        if (!this.e && !this.f) {
            return;
        }
        printWriter.print(string);
        printWriter.print("mAbandoned=");
        printWriter.print(this.e);
        printWriter.print(" mReset=");
        printWriter.println(this.f);
    }

    public Context j() {
        return this.c;
    }

    public int k() {
        return this.a;
    }

    public boolean l() {
        return this.e;
    }

    public boolean m() {
        return this.f;
    }

    public boolean n() {
        return this.d;
    }

    protected void o() {
    }

    protected boolean p() {
        throw null;
    }

    public void q() {
        if (this.d) {
            this.a();
            return;
        }
        this.g = true;
    }

    protected void r() {
    }

    protected void s() {
    }

    protected void t() {
        throw null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        Class<?> clazz = this.getClass();
        stringBuilder.append(clazz.getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(clazz)));
        stringBuilder.append(" id=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    protected void u() {
    }

    public void v(int n8, b<D> b8) {
        if (this.b == null) {
            this.b = b8;
            this.a = n8;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void w() {
        this.s();
        this.f = true;
        this.d = false;
        this.e = false;
        this.g = false;
        this.h = false;
    }

    public void x() {
        if (this.h) {
            this.q();
        }
    }

    public final void y() {
        this.d = true;
        this.f = false;
        this.e = false;
        this.t();
    }

    public void z() {
        this.d = false;
        this.u();
    }

    public final class a
    extends ContentObserver {
        final c a;

        public a(c c8) {
            this.a = c8;
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean bl) {
            this.a.q();
        }
    }

    public static interface b<D> {
        public void a(c<D> var1, D var2);
    }
}

