package ax.K0;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class c<D> {
    private int a;
    private b<D> b;
    private Context c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = true;
    private boolean g = false;
    private boolean h = false;

    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            c.this.q();
        }
    }

    public interface b<D> {
        void a(c<D> cVar, D d);
    }

    public c(Context context) {
        this.c = context.getApplicationContext();
    }

    public boolean A() {
        boolean z = this.g;
        this.g = false;
        this.h |= z;
        return z;
    }

    public void B(b<D> bVar) {
        b<D> bVar2 = this.b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }

    public void a() {
        r();
    }

    public void c() {
        this.e = true;
        o();
    }

    public boolean d() {
        return p();
    }

    public void e() {
        this.h = false;
    }

    public String f(D d) {
        StringBuilder sb = new StringBuilder(64);
        if (d == null) {
            sb.append("null");
        } else {
            Class<?> cls = d.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}");
        }
        return sb.toString();
    }

    public void h(D d) {
        b<D> bVar = this.b;
        if (bVar != null) {
            bVar.a(this, d);
        }
    }

    @Deprecated
    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.d || this.g || this.h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.h);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.f);
        }
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

    protected boolean p() {
        throw null;
    }

    public void q() {
        if (this.d) {
            a();
        } else {
            this.g = true;
        }
    }

    protected void t() {
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public void v(int i, b<D> bVar) {
        if (this.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.b = bVar;
        this.a = i;
    }

    public void w() {
        s();
        this.f = true;
        this.d = false;
        this.e = false;
        this.g = false;
        this.h = false;
    }

    public void x() {
        if (this.h) {
            q();
        }
    }

    public final void y() {
        this.d = true;
        this.f = false;
        this.e = false;
        t();
    }

    public void z() {
        this.d = false;
        u();
    }

    public void g() {
    }

    protected void o() {
    }

    protected void r() {
    }

    protected void s() {
    }

    protected void u() {
    }
}
