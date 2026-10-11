package ax.b6;

import ax.b6.AbstractC1639p3;
import ax.b6.AbstractC1647q3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ax.b6.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1647q3<MessageType extends AbstractC1647q3<MessageType, BuilderType>, BuilderType extends AbstractC1639p3<MessageType, BuilderType>> implements U4 {
    protected int zza = 0;

    protected static <T> void g(Iterable<T> iterable, List<? super T> list) {
        C1616m4.e(iterable);
        if (iterable instanceof B4) {
            List<?> a = ((B4) iterable).a();
            B4 b4 = (B4) list;
            int size = list.size();
            for (Object obj : a) {
                if (obj == null) {
                    String str = "Element at index " + (b4.size() - size) + " is null.";
                    for (int size2 = b4.size() - 1; size2 >= size; size2--) {
                        b4.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof B3) {
                    b4.s0((B3) obj);
                } else if (obj instanceof byte[]) {
                    b4.s0(B3.n((byte[]) obj));
                } else {
                    b4.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC1564g5) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size3 = list.size();
        for (T t : iterable) {
            if (t == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(t);
        }
    }

    @Override // ax.b6.U4
    public final B3 b() {
        try {
            G3 u = B3.u(d());
            i(u.b());
            return u.a();
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    int e(InterfaceC1609l5 interfaceC1609l5) {
        int k = k();
        if (k != -1) {
            return k;
        }
        int b = interfaceC1609l5.b(this);
        m(b);
        return b;
    }

    int k() {
        throw new UnsupportedOperationException();
    }

    public final byte[] l() {
        try {
            byte[] bArr = new byte[d()];
            S3 H = S3.H(bArr);
            i(H);
            H.I();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    void m(int i) {
        throw new UnsupportedOperationException();
    }
}
