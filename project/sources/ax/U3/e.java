package ax.U3;

import android.util.Base64;
import ax.N3.b;
import ax.U3.m;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class e<Data> implements m<String, Data> {
    private final a<Data> a;

    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    public static final class c implements n<String, InputStream> {
        private final a<InputStream> a = new a();

        class a implements a<InputStream> {
            a() {
            }

            @Override // ax.U3.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // ax.U3.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // ax.U3.e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // ax.U3.n
        public final m<String, InputStream> b(q qVar) {
            return new e(this.a);
        }
    }

    public e(a<Data> aVar) {
        this.a = aVar;
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(String str, int i, int i2, ax.M3.j jVar) {
        return new m.a<>(new ax.j4.b(str), new b(str, this.a));
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String str) {
        return str.startsWith("data:image");
    }

    private static final class b<Data> implements ax.N3.b<Data> {
        private final a<Data> c0;
        private Data d0;
        private final String q;

        public b(String str, a<Data> aVar) {
            this.q = str;
            this.c0 = aVar;
        }

        @Override // ax.N3.b
        public Class<Data> a() {
            return this.c0.a();
        }

        @Override // ax.N3.b
        public void b() {
            try {
                this.c0.b(this.d0);
            } catch (IOException unused) {
            }
        }

        @Override // ax.N3.b
        public ax.M3.a d() {
            return ax.M3.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // ax.N3.b
        public void e(ax.J3.g gVar, b.a<? super Data> aVar) {
            try {
                Data c = this.c0.c(this.q);
                this.d0 = c;
                aVar.f(c);
            } catch (IllegalArgumentException e) {
                aVar.c(e);
            }
        }

        @Override // ax.N3.b
        public void cancel() {
        }
    }
}
