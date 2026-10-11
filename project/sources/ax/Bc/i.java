package ax.Bc;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

/* loaded from: classes3.dex */
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

    int a(int i) {
        if (this.d == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            c[] cVarArr = this.d;
            if (i2 >= cVarArr.length) {
                return -1;
            }
            if (cVarArr[i2].a == i) {
                return i2;
            }
            i2++;
        }
    }

    int b(int i) {
        if (this.d == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            c[] cVarArr = this.d;
            if (i2 >= cVarArr.length) {
                return -1;
            }
            if (cVarArr[i2].b == i) {
                return i2;
            }
            i2++;
        }
    }

    Iterable<e> c() throws IOException {
        e[] eVarArr;
        long[] jArr = this.e;
        if (jArr == null || (eVarArr = this.a) == null || jArr.length == 0 || eVarArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = new LinkedList();
        int i = (int) this.e[0];
        while (i >= 0) {
            e[] eVarArr2 = this.a;
            if (i >= eVarArr2.length) {
                break;
            }
            if (linkedList.contains(eVarArr2[i])) {
                throw new IOException("folder uses the same coder more than once in coder chain");
            }
            linkedList.addLast(this.a[i]);
            int b = b(i);
            i = b != -1 ? (int) this.d[b].a : -1;
        }
        return linkedList;
    }

    long d() {
        long j2 = this.c;
        if (j2 == 0) {
            return 0L;
        }
        for (int i = ((int) j2) - 1; i >= 0; i--) {
            if (b(i) < 0) {
                return this.f[i];
            }
        }
        return 0L;
    }

    long e(e eVar) {
        if (this.a == null) {
            return 0L;
        }
        int i = 0;
        while (true) {
            e[] eVarArr = this.a;
            if (i >= eVarArr.length) {
                return 0L;
            }
            if (eVarArr[i] == eVar) {
                return this.f[i];
            }
            i++;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Folder with ");
        sb.append(this.a.length);
        sb.append(" coders, ");
        sb.append(this.b);
        sb.append(" input streams, ");
        sb.append(this.c);
        sb.append(" output streams, ");
        sb.append(this.d.length);
        sb.append(" bind pairs, ");
        sb.append(this.e.length);
        sb.append(" packed streams, ");
        sb.append(this.f.length);
        sb.append(" unpack sizes, ");
        if (this.g) {
            str = "with CRC " + this.h;
        } else {
            str = "without CRC";
        }
        sb.append(str);
        sb.append(" and ");
        sb.append(this.i);
        sb.append(" unpack streams");
        return sb.toString();
    }
}
