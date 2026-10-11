package ax.Sc;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public class s {
    private static final i[] e = new i[0];
    private List<String> a;
    private ListIterator<String> b;
    private final j c;
    private final boolean d;

    s(j jVar, f fVar) {
        LinkedList linkedList = new LinkedList();
        this.a = linkedList;
        this.b = linkedList.listIterator();
        this.c = jVar;
        if (fVar != null) {
            this.d = fVar.h();
        } else {
            this.d = false;
        }
    }

    public static /* synthetic */ i b(s sVar, String str) {
        i c = sVar.c.c(str);
        return (c == null && sVar.d) ? new i(str) : c;
    }

    private void h(InputStream inputStream, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, ax.Vc.a.a(str)));
        try {
            String a = this.c.a(bufferedReader);
            while (a != null) {
                this.a.add(a);
                a = this.c.a(bufferedReader);
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public List<i> c(final l lVar) {
        return (List) Collection.EL.stream(this.a).map(new Function() { // from class: ax.Sc.q
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return s.b(s.this, (String) obj);
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: ax.Sc.r
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean a;
                a = l.this.a((i) obj);
                return a;
            }
        }).collect(Collectors.toList());
    }

    public i[] d() throws IOException {
        return e(p.b);
    }

    public i[] e(l lVar) throws IOException {
        return (i[]) c(lVar).toArray(e);
    }

    public i[] f(int i) {
        LinkedList linkedList = new LinkedList();
        while (i > 0 && this.b.hasNext()) {
            String next = this.b.next();
            i c = this.c.c(next);
            if (c == null && this.d) {
                c = new i(next);
            }
            linkedList.add(c);
            i--;
        }
        return (i[]) linkedList.toArray(e);
    }

    public boolean g() {
        return this.b.hasNext();
    }

    public void i(InputStream inputStream, String str) throws IOException {
        this.a = new LinkedList();
        h(inputStream, str);
        this.c.b(this.a);
        j();
    }

    public void j() {
        this.b = this.a.listIterator();
    }
}
