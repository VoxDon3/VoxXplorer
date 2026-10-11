package j$.nio.file;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class m implements Iterator {
    public int a = 0;
    public final /* synthetic */ j$.desugar.sun.nio.fs.n b;

    public m(j$.desugar.sun.nio.fs.n nVar) {
        this.b = nVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.c.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        j$.desugar.sun.nio.fs.n nVar = this.b;
        if (i < nVar.c.size()) {
            j$.desugar.sun.nio.fs.n name = nVar.getName(this.a);
            this.a++;
            return name;
        }
        throw new NoSuchElementException();
    }
}
