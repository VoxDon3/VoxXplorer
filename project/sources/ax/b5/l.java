package ax.b5;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class l {
    static final char[] l = new char[0];
    private final C1500a a;
    private char[] b;
    private int c;
    private int d;
    private ArrayList<char[]> e;
    private boolean f;
    private int g;
    private char[] h;
    private int i;
    private String j;
    private char[] k;

    public l(C1500a c1500a) {
        this.a = c1500a;
    }

    private char[] b(int i) {
        C1500a c1500a = this.a;
        return c1500a != null ? c1500a.d(2, i) : new char[Math.max(i, 500)];
    }

    private char[] c(int i) {
        return new char[i];
    }

    private void d() {
        this.f = false;
        this.e.clear();
        this.g = 0;
        this.i = 0;
    }

    private void j() {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        char[] cArr = this.h;
        this.f = true;
        this.e.add(cArr);
        this.g += cArr.length;
        this.i = 0;
        int length = cArr.length;
        int i = length + (length >> 1);
        if (i < 500) {
            i = 500;
        } else if (i > 65536) {
            i = 65536;
        }
        this.h = c(i);
    }

    private char[] u() throws IOException {
        int i;
        String str = this.j;
        if (str != null) {
            return str.toCharArray();
        }
        if (this.c >= 0) {
            int i2 = this.d;
            if (i2 < 1) {
                return l;
            }
            A(i2);
            int i3 = this.c;
            return i3 == 0 ? Arrays.copyOf(this.b, i2) : Arrays.copyOfRange(this.b, i3, i2 + i3);
        }
        int x = x();
        if (x < 1) {
            return l;
        }
        A(x);
        char[] c = c(x);
        ArrayList<char[]> arrayList = this.e;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr = this.e.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, c, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.h, 0, c, i, this.i);
        return c;
    }

    private void y(int i) {
        int i2 = this.d;
        this.d = 0;
        char[] cArr = this.b;
        this.b = null;
        int i3 = this.c;
        this.c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.h = b(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.h, 0, i2);
        }
        this.g = 0;
        this.i = i2;
    }

    private void z(int i) throws IOException {
        int i2 = this.g + this.i + i;
        if (i2 < 0) {
            i2 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        A(i2);
    }

    protected void A(int i) throws IOException {
        throw null;
    }

    public void a(char[] cArr, int i, int i2) throws IOException {
        if (this.c >= 0) {
            y(i2);
        }
        this.j = null;
        this.k = null;
        char[] cArr2 = this.h;
        int length = cArr2.length;
        int i3 = this.i;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.i += i2;
            return;
        }
        z(i2);
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, this.i, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            j();
            int min = Math.min(this.h.length, i2);
            System.arraycopy(cArr, i, this.h, 0, min);
            this.i += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    public char[] e() throws IOException {
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr;
        }
        char[] u = u();
        this.k = u;
        return u;
    }

    public int f(boolean z) {
        char[] cArr;
        int i = this.c;
        return (i < 0 || (cArr = this.b) == null) ? z ? -ax.W4.i.g(this.h, 1, this.i - 1) : ax.W4.i.g(this.h, 0, this.i) : z ? -ax.W4.i.g(cArr, i + 1, this.d - 1) : ax.W4.i.g(cArr, i, this.d);
    }

    public long g(boolean z) {
        char[] cArr;
        int i = this.c;
        return (i < 0 || (cArr = this.b) == null) ? z ? -ax.W4.i.h(this.h, 1, this.i - 1) : ax.W4.i.h(this.h, 0, this.i) : z ? -ax.W4.i.h(cArr, i + 1, this.d - 1) : ax.W4.i.h(cArr, i, this.d);
    }

    public String h() throws IOException {
        if (this.j == null) {
            char[] cArr = this.k;
            if (cArr != null) {
                this.j = new String(cArr);
            } else if (this.c >= 0) {
                int i = this.d;
                if (i < 1) {
                    this.j = HttpUrl.FRAGMENT_ENCODE_SET;
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                A(i);
                this.j = new String(this.b, this.c, this.d);
            } else {
                int i2 = this.g;
                int i3 = this.i;
                if (i2 != 0) {
                    int i4 = i2 + i3;
                    A(i4);
                    StringBuilder sb = new StringBuilder(i4);
                    ArrayList<char[]> arrayList = this.e;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            char[] cArr2 = this.e.get(i5);
                            sb.append(cArr2, 0, cArr2.length);
                        }
                    }
                    sb.append(this.h, 0, this.i);
                    this.j = sb.toString();
                } else if (i3 == 0) {
                    this.j = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    A(i3);
                    this.j = new String(this.h, 0, i3);
                }
            }
        }
        return this.j;
    }

    public char[] i() {
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.j = null;
        this.k = null;
        if (this.f) {
            d();
        }
        char[] cArr = this.h;
        if (cArr != null) {
            return cArr;
        }
        char[] b = b(0);
        this.h = b;
        return b;
    }

    public char[] k() {
        char[] cArr = this.h;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 65536) {
            i = (length >> 2) + length;
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this.h = copyOf;
        return copyOf;
    }

    public char[] l() throws IOException {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        this.f = true;
        this.e.add(this.h);
        int length = this.h.length;
        int i = this.g + length;
        this.g = i;
        this.i = 0;
        A(i);
        int i2 = length + (length >> 1);
        if (i2 < 500) {
            i2 = 500;
        } else if (i2 > 65536) {
            i2 = 65536;
        }
        char[] c = c(i2);
        this.h = c;
        return c;
    }

    public char[] m() {
        if (this.c >= 0) {
            y(1);
        } else {
            char[] cArr = this.h;
            if (cArr == null) {
                this.h = b(0);
            } else if (this.i >= cArr.length) {
                j();
            }
        }
        return this.h;
    }

    public int n() {
        return this.i;
    }

    public char[] o() throws IOException {
        if (this.c >= 0) {
            return this.b;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.k = charArray;
            return charArray;
        }
        if (this.f) {
            return e();
        }
        char[] cArr2 = this.h;
        return cArr2 == null ? l : cArr2;
    }

    public int p() {
        int i = this.c;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public void q() {
        char[] cArr;
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.k = null;
        if (this.f) {
            d();
        }
        C1500a c1500a = this.a;
        if (c1500a == null || (cArr = this.h) == null) {
            return;
        }
        this.h = null;
        c1500a.j(2, cArr);
    }

    public void r(char[] cArr, int i, int i2) throws IOException {
        this.b = null;
        this.c = -1;
        this.d = 0;
        this.j = null;
        this.k = null;
        if (this.f) {
            d();
        } else if (this.h == null) {
            this.h = b(i2);
        }
        this.g = 0;
        this.i = 0;
        a(cArr, i, i2);
    }

    public void s(char[] cArr, int i, int i2) {
        this.j = null;
        this.k = null;
        this.b = cArr;
        this.c = i;
        this.d = i2;
        if (this.f) {
            d();
        }
    }

    public void t(String str) throws IOException {
        this.b = null;
        this.c = -1;
        this.d = 0;
        A(str.length());
        this.j = str;
        this.k = null;
        if (this.f) {
            d();
        }
        this.i = 0;
    }

    public String toString() {
        try {
            return h();
        } catch (IOException unused) {
            return "TextBuffer: Exception when reading contents";
        }
    }

    public String v(int i) throws IOException {
        this.i = i;
        if (this.g > 0) {
            return h();
        }
        A(i);
        String str = i == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : new String(this.h, 0, i);
        this.j = str;
        return str;
    }

    public void w(int i) {
        this.i = i;
    }

    public int x() {
        if (this.c >= 0) {
            return this.d;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.j;
        return str != null ? str.length() : this.g + this.i;
    }
}
