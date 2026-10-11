package ax.Wc;

/* renamed from: ax.Wc.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1103h {
    static final InterfaceC1101g[] d = new InterfaceC1101g[0];
    private InterfaceC1101g[] a;
    private int b;
    private boolean c;

    public C1103h() {
        this(10);
    }

    static InterfaceC1101g[] b(InterfaceC1101g[] interfaceC1101gArr) {
        return interfaceC1101gArr.length < 1 ? d : (InterfaceC1101g[]) interfaceC1101gArr.clone();
    }

    private void e(int i) {
        InterfaceC1101g[] interfaceC1101gArr = new InterfaceC1101g[Math.max(this.a.length, i + (i >> 1))];
        System.arraycopy(this.a, 0, interfaceC1101gArr, 0, this.b);
        this.a = interfaceC1101gArr;
        this.c = false;
    }

    public void a(InterfaceC1101g interfaceC1101g) {
        if (interfaceC1101g == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        int length = this.a.length;
        int i = this.b + 1;
        if (this.c | (i > length)) {
            e(i);
        }
        this.a[this.b] = interfaceC1101g;
        this.b = i;
    }

    InterfaceC1101g[] c() {
        int i = this.b;
        if (i == 0) {
            return d;
        }
        InterfaceC1101g[] interfaceC1101gArr = new InterfaceC1101g[i];
        System.arraycopy(this.a, 0, interfaceC1101gArr, 0, i);
        return interfaceC1101gArr;
    }

    public InterfaceC1101g d(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.b);
    }

    public int f() {
        return this.b;
    }

    InterfaceC1101g[] g() {
        int i = this.b;
        if (i == 0) {
            return d;
        }
        InterfaceC1101g[] interfaceC1101gArr = this.a;
        if (interfaceC1101gArr.length == i) {
            this.c = true;
            return interfaceC1101gArr;
        }
        InterfaceC1101g[] interfaceC1101gArr2 = new InterfaceC1101g[i];
        System.arraycopy(interfaceC1101gArr, 0, interfaceC1101gArr2, 0, i);
        return interfaceC1101gArr2;
    }

    public C1103h(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.a = i == 0 ? d : new InterfaceC1101g[i];
        this.b = 0;
        this.c = false;
    }
}
