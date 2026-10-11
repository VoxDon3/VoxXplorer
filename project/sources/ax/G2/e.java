package ax.G2;

import ax.B2.i;
import ax.Gb.l;
import ax.H2.c;
import ax.H2.g;
import ax.H2.h;
import ax.I2.o;
import ax.K2.v;
import ax.sb.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements d, c.a {
    private final c a;
    private final ax.H2.c<?>[] b;
    private final Object c;

    public e(c cVar, ax.H2.c<?>[] cVarArr) {
        l.f(cVarArr, "constraintControllers");
        this.a = cVar;
        this.b = cVarArr;
        this.c = new Object();
    }

    @Override // ax.G2.d
    public void a() {
        synchronized (this.c) {
            try {
                for (ax.H2.c<?> cVar : this.b) {
                    cVar.f();
                }
                t tVar = t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.G2.d
    public void b(Iterable<v> iterable) {
        l.f(iterable, "workSpecs");
        synchronized (this.c) {
            try {
                for (ax.H2.c<?> cVar : this.b) {
                    cVar.g(null);
                }
                for (ax.H2.c<?> cVar2 : this.b) {
                    cVar2.e(iterable);
                }
                for (ax.H2.c<?> cVar3 : this.b) {
                    cVar3.g(this);
                }
                t tVar = t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.H2.c.a
    public void c(List<v> list) {
        String str;
        l.f(list, "workSpecs");
        synchronized (this.c) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (e(((v) obj).a)) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    i e = i.e();
                    str = f.a;
                    e.a(str, "Constraints met for " + ((v) obj2));
                }
                c cVar = this.a;
                if (cVar != null) {
                    cVar.f(arrayList);
                    t tVar = t.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.H2.c.a
    public void d(List<v> list) {
        l.f(list, "workSpecs");
        synchronized (this.c) {
            c cVar = this.a;
            if (cVar != null) {
                cVar.b(list);
                t tVar = t.a;
            }
        }
    }

    public final boolean e(String str) {
        ax.H2.c<?> cVar;
        boolean z;
        String str2;
        l.f(str, "workSpecId");
        synchronized (this.c) {
            try {
                ax.H2.c<?>[] cVarArr = this.b;
                int length = cVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = cVarArr[i];
                    if (cVar.d(str)) {
                        break;
                    }
                    i++;
                }
                if (cVar != null) {
                    i e = i.e();
                    str2 = f.a;
                    e.a(str2, "Work " + str + " constrained by " + cVar.getClass().getSimpleName());
                }
                z = cVar == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(o oVar, c cVar) {
        this(cVar, (ax.H2.c<?>[]) new ax.H2.c[]{new ax.H2.a(oVar.a()), new ax.H2.b(oVar.b()), new h(oVar.d()), new ax.H2.d(oVar.c()), new g(oVar.c()), new ax.H2.f(oVar.c()), new ax.H2.e(oVar.c())});
        l.f(oVar, "trackers");
    }
}
