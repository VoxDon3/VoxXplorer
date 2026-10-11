package ax.zd;

import ax.Dd.k;
import ax.Nd.f;
import ax.vd.InterfaceC3307d;
import ax.vd.InterfaceC3312i;
import ax.vd.InterfaceC3313j;
import ax.vd.InterfaceC3315l;
import java.util.Hashtable;

/* renamed from: ax.zd.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3569c implements InterfaceC3315l {
    private static Hashtable h;
    private InterfaceC3312i a;
    private int b;
    private int c;
    private f d;
    private f e;
    private byte[] f;
    private byte[] g;

    static {
        Hashtable hashtable = new Hashtable();
        h = hashtable;
        hashtable.put("GOST3411", ax.Nd.d.d(32));
        h.put("MD2", ax.Nd.d.d(16));
        h.put("MD4", ax.Nd.d.d(64));
        h.put("MD5", ax.Nd.d.d(64));
        h.put("RIPEMD128", ax.Nd.d.d(64));
        h.put("RIPEMD160", ax.Nd.d.d(64));
        h.put("SHA-1", ax.Nd.d.d(64));
        h.put("SHA-224", ax.Nd.d.d(64));
        h.put("SHA-256", ax.Nd.d.d(64));
        h.put("SHA-384", ax.Nd.d.d(128));
        h.put("SHA-512", ax.Nd.d.d(128));
        h.put("Tiger", ax.Nd.d.d(64));
        h.put("Whirlpool", ax.Nd.d.d(64));
    }

    public C3569c(InterfaceC3312i interfaceC3312i) {
        this(interfaceC3312i, f(interfaceC3312i));
    }

    private static int f(InterfaceC3312i interfaceC3312i) {
        if (interfaceC3312i instanceof InterfaceC3313j) {
            return ((InterfaceC3313j) interfaceC3312i).h();
        }
        Integer num = (Integer) h.get(interfaceC3312i.f());
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("unknown digest passed: " + interfaceC3312i.f());
    }

    private static void g(byte[] bArr, int i, byte b) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ b);
        }
    }

    @Override // ax.vd.InterfaceC3315l
    public int a() {
        return this.b;
    }

    @Override // ax.vd.InterfaceC3315l
    public void b(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2);
    }

    @Override // ax.vd.InterfaceC3315l
    public int c(byte[] bArr, int i) {
        this.a.c(this.g, this.c);
        f fVar = this.e;
        if (fVar != null) {
            ((f) this.a).j(fVar);
            InterfaceC3312i interfaceC3312i = this.a;
            interfaceC3312i.b(this.g, this.c, interfaceC3312i.i());
        } else {
            InterfaceC3312i interfaceC3312i2 = this.a;
            byte[] bArr2 = this.g;
            interfaceC3312i2.b(bArr2, 0, bArr2.length);
        }
        int c = this.a.c(bArr, i);
        int i2 = this.c;
        while (true) {
            byte[] bArr3 = this.g;
            if (i2 >= bArr3.length) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        f fVar2 = this.d;
        if (fVar2 != null) {
            ((f) this.a).j(fVar2);
            return c;
        }
        InterfaceC3312i interfaceC3312i3 = this.a;
        byte[] bArr4 = this.f;
        interfaceC3312i3.b(bArr4, 0, bArr4.length);
        return c;
    }

    @Override // ax.vd.InterfaceC3315l
    public void d(byte b) {
        this.a.d(b);
    }

    @Override // ax.vd.InterfaceC3315l
    public void e(InterfaceC3307d interfaceC3307d) {
        byte[] bArr;
        this.a.a();
        byte[] a = ((k) interfaceC3307d).a();
        int length = a.length;
        if (length > this.c) {
            this.a.b(a, 0, length);
            this.a.c(this.f, 0);
            length = this.b;
        } else {
            System.arraycopy(a, 0, this.f, 0, length);
        }
        while (true) {
            bArr = this.f;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.g, 0, this.c);
        g(this.f, this.c, (byte) 54);
        g(this.g, this.c, (byte) 92);
        InterfaceC3312i interfaceC3312i = this.a;
        if (interfaceC3312i instanceof f) {
            f g = ((f) interfaceC3312i).g();
            this.e = g;
            ((InterfaceC3312i) g).b(this.g, 0, this.c);
        }
        InterfaceC3312i interfaceC3312i2 = this.a;
        byte[] bArr2 = this.f;
        interfaceC3312i2.b(bArr2, 0, bArr2.length);
        InterfaceC3312i interfaceC3312i3 = this.a;
        if (interfaceC3312i3 instanceof f) {
            this.d = ((f) interfaceC3312i3).g();
        }
    }

    private C3569c(InterfaceC3312i interfaceC3312i, int i) {
        this.a = interfaceC3312i;
        int i2 = interfaceC3312i.i();
        this.b = i2;
        this.c = i;
        this.f = new byte[i];
        this.g = new byte[i + i2];
    }
}
