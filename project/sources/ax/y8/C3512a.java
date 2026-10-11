package ax.y8;

import ax.Xd.f;
import ax.z8.InterfaceC3557a;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ax.y8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3512a extends FilterInputStream implements Iterable<ax.C8.b>, InputStreamRetargetInterface {
    private static final ax.Xd.d c0 = f.k(C3512a.class);
    private final InterfaceC3557a q;

    /* renamed from: ax.y8.a$a, reason: collision with other inner class name */
    class C0502a implements Iterator<ax.C8.b> {
        C0502a() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.C8.b next() {
            try {
                return C3512a.this.g();
            } catch (Exception e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            try {
                return C3512a.this.available() > 0;
            } catch (IOException unused) {
                return false;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Remove not supported on ASN.1 InputStream iterator");
        }
    }

    public C3512a(InterfaceC3557a interfaceC3557a, InputStream inputStream) {
        super(inputStream);
        this.q = interfaceC3557a;
    }

    public int e() {
        return this.q.a(this);
    }

    public <T extends ax.C8.b> T g() {
        try {
            ax.C8.c<? extends ax.C8.b> b = this.q.b(this);
            ax.Xd.d dVar = c0;
            dVar.g("Read ASN.1 tag {}", b);
            int a = this.q.a(this);
            dVar.g("Read ASN.1 object length: {}", Integer.valueOf(a));
            T t = (T) b.j(this.q).a(b, this.q.c(a, this));
            dVar.s("Read ASN.1 object: {}", t);
            return t;
        } catch (C3514c e) {
            throw e;
        } catch (Exception e2) {
            throw new C3514c(e2, "Cannot parse ASN.1 object from stream", new Object[0]);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<ax.C8.b> iterator() {
        return new C0502a();
    }

    public ax.C8.c p() {
        return this.q.b(this);
    }

    public byte[] q(int i) {
        return this.q.c(i, this);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public C3512a(InterfaceC3557a interfaceC3557a, byte[] bArr) {
        super(new ByteArrayInputStream(bArr));
        this.q = interfaceC3557a;
    }
}
