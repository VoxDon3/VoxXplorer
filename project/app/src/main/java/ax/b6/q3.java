/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.B4;
import ax.b6.G3;
import ax.b6.S3;
import ax.b6.U4;
import ax.b6.g5;
import ax.b6.l5;
import ax.b6.m4;
import ax.b6.p3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class q3<MessageType extends q3<MessageType, BuilderType>, BuilderType extends p3<MessageType, BuilderType>>
implements U4 {
    protected int zza = 0;

    protected static <T> void g(Iterable<T> object, List<? super T> object2) {
        m4.e(object);
        if (object instanceof B4) {
            List<Object> list = ((B4)object).a();
            object = (B4)object2;
            int n8 = object2.size();
            object2 = list.iterator();
            while (object2.hasNext()) {
                list = object2.next();
                if (list == null) {
                    int n9 = object.size();
                    object2 = new StringBuilder("Element at index ");
                    ((StringBuilder)object2).append(n9 - n8);
                    ((StringBuilder)object2).append(" is null.");
                    object2 = ((StringBuilder)object2).toString();
                    for (n9 = object.size() - 1; n9 >= n8; --n9) {
                        object.remove(n9);
                    }
                    throw new NullPointerException((String)object2);
                }
                if (list instanceof B3) {
                    object.s0((B3)((Object)list));
                    continue;
                }
                if (list instanceof byte[]) {
                    object.s0(B3.n((byte[])list));
                    continue;
                }
                object.add((String)((Object)list));
            }
        } else {
            if (object instanceof g5) {
                object2.addAll((Collection)object);
                return;
            }
            if (object2 instanceof ArrayList && object instanceof Collection) {
                ((ArrayList)object2).ensureCapacity(object2.size() + ((Collection)object).size());
            }
            int n10 = object2.size();
            object = object.iterator();
            while (object.hasNext()) {
                Object e8 = object.next();
                if (e8 == null) {
                    int n11 = object2.size();
                    object = new StringBuilder("Element at index ");
                    ((StringBuilder)object).append(n11 - n10);
                    ((StringBuilder)object).append(" is null.");
                    object = ((StringBuilder)object).toString();
                    for (n11 = object2.size() - 1; n11 >= n10; --n11) {
                        object2.remove(n11);
                    }
                    throw new NullPointerException((String)object);
                }
                object2.add(e8);
            }
        }
    }

    @Override
    public final B3 b() {
        try {
            Object object = B3.u(this.d());
            this.i(((G3)object).b());
            object = ((G3)object).a();
            return object;
        }
        catch (IOException iOException) {
            String string = this.getClass().getName();
            StringBuilder stringBuilder = new StringBuilder("Serializing ");
            stringBuilder.append(string);
            stringBuilder.append(" to a ");
            stringBuilder.append("ByteString");
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), iOException);
        }
    }

    int e(l5 l52) {
        int n8 = this.k();
        if (n8 == -1) {
            n8 = l52.b(this);
            this.m(n8);
            return n8;
        }
        return n8;
    }

    int k() {
        throw new UnsupportedOperationException();
    }

    public final byte[] l() {
        try {
            byte[] byArray = new byte[this.d()];
            S3 s32 = S3.H(byArray);
            this.i(s32);
            s32.I();
            return byArray;
        }
        catch (IOException iOException) {
            String string = this.getClass().getName();
            StringBuilder stringBuilder = new StringBuilder("Serializing ");
            stringBuilder.append(string);
            stringBuilder.append(" to a ");
            stringBuilder.append("byte array");
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), iOException);
        }
    }

    void m(int n8) {
        throw new UnsupportedOperationException();
    }
}

