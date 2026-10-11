package ax.r0;

import ax.r0.AbstractC2914a;
import ax.r0.AbstractC2914a.AbstractC0432a;
import ax.r0.AbstractC2921h;
import ax.r0.S;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ax.r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2914a<MessageType extends AbstractC2914a<MessageType, BuilderType>, BuilderType extends AbstractC0432a<MessageType, BuilderType>> implements S {
    protected int memoizedHashCode = 0;

    /* renamed from: ax.r0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0432a<MessageType extends AbstractC2914a<MessageType, BuilderType>, BuilderType extends AbstractC0432a<MessageType, BuilderType>> implements S.a {
        protected static <T> void l(Iterable<T> iterable, List<? super T> list) {
            C2904A.a(iterable);
            if (!(iterable instanceof InterfaceC2910G)) {
                if (iterable instanceof b0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    m(iterable, list);
                    return;
                }
            }
            List<?> d0 = ((InterfaceC2910G) iterable).d0();
            InterfaceC2910G interfaceC2910G = (InterfaceC2910G) list;
            int size = list.size();
            for (Object obj : d0) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC2910G.size() - size) + " is null.";
                    for (int size2 = interfaceC2910G.size() - 1; size2 >= size; size2--) {
                        interfaceC2910G.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC2921h) {
                    interfaceC2910G.C0((AbstractC2921h) obj);
                } else {
                    interfaceC2910G.add((String) obj);
                }
            }
        }

        private static <T> void m(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t);
            }
        }

        protected static n0 r(S s) {
            return new n0(s);
        }

        protected abstract BuilderType n(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ax.r0.S.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public BuilderType o0(S s) {
            if (c().getClass().isInstance(s)) {
                return (BuilderType) n((AbstractC2914a) s);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        AbstractC0432a.l(iterable, list);
    }

    private String m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int e() {
        throw new UnsupportedOperationException();
    }

    @Override // ax.r0.S
    public AbstractC2921h h() {
        try {
            AbstractC2921h.C0433h t = AbstractC2921h.t(i());
            f(t.b());
            return t.a();
        } catch (IOException e) {
            throw new RuntimeException(m("ByteString"), e);
        }
    }

    int l(h0 h0Var) {
        int e = e();
        if (e != -1) {
            return e;
        }
        int f = h0Var.f(this);
        o(f);
        return f;
    }

    n0 n() {
        return new n0(this);
    }

    void o(int i) {
        throw new UnsupportedOperationException();
    }

    public void p(OutputStream outputStream) throws IOException {
        AbstractC2924k f0 = AbstractC2924k.f0(outputStream, AbstractC2924k.I(i()));
        f(f0);
        f0.c0();
    }
}
