/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.G;
import ax.r0.h;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class r0
extends AbstractList<String>
implements G,
RandomAccess {
    private final G q;

    public r0(G g8) {
        this.q = g8;
    }

    @Override
    public G A0() {
        return this;
    }

    @Override
    public void C0(h h8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object D0(int n8) {
        return this.q.D0(n8);
    }

    @Override
    public List<?> d0() {
        return this.q.d0();
    }

    public String g(int n8) {
        return (String)this.q.get(n8);
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>(this){
            final r0 c0;
            Iterator<String> q;
            {
                this.c0 = r02;
                this.q = r02.q.iterator();
            }

            public String b() {
                return this.q.next();
            }

            @Override
            public boolean hasNext() {
                return this.q.hasNext();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public ListIterator<String> listIterator(int n8) {
        return new ListIterator<String>(this, n8){
            final int c0;
            final r0 d0;
            ListIterator<String> q;
            {
                this.d0 = r02;
                this.c0 = n8;
                this.q = r02.q.listIterator(n8);
            }

            public void b(String string) {
                throw new UnsupportedOperationException();
            }

            public String c() {
                return this.q.next();
            }

            public String e() {
                return this.q.previous();
            }

            public void f(String string) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean hasNext() {
                return this.q.hasNext();
            }

            @Override
            public boolean hasPrevious() {
                return this.q.hasPrevious();
            }

            @Override
            public int nextIndex() {
                return this.q.nextIndex();
            }

            @Override
            public int previousIndex() {
                return this.q.previousIndex();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() {
        return this.q.size();
    }
}

