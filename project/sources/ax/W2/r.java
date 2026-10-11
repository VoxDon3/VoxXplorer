package ax.W2;

import ax.W2.h;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class r extends h {
    private C3596o d;
    private List<AbstractC3595n> e;
    private boolean f;

    public static r l() {
        return new r();
    }

    @Override // ax.W2.h
    protected j b() {
        return new s(f(), this.d, this.e, this.f);
    }

    public void k(C3596o c3596o, List<AbstractC3595n> list, boolean z, h.a aVar) {
        this.d = c3596o;
        i(aVar);
        this.e = new ArrayList();
        this.f = z;
        for (AbstractC3595n abstractC3595n : list) {
            if (abstractC3595n != null) {
                this.e.add(abstractC3595n);
            } else {
                ax.Ha.c.h().f().d("FileInfo == null").j().g("Location:" + c3596o.S().I() + ",size:" + list.size()).h();
            }
        }
        j(h.c.FILLED);
    }
}
