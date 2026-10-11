/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import ax.J3.g;
import ax.M3.j;
import ax.N3.b;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class f<Data>
implements m<File, Data> {
    private final d<Data> a;

    public f(d<Data> d8) {
        this.a = d8;
    }

    public m.a<Data> c(File file, int n8, int n9, j j8) {
        return new m.a<Data>(new ax.j4.b(file), new c<Data>(file, this.a));
    }

    public boolean d(File file) {
        return true;
    }

    public static class a<Data>
    implements n<File, Data> {
        private final d<Data> a;

        public a(d<Data> d8) {
            this.a = d8;
        }

        @Override
        public final m<File, Data> b(q q8) {
            return new f<Data>(this.a);
        }
    }

    public static class b
    extends a<ParcelFileDescriptor> {
        public b() {
            super(new d<ParcelFileDescriptor>(){

                @Override
                public Class<ParcelFileDescriptor> a() {
                    return ParcelFileDescriptor.class;
                }

                public void d(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                    parcelFileDescriptor.close();
                }

                public ParcelFileDescriptor e(File file) throws FileNotFoundException {
                    return ParcelFileDescriptor.open((File)file, (int)0x10000000);
                }
            });
        }
    }

    private static class c<Data>
    implements ax.N3.b<Data> {
        private final d<Data> c0;
        private Data d0;
        private final File q;

        public c(File file, d<Data> d8) {
            this.q = file;
            this.c0 = d8;
        }

        @Override
        public Class<Data> a() {
            return this.c0.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void b() {
            Data Data = this.d0;
            if (Data == null) return;
            try {
                this.c0.b(Data);
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }

        @Override
        public void cancel() {
        }

        @Override
        public ax.M3.a d() {
            return ax.M3.a.q;
        }

        @Override
        public void e(g g8, b.a<? super Data> a8) {
            try {
                g8 = this.c0.c(this.q);
                this.d0 = g8;
                a8.f((Data)((Object)g8));
                return;
            }
            catch (FileNotFoundException fileNotFoundException) {
                if (Log.isLoggable((String)"FileLoader", (int)3)) {
                    Log.d((String)"FileLoader", (String)"Failed to open file", (Throwable)fileNotFoundException);
                }
                a8.c(fileNotFoundException);
                return;
            }
        }
    }

    public static interface d<Data> {
        public Class<Data> a();

        public void b(Data var1) throws IOException;

        public Data c(File var1) throws FileNotFoundException;
    }

    public static class e
    extends a<InputStream> {
        public e() {
            super(new d<InputStream>(){

                @Override
                public Class<InputStream> a() {
                    return InputStream.class;
                }

                public void d(InputStream inputStream) throws IOException {
                    inputStream.close();
                }

                public InputStream e(File file) throws FileNotFoundException {
                    return new FileInputStream(file);
                }
            });
        }
    }
}

