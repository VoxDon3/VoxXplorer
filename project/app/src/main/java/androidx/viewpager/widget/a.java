/*
 * Decompiled with CFR 0.152.
 */
package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {
    private final DataSetObservable a = new DataSetObservable();
    private DataSetObserver b;

    @Deprecated
    public void a(View view, int n8, Object object) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(ViewGroup viewGroup, int n8, Object object) {
        this.a((View)viewGroup, n8, object);
    }

    @Deprecated
    public void c(View view) {
    }

    public void d(ViewGroup viewGroup) {
        this.c((View)viewGroup);
    }

    public abstract int e();

    public int f(Object object) {
        return -1;
    }

    public CharSequence g(int n8) {
        return null;
    }

    public float h(int n8) {
        return 1.0f;
    }

    @Deprecated
    public Object i(View view, int n8) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object j(ViewGroup viewGroup, int n8) {
        return this.i((View)viewGroup, n8);
    }

    public abstract boolean k(View var1, Object var2);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void l() {
        // MONITORENTER : this
        DataSetObserver dataSetObserver = this.b;
        if (dataSetObserver != null) {
            dataSetObserver.onChanged();
        }
        this.a.notifyChanged();
    }

    public void m(DataSetObserver dataSetObserver) {
        this.a.registerObserver((Object)dataSetObserver);
    }

    public void n(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable o() {
        return null;
    }

    @Deprecated
    public void p(View view, int n8, Object object) {
    }

    public void q(ViewGroup viewGroup, int n8, Object object) {
        this.p((View)viewGroup, n8, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
            return;
        }
    }

    @Deprecated
    public void s(View view) {
    }

    public void t(ViewGroup viewGroup) {
        this.s((View)viewGroup);
    }

    public void u(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver((Object)dataSetObserver);
    }
}

