package ax.U3;

import ax.N3.b;
import ax.U3.m;
import ax.j4.C2312a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b<Data> implements m<byte[], Data> {
    private final InterfaceC0206b<Data> a;

    public static class a implements n<byte[], ByteBuffer> {

        /* renamed from: ax.U3.b$a$a, reason: collision with other inner class name */
        class C0205a implements InterfaceC0206b<ByteBuffer> {
            C0205a() {
            }

            @Override // ax.U3.b.InterfaceC0206b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // ax.U3.b.InterfaceC0206b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // ax.U3.n
        public m<byte[], ByteBuffer> b(q qVar) {
            return new b(new C0205a());
        }
    }

    /* renamed from: ax.U3.b$b, reason: collision with other inner class name */
    public interface InterfaceC0206b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class d implements n<byte[], InputStream> {

        class a implements InterfaceC0206b<InputStream> {
            a() {
            }

            @Override // ax.U3.b.InterfaceC0206b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // ax.U3.b.InterfaceC0206b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // ax.U3.n
        public m<byte[], InputStream> b(q qVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0206b<Data> interfaceC0206b) {
        this.a = interfaceC0206b;
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(byte[] bArr, int i, int i2, ax.M3.j jVar) {
        return new m.a<>(C2312a.c(), new c(bArr, this.a));
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(byte[] bArr) {
        return true;
    }

    private static class c<Data> implements ax.N3.b<Data> {
        private final InterfaceC0206b<Data> c0;
        private final byte[] q;

        public c(byte[] bArr, InterfaceC0206b<Data> interfaceC0206b) {
            this.q = bArr;
            this.c0 = interfaceC0206b;
        }

        @Override // ax.N3.b
        public Class<Data> a() {
            return this.c0.a();
        }

        @Override // ax.N3.b
        public ax.M3.a d() {
            return ax.M3.a.LOCAL;
        }

        @Override // ax.N3.b
        public void e(ax.J3.g gVar, b.a<? super Data> aVar) {
            aVar.f(this.c0.b(this.q));
        }

        @Override // ax.N3.b
        public void b() {
        }

        @Override // ax.N3.b
        public void cancel() {
        }
    }
}
