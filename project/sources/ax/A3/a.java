package ax.A3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ax.A3.b;
import ax.c5.AbstractC1843a;
import com.android.ex.photo.f;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a extends AbstractC1843a<b.a> implements b {
    private String o;
    private b.a p;

    public a(Context context, Executor executor, String str) {
        super(context, executor);
        this.o = str;
    }

    @Override // ax.K0.c
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void h(b.a aVar) {
        Drawable drawable;
        Bitmap bitmap;
        if (m()) {
            if (aVar != null) {
                N(aVar.c);
                O(aVar.b);
                return;
            }
            return;
        }
        b.a aVar2 = this.p;
        this.p = aVar;
        if (n()) {
            super.h(aVar);
        }
        if (aVar2 != null && (bitmap = aVar2.c) != aVar.c) {
            N(bitmap);
        }
        if (aVar2 == null || (drawable = aVar2.b) == aVar.b) {
            return;
        }
        O(drawable);
    }

    @Override // ax.c5.AbstractC1843a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public b.a H() {
        b.a aVar = new b.a();
        Context j = j();
        if (j != null && this.o != null) {
            try {
                aVar = ax.C3.b.c(ax.C3.b.b(j.getContentResolver(), Uri.parse(this.o)), f.O, true);
                Bitmap bitmap = aVar.c;
                if (bitmap == null) {
                    return aVar;
                }
                bitmap.setDensity(160);
                return aVar;
            } catch (UnsupportedOperationException e) {
                aVar.e = 1;
                aVar.h = e;
            }
        }
        return aVar;
    }

    @Override // ax.c5.AbstractC1843a
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void I(b.a aVar) {
        super.I(aVar);
        if (aVar != null) {
            N(aVar.c);
            O(aVar.b);
        }
    }

    protected void N(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    @Override // ax.A3.b
    public void b(String str) {
        this.o = str;
    }

    @Override // ax.K0.c
    protected void s() {
        super.s();
        u();
        b.a aVar = this.p;
        if (aVar != null) {
            N(aVar.c);
            O(this.p.b);
            this.p = null;
        }
    }

    @Override // ax.K0.c
    protected void t() {
        b.a aVar = this.p;
        if (aVar != null) {
            h(aVar);
        }
        if (A() || this.p == null) {
            a();
        }
    }

    @Override // ax.K0.c
    protected void u() {
        d();
    }

    protected void O(Drawable drawable) {
    }
}
