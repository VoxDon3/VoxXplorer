package ax.W2;

import android.widget.Toast;
import ax.W2.h;
import ax.b3.C1488c;
import ax.b3.C1495j;
import ax.c3.C1835x;
import ax.d3.InterfaceC1931s;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class x extends h {
    private C3596o d;
    private List<AbstractC3595n> e;

    static class a extends AbstractC3199q<Void, Void, List<AbstractC3595n>> {
        C3596o h;
        InterfaceC1931s i;
        h.a j;
        List<String> k;

        a(InterfaceC1931s interfaceC1931s, C3596o c3596o, List<String> list, h.a aVar) {
            super(AbstractC3199q.e.HIGH);
            this.i = interfaceC1931s;
            this.h = c3596o;
            this.j = aVar;
            this.k = list;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public List<AbstractC3595n> g(Void... voidArr) {
            J j = (J) C1835x.d(ax.Q2.f.o1, 0).u();
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = this.k.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(j.d2(it.next()));
                } catch (C1495j e) {
                    ax.Ha.c.h().f().d("RESTORE TASK BUILD INFO").l(e).h();
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(List<AbstractC3595n> list) {
            if (list.size() > 0) {
                x l = x.l();
                l.k(this.h, list, this.j);
                try {
                    this.i.l(l, true);
                } catch (C1488c unused) {
                    Toast.makeText(this.i.b(), R.string.error, 0).show();
                }
            }
        }
    }

    public static x l() {
        return new x();
    }

    public static void m(InterfaceC1931s interfaceC1931s, C3596o c3596o, List<String> list, h.a aVar) {
        new a(interfaceC1931s, c3596o, list, aVar).i(new Void[0]);
    }

    @Override // ax.W2.h
    protected j b() {
        return new y(f(), this.d, this.e);
    }

    public void k(C3596o c3596o, List<AbstractC3595n> list, h.a aVar) {
        i(aVar);
        this.d = c3596o;
        this.e = list;
        j(h.c.FILLED);
    }
}
