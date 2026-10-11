/*
 * Decompiled with CFR 0.152.
 */
package ax.i5;

import android.util.Log;
import ax.h5.e;
import ax.i5.a;
import ax.i5.b;
import ax.i5.c;
import ax.i5.g;
import ax.i5.h;
import ax.i5.i;
import ax.i5.k;
import ax.i5.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class f
extends ax.h5.a {
    private static String n0 = "f";
    private a c0;
    private ax.e5.a d0;
    private b e0;
    private c f0;
    private List<i> g0;
    private Map<String, i> h0;
    private Map<k, g> i0;
    private f j0;
    private i k0;
    private String l0;
    private boolean m0;

    private f(ax.e5.a a8, b b8, c c8, f f8) {
        this.d0 = a8;
        this.e0 = b8;
        this.f0 = c8;
        this.j0 = f8;
        this.h0 = new HashMap<String, i>();
        this.i0 = new HashMap<k, g>();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b(i i8, g g8) {
        synchronized (this) {
            this.g0.add(i8);
            this.h0.put(i8.g().toLowerCase(Locale.getDefault()), i8);
            this.i0.put(g8.m(), g8);
            return;
        }
    }

    static f c(i i8, ax.e5.a object, b b8, c c8, f f8) {
        object = new f((ax.e5.a)object, b8, c8, f8);
        ((f)object).k0 = i8;
        return object;
    }

    private void f() throws IOException {
        if (this.c0 == null) {
            this.c0 = new a(this.k0.i(), this.d0, this.e0, this.f0);
        }
        if (this.c0.c() <= 0x1000000L) {
            if (this.g0 == null) {
                this.g0 = new ArrayList<i>();
            }
            if (this.g0.size() == 0 && !this.m0) {
                this.j();
            }
            this.m0 = true;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Too large chain length for directory : ");
        stringBuilder.append(this.c0.c());
        throw new com.github.mjdev.libaums.a(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j() throws IOException {
        ArrayList<g> arrayList;
        ByteBuffer byteBuffer;
        try {
            byteBuffer = ByteBuffer.allocate((int)this.c0.c());
            this.c0.d(0L, byteBuffer);
            arrayList = new ArrayList<g>();
            byteBuffer.flip();
        }
        catch (OutOfMemoryError outOfMemoryError) {
            throw new IOException(outOfMemoryError);
        }
        while (byteBuffer.remaining() > 0) {
            Object object = g.D(byteBuffer);
            if (object == null) {
                return;
            }
            if (((g)object).w()) {
                arrayList.add((g)object);
                continue;
            }
            if (((g)object).C()) {
                if (!this.q0()) {
                    Log.w((String)n0, (String)"volume label in non root dir!");
                }
                this.l0 = ((g)object).r();
                String string = n0;
                object = new StringBuilder();
                ((StringBuilder)object).append("volume label: ");
                ((StringBuilder)object).append(this.l0);
                Log.d((String)string, (String)((StringBuilder)object).toString());
                continue;
            }
            if (((g)object).s()) {
                arrayList.clear();
                continue;
            }
            this.b(i.k((g)object, arrayList), (g)object);
            arrayList.clear();
        }
    }

    static f m(ax.e5.a a8, b b8, c c8) throws IOException {
        f f8 = new f(a8, b8, c8, null);
        f8.c0 = new a(c8.h(), a8, b8, c8);
        f8.f();
        return f8;
    }

    @Override
    public e[] B0() throws IOException {
        this.f();
        ArrayList<ax.h5.a> arrayList = new ArrayList<ax.h5.a>(this.g0.size());
        for (int i8 = 0; i8 < this.g0.size(); ++i8) {
            i i9 = this.g0.get(i8);
            String string = i9.g();
            if (string.equals(".") || string.equals("..")) continue;
            if (i9.j()) {
                arrayList.add(f.c(i9, this.d0, this.e0, this.f0, this));
                continue;
            }
            arrayList.add(h.b(i9, this.d0, this.e0, this.f0, this));
        }
        return arrayList.toArray(new e[arrayList.size()]);
    }

    @Override
    public void R0(long l8) {
        if (this.q0()) {
            return;
        }
        this.k0.c().K(l8);
    }

    @Override
    public String W0() {
        i i8 = this.k0;
        if (i8 != null) {
            return i8.f();
        }
        return "null entry";
    }

    @Override
    public void X0(e e8) throws IOException {
        if (!this.q0()) {
            if (e8.isDirectory()) {
                if (e8 instanceof f) {
                    e8 = (f)e8;
                    if (!((f)e8).h0.containsKey(this.k0.g().toLowerCase(Locale.getDefault()))) {
                        this.f();
                        super.f();
                        this.j0.o(this.k0);
                        i i8 = this.k0;
                        super.b(i8, i8.c());
                        this.j0.q();
                        ((f)e8).q();
                        this.j0 = e8;
                        return;
                    }
                    throw new IOException("item already exists in destination!");
                }
                throw new IllegalStateException("cannot move between different filesystems!");
            }
            throw new IllegalStateException("destination cannot be a file!");
        }
        throw new IllegalStateException("cannot move root dir!");
    }

    @Override
    public String[] c0() throws IOException {
        this.f();
        ArrayList<String> arrayList = new ArrayList<String>(this.g0.size());
        for (int i8 = 0; i8 < this.g0.size(); ++i8) {
            String string = this.g0.get(i8).g();
            if (string.equals(".") || string.equals("..")) continue;
            arrayList.add(string);
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("This is a directory!");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f d(String object) throws IOException {
        synchronized (this) {
            try {
                if (this.h0.containsKey(((String)object).toLowerCase(Locale.getDefault()))) {
                    object = new IOException("Item already exists!");
                    throw object;
                }
                this.f();
                Object object2 = l.c((String)object, this.i0.keySet());
                object = i.b((String)object, (k)object2);
                ((i)object).m();
                long l8 = this.e0.a(new Long[0], 1)[0];
                ((i)object).r(l8);
                String string = n0;
                Object object3 = new StringBuilder();
                ((StringBuilder)object3).append("adding entry: ");
                ((StringBuilder)object3).append(object);
                ((StringBuilder)object3).append(" with short name: ");
                ((StringBuilder)object3).append(object2);
                Log.d((String)string, (String)((StringBuilder)object3).toString());
                this.b((i)object, ((i)object).c());
                this.q();
                object2 = f.c((i)object, this.d0, this.e0, this.f0, this);
                ((f)object2).m0 = true;
                ((f)object2).g0 = object3 = new ArrayList();
                object3 = new k(".", "");
                object3 = i.b(null, (k)object3);
                ((i)object3).m();
                ((i)object3).r(l8);
                i.a((i)object, (i)object3);
                super.b((i)object3, ((i)object3).c());
                object3 = new k("..", "");
                object3 = i.b(null, (k)object3);
                ((i)object3).m();
                l8 = this.q0() ? 0L : ((i)object).i();
                ((i)object3).r(l8);
                i.a((i)object, (i)object3);
                super.b((i)object3, ((i)object3).c());
                ((f)object2).q();
                return object2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public void delete() throws IOException {
        if (!this.q0()) {
            this.f();
            e[] eArray = this.B0();
            if (eArray != null && eArray.length > 0) {
                throw new IOException("Can't delete directory. SubElements exists");
            }
            this.j0.f();
            this.j0.o(this.k0);
            this.j0.q();
            this.c0.f(0L);
            return;
        }
        throw new IllegalStateException("Root dir cannot be deleted!");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public h e(String object) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (!this.h0.containsKey(((String)object).toLowerCase(Locale.getDefault()))) {
                        this.f();
                        k k8 = l.c((String)object, this.i0.keySet());
                        object = i.b((String)object, k8);
                        ((i)object).r(this.e0.a(new Long[0], 1)[0]);
                        String string = n0;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("adding entry: ");
                        stringBuilder.append(object);
                        stringBuilder.append(" with short name: ");
                        stringBuilder.append(k8);
                        Log.d((String)string, (String)stringBuilder.toString());
                        this.b((i)object, ((i)object).c());
                        this.q();
                        return h.b((i)object, this.d0, this.e0, this.f0, this);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = new IOException("Item already exists!");
                throw object;
            }
            throw throwable2;
        }
    }

    void g(i i8, e e8) throws IOException {
        if (e8.isDirectory()) {
            if (e8 instanceof f) {
                e8 = (f)e8;
                if (!((f)e8).h0.containsKey(i8.g().toLowerCase(Locale.getDefault()))) {
                    this.f();
                    super.f();
                    this.o(i8);
                    super.b(i8, i8.c());
                    this.q();
                    ((f)e8).q();
                    return;
                }
                throw new IOException("item already exists in destination!");
            }
            throw new IllegalStateException("cannot move between different filesystems!");
        }
        throw new IllegalStateException("destination cannot be a file!");
    }

    @Override
    public long getLength() {
        return 0L;
    }

    @Override
    public String getName() {
        i i8 = this.k0;
        if (i8 != null) {
            return i8.g();
        }
        return "";
    }

    @Override
    public e getParent() {
        return this.j0;
    }

    @Override
    public long h() {
        if (this.q0()) {
            return 0L;
        }
        return this.k0.c().l();
    }

    @Override
    public void i(long l8, ByteBuffer byteBuffer) throws IOException {
        throw new UnsupportedOperationException("This is a directory!");
    }

    @Override
    public boolean isDirectory() {
        return true;
    }

    @Override
    public void l(long l8, ByteBuffer byteBuffer) throws IOException {
        throw new UnsupportedOperationException("This is a directory!");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void o(i i8) {
        synchronized (this) {
            this.g0.remove(i8);
            this.h0.remove(i8.g().toLowerCase(Locale.getDefault()));
            this.i0.remove(i8.c().m());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void p(i i8, String string) throws IOException {
        synchronized (this) {
            boolean bl = i8.g().equals(string);
            if (bl) {
                return;
            }
            this.o(i8);
            i8.q(string, l.c(string, this.i0.keySet()));
            this.b(i8, i8.c());
            this.q();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void q() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block11: {
                long l8;
                Iterator<i> iterator;
                boolean bl;
                int n8;
                block9: {
                    block10: {
                        long l9;
                        int n9;
                        block8: {
                            try {
                                this.f();
                                boolean bl2 = this.q0();
                                n8 = 0;
                                bl = bl2 && this.l0 != null;
                                iterator = this.g0.iterator();
                                while (iterator.hasNext()) {
                                    n8 += iterator.next().d();
                                }
                                n9 = n8;
                                if (!bl) break block8;
                                n9 = n8 + 1;
                            }
                            catch (Throwable throwable2) {}
                        }
                        if ((n8 = (int)((l9 = (l8 = (long)(n9 * 32)) - 0L) == 0L ? 0 : (l9 < 0L ? -1 : 1))) == 0) break block10;
                        this.c0.f(l8);
                        break block9;
                        break block11;
                    }
                    this.c0.f(32L);
                }
                ByteBuffer byteBuffer = ByteBuffer.allocate((int)this.c0.c());
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                if (bl) {
                    g.c(this.l0).E(byteBuffer);
                }
                iterator = this.g0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().l(byteBuffer);
                }
                if (l8 % (long)this.f0.a() != 0L || n8 == 0) {
                    byteBuffer.put(new byte[byteBuffer.remaining()]);
                }
                byteBuffer.flip();
                this.c0.g(0L, byteBuffer);
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public boolean q0() {
        return this.k0 == null;
    }

    @Override
    public void w0(String string) throws IOException {
        if (!this.q0()) {
            this.j0.p(this.k0, string);
            return;
        }
        throw new IllegalStateException("Cannot rename root dir!");
    }

    @Override
    public String z() {
        i i8 = this.k0;
        if (i8 != null) {
            return i8.h();
        }
        return "null entry";
    }
}

