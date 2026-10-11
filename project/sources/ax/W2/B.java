package ax.W2;

import ax.W2.h;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import java.io.File;

/* loaded from: classes.dex */
public class B extends h {
    private C3596o d;
    private C3596o e;
    private File f;
    private AbstractC3595n g;

    public static B l() {
        return new B();
    }

    @Override // ax.W2.h
    protected j b() {
        return new C(f(), this.d, this.f, this.e, this.g);
    }

    public void k(C3596o c3596o, File file, C3596o c3596o2, AbstractC3595n abstractC3595n, h.a aVar) {
        this.d = c3596o;
        this.f = file;
        this.e = c3596o2;
        this.g = abstractC3595n;
        i(aVar);
        j(h.c.FILLED);
    }
}
