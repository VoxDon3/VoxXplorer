/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import ax.Bc.c;
import ax.Bc.e;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

class i {
    static final i[] j = new i[0];
    e[] a;
    long b;
    long c;
    c[] d;
    long[] e;
    long[] f;
    boolean g;
    long h;
    int i;

    i() {
    }

    int a(int n8) {
        if (this.d != null) {
            c[] cArray;
            for (int i8 = 0; i8 < (cArray = this.d).length; ++i8) {
                if (cArray[i8].a != (long)n8) continue;
                return i8;
            }
        }
        return -1;
    }

    int b(int n8) {
        if (this.d != null) {
            c[] cArray;
            for (int i8 = 0; i8 < (cArray = this.d).length; ++i8) {
                if (cArray[i8].b != (long)n8) continue;
                return i8;
            }
        }
        return -1;
    }

    Iterable<e> c() throws IOException {
        Object object;
        Object[] objectArray = this.e;
        if (objectArray != null && (object = this.a) != null && objectArray.length != 0 && ((e[])object).length != 0) {
            object = new LinkedList();
            int n8 = (int)this.e[0];
            while (n8 >= 0 && n8 < (objectArray = (Object[])this.a).length) {
                if (!((LinkedList)object).contains(objectArray[n8])) {
                    ((LinkedList)object).addLast(this.a[n8]);
                    n8 = this.b(n8);
                    if (n8 != -1) {
                        n8 = (int)this.d[n8].a;
                        continue;
                    }
                    n8 = -1;
                    continue;
                }
                throw new IOException("folder uses the same coder more than once in coder chain");
            }
            return object;
        }
        return Collections.EMPTY_LIST;
    }

    long d() {
        long l8 = this.c;
        if (l8 == 0L) {
            return 0L;
        }
        for (int i8 = (int)l8 - 1; i8 >= 0; --i8) {
            if (this.b(i8) >= 0) continue;
            return this.f[i8];
        }
        return 0L;
    }

    long e(e e8) {
        if (this.a != null) {
            e[] eArray;
            for (int i8 = 0; i8 < (eArray = this.a).length; ++i8) {
                if (eArray[i8] != e8) continue;
                return this.f[i8];
            }
        }
        return 0L;
    }

    public String toString() {
        CharSequence charSequence;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Folder with ");
        stringBuilder.append(this.a.length);
        stringBuilder.append(" coders, ");
        stringBuilder.append(this.b);
        stringBuilder.append(" input streams, ");
        stringBuilder.append(this.c);
        stringBuilder.append(" output streams, ");
        stringBuilder.append(this.d.length);
        stringBuilder.append(" bind pairs, ");
        stringBuilder.append(this.e.length);
        stringBuilder.append(" packed streams, ");
        stringBuilder.append(this.f.length);
        stringBuilder.append(" unpack sizes, ");
        if (this.g) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("with CRC ");
            ((StringBuilder)charSequence).append(this.h);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "without CRC";
        }
        stringBuilder.append((String)charSequence);
        stringBuilder.append(" and ");
        stringBuilder.append(this.i);
        stringBuilder.append(" unpack streams");
        return stringBuilder.toString();
    }
}

