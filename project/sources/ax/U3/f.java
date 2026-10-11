package ax.U3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import ax.N3.b;
import ax.U3.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class f<Data> implements m<File, Data> {
    private final d<Data> a;

    public static class a<Data> implements n<File, Data> {
        private final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // ax.U3.n
        public final m<File, Data> b(q qVar) {
            return new f(this.a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // ax.U3.f.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // ax.U3.f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // ax.U3.f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    public static class e extends a<InputStream> {

        class a implements d<InputStream> {
            a() {
            }

            @Override // ax.U3.f.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // ax.U3.f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // ax.U3.f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(File file, int i, int i2, ax.M3.j jVar) {
        return new m.a<>(new ax.j4.b(file), new c(file, this.a));
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }

    private static class c<Data> implements ax.N3.b<Data> {
        private final d<Data> c0;
        private Data d0;
        private final File q;

        public c(File file, d<Data> dVar) {
            this.q = file;
            this.c0 = dVar;
        }

        @Override // ax.N3.b
        public Class<Data> a() {
            return this.c0.a();
        }

        @Override // ax.N3.b
        public void b() {
            Data data = this.d0;
            if (data != null) {
                try {
                    this.c0.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // ax.N3.b
        public ax.M3.a d() {
            return ax.M3.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // ax.N3.b
        public void e(ax.J3.g gVar, b.a<? super Data> aVar) {
            try {
                Data c = this.c0.c(this.q);
                this.d0 = c;
                aVar.f(c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.c(e);
            }
        }

        @Override // ax.N3.b
        public void cancel() {
        }
    }
}
