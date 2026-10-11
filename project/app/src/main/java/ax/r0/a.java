/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.G;
import ax.r0.S;
import ax.r0.b0;
import ax.r0.h;
import ax.r0.h0;
import ax.r0.k;
import ax.r0.n0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
implements S {
    protected int memoizedHashCode = 0;

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        a.l(iterable, list);
    }

    private String m(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Serializing ");
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append(" to a ");
        stringBuilder.append(string);
        stringBuilder.append(" threw an IOException (should never happen).");
        return stringBuilder.toString();
    }

    int e() {
        throw new UnsupportedOperationException();
    }

    @Override
    public h h() {
        try {
            Object object = h.t(this.i());
            this.f(((h.h)object).b());
            object = ((h.h)object).a();
            return object;
        }
        catch (IOException iOException) {
            throw new RuntimeException(this.m("ByteString"), iOException);
        }
    }

    int l(h0 h02) {
        int n8 = this.e();
        if (n8 == -1) {
            n8 = h02.f(this);
            this.o(n8);
            return n8;
        }
        return n8;
    }

    n0 n() {
        return new n0(this);
    }

    void o(int n8) {
        throw new UnsupportedOperationException();
    }

    public void p(OutputStream object) throws IOException {
        object = k.f0((OutputStream)object, k.I(this.i()));
        this.f((k)object);
        ((k)object).c0();
    }

    public static abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
    implements S.a {
        protected static <T> void l(Iterable<T> g8, List<? super T> object) {
            A.a(g8);
            if (g8 instanceof G) {
                Object object2 = ((G)g8).d0();
                g8 = (G)object;
                int n8 = object.size();
                object2 = object2.iterator();
                while (object2.hasNext()) {
                    object = object2.next();
                    if (object == null) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Element at index ");
                        ((StringBuilder)object).append(g8.size() - n8);
                        ((StringBuilder)object).append(" is null.");
                        object = ((StringBuilder)object).toString();
                        for (int i8 = g8.size() - 1; i8 >= n8; --i8) {
                            g8.remove(i8);
                        }
                        throw new NullPointerException((String)object);
                    }
                    if (object instanceof h) {
                        g8.C0((h)object);
                        continue;
                    }
                    g8.add((String)object);
                }
                return;
            }
            if (g8 instanceof b0) {
                object.addAll(g8);
                return;
            }
            a.m(g8, object);
        }

        private static <T> void m(Iterable<T> object, List<? super T> list) {
            if (list instanceof ArrayList && object instanceof Collection) {
                ((ArrayList)list).ensureCapacity(list.size() + ((Collection)object).size());
            }
            int n8 = list.size();
            Iterator<T> iterator = object.iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                if (object == null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Element at index ");
                    ((StringBuilder)object).append(list.size() - n8);
                    ((StringBuilder)object).append(" is null.");
                    object = ((StringBuilder)object).toString();
                    for (int i8 = list.size() - 1; i8 >= n8; --i8) {
                        list.remove(i8);
                    }
                    throw new NullPointerException((String)object);
                }
                list.add(object);
            }
        }

        protected static n0 r(S s8) {
            return new n0(s8);
        }

        protected abstract BuilderType n(MessageType var1);

        public BuilderType o(S s8) {
            if (this.c().getClass().isInstance(s8)) {
                return this.n((a)s8);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }
}

