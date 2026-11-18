/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.TransactionTooLargeException;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.X2.L;
import ax.X2.M;
import ax.X2.Q;
import ax.X2.v;
import ax.b3.k;
import ax.b3.r;
import ax.b3.t;
import ax.b3.w;
import ax.c3.B;
import ax.c3.F;
import ax.c3.G;
import ax.c3.H;
import ax.c3.I;
import ax.c3.N;
import ax.c3.Y;
import ax.c3.d0;
import ax.c3.i0;
import ax.c3.k0;
import ax.c3.l;
import ax.c3.n0;
import ax.g3.h;
import ax.g3.i;
import ax.s3.a;
import ax.u3.q;
import com.voxdon.xplorer.file.A;
import com.voxdon.xplorer.file.C;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.file.K;
import com.voxdon.xplorer.file.c;
import com.voxdon.xplorer.file.j;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.p;
import com.voxdon.xplorer.file.y;
import com.voxdon.xplorer.file.z;
import com.voxdon.xplorer.service.ScanService;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.logging.Logger;

public class x
extends com.voxdon.xplorer.file.e
implements i0 {
    private static final Logger r = Logger.getLogger("FileManager.LocalFileHelper");
    private static int s = 327680;
    private static final List<String> t = Arrays.asList("acct", "cache", "charger", "config", "d", "data", "debug_ramdisk", "dev", "etc", "mnt", "oem", "proc", "property_contexts", "root", "sbin", "sdcard", "storage", "sys", "system", "vendor");
    private static final List<String> u = Arrays.asList("0", "999", "95", "96");
    private static final List<String> v = Arrays.asList("/DCIM/Camera", "/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Images");
    private static final List<String> w = Arrays.asList("/DCIM/Camera");
    private static final List<String> x = Arrays.asList("/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Voice Notes", "/Android/media/com.whatsapp/WhatsApp/Media/.Statuses");
    private static final String[] y = new String[]{"_id", "_data", "date_modified", "_size", "mime_type", "date_added", "datetaken"};
    private HashMap<String, Boolean> h = new HashMap();
    private ArrayList<ax.o3.f> i = new ArrayList();
    private boolean j = false;
    private j.ConcurrentHashMap<String, ax.o3.f> k = new j.ConcurrentHashMap();
    private com.voxdon.xplorer.file.g l;
    private final Object m = new Object();
    private HashSet<String> n;
    private HashSet<String> o;
    private Boolean p;
    private boolean q = false;

    private void A1(y y8, y y9, ax.u3.c c8, i i8) throws ax.b3.j, ax.b3.a {
        if (y8.isDirectory()) {
            this.x0(y8, y9, c8, i8);
            this.C0(y8);
            return;
        }
        this.z1(y8, y9, c8, i8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private A B0(ax.c3.K object, Cursor object2, L object3) {
        boolean bl;
        boolean bl2;
        long l8;
        long l9;
        long l10;
        String string;
        block8: {
            File file;
            boolean bl3;
            long l11;
            block9: {
                boolean bl4 = true;
                string = object2.getString(1);
                l10 = object2.getLong(2) * 1000L;
                l11 = object2.getLong(3);
                bl3 = this.k1(object2.getString(4));
                boolean bl5 = bl4;
                if (!object2.isNull(2)) {
                    bl5 = !bl3 && object2.isNull(3) ? bl4 : false;
                }
                l9 = object2.getLong(5);
                if (bl3 || l10 == 0L) break block9;
                l8 = l11;
                bl2 = bl3;
                if (!bl5) break block8;
            }
            bl = bl3;
            try {
                ax.X2.v.l(string, (L)((Object)file));
                bl = bl3;
                long l12 = ((L)((Object)file)).c;
                bl = bl3;
                bl3 = ((L)((Object)file)).b;
                l10 = l12;
                l8 = l11;
                bl2 = bl3;
                if (!bl3) {
                    bl = bl3;
                    l8 = ((L)((Object)file)).a;
                    l10 = l12;
                    bl2 = bl3;
                }
            }
            catch (IOException iOException) {
                file = new File(string);
                long l13 = file.lastModified();
                object = d0.f(string);
                l10 = l13;
                l8 = l11;
                bl2 = bl;
                if (TextUtils.isEmpty((CharSequence)object)) break block8;
                l10 = l13;
                l8 = l11;
                bl2 = bl;
                if (ax.c3.A.g((String)object) == null) break block8;
                bl2 = file.isDirectory();
                l10 = l13;
                l8 = l11;
            }
        }
        bl = object2.isNull(6);
        object = null;
        if (bl) {
            return new A(string, bl2, l10, (Long)object, l9, l8);
        }
        try {
            Long l14 = object2.getLong(6);
            object = l14;
            return new A(string, bl2, l10, (Long)object, l9, l8);
        }
        catch (Exception exception) {
            return new A(string, bl2, l10, (Long)object, l9, l8);
        }
    }

    private boolean B1(n n8) {
        return !ax.X2.J.x(this.p()) && B.M(n8);
    }

    public static boolean C1(Context context, ax.c3.K k8, y object) {
        if (object != null && (((y)object).o0() || ((y)object).d1() || ((y)object).f1())) {
            return false;
        }
        object = object == null ? null : ((y)object).M0();
        return com.voxdon.xplorer.file.x.D1(context, k8, (String)object);
    }

    private boolean D0(n object, boolean bl) {
        if (!this.m1()) {
            return true;
        }
        if (!B.P((n)object)) {
            return true;
        }
        y y8 = (y)object;
        if (y8.B0().d() == ax.Q2.f.t0) {
            return true;
        }
        if (y8.C0().startsWith("/Android") && (com.voxdon.xplorer.file.x.h1((n)object) || com.voxdon.xplorer.file.x.i1((n)object))) {
            return true;
        }
        if (!(Q.A0() || bl || ax.c3.A.L(((n)object).A()))) {
            return true;
        }
        if ("tmp".equals(((n)object).A())) {
            return true;
        }
        object = y8.C0();
        if (((String)object).contains(".$recycle_bin$")) {
            return true;
        }
        if (Q.L()) {
            if (d0.H("/.localcache", (String)object)) {
                return true;
            }
            if (d0.H("/Android/media/com.voxdon.xplorer/.localcache", (String)object)) {
                return true;
            }
        } else if (!Q.L() && ((String)object).contains("/localcache")) {
            return true;
        }
        return false;
    }

    public static boolean D1(Context context, ax.c3.K k8, String string) {
        if (!Q.V1()) {
            return false;
        }
        if (ax.Q2.f.Q(k8)) {
            if (string != null) {
                return com.voxdon.xplorer.file.g.C(context, k8, string) ^ true;
            }
            if (ax.Z2.j.F().j0(k8)) {
                return false;
            }
            return com.voxdon.xplorer.file.g.C(context, k8, null) ^ true;
        }
        if (!ax.Q2.f.i0(k8.d())) {
            return false;
        }
        if (ax.Z2.j.F().k0(k8)) {
            return false;
        }
        return !com.voxdon.xplorer.file.g.C(context, k8, null) && !ax.Z2.j.F().j0(k8);
    }

    public static boolean E1(Context context, n n8, boolean bl) {
        if (!B.P(n8)) {
            return false;
        }
        if (((y)(n8 = (y)n8)).d1()) {
            return false;
        }
        if (((y)n8).o0()) {
            return false;
        }
        if (((y)n8).f1()) {
            return false;
        }
        if (bl && ax.Z2.j.F().E0(((y)n8).B0()) && com.voxdon.xplorer.file.x.t0(context, (y)n8)) {
            return false;
        }
        return com.voxdon.xplorer.file.x.C1(context, ((y)n8).B0(), (y)n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void F0(ArrayList<ax.o3.f> arrayList) {
        int n8;
        ArrayList<ax.o3.f> arrayList2 = new ArrayList<ax.o3.f>();
        int n9 = 0;
        int n10 = 5000;
        do {
            int n11;
            block10: {
                int n12;
                block11: {
                    Iterator<ax.o3.f> iterator;
                    block9: {
                        n12 = n9;
                        if (n9 != 0) {
                            arrayList.addAll(arrayList2);
                            arrayList2.clear();
                            n12 = 0;
                            n10 = 5000;
                        }
                        n9 = n10;
                        try {
                            iterator = arrayList.iterator();
                            break block9;
                        }
                        catch (RuntimeException runtimeException) {}
                        if (runtimeException.getCause() instanceof TransactionTooLargeException && s == 327680) {
                            s = 163840;
                            n8 = 1;
                            n11 = n9;
                            break block10;
                        } else {
                            ax.Q2.d.c("executePendingScan", runtimeException);
                            n11 = n9;
                            n8 = n12;
                        }
                        break block10;
                    }
                    do {
                        n9 = n10;
                        if (!iterator.hasNext()) break block11;
                        n9 = n10;
                        ax.o3.f f8 = iterator.next();
                        n8 = n10;
                        if (f8 != null) {
                            n9 = n10;
                            arrayList2.add(f8);
                            n9 = n10;
                            n8 = n10 + f8.a();
                        }
                        n9 = n8;
                        iterator.remove();
                        n10 = n8;
                        n9 = n8;
                    } while (n8 < s);
                    n9 = n8;
                    this.P1(arrayList2, iterator.hasNext(), n8);
                    return;
                }
                n9 = n10;
                n8 = n12;
                n11 = n10;
                if (arrayList2.size() > 0) {
                    n9 = n10;
                    this.P1(arrayList2, false, n10);
                    return;
                }
            }
            n9 = n8;
            n10 = n11;
        } while (n8 != 0);
    }

    private void F1(n n8, n n9, Throwable throwable) throws ax.b3.j {
        boolean bl;
        block7: {
            block8: {
                boolean bl2;
                boolean bl3 = this.u0();
                bl = bl2 = false;
                if (!bl3) break block7;
                if (this.p1(n8)) break block8;
                bl = bl2;
                if (!this.p1(n9)) break block7;
            }
            bl = z.Y().P(n8.E(), n9.E(), false);
        }
        if (!bl) {
            ((y)n8).q1();
            if (throwable == null) {
                if (n8.n()) {
                    throw new ax.b3.j("File.renameTo failed");
                }
                throw new t("move source not exist");
            }
            if (n8.n()) {
                throw new ax.b3.j("Files.move failed", throwable);
            }
            throw new t(throwable);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String G1(Uri object, String[] cursor, String string, String[] stringArray, int n8) {
        RuntimeException var1_4;
        block8: {
            block7: {
                Object var6_9 = null;
                if (object == null) {
                    return null;
                }
                try {
                    cursor = this.p().getContentResolver().query((Uri)object, (String[])cursor, string, stringArray, null);
                    if (cursor == null) break block7;
                }
                catch (Throwable throwable) {
                    cursor = var6_9;
                    break block8;
                }
                try {
                    if (!cursor.moveToFirst()) break block7;
                    object = cursor.getString(n8);
                }
                catch (Throwable throwable) {
                    break block8;
                }
                cursor.close();
                return object;
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw var1_4;
    }

    private void H0(ArrayList<ax.o3.f> arrayList, int n8, i i8) {
        while (arrayList.size() > 0) {
            if (i8 != null) {
                i8.a(n8 - arrayList.size(), n8);
            }
            this.F0(arrayList);
            if (arrayList.size() <= 0) continue;
            try {
                Thread.sleep(500L);
            }
            catch (Exception exception) {}
        }
        if (i8 != null) {
            i8.a(n8 - arrayList.size(), n8);
        }
    }

    public static n J0(List<n> object) {
        object = object.iterator();
        while (object.hasNext()) {
            n n8 = (n)object.next();
            if (!".hidden".equals(n8.B())) continue;
            return n8;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static long K1(long l8) {
        long l9;
        long l10;
        long l11;
        long l12 = 1L;
        long l13 = 1L;
        while ((l11 = (l10 = (l9 = l12 * l13) - l8) == 0L ? 0 : (l10 < 0L ? -1 : 1)) < 0 && l8 - l9 > l9 / 2L) {
            l12 = l9 = l12 << 1;
            if (l9 <= 512L) continue;
            l12 = Q.b2() ? 1000L : 1024L;
            l13 *= l12;
            l12 = 1L;
        }
        if (l11 > 0) {
            return l9;
        }
        return l8;
    }

    private void L1(n n8, boolean bl, boolean bl2) {
        if (this.D0(n8, bl)) {
            return;
        }
        this.r0(n8, true, bl, false, false, bl2, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private n M0(y n8, String object) {
        if (((y)n8).T0()) {
            try {
                return this.V0((y)n8);
            }
            catch (ax.b3.j j8) {
                return null;
            }
        }
        if (I.b(n8.R())) {
            object = I.c(n8.R(), (String)object);
            if (object == null) return null;
            return new y(this, (File)object, ((y)n8).B0(), true);
        }
        if (I.a(((y)n8).B0()) && ((y)n8).b1()) {
            object = I.c(n8.R(), (String)object);
            if (object == null) return null;
            return new y(this, (File)object, ((y)n8).B0(), true);
        }
        if (!com.voxdon.xplorer.shizuku.c.t().l()) return null;
        n8 = com.voxdon.xplorer.shizuku.c.t().r(this, null, (String)object);
        if (n8 == null) return null;
        return n8;
    }

    private void M1(n n8, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (this.D0(n8, n8.isDirectory())) {
            return;
        }
        if (n8.isDirectory()) {
            this.q0(n8, bl, bl2, bl3);
            return;
        }
        this.r0(n8, false, false, bl, bl2, bl3, bl4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void N1(n n8, String string, boolean bl, boolean bl2, h h8, ax.u3.c c8) {
        if (c8 != null && c8.isCancelled()) return;
        List<String> list = N.d(this.p(), n8, string, bl2);
        ArrayList<n> arrayList = new ArrayList<n>();
        long l8 = System.currentTimeMillis();
        Iterator<String> iterator = list.iterator();
        Object object = "";
        while (iterator.hasNext()) {
            String string2 = iterator.next();
            Object object2 = d0.r(string2);
            if (!((String)object).equals(object2)) {
                long l9 = System.currentTimeMillis();
                if (arrayList.size() > 0 && l9 - l8 > 100L) {
                    this.I0(n8, arrayList, false, string, bl, h8);
                    arrayList.clear();
                    l8 = l9;
                }
                if (c8 != null && c8.isCancelled()) {
                    return;
                }
                object = object2;
            }
            if (!(object2 = this.z(string2)).n() || J.j2((n)object2)) continue;
            arrayList.add((n)object2);
        }
        if (arrayList.size() > 0) {
            this.I0(n8, arrayList, true, string, bl, h8);
            arrayList.clear();
        }
        this.o(n8, string, bl, bl2, new h(){
            final List a;
            final h b;
            final x c;
            {
                this.c = x8;
                this.a = list;
                this.b = h8;
            }

            @Override
            public void Y(List<n> list, boolean bl) {
                Iterator<n> iterator = list.iterator();
                list = null;
                while (iterator.hasNext()) {
                    n n8 = iterator.next();
                    if (this.a.contains(n8.E())) continue;
                    List<n> list2 = list;
                    if (list == null) {
                        list2 = new ArrayList<n>();
                    }
                    list2.add(n8);
                    list = list2;
                }
                if (list != null) {
                    this.b.Y(list, bl);
                }
            }

            @Override
            public void i() {
            }

            @Override
            public void o() {
            }
        }, c8);
    }

    public static y O0(File comparable) {
        o o8 = ax.c3.x.f(comparable);
        try {
            comparable = (y)o8.z(comparable.getAbsolutePath());
            return comparable;
        }
        catch (ax.b3.j j8) {
            ax.u3.b.f();
            return null;
        }
    }

    public static void O1(Context context, ArrayList<ax.o3.f> arrayList, boolean bl, int n8) {
        Intent intent = new Intent(context, ScanService.class);
        intent.putExtra("PENDING_SCAN_ARRAY", (Parcelable[])arrayList.toArray(new ax.o3.f[0]));
        intent.putExtra("HAS_FOLLOWING_LIST", bl);
        try {
            ax.u3.B.f0(context, intent, true, true);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            ax.Ha.c.i(context).f().b("START SCAN SERVICE FOREGROUND").l(illegalStateException).h();
            return;
        }
    }

    private InputStream P0(y object, long l8) throws IOException {
        object = new FileInputStream(((y)object).F0());
        if (l8 != 0L) {
            ((FileInputStream)object).skip(l8);
        }
        return object;
    }

    private void P1(ArrayList<ax.o3.f> arrayList, boolean bl, int n8) {
        com.voxdon.xplorer.file.x.O1(this.p(), arrayList, bl, n8);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private String Q0(String object, boolean bl) {
        String string;
        block8: {
            block9: {
                String var3_9;
                Object object2;
                if (!Q.b()) {
                    return null;
                }
                if (bl) {
                    object2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    Uri uri = MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI;
                    string = "video_id";
                } else {
                    object2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    Uri uri = MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI;
                    string = "image_id";
                }
                object2 = this.G1((Uri)object2, new String[]{"_id", "_data"}, "_data = ?", new String[]{object}, 0);
                if (object2 != null) {
                    Uri var3_5;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    stringBuilder.append(" = ?");
                    string = stringBuilder.toString();
                    String string2 = this.G1((Uri)var3_5, new String[]{"_id", "_data"}, string, new String[]{object2}, 1);
                } else {
                    Object var3_8 = null;
                }
                string = var3_9;
                if (var3_9 == null) break block8;
                object2 = this.z((String)var3_9);
                if (!object2.n()) break block9;
                object = this.z((String)object);
                string = var3_9;
                if (!object.n()) break block8;
                string = var3_9;
                if (object.q() <= object2.q()) break block8;
                string = var3_9;
                if (object.q() >= System.currentTimeMillis()) break block8;
            }
            string = null;
        }
        if (string == null) return null;
        if (!string.isEmpty()) return string;
        return null;
    }

    public static j R0(Context object, List<n> object2) {
        Iterator<n> iterator = object2.iterator();
        Object var3_4 = null;
        Object object3 = null;
        while (iterator.hasNext()) {
            Object object4 = iterator.next();
            if (!B.P((n)object4)) continue;
            if (object4 instanceof K && ((K)object4).C1()) {
                try {
                    object2 = com.voxdon.xplorer.file.y.I0(((n)object4).E());
                }
                catch (ax.b3.j j8) {
                    object2 = (y)object4;
                }
            } else {
                object2 = (y)object4;
            }
            if (((ax.c3.K)(object4 = ((y)object2).B0())).equals(object3)) continue;
            if (com.voxdon.xplorer.file.x.C1(object, (ax.c3.K)object4, (y)object2)) {
                object = var3_4;
                if (ax.Q2.f.Q((ax.c3.K)object4)) {
                    object = var3_4;
                    if (((y)object2).a1()) {
                        object = ((y)object2).M0();
                    }
                }
                return new j((ax.c3.K)object4, (String)object);
            }
            object3 = object4;
        }
        return null;
    }

    private boolean R1(n n8, n n9) {
        n8 = (y)n8;
        n9 = (y)n9;
        boolean bl = ((y)n8).i0();
        if (!(bl || ((y)n8).B0() == ax.c3.K.f && ((y)n8).T0())) {
            return false;
        }
        if (((y)n8).B0() == ax.c3.K.e) {
            return bl && ((y)n9).i0();
        }
        return ((y)n8).B0() != ax.c3.K.f || bl || ((y)n9).i0();
        {
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static Bitmap S0(ParcelFileDescriptor parcelFileDescriptor, int n8, int n9) {
        PdfRenderer.Page page;
        PdfRenderer pdfRenderer;
        block16: {
            Bitmap bitmap;
            block17: {
                block15: {
                    // MONITORENTER : com.voxdon.xplorer.file.x.class
                    Object var6_4 = null;
                    pdfRenderer = new PdfRenderer(parcelFileDescriptor);
                    bitmap = Bitmap.createBitmap((int)n8, (int)n9, (Bitmap.Config)Bitmap.Config.ARGB_4444);
                    bitmap.eraseColor(-1);
                    page = pdfRenderer.openPage(0);
                    page.render(bitmap, null, null, 1);
                    F.a((AutoCloseable)page);
                    F.a((AutoCloseable)pdfRenderer);
                    return bitmap;
                    catch (Throwable throwable) {
                        break block15;
                    }
                    catch (Exception exception) {
                        break block16;
                    }
                    catch (Throwable throwable) {
                        page = null;
                        break block15;
                    }
                    catch (Exception exception) {
                        page = null;
                        break block16;
                    }
                    catch (Throwable throwable) {
                        page = null;
                        pdfRenderer = var6_4;
                    }
                    catch (Exception exception) {
                        page = null;
                        pdfRenderer = null;
                        break block16;
                    }
                }
                if (pdfRenderer == null) break block17;
                F.a(page);
                F.a((AutoCloseable)pdfRenderer);
                throw bitmap;
            }
            F.a((AutoCloseable)parcelFileDescriptor);
            throw bitmap;
        }
        if (pdfRenderer != null) {
            F.a(page);
            F.a((AutoCloseable)pdfRenderer);
            return null;
        }
        F.a((AutoCloseable)parcelFileDescriptor);
        // MONITOREXIT : com.voxdon.xplorer.file.x.class
        return null;
    }

    private boolean S1() {
        return this.q && this.u() == ax.Q2.f.t0 && ax.Z2.j.F().q();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private y V0(y var1_1) throws ax.b3.j {
        block11: {
            var4_2 = var1_1.E();
            var3_3 /* !! */  = var1_1.N0();
            var5_10 = var1_1.B0();
            var1_1 = com.voxdon.xplorer.file.g.e(this.v(), var3_3 /* !! */ , (String)var4_2);
            var2_11 = this.p().getContentResolver();
            var2_11 = var2_11.query((Uri)var1_1, ax.c3.l.g, null, null, null);
            if (var2_11 != null) {
                var1_1 = var2_11;
            }
            ** GOTO lbl40
            {
                block13: {
                    block12: {
                        block14: {
                            catch (Throwable var2_14) {
                                var1_1 = null;
                                break block11;
                            }
                            catch (Exception var3_8) {
                                var2_11 = null;
                                break block12;
                            }
                            catch (IllegalArgumentException var3_9) {
                                var2_11 = null;
                                break block13;
                            }
                            try {
                                if (!var2_11.moveToFirst()) break block14;
                                var1_1 = var2_11;
                                var3_3 /* !! */  = new y(this, var3_3 /* !! */ , var5_10, d0.r((String)var4_2), (Cursor)var2_11);
                            }
                            catch (Exception var3_4) {
                                break block12;
                            }
                            catch (IllegalArgumentException var3_6) {
                                break block13;
                            }
                            F.a((AutoCloseable)var2_11);
                            return var3_3 /* !! */ ;
                            catch (Throwable var2_12) {
                            }
                        }
                        var1_1 = var2_11;
                        {
                            var1_1 = var2_11;
                            var3_3 /* !! */  = new t();
                            var1_1 = var2_11;
                            throw var3_3 /* !! */ ;
lbl40:
                            // 1 sources

                            var1_1 = var2_11;
                            var1_1 = var2_11;
                            var3_3 /* !! */  = new ax.b3.j("query return null");
                            var1_1 = var2_11;
                            throw var3_3 /* !! */ ;
                        }
                    }
                    var1_1 = var2_11;
                    var1_1 = var2_11;
                    var4_2 = new StringBuilder();
                    var1_1 = var2_11;
                    var4_2.append("getFileInfo : ");
                    var1_1 = var2_11;
                    var4_2.append(var3_5.getClass().getSimpleName());
                    var1_1 = var2_11;
                    var4_2.append(":");
                    var1_1 = var2_11;
                    var4_2.append(var3_5.getMessage());
                    var1_1 = var2_11;
                    throw ax.b3.d.a(var4_2.toString(), (Exception)var3_5);
                }
                var1_1 = var2_11;
                var1_1 = var2_11;
                var4_2 = new ax.b3.j((Throwable)var3_7);
                var1_1 = var2_11;
                throw var4_2;
            }
        }
        F.a((AutoCloseable)var1_1);
        throw var2_13;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private k0 W0(String object, long l8) throws ax.b3.j {
        try {
            Object object2 = ax.X2.v.o((String)object);
            if (l8 <= 0L) {
                l8 = ((M)object2).b * ((M)object2).a;
            }
            StorageManager storageManager = (StorageManager)this.p().getSystemService("storage");
            object2 = new File((String)object);
            return new k0(l8, l8 - ax.c3.J.a(storageManager, ax.T2.a.a(storageManager, (File)object2)), 0);
        }
        catch (Exception exception) {
            throw new ax.b3.j(exception);
        }
    }

    private k0 X0() throws ax.b3.j {
        Object object = this.u();
        Comparable<n> comparable = this.z(this.x());
        if (comparable.n()) {
            long l8;
            Object object2;
            boolean bl = comparable.isDirectory();
            long l9 = 0L;
            if (!bl) {
                if (object == ax.Q2.f.q0) {
                    if (comparable.p() == 0L) {
                        this.P((n)comparable);
                        ax.Ha.c.h().c("Download root path file size 0 deleted").h();
                    }
                } else {
                    ax.Ha.b b8 = ax.Ha.c.h().f().d("RootPath is File").j();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(((ax.Q2.f)((Object)object)).I());
                    stringBuilder.append(":");
                    stringBuilder.append(comparable.p());
                    b8.g(stringBuilder.toString()).h();
                }
                throw new ax.b3.j("Root path is file");
            }
            object = object2 = ax.Z2.b.k().g((n)comparable);
            if (object2 == null) {
                object = this.b0((n)comparable);
            }
            object2 = comparable instanceof C ? ((C)comparable).C1() : null;
            int n8 = 0;
            if (object != null) {
                object = new ArrayList(object);
                int n9 = ((ArrayList)object).size();
                l8 = 0L;
                int n10 = 0;
                while (n10 < n9) {
                    comparable = ((ArrayList)object).get(n10);
                    int n11 = n10 + 1;
                    comparable = ((y)comparable).F0();
                    n10 = n11;
                    if (!((File)comparable).exists()) continue;
                    n8 += B.v(comparable, (FilenameFilter)object2);
                    l8 += B.p(comparable, (FilenameFilter)object2);
                    n10 = n11;
                }
            } else {
                l8 = 0L;
                n8 = 0;
            }
            long l10 = l9;
            if (!TextUtils.isEmpty((CharSequence)this.x())) {
                l10 = l9;
                if (!"/".equals(this.x())) {
                    l10 = this.Y0().d;
                }
            }
            return new k0(l8, l8, l10, n8);
        }
        throw new t("StorageSpaceIteration root file not found");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private k0 Y0() throws ax.b3.j {
        Object object = this.x();
        if (TextUtils.isEmpty((CharSequence)object)) {
            object = ax.Ha.c.h().f().d("LOCAL STORAGE SPACE");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.u().I());
            stringBuilder.append(" ");
            stringBuilder.append(this.x());
            stringBuilder.append(" (");
            stringBuilder.append((Object)ax.Q2.e.z());
            stringBuilder.append(")");
            ((ax.Ha.b)object).g(stringBuilder.toString()).h();
            throw new ax.b3.j("no root path");
        }
        if (this.u() == ax.Q2.f.o0 && !ax.Z2.j.F().o0() && ((String)object).equals("/storage/emulated/0")) {
            long l8 = Environment.getRootDirectory().getTotalSpace();
            long l9 = Environment.getDataDirectory().getTotalSpace();
            if (l8 > 1000000000000L) {
                l8 = com.voxdon.xplorer.file.x.K1(l9);
                return this.Z0((String)object, l8);
            }
            l8 = com.voxdon.xplorer.file.x.K1(l9 + l8);
            return this.Z0((String)object, l8);
        }
        if (this.u() != ax.Q2.f.p0 && this.u() != ax.Q2.f.v0 && this.u() != ax.Q2.f.x0) {
            if (this.u() != ax.Q2.f.w0) return this.Z0((String)object, 0L);
        }
        if (!this.j1()) return this.Z0((String)object, 0L);
        if (ax.Q2.e.I()) return this.Z0((String)object, 0L);
        Object object2 = com.voxdon.xplorer.file.g.x(this.p(), this.v(), null);
        if (TextUtils.isEmpty((CharSequence)object2)) return this.Z0((String)object, 0L);
        try {
            object2 = Uri.parse((String)object2);
            return com.voxdon.xplorer.file.g.k(this.p(), this, this.v(), (Uri)object2);
        }
        catch (ax.b3.j j8) {
            return this.Z0((String)object, 0L);
        }
    }

    private k0 Z0(String string, long l8) throws ax.b3.j {
        if (Q.P1()) {
            return this.b1(string, l8);
        }
        return this.a1(string, l8);
    }

    private k0 a1(String object, long l8) {
        block0: {
            object = new File((String)object);
            if (l8 > 0L) break block0;
            l8 = ((File)object).getTotalSpace();
        }
        return new k0(l8, l8 - ((File)object).getUsableSpace(), 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private k0 b1(String object, long l8) throws ax.b3.j {
        Throwable var1_4;
        long l9;
        long l10;
        long l11;
        Object object2;
        try {
            object2 = ax.X2.v.o((String)object);
            l11 = l8 > 0L ? l8 : ((M)object2).b * ((M)object2).a;
            l10 = ((M)object2).c;
            l9 = ((M)object2).a;
        }
        catch (Exception exception) {
            throw new ax.b3.j((Throwable)var1_4);
        }
        Long.signum(l10);
        l10 = l11 - l10 * l9;
        if (!ax.X2.J.F()) return new k0(l11, l10, 0);
        if (this.u() != ax.Q2.f.o0) return new k0(l11, l10, 0);
        if (l11 <= 1000000000000L) return new k0(l11, l10, 0);
        if (l10 * 100L / l11 < 95L) return new k0(l11, l10, 0);
        l9 = l11 - ((M)object2).d * ((M)object2).a;
        if (l9 > 0L && l9 * 100L / l11 < 95L) {
            return new k0(l11, l9, 0);
        }
        if (Q.S0()) {
            long l12;
            object2 = this.W0((String)object, l8);
            l9 = ((k0)object2).b;
            if (l9 != 0L && (l12 = ((k0)object2).a) > 0L && l12 * 100L / l9 < 95L) {
                return object2;
            }
        }
        object2 = d0.Q((String)object, "DCIM");
        object = new File((String)object2);
        boolean bl = ((File)object).exists();
        if (!bl) return new k0(l11, l10, 0);
        try {
            object = this.a1((String)object2, l8);
            l9 = ((k0)object).b;
            if (l9 == 0L) return new k0(l11, l10, 0);
            l8 = ((k0)object).a;
            if (l8 <= 0L) return new k0(l11, l10, 0);
            if (l8 * 100L / l9 >= 95L) return new k0(l11, l10, 0);
            return object;
        }
        catch (Exception exception) {
            throw new ax.b3.j((Throwable)var1_4);
        }
    }

    private InputStream e1(String string) {
        if (new File(string).length() == 0L) {
            return ax.r3.b.n();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile((String)string, (BitmapFactory.Options)options);
        if (options.outWidth > 0 && options.outHeight > 0) {
            return this.x1(string);
        }
        return ax.r3.b.n();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private InputStream f1(String var1_1) {
        block16: {
            block17: {
                block14: {
                    block15: {
                        block18: {
                            var3_5 = this.Q0((String)var1_1, true);
                            if (var3_5 != null) return this.x1((String)var3_5);
                            var3_5 = (y)this.z((String)var1_1);
                            var2_8 = var3_5.k0();
                            var4_9 = null;
                            if (!var2_8) break block17;
                            var4_9 = var3_5 = var3_5.e0(true);
                            ** try [egrp 1[TRYBLOCK] [3, 2 : 41->59)] { 
lbl10:
                            // 1 sources

                            break block18;
lbl11:
                            // 1 sources

                            catch (Throwable var1_2) {
                                var3_5 = var4_9;
                                break block14;
                            }
lbl14:
                            // 1 sources

                            catch (ax.b3.j var5_11) {
                                break block15;
                            }
lbl16:
                            // 2 sources

                            while (true) {
                                try {
                                    var3_5.close();
                                }
                                catch (IOException var3_6) {}
                                break block16;
                                break;
                            }
                            catch (Throwable var1_3) {
                                var3_5 = var4_9;
                                break block14;
                            }
                            catch (ax.b3.j var5_12) {
                                var3_5 = null;
                                break block15;
                            }
                        }
                        var5_10 = ax.u3.B.g(this.p(), null, var3_5.getFileDescriptor(), null, 512);
                        var1_1 = var5_10;
                        ** GOTO lbl16
                    }
                    var4_9 = var3_5;
                    {
                        var5_13.printStackTrace();
                        var4_9 = var3_5;
                        var5_13 = ax.u3.B.g(this.p(), (String)var1_1, null, null, 512);
                        var1_1 = var5_13;
                        if (var3_5 != null) {
                            var1_1 = var5_13;
                            ** continue;
                        }
                        break block16;
                    }
                }
                if (var3_5 == null) throw var1_4;
                try {
                    var3_5.close();
                    throw var1_4;
                }
                catch (IOException var3_7) {
                    throw var1_4;
                }
            }
            var1_1 = ax.u3.B.g(this.p(), (String)var1_1, null, null, 512);
        }
        var3_5 = var1_1;
        if (var1_1 == null) {
            var3_5 = a.b();
        }
        var1_1 = new ByteArrayOutputStream(32768);
        var3_5.compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)var1_1);
        return new ByteArrayInputStream(var1_1.toByteArray());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static boolean h1(n n8) {
        if (!Q.L()) {
            return false;
        }
        if (!B.P(n8)) {
            return false;
        }
        try {
            n8 = (y)n8;
            if (((y)n8).B0() == ax.c3.K.e) return d0.J("/Android/data", ((y)n8).C0(), true);
            if (((y)n8).B0() == ax.c3.K.f) return d0.J("/Android/data", ((y)n8).C0(), true);
            return false;
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        ax.Ha.c.h().f().b("SUBDIRECTORY ERROR").l(illegalArgumentException).h();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static boolean i1(n n8) {
        if (!B.P(n8)) {
            return false;
        }
        try {
            n8 = (y)n8;
            if (((y)n8).B0() == ax.c3.K.e) return d0.J("/Android/obb", ((y)n8).C0(), true);
            if (((y)n8).B0() != ax.c3.K.f) return false;
            if (!Q.L()) return false;
            return d0.J("/Android/obb", ((y)n8).C0(), true);
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        ax.Ha.c.h().f().b("SUBDIRECTORY ERROR").l(illegalArgumentException).h();
        return false;
    }

    private boolean j1() {
        if (!Q.V1()) {
            return false;
        }
        ax.c3.K k8 = this.v();
        return ax.Z2.j.F().j0(k8) ^ true;
    }

    private boolean k1(String string) {
        return string == null || "vnd.android.document/directory".equals(string);
        {
        }
    }

    private boolean l1(Exception exception) {
        if ("AccessDeniedException".equals(exception.getClass().getSimpleName())) {
            return true;
        }
        if ("DirectoryNotEmptyException".equals(exception.getClass().getSimpleName())) {
            return true;
        }
        return exception.getMessage() != null && exception.getMessage().endsWith("Operation not permitted");
    }

    private boolean m1() {
        if (this.p == null) {
            this.p = ax.Q2.f.s0(this.u());
        }
        return this.p;
    }

    private boolean n1(y y8) {
        if (!ax.Q2.f.k0(y8.P())) {
            return false;
        }
        if (y8.a1()) {
            return false;
        }
        if (J.j2(y8)) {
            return false;
        }
        return !y8.E().endsWith(".tmp");
    }

    private void o0(y y8, ax.c3.K k8, File[] fileArray, List<n> list, boolean bl) {
        boolean bl2 = y8.V0();
        for (File file : fileArray) {
            String string = file.getName();
            if (d0.C(string)) continue;
            if (this.u() == ax.Q2.f.t0 && file.isDirectory()) {
                list.add(new y(this, y8.F0(), file, null, bl));
                continue;
            }
            if (bl2 && I.a(y8.R()) && ("data".equals(string) || "obb".equals(string))) {
                list.add(this.z(file.getAbsolutePath()));
                continue;
            }
            list.add(new y(this, y8.F0(), file, k8, bl));
        }
    }

    public static boolean o1(Context object, ax.c3.K object2, Uri object3) {
        object = object3.toString();
        if (object == null) {
            ax.Ha.c.h().d("DOCUMENT TREE URI ERROR 1").g(object3.toString()).h();
            return false;
        }
        if (((String)object).lastIndexOf("/") < 0) {
            ax.Ha.c.h().d("DOCUMENT TREE URI ERROR 2").g(object3.toString()).h();
            return false;
        }
        object = ((String)object).substring(((String)object).lastIndexOf("/"));
        object2 = d0.h(((ax.c3.K)object2).e());
        object3 = new StringBuilder();
        ((StringBuilder)object3).append("/");
        ((StringBuilder)object3).append((String)object2);
        return ((String)object).startsWith(((StringBuilder)object3).toString());
    }

    private void p0(n n8, boolean bl, boolean bl2) {
        if (this.D0(n8, true)) {
            return;
        }
        this.r0(n8, false, true, false, false, bl, bl2);
    }

    private boolean p1(n n8) {
        ax.Q2.f f8;
        n8 = (y)n8;
        ax.Q2.f f9 = this.u();
        return f9 == (f8 = ax.Q2.f.t0) || ((y)n8).B0().d() == f8;
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void q0(n n8, boolean bl, boolean bl2, boolean bl3) {
        Stack<n> stack = new Stack<n>();
        stack.push(n8);
        block2: while (((AbstractCollection)stack).size() > 0) {
            n8 = (n)stack.pop();
            this.r0(n8, false, true, bl, bl2, bl3, false);
            try {
                Iterator<n> iterator = this.b0(n8).iterator();
                while (true) {
                    if (!iterator.hasNext()) continue block2;
                    n8 = iterator.next();
                    if (n8.isDirectory()) {
                        stack.push(n8);
                        continue;
                    }
                    this.r0(n8, false, false, bl, bl2, bl3, false);
                }
            }
            catch (ax.b3.j j8) {
                continue;
            }
            break;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void r0(n n8, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        Object object = this.m;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                ax.o3.f f8;
                Object object2;
                block7: {
                    try {
                        object2 = n8.E();
                        if (!this.k.containsKey(object2) || (f8 = (ax.o3.f)this.k.get(object2)) == null) break block7;
                        this.i.remove(f8);
                        this.k.remove(object2);
                        if (!f8.q && bl && f8.i0) {
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                if (bl2 && bl) {
                    Iterator<ax.o3.f> iterator = this.i.iterator();
                    while (iterator.hasNext()) {
                        f8 = iterator.next();
                        if (!d0.J((String)object2, f8.c0, true)) continue;
                        iterator.remove();
                        this.k.remove((Object)f8.c0);
                    }
                }
                f8 = new ax.o3.f((String)object2, n8.P().K(), n8.L(), n8.q(), bl, bl2, bl3, bl4, bl5, bl6);
                this.k.put(object2, (Object)f8);
                this.i.add(f8);
                if (Q.X1() && (object2 = this.n) != null && ((HashSet)object2).contains(n8.T())) {
                    f8.n0 = true;
                    this.j = true;
                }
                return;
            }
            throw throwable2;
        }
    }

    private List<n> r1(n n8) throws ax.b3.j {
        Object object;
        ArrayList<n> arrayList;
        ax.c3.K k8;
        y y8;
        block40: {
            File[] fileArray;
            block39: {
                block37: {
                    y8 = (y)n8;
                    k8 = y8.B0();
                    arrayList = new ArrayList<n>();
                    if (y8.d1()) {
                        object = com.voxdon.xplorer.shizuku.c.t().E(this, k8, y8.E());
                        if (object != null) {
                            arrayList.addAll((Collection<n>)object);
                            return arrayList;
                        }
                    } else if (!this.S1()) {
                        OutOfMemoryError outOfMemoryError2;
                        block38: {
                            try {
                                fileArray = y8.F0().listFiles();
                                break block37;
                            }
                            catch (ArrayStoreException arrayStoreException) {
                            }
                            catch (OutOfMemoryError outOfMemoryError2) {
                                break block38;
                            }
                            ax.Ha.c.h().f().d("LLISTCH2 ArrayStoreException").h();
                            throw new ax.b3.j(arrayStoreException);
                        }
                        ax.Ha.c.h().f().d("LLISTCH2 OutOfMemoryError").h();
                        throw new ax.b3.j(outOfMemoryError2);
                    }
                    fileArray = null;
                }
                if (fileArray != null) {
                    this.o0(y8, k8, fileArray, arrayList, y8.f1());
                }
                if (fileArray == null) break block39;
                object = fileArray;
                if (arrayList.size() != 0) break block40;
            }
            object = fileArray;
            if (ax.Q2.f.Q(k8)) {
                object = fileArray;
                if (y8.a1()) {
                    if (I.b(y8.R())) {
                        File file = I.c(y8.R(), y8.E());
                        object = fileArray;
                        if (file != null) {
                            object = fileArray = file.listFiles();
                            if (fileArray != null) {
                                this.o0(y8, k8, fileArray, arrayList, true);
                                object = fileArray;
                            }
                        }
                    } else if (I.a(y8.B0()) && y8.b1()) {
                        File file = I.c(y8.R(), y8.E());
                        object = fileArray;
                        if (file != null) {
                            object = fileArray = file.listFiles();
                            if (fileArray != null) {
                                this.o0(y8, k8, fileArray, arrayList, true);
                                object = fileArray;
                            }
                        }
                    } else {
                        object = fileArray;
                        if (com.voxdon.xplorer.shizuku.c.t().l()) {
                            List<y> list = com.voxdon.xplorer.shizuku.c.t().E(this, k8, y8.E());
                            object = fileArray;
                            if (list != null) {
                                y8.l1(true);
                                arrayList.addAll(list);
                                return arrayList;
                            }
                        }
                    }
                }
            }
        }
        if (object == null || arrayList.size() == 0 && !y8.F0().canRead()) {
            if (this.p1(y8)) {
                if (this.u0() && (Q.a2() || !y8.a1()) && (object = z.Y().O(this, k8, y8.E())) != null) {
                    this.q = true;
                    arrayList.addAll((Collection<n>)object);
                    return arrayList;
                }
                if (Build.VERSION.SDK_INT >= 24 && arrayList.size() == 0) {
                    if ("/".equals(n8.E())) {
                        this.u1(arrayList, k8);
                    } else if ("/storage/emulated".equals(n8.E())) {
                        this.w1(arrayList, k8);
                    } else if ("/storage".equals(n8.E())) {
                        this.v1(arrayList, k8);
                    }
                }
            }
            if (ax.Z2.j.F().E0(y8.B0()) && ax.Q2.f.Q(this.v()) && y8.b1() && !com.voxdon.xplorer.shizuku.c.t().C()) {
                this.t1(n8, arrayList, k8);
                return arrayList;
            }
            if (arrayList.size() == 0) {
                y8.q1();
                if (!y8.n()) {
                    if (Q.j() && y8.Z0()) {
                        throw new ax.b3.e();
                    }
                    throw new t();
                }
                throw new ax.b3.e();
            }
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<n> s1(n object) throws ax.b3.j {
        try {
            Object object2 = this.p();
            int n8 = ((n)object).E().toLowerCase(Locale.ROOT).hashCode();
            ArrayList<n> arrayList = ((n)object).B();
            Cursor cursor = object2.getContentResolver().query(n0.c("external"), y, "bucket_id=? AND bucket_display_name=?", new String[]{String.valueOf(n8), arrayList}, "_data asc");
            if (cursor == null) {
                return null;
            }
            if (cursor.getCount() <= 0) {
                cursor.close();
                return null;
            }
            arrayList = new ArrayList<n>();
            ax.c3.K k8 = ((y)object).B0();
            L l8 = new L();
            long l9 = 0L;
            object = null;
            while (true) {
                if (!cursor.moveToNext()) {
                    cursor.close();
                    return arrayList;
                }
                A a8 = this.B0(k8, cursor, l8);
                object2 = this.A0(k8, a8);
                long l10 = a8.e;
                if (object != null && ((n)object).E().equalsIgnoreCase(((n)object2).E())) {
                    if (l10 <= l9) continue;
                    arrayList.remove(object);
                }
                arrayList.add((n)object2);
                object = object2;
                l9 = l10;
            }
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static boolean t0(Context context, y y8) {
        block2: {
            block3: {
                if (!y8.b1()) break block2;
                if (y8.j() || y8.d1()) break block3;
                List<n> list = ax.W2.c.q().p();
                if (list == null || list.size() != 1 || !(list = list.get(0)).isDirectory() || !((n)((Object)list)).B().contains(".")) break block2;
                list = d0.Q(y8.M0(), ((n)((Object)list)).B());
                if (!com.voxdon.xplorer.file.g.C(context, y8.B0(), (String)((Object)list))) break block2;
            }
            return true;
        }
        return false;
    }

    private void t1(n n8, List<n> list, ax.c3.K k8) {
        if (ax.Q2.f.Q(k8)) {
            for (ax.U2.f f8 : ax.U2.d.F(this.p()).B()) {
                if (TextUtils.isEmpty((CharSequence)f8.r())) continue;
                Comparable<File> comparable = new File(d0.Q(n8.E(), f8.r()));
                if (((File)comparable).exists()) {
                    list.add(new y(this, (File)comparable, k8));
                    continue;
                }
                if (!Q.j() || !f8.B()) continue;
                if (((y)(comparable = new y(this, (File)comparable, k8, true, false, true, false, 0L, 0L))).T0()) {
                    ((y)comparable).q1();
                    if (((y)comparable).n()) {
                        list.add((n)comparable);
                        continue;
                    }
                    ax.Z2.n.b(this.p()).e(this.p());
                    continue;
                }
                ((y)comparable).j1(true);
                list.add((n)comparable);
            }
        }
    }

    private boolean u0() {
        return ax.Z2.j.F().q();
    }

    private void v0(n comparable) throws ax.b3.j {
        if (comparable.n()) {
            if (comparable.isDirectory()) {
                return;
            }
            ax.Ha.b b8 = ax.Ha.c.h().d("LLISTCH1");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(comparable.isDirectory());
            stringBuilder.append(":");
            stringBuilder.append(comparable.n());
            b8.g(stringBuilder.toString()).h();
            throw new ax.b3.j("file is not directory");
        }
        ax.Ha.b b9 = ax.Ha.c.h().f().d("LLISTCH0").j();
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("Location = ");
        ((StringBuilder)comparable).append(this.u().I());
        b9.g(((StringBuilder)comparable).toString()).h();
        throw new t();
    }

    private void v1(List<n> list, ax.c3.K k8) {
        File file = new File("/storage/emulated");
        if (file.exists()) {
            list.add(new y(this, file, k8));
        }
    }

    private void w0() {
        this.i.clear();
        this.k.clear();
        this.j = false;
    }

    private void w1(List<n> list, ax.c3.K k8) {
        Iterator<String> iterator = u.iterator();
        while (iterator.hasNext()) {
            File file = new File("/storage/emulated/", iterator.next());
            if (!file.exists()) continue;
            list.add(new y(this, file, k8));
        }
    }

    private InputStream x1(String object) {
        try {
            object = (y)this.z((String)object);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.J((n)object, 0L), 32768);
            object = new ax.ca.a(bufferedInputStream, (int)((y)object).p());
            return object;
        }
        catch (ax.b3.j j8) {
            return null;
        }
    }

    private boolean y0(y y8) throws ax.b3.j {
        Uri uri = com.voxdon.xplorer.file.g.d(this, y8, true);
        if (uri != null) {
            if (".$recycle_bin$".equals(y8.B())) {
                J.A = uri;
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void y1(m object, n n8, n comparable, ax.u3.c c8, i i8) throws ax.b3.j, ax.b3.a {
        object = ((m)object).p();
        boolean bl = n8.T().equals(((n)comparable).T());
        boolean bl2 = n8.isDirectory();
        boolean bl3 = this.B1(n8);
        if (bl) {
            y y8 = (y)n8;
            if (ax.Z2.j.F().E0(y8.B0()) && y8.Z0()) {
                throw new ax.b3.e("/Android/data package folders cannot be renamed from Android 13");
            }
            com.voxdon.xplorer.file.g.M((Context)object, n8, comparable, c8, i8);
            if (!Q.d0()) return;
            this.L1(n8, bl2, true);
            this.M1(this.z(((n)comparable).E()), true, bl3, true, false);
            return;
        }
        if (Q.I0() && this.Q(n8, (n)comparable)) {
            com.voxdon.xplorer.file.g.K((Context)object, n8, comparable, c8, i8);
            if (!Q.d0()) return;
            this.L1(n8, bl2, true);
            this.M1(this.z(((n)comparable).E()), true, bl3, true, false);
            return;
        }
        if (n8.isDirectory()) {
            object = (y)n8;
            n8 = (y)comparable;
            if (Q.L() && ((y)object).P0() != ((y)n8).P0()) throw new ax.b3.j("treespace problem : doesSupportMoveFileToDifferentParent() == false");
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("location:");
            ((StringBuilder)comparable).append((Object)((n)object).P());
            ((StringBuilder)comparable).append(",");
            ((StringBuilder)comparable).append((Object)n8.P());
            object = ((StringBuilder)comparable).toString();
            ax.Ha.c.h().f().b("MOVE ERROR").j().g(object).h();
            throw new ax.b3.j("treespace problem : doesSupportMoveFileToDifferentParent() == false");
        }
        this.z1(n8, (n)comparable, c8, i8);
    }

    private void z1(n n8, n n9, ax.u3.c c8, i i8) throws ax.b3.j, ax.b3.a {
        long l8;
        ax.u3.b.c(n8.isDirectory() ^ true);
        try {
            this.F(n8, n9, c8, i8);
            l8 = n8.p();
        }
        catch (ax.b3.j j8) {
            this.P(n9);
            throw j8;
        }
        catch (ax.b3.a a8) {
            this.P(n9);
            throw a8;
        }
        this.P(n8);
        if (i8 != null) {
            i8.a(l8, l8);
        }
        return;
    }

    @Override
    public InputStream A(String object, String string, String string2) {
        object = (y)this.z(string);
        string = ((y)object).s();
        return this.d1(((y)object).K0(), ((n)object).A(), string);
    }

    public y A0(ax.c3.K object, A object2) {
        object = new y(this, new File(((A)object2).a), (ax.c3.K)object, ((A)object2).b, false, true, true, ((A)object2).d, ((A)object2).c);
        object2 = ((A)object2).f;
        if (object2 != null) {
            ((y)object).i1((Long)object2);
        }
        return object;
    }

    @Override
    public boolean B(n n8) {
        if (n8 == null) {
            ax.u3.b.f();
            return true;
        }
        if (((y)n8).i0()) {
            return Q.I0();
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public List<n> C(n var1_1, m.f var2_2) throws ax.b3.j {
        this.v0((n)var1_1);
        var3_5 = (y)var1_1;
        if (var3_5.m0() && !var3_5.o1()) {
            try {
                return com.voxdon.xplorer.file.g.J(this, var1_1);
            }
            catch (RuntimeException var2_3) {
                ax.Ha.c.h().b("listchildren local document runtime").l(var2_3).h();
                return this.r1((n)var1_1);
            }
            catch (ax.b3.j var2_4) {
                if (ax.Z2.j.F().E0(var3_5.B0()) && var3_5.Z0() && ax.Z2.n.b(this.p()).c(this.p(), (y)var3_5)) {
                    ax.Z2.n.b(this.p()).e(this.p());
                    var3_5.x1();
                }
lbl15:
                // 4 sources

                while (true) {
                    var2_4.printStackTrace();
                    return this.r1((n)var1_1);
                }
            }
        }
        if (Q.h1() == false) return this.r1((n)var1_1);
        if (ax.Q2.f.g0(var1_1.P()) == false) return this.r1((n)var1_1);
        var3_5 = this.n;
        if (var3_5 == null || !var3_5.contains(var1_1.E())) {
            if (var2_2 != m.f.c0) return this.r1((n)var1_1);
        }
        var2_2 = this.s1((n)var1_1);
        if (var2_2 == null) return this.r1((n)var1_1);
        if (var2_2.size() == 0) return this.r1((n)var1_1);
        return var2_2;
        {
            catch (r var3_6) {
                ** continue;
            }
        }
    }

    public void C0(n n8) throws ax.b3.j {
        if (n8.isDirectory()) {
            Iterator<n> iterator = this.b0(n8).iterator();
            while (iterator.hasNext()) {
                this.C0(iterator.next());
            }
            this.P(n8);
            return;
        }
        this.P(n8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void D(n var1_1, G var2_15, String var3_23, long var4_28, Long var6_29, p var7_30, boolean var8_31, ax.u3.c var9_32, i var10_33) throws ax.b3.j, ax.b3.a {
        block79: {
            block73: {
                block77: {
                    block80: {
                        block78: {
                            block74: {
                                block76: {
                                    block75: {
                                        block72: {
                                            block71: {
                                                block69: {
                                                    block70: {
                                                        if (var1_1.n()) {
                                                            var2_15 = ax.Ha.c.h().f().d("!! WRITE FILE ALREADY EXISTS !!").j();
                                                            var3_23 = new StringBuilder();
                                                            var3_23.append("location:");
                                                            var3_23.append(var1_1.P().I());
                                                            var2_15.g(var3_23.toString()).h();
                                                            throw new ax.b3.j("WriteFile file already exists");
                                                        }
                                                        var19_34 = (y)var1_1;
                                                        var3_23 = (y)this.J1(var19_34);
                                                        var12_35 = var3_23.n();
                                                        var11_36 = false;
                                                        if (var12_35) {
                                                            var8_31 = var11_36;
                                                            if (var3_23.isDirectory() == var1_1.isDirectory()) throw new ax.b3.f(var8_31);
                                                            var8_31 = true;
                                                            throw new ax.b3.f(var8_31);
                                                        }
                                                        var11_36 = Q.F1();
                                                        var16_37 = null;
                                                        var13_38 = null;
                                                        var15_42 = null;
                                                        var17_43 = null;
                                                        var14_44 = null;
                                                        var18_45 = null;
                                                        if (var11_36 && var19_34.d1()) {
                                                            block68: {
                                                                var7_30 = var2_15.b();
                                                                if (var7_30 == null) throw new ax.b3.j("null inputstream");
                                                                var2_15 = var18_45;
                                                                var14_44 = com.voxdon.xplorer.shizuku.c.t().v(var1_1.E(), false);
                                                                var2_15 = var18_45;
                                                                var2_15 = var18_45;
                                                                var3_23 = new BufferedOutputStream(var14_44, 8192);
                                                                F.c((InputStream)var7_30, (OutputStream)var3_23, var4_28, var9_32, var10_33);
                                                                var3_23.close();
                                                                if (var6_29 == null) break block68;
                                                                var2_15 = var18_45;
                                                                try {
                                                                    if (var6_29.longValue() < 0L) break block68;
                                                                    var2_15 = var18_45;
                                                                    this.d((y)var1_1, var6_29.longValue());
                                                                    break block68;
                                                                }
                                                                catch (Throwable var1_2) {
                                                                    break block69;
                                                                }
                                                                catch (IOException var3_24) {
                                                                    var6_29 = var13_38;
                                                                    break block70;
                                                                }
                                                                catch (Throwable var1_6) {
                                                                    var2_15 = var3_23;
                                                                    break block69;
                                                                }
                                                                catch (IOException var2_16) {
                                                                    var6_29 = var3_23;
                                                                    var3_23 = var2_16;
                                                                    break block70;
                                                                }
                                                            }
                                                            var2_15 = var18_45;
                                                            if (this.n1(var19_34)) {
                                                                var2_15 = var18_45;
                                                                var2_15 = var18_45;
                                                                var3_23 = new StringBuilder();
                                                                var2_15 = var18_45;
                                                                var3_23.append("what case is this? : ");
                                                                var2_15 = var18_45;
                                                                var3_23.append(var19_34.E());
                                                                var2_15 = var18_45;
                                                                ax.u3.b.e(var3_23.toString());
                                                                var2_15 = var18_45;
                                                                var3_23 = this.z(var1_1.E());
                                                                try {
                                                                    this.M1((n)var3_23, false, false, false, true);
                                                                }
                                                                catch (Throwable var1_4) {
                                                                    var2_15 = var16_37;
                                                                    break block69;
                                                                }
                                                                catch (IOException var3_25) {
                                                                    var6_29 = var13_38;
                                                                    break block70;
                                                                }
                                                            }
                                                            try {
                                                                var7_30.close();
                                                                return;
                                                            }
                                                            catch (IOException var1_5) {
                                                                var1_5.printStackTrace();
                                                                return;
                                                            }
                                                        }
                                                        if (var19_34.i0()) break block80;
                                                        var16_37 = var2_15.b();
                                                        if (var16_37 == null) {
                                                            if (var2_15 instanceof m.e) {
                                                                var3_23 = ax.Ha.c.h().f().b("NULL INPUTSTREAM");
                                                                var1_1 = new StringBuilder();
                                                                var1_1.append("location:");
                                                                var1_1.append(((m.e)var2_15).e().k());
                                                                var3_23.g(var1_1.toString()).h();
                                                                throw new ax.b3.j("null inputstream");
                                                            }
                                                            ax.Ha.c.h().f().b("NULL INPUTSTREAM").g(var2_15.getClass().getName()).h();
                                                            throw new ax.b3.j("null inputstream");
                                                        }
                                                        var2_15 = var15_42;
                                                        var2_15 = var15_42;
                                                        var13_38 = new FileOutputStream(var19_34.F0());
                                                        var2_15 = var15_42;
                                                        var2_15 = var15_42;
                                                        var2_15 = var3_23 = new BufferedOutputStream(var13_38, 8192);
                                                        break block71;
                                                    }
                                                    var2_15 = var6_29;
                                                    {
                                                        if (!d0.M(var1_1.B())) {
                                                            var2_15 = var6_29;
                                                            var2_15 = var6_29;
                                                            var1_1 = new ax.b3.n("shizuku write file error 1", (Throwable)var3_23);
                                                            var2_15 = var6_29;
                                                            throw var1_1;
                                                        }
                                                        var2_15 = var6_29;
                                                        throw ax.b3.d.a("shizuku write file error 2", (Exception)var3_23);
                                                    }
                                                }
                                                if (var2_15 != null) {
                                                    var2_15.close();
                                                }
lbl126:
                                                // 4 sources

                                                while (true) {
                                                    try {
                                                        var7_30.close();
                                                        throw var1_3;
                                                    }
                                                    catch (IOException var2_17) {
                                                        var2_17.printStackTrace();
                                                    }
                                                    throw var1_3;
                                                }
                                            }
                                            try {
                                                F.c(var16_37, (OutputStream)var3_23, var4_28, var9_32, var10_33);
                                                if (!var8_31) break block72;
                                                var2_15 = var3_23;
                                                if (!this.k0()) break block72;
                                                var2_15 = var3_23;
                                                var13_38.getFD().sync();
                                            }
                                            catch (Throwable var1_7) {
                                                break block73;
                                            }
                                            catch (IOException var1_8) {
                                                var2_15 = var3_23;
                                                throw ax.b3.d.a("write file error 3", (Exception)var1_1);
                                            }
                                            catch (FileNotFoundException var13_39) {
                                                var2_15 = var3_23;
                                                break block74;
                                            }
                                        }
                                        var2_15 = var3_23;
                                        var3_23.close();
                                        var2_15 = var15_42;
                                        try {
                                            if (this.u() != ax.Q2.f.p0 || !var8_31) break block75;
                                            var2_15 = var15_42;
                                            if (!((y)this.J1(var19_34)).n()) {
                                                var2_15 = var15_42;
                                                ax.Ha.c.h().f().b("written file not found 1").h();
                                            }
                                            break block76;
                                        }
                                        catch (Throwable var1_9) {
                                            break block73;
                                        }
                                        catch (IOException var1_10) {
                                            var2_15 = var17_43;
                                            throw ax.b3.d.a("write file error 3", (Exception)var1_1);
                                        }
                                        catch (FileNotFoundException var13_40) {
                                            var2_15 = null;
                                            break block74;
                                        }
                                    }
                                    var2_15 = var15_42;
                                    ax.Q2.f.z0(this.u());
                                }
                                if (var6_29 != null) {
                                    var2_15 = var15_42;
                                    if (var6_29.longValue() >= 0L) {
                                        var2_15 = var15_42;
                                        this.d((y)var1_1, var6_29.longValue());
                                    }
                                }
                                var2_15 = var15_42;
                                this.M1(this.z(var1_1.E()), false, false, false, true);
                                try {
                                    var16_37.close();
                                    return;
                                }
                                catch (IOException var1_11) {
                                    var1_11.printStackTrace();
                                    return;
                                }
                            }
                            try {
                                if (!this.u0() || !(var8_31 = this.p1((n)var1_1))) break block77;
                                var17_43 = z.Y().D((n)var1_1, false);
                                if (var17_43 == null) break block77;
                            }
                            catch (Throwable var1_14) {
                                break block73;
                            }
                            var2_15 = var3_23 = new BufferedOutputStream(var17_43, 8192);
                            try {
                                F.c(var16_37, (OutputStream)var3_23, var4_28, var9_32, var10_33);
                                var2_15 = var3_23;
                                var3_23.close();
                                if (var6_29 == null) ** GOTO lbl212
                                var2_15 = var15_42;
                            }
                            catch (IOException var2_18) {
                                ** GOTO lbl245
                            }
                            if (var6_29.longValue() >= 0L) {
                                var2_15 = var15_42;
                                z.Y().U(var1_1.E(), var6_29.longValue());
                            }
lbl212:
                            // 4 sources

                            if (var7_30 == null) break block78;
                            var2_15 = var15_42;
                            z.Y().V(var1_1.E(), (p)var7_30);
                        }
                        var16_37.close();
                        return;
                    }
                    com.voxdon.xplorer.file.g.Q(this, (n)var1_1, (G)var2_15, var4_28, (Long)var6_29, var8_31, var9_32, var10_33);
                    if (this.u() == ax.Q2.f.p0 && var8_31 && !((y)this.J1(var19_34)).n()) {
                        var2_15 = d0.b(var1_1.B());
                        var2_15 = (y)this.L0(d0.Q(var1_1.T(), (String)var2_15), var19_34.B0());
                        if (!var2_15.n()) {
                            var3_23 = new StringBuilder();
                            var3_23.append("validfat:");
                            var3_23.append(d0.M(var2_15.B()));
                            var2_15 = var3_23.toString();
                            ax.Ha.c.h().f().b("written file not found 2").g(var2_15).h();
                        }
                    }
                    if (var6_29 != null && var6_29.longValue() >= 0L) {
                        this.d(var19_34, var6_29.longValue());
                    }
                    if (ax.X2.J.n() == false) return;
                    this.M1(this.z(var1_1.E()), false, false, false, true);
                    return;
                    catch (IOException var2_20) {
                        ** continue;
                    }
                    catch (Throwable var1_12) {
                        break block73;
                    }
                }
lbl243:
                // 3 sources

                while (true) {
                    var3_23 = var2_15;
lbl245:
                    // 3 sources

                    while (true) {
                        var2_15 = var3_23;
                        {
                            if (!d0.M(var1_1.B())) {
                                var2_15 = var3_23;
                                var2_15 = var3_23;
                                var1_1 = new ax.b3.n("write file error 1", (Throwable)var13_41);
                                var2_15 = var3_23;
                                throw var1_1;
                            }
                            var2_15 = var3_23;
                            throw ax.b3.d.a("write file error 2", (Exception)var13_41);
                        }
                        break;
                    }
                    break;
                }
            }
            if (var2_15 != null) {
                ** try [egrp 20[TRYBLOCK] [104 : 1009->1013)] { 
lbl258:
                // 1 sources

                break block79;
            } else lbl-1000:
            // 3 sources

            {
                while (true) {
                    try {
                        var16_37.close();
                        throw var1_13;
                    }
                    catch (IOException var2_19) {
                        var2_19.printStackTrace();
                    }
                    throw var1_13;
                }
            }
lbl266:
            // 1 sources

            catch (IOException var2_22) {
                ** GOTO lbl-1000
            }
            catch (IOException var2_21) {
                var3_23 = var14_44;
                ** continue;
            }
            catch (IOException var3_27) {
                ** GOTO lbl243
            }
            catch (IOException var3_26) {
                ** continue;
            }
        }
        var2_15.close();
        ** while (true)
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void E(n n8, n object, ax.u3.c c8, i i8) throws ax.b3.j, ax.b3.a {
        boolean bl;
        boolean bl2;
        long l8;
        y y8;
        block19: {
            y y9;
            block20: {
                RuntimeException runtimeException2;
                block18: {
                    Exception var9_10;
                    j.Path path;
                    y y10;
                    block17: {
                        ax.u3.b.a(object.n());
                        y10 = (y)n8;
                        y8 = (y)object;
                        if (y10.d1()) {
                            long l9 = n8.p();
                            boolean bl3 = n8.isDirectory();
                            if (!com.voxdon.xplorer.shizuku.c.t().H(n8.E(), ((n)object).E())) {
                                this.F1(n8, (n)object, null);
                            }
                            if (i8 != null) {
                                i8.a(l9, l9);
                            }
                            if (this.n1(y10)) {
                                this.L1(n8, bl3, true);
                            }
                            if (!this.n1(y8)) return;
                            bl3 = this.B1(n8);
                            this.M1(this.z(((n)object).E()), false, bl3, true, false);
                            return;
                        }
                        if (this.R1(n8, (n)object)) {
                            this.y1(this, n8, (n)object, c8, i8);
                            return;
                        }
                        l8 = n8.p();
                        bl2 = n8.isDirectory();
                        y9 = (y)n8;
                        if (!Q.P0()) break block20;
                        bl = false;
                        try {
                            path = j.Paths.get((String)y9.K0(), (String[])new String[0]);
                            y10 = j.Paths.get((String)y8.K0(), (String[])new String[0]);
                            if (path == null || y10 == null || path.getFileSystem().equals(y10.getFileSystem())) break block17;
                            ax.u3.b.f();
                        }
                        catch (RuntimeException runtimeException2) {
                            break block18;
                        }
                    }
                    try {
                        j.Files.move((j.Path)path, (j.Path)y10, (j.CopyOption[])new j.CopyOption[0]);
                        break block19;
                    }
                    catch (SecurityException securityException) {
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                    if (Q.e() && this.l1((Exception)var9_10) && (com.voxdon.xplorer.file.x.i1((n)object) || com.voxdon.xplorer.file.x.i1(n8)) || Q.L() && this.l1((Exception)var9_10) && (y8.a1() || y9.a1()) || Q.L() && this.l1((Exception)var9_10) && (com.voxdon.xplorer.file.x.h1(n8) || com.voxdon.xplorer.file.x.h1((n)object)) && n8.isDirectory()) {
                        if (n8.isDirectory()) {
                            this.A1(y9, y8, c8, i8);
                            return;
                        }
                        this.z1(n8, (n)object, c8, i8);
                        return;
                    }
                    var9_10.printStackTrace();
                    if (!y9.F0().renameTo(y8.F0())) {
                        this.F1(n8, (n)object, (Throwable)var9_10);
                    }
                    break block19;
                }
                if (!y9.F0().renameTo(y8.F0())) {
                    this.F1(n8, (n)object, null);
                } else {
                    bl = true;
                }
                object = ax.Ha.c.h().f().b("moveFile InvalidPath").l(runtimeException2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("retry success=");
                stringBuilder.append(bl);
                ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                break block19;
            }
            if (!y9.F0().renameTo(y8.F0())) {
                this.F1(n8, (n)object, null);
            }
        }
        if (i8 != null) {
            i8.a(l8, l8);
        }
        bl = this.B1(n8);
        this.L1(n8, bl2, true);
        this.M1((y)this.J1(y8), false, bl, true, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void E0(i i8) {
        Object object = this.m;
        // MONITORENTER : object
        if (this.i.size() == 0) {
            // MONITOREXIT : object
            return;
        }
        ArrayList<ax.o3.f> arrayList = new ArrayList<ax.o3.f>(this.i);
        this.w0();
        // MONITOREXIT : object
        int n8 = arrayList.size();
        ax.c3.M.b(this.p(), arrayList, i8);
        ax.c3.M.c(this.p(), arrayList, true, i8);
        this.H0(arrayList, n8, i8);
    }

    @Override
    public void F(n n8, n n9, ax.u3.c c8, i i8) throws ax.b3.j, ax.b3.a {
        this.D(n9, this.s(n8), n8.s(), n8.p(), n8.q(), n8.D(), false, c8, i8);
    }

    @Override
    public int G(String string, String string2) {
        return this.c1(string, string2, ((y)this.z(string2)).s());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void G0() {
        Object object = this.m;
        // MONITORENTER : object
        if (this.i.size() == 0) {
            // MONITOREXIT : object
            return;
        }
        ArrayList<ax.o3.f> arrayList = new ArrayList<ax.o3.f>(this.i);
        this.w0();
        // MONITOREXIT : object
        if (Q.U() || Q.T()) {
            ax.c3.M.f(this.p(), arrayList);
            if (arrayList.size() == 0) {
                return;
            }
        }
        this.F0(arrayList);
        if (arrayList.size() <= 0) return;
        new d(this, arrayList, 500L).h(new Long[0]);
    }

    @Override
    public String H(n n8) {
        ax.c3.z z8;
        if (n8 == null) {
            return null;
        }
        if (this.u() == ax.Q2.f.t0 && !n8.d() && ax.c3.z.f0 != (z8 = n8.G())) {
            return null;
        }
        return B.Y(n8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<String> H1(n var1_1) {
        block17: {
            block18: {
                var4_5 = new ArrayList<String>();
                var3_6 = null;
                var5_16 = new InputStreamReader(this.J((n)var1_1, 0L));
                var2_12 = new BufferedReader(var5_16);
                while (true) {
                    var1_1 = var2_12;
                    try {
                        var3_6 = var2_12.readLine();
                        if (var3_6 == null) break;
                        var1_1 = var2_12;
                        if (var3_6.isEmpty()) continue;
                        var1_1 = var2_12;
                        var4_5.add(var3_6);
                    }
                    catch (Throwable var2_13) {
                        break block17;
                    }
                    catch (ax.b3.j var3_7) {
                        break block18;
                    }
                    catch (IOException var3_8) {
                        break block18;
                    }
                }
                var2_12.close();
                return var4_5;
                catch (Throwable var2_14) {
                    var1_1 = var3_6;
                    break block17;
                }
                catch (ax.b3.j var3_9) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_12 = null;
                        break;
                    }
                }
                catch (IOException var3_11) {
                    ** continue;
                }
            }
            var1_1 = var2_12;
            {
                ax.Ha.c.h().f().d("DOT_HIDDEN READ ERROR").l((Throwable)var3_10).h();
                if (var2_12 == null) return null;
            }
            try {
                var2_12.close();
                return null;
            }
            catch (IOException var1_3) {
                return null;
            }
            catch (IOException var1_2) {
                return var4_5;
            }
        }
        if (var1_1 == null) throw var2_15;
        try {}
        catch (IOException var1_4) {
            throw var2_15;
        }
        var1_1.close();
        throw var2_15;
    }

    @Override
    public void I(n n8) throws ax.b3.j {
        ax.u3.b.g("not support delete file recursively");
    }

    protected void I0(n n8, List<n> list, boolean bl, String string, boolean bl2, h h8) {
        h8.Y(B.h(list, string, bl2, true), bl);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean I1(n object) {
        RuntimeException var1_4;
        Object object2;
        block17: {
            Object object3;
            block18: {
                boolean bl;
                String string = d0.Q(((n)object).T(), ".hidden");
                object2 = this.z(string);
                if (!object2.n()) {
                    return false;
                }
                List<String> list = this.H1((n)object2);
                if (list == null) {
                    return false;
                }
                Iterator<String> iterator = null;
                Object var6_13 = null;
                object2 = var6_13;
                object2 = var6_13;
                object3 = new OutputStreamWriter(this.c(string, false));
                try {
                    iterator = list.iterator();
                    bl = true;
                }
                catch (Throwable throwable) {
                    object2 = object3;
                    break block17;
                }
                catch (IOException iOException) {
                    object = object3;
                    object3 = iOException;
                    break block18;
                }
                while (iterator.hasNext()) {
                    object2 = iterator.next();
                    if (!bl) {
                        ((Writer)object3).write("\n");
                    }
                    if (((String)object2).equals(((n)object).B())) continue;
                    ((Writer)object3).write((String)object2);
                    if (!bl) continue;
                    bl = false;
                }
                try {
                    ((OutputStreamWriter)object3).close();
                    return true;
                }
                catch (IOException iOException) {
                    return true;
                }
                catch (Throwable throwable) {
                    break block17;
                }
                catch (IOException iOException) {
                    object = iterator;
                }
            }
            object2 = object;
            {
                ((Throwable)object3).printStackTrace();
                if (object == null) return false;
            }
            try {
                ((OutputStreamWriter)object).close();
                return false;
            }
            catch (IOException iOException) {
                return false;
            }
        }
        if (object2 == null) throw var1_4;
        try {
            ((OutputStreamWriter)object2).close();
        }
        catch (IOException iOException) {
            throw var1_4;
        }
        throw var1_4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream J(n object, long l8) throws ax.b3.j {
        Exception var7_6;
        block15: {
            y y8;
            block12: {
                block14: {
                    y8 = (y)object;
                    try {
                        long l9;
                        InputStream inputStream;
                        try {
                            boolean bl = y8.m0();
                            if (!bl) break block12;
                            try {
                                inputStream = com.voxdon.xplorer.file.g.t(this.p(), (n)object, l8);
                                if (!y8.a1()) return inputStream;
                                l9 = y8.p();
                            }
                            catch (ax.b3.j j8) {
                                break block14;
                            }
                        }
                        catch (FileNotFoundException fileNotFoundException) {
                            break block15;
                        }
                        try {
                            return new e(inputStream, l9, l8);
                        }
                        catch (FileNotFoundException fileNotFoundException) {
                            break block15;
                        }
                        catch (ax.b3.j j9) {
                        }
                    }
                    catch (IOException iOException) {
                        throw new ax.b3.j(iOException);
                    }
                }
                try {
                    return this.P0(y8, l8);
                }
                catch (FileNotFoundException fileNotFoundException) {
                    break block15;
                }
            }
            if (!y8.d1()) return this.P0(y8, l8);
            InputStream inputStream = com.voxdon.xplorer.shizuku.c.t().s(((n)object).E(), l8);
            if (!y8.a1()) return inputStream;
            return new e(inputStream, y8.p(), l8);
        }
        if (ax.Z2.j.F().q0() && z.Y().m(((n)object).E()) && (object = ax.t3.j.k(this.p()) ? z.Y().w((n)object, l8) : z.Y().z((n)object, l8)) != null) {
            return object;
        }
        object = ax.b3.d.c("getInputStream", (Exception)var7_6, false);
        if (object == null) throw new t((Throwable)var7_6);
        throw object;
    }

    protected n J1(y n8) {
        String string = n8.F();
        y y8 = this.z0(new File(string), n8.B0(), n8.f1());
        y8.t0((y)n8);
        if (Q.L() && y8.a1() && (n8 = this.M0(y8, string)) != null) {
            return n8;
        }
        return y8;
    }

    @Override
    public void K(Activity activity, Fragment fragment, c.a a8) {
        a8.B();
        a8.T(true, null);
    }

    protected InputStream K0(String string) {
        byte[] byArray = ax.u3.B.k(this.p(), string, null);
        if (byArray != null) {
            return new ByteArrayInputStream(byArray);
        }
        if ((string = (string = this.G1(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"album_id", "_data"}, "_data = ?", new String[]{string}, 0)) != null ? this.G1(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"album_art", "album"}, "_id = ? AND album_art IS NOT NULL", new String[]{string}, 0) : null) != null && !string.isEmpty() && ((y)this.z(string)).n()) {
            return this.x1(string);
        }
        return null;
    }

    @Override
    public boolean L() {
        return false;
    }

    protected n L0(String string, ax.c3.K k8) {
        return this.z0(new File(string), k8, false);
    }

    @Override
    public boolean M(n n8) {
        if (n8.n()) {
            return false;
        }
        y y8 = (y)n8;
        if (y8.d1()) {
            return com.voxdon.xplorer.shizuku.c.t().o(n8.E());
        }
        if (!y8.i0()) {
            boolean bl = y8.F0().mkdir();
            if (bl) {
                this.p0(n8, false, true);
            }
            if (!bl && this.u0() && this.p1(n8)) {
                return z.Y().i(n8.E());
            }
            return bl;
        }
        try {
            boolean bl = this.y0((y)n8);
            return bl;
        }
        catch (ax.b3.j j8) {
            return false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean N(n n8) {
        block10: {
            if (n8.n()) {
                return false;
            }
            y y8 = (y)n8;
            if (y8.d1()) {
                return com.voxdon.xplorer.shizuku.c.t().p(n8.E());
            }
            if (!y8.i0()) {
                boolean bl;
                try {
                    bl = ((y)n8).F0().createNewFile();
                    if (!bl) return bl;
                }
                catch (IOException iOException) {}
                this.M1(this.z(n8.E()), false, false, false, true);
                return bl;
                if (this.u0() && this.p1(n8)) {
                    return z.Y().h(n8.E());
                }
                iOException.printStackTrace();
                return false;
            }
            try {
                if (com.voxdon.xplorer.file.g.d(this, n8, false) == null) break block10;
                this.M1(this.z(n8.E()), false, false, false, true);
                return true;
            }
            catch (ax.b3.j j8) {
                return false;
            }
        }
        return false;
    }

    protected InputStream N0(String string) {
        String string2 = this.Q0(string, false);
        if (string2 == null) {
            this.h.put(string, Boolean.FALSE);
            return this.x1(string);
        }
        this.h.put(string, Boolean.TRUE);
        return this.x1(string2);
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public void P(n comparable) throws ax.b3.j {
        y y8 = (y)comparable;
        if (y8.d1()) {
            boolean bl = comparable.isDirectory();
            if (!com.voxdon.xplorer.shizuku.c.t().q(((n)comparable).E())) {
                y8.q1();
                if (!y8.n()) {
                    throw new t("Shizuku.delete failed : not exist");
                }
                throw new ax.b3.j("Shizuku.delete failed.");
            }
            if (this.n1(y8)) {
                this.L1((n)comparable, bl, false);
                return;
            }
        } else if (!y8.i0()) {
            File file;
            File file2;
            boolean bl;
            String[] stringArray;
            boolean bl2;
            block21: {
                bl2 = comparable.isDirectory();
                if (bl2 && (stringArray = y8.F0().list()) != null && stringArray.length > 0) {
                    throw new k("File.delete directory that has children");
                }
                bl = Q.P0();
                stringArray = null;
                if (bl) {
                    try {
                        j.Files.delete((j.Path)j.Paths.get((String)y8.K0(), (String[])new String[0]));
                        bl = true;
                        break block21;
                    }
                    catch (RuntimeException runtimeException) {
                    }
                    catch (IOException iOException) {}
                    bl = false;
                } else {
                    bl = y8.F0().delete();
                }
            }
            if (ax.X2.J.f() && bl && (file2 = y8.F0()).exists() && file2.renameTo(file = B.u(file2))) {
                file.delete();
            }
            if (!bl) {
                if (!(this.u0() && this.p1((n)comparable) && z.Y().j(((n)comparable).E()))) {
                    y8.q1();
                    if (y8.n()) {
                        if (((n)comparable).P() == ax.Q2.f.t0 && !comparable.j()) {
                            throw new w("Read only system file.delete failed");
                        }
                        if (stringArray != null) {
                            comparable = new StringBuilder();
                            ((StringBuilder)comparable).append("File.delete failed dir=:");
                            ((StringBuilder)comparable).append(bl2);
                            ((StringBuilder)comparable).append(":");
                            ((StringBuilder)comparable).append(stringArray.getMessage());
                            throw new ax.b3.j(((StringBuilder)comparable).toString(), (Throwable)stringArray);
                        }
                        comparable = new StringBuilder();
                        ((StringBuilder)comparable).append("File.delete failed dir=");
                        ((StringBuilder)comparable).append(bl2);
                        ((StringBuilder)comparable).append(",exists=true");
                        throw new ax.b3.j(((StringBuilder)comparable).toString());
                    }
                    throw new t("File.delete failed : File not exist");
                }
            } else {
                this.L1((n)comparable, bl2, false);
            }
        } else {
            com.voxdon.xplorer.file.g.g(this, (n)comparable);
            if (!Q.G0()) {
                this.L1((n)comparable, comparable.isDirectory(), false);
            }
        }
    }

    @Override
    public boolean Q(n n8, n n9) {
        if (B.P(n8) && B.P(n9)) {
            return com.voxdon.xplorer.file.y.c1((y)n8, (y)n9);
        }
        ax.u3.b.f();
        return n8.P() == n9.P();
    }

    public void Q1(n n8) {
        ArrayList<ax.o3.f> arrayList = new ArrayList<ax.o3.f>();
        arrayList.add(new ax.o3.f(n8.E(), n8.P().K(), n8.L(), n8.q(), false, false, false, true, false, false));
        this.P1(arrayList, false, 10000);
    }

    protected InputStream T0(String object) {
        Object object2;
        block5: {
            int n8;
            block4: {
                n8 = (int)(ax.u3.B.s(this.p()) * 128.0f);
                try {
                    object2 = new File((String)object);
                    object = ParcelFileDescriptor.open((File)object2, (int)0x10000000);
                    if (object != null) break block4;
                    return null;
                }
                catch (Exception exception) {
                    return null;
                }
            }
            object = com.voxdon.xplorer.file.x.S0((ParcelFileDescriptor)object, n8, n8);
            if (object != null) break block5;
            return null;
        }
        object2 = new ByteArrayOutputStream(32768);
        object.compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)object2);
        object.recycle();
        object = new ByteArrayInputStream(((ByteArrayOutputStream)object2).toByteArray());
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ParcelFileDescriptor U0(y y8) throws ax.b3.j {
        try {
            if (Q.F1() && y8.d1()) {
                return com.voxdon.xplorer.shizuku.c.t().x(y8.E());
            }
        }
        catch (IOException iOException) {
            throw new ax.b3.j(iOException);
        }
        if (y8.i0()) return com.voxdon.xplorer.file.g.w(this.p(), y8);
        return ParcelFileDescriptor.open((File)y8.F0(), (int)0x30000000);
    }

    @Override
    public void W(Context object3, ax.c3.K object2) {
        ax.c3.K k8;
        Iterator<String> iterator;
        super.W((Context)object3, (ax.c3.K)((Object)iterator));
        if (Q.V1()) {
            this.l = new com.voxdon.xplorer.file.g((Context)object3);
        }
        if (iterator == ax.c3.K.e || ax.Q2.f.g0(((ax.c3.K)((Object)iterator)).d())) {
            this.n = new HashSet();
            for (Object object : v) {
                this.n.add(d0.P(ax.c3.K.e.e(), (String)object));
            }
            this.o = new HashSet();
            for (String string : x) {
                this.o.add(d0.P(ax.c3.K.e.e(), string));
            }
        }
        if (iterator == (k8 = ax.c3.K.f) || ax.Q2.f.g0(((ax.c3.K)((Object)iterator)).d())) {
            if (this.n == null) {
                this.n = new HashSet();
            }
            if (ax.Z2.j.F().t0() && !TextUtils.isEmpty((CharSequence)k8.e())) {
                for (String string : w) {
                    this.n.add(d0.P(ax.c3.K.f.e(), string));
                }
            }
        }
    }

    @Override
    public boolean Y() {
        return true;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
    }

    @Override
    public OutputStream c(String object, boolean bl) throws IOException {
        y y8 = (y)this.z((String)object);
        if (Q.F1() && y8.d1()) {
            return com.voxdon.xplorer.shizuku.c.t().v((String)object, bl);
        }
        if (y8.i0()) {
            try {
                object = com.voxdon.xplorer.file.g.u(this, y8, bl);
                return object;
            }
            catch (ax.b3.j j8) {
                throw new IOException(j8);
            }
        }
        if (this.u0() && this.p1(y8)) {
            try {
                object = new c(this, y8, bl, y8.n() ^ true);
                return object;
            }
            catch (IOException iOException) {
                FileOutputStream fileOutputStream = z.Y().D(y8, bl);
                if (fileOutputStream != null) {
                    return fileOutputStream;
                }
                throw new FileNotFoundException("failed to open outputstream using root");
            }
        }
        return new c(this, y8, bl, y8.n() ^ true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected int c1(String object, String string, String string2) {
        if (!string2.startsWith("image")) return -1;
        object = this.h.get(string);
        if (object == null) return -1;
        try {
            if (!((Boolean)object).booleanValue()) return -1;
            object = new ax.y0.a(string);
            return ((ax.y0.a)object).l("Orientation", 0);
        }
        catch (FileNotFoundException | IOException iOException) {
            return -1;
        }
    }

    @Override
    public boolean d(n n8, long l8) {
        Exception exception2;
        block8: {
            boolean bl;
            block7: {
                if (l8 < 0L) {
                    return false;
                }
                if (!(n8 instanceof y)) {
                    return false;
                }
                if (((y)(n8 = (y)n8)).d1()) {
                    boolean bl2 = com.voxdon.xplorer.shizuku.c.t().I(n8.E(), l8);
                    if (bl2) {
                        ((y)n8).m1(l8);
                    }
                    return bl2;
                }
                try {
                    bl = ((y)n8).F0().setLastModified(l8);
                    if (!bl) break block7;
                }
                catch (Exception exception2) {}
                ((y)n8).r0();
                return bl;
                break block8;
            }
            return bl;
        }
        ax.Ha.b b8 = ax.Ha.c.h().f().d("set last modified").l(exception2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("base:");
        stringBuilder.append(((y)n8).B0().k());
        b8.g(stringBuilder.toString()).h();
        return false;
    }

    protected InputStream d1(String object, String object2, String string) {
        ax.c3.z z8 = ax.c3.A.g((String)(object2 = object2 != null ? ((String)object2).toLowerCase() : null));
        if (ax.c3.z.c0 != z8 && !string.startsWith("audio")) {
            if (ax.c3.z.e0 != z8 && !string.startsWith("video")) {
                if (ax.c3.z.f0 != z8 && !string.startsWith("image")) {
                    if (ax.c3.z.s0 != z8 && !string.equals("application/vnd.android.package-archive")) {
                        if (ax.c3.z.n0 == z8 && Q.r1()) {
                            object = this.T0((String)object);
                        } else if ("epub".equals(object2)) {
                            object = object2 = ax.r3.c.c(this.p(), (String)object);
                            if (object2 == null) {
                                object = ax.r3.b.n();
                            }
                        } else {
                            object = this.e1((String)object);
                        }
                    } else {
                        object = ax.U2.d.r(this.p(), (String)object);
                    }
                } else if (ax.c3.A.S((String)object2)) {
                    int n8 = (int)(ax.u3.B.s(this.p()) * 128.0f);
                    object = object2 = ax.r3.c.e(this.N0((String)object), n8);
                    if (object2 == null) {
                        object = ax.r3.b.n();
                    }
                } else {
                    object = this.N0((String)object);
                }
            } else {
                object = this.f1((String)object);
            }
        } else {
            object = this.K0((String)object);
        }
        object2 = object;
        if (object == null) {
            object2 = ax.r3.b.n();
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean g1() {
        Object object = this.m;
        synchronized (object) {
            if (this.i.size() <= 0) return false;
            return true;
        }
    }

    @Override
    public void l0(String string, long l8) throws IOException {
        Object object = (y)this.z(string);
        if (!((y)object).i0()) {
            object = new RandomAccessFile(string, "rw");
            try {
                ((RandomAccessFile)object).setLength(l8);
                return;
            }
            finally {
                ((RandomAccessFile)object).close();
            }
        }
        try {
            com.voxdon.xplorer.file.g.P(this, (n)object, l8);
            return;
        }
        catch (ax.b3.j j8) {
            throw new IOException(j8);
        }
    }

    @Override
    void m(n n8, String string, boolean bl, boolean bl2, h h8, ax.u3.c c8) {
        this.N1(n8, string, bl, bl2, h8, c8);
    }

    @Override
    public long q() throws ax.b3.j {
        switch (b.a[this.u().ordinal()]) {
            default: {
                Object object = new StringBuilder();
                ((StringBuilder)object).append("freespace not reachable : ");
                ((StringBuilder)object).append(this.u().I());
                ax.u3.b.g(((StringBuilder)object).toString());
                object = r;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("INVALID GETFREESPACE CALL FOR LOCATOIN : ");
                stringBuilder.append((Object)this.u());
                ((Logger)object).severe(stringBuilder.toString());
                throw new ax.b3.j();
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                long l8;
                k0 k02;
                if (!TextUtils.isEmpty((CharSequence)this.x()) && (k02 = this.Y0()) != null && k02.b != 0L && (l8 = k02.d) >= 0L) {
                    return l8;
                }
                return -1L;
            }
            case 1: 
        }
        return 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<A> q1(n hashSet, boolean bl, long l8, long l9) {
        long l10;
        long l11;
        String string;
        Object object;
        Context context;
        A a8 = null;
        try {
            context = this.p();
            object = new StringBuilder();
            ((StringBuilder)object).append("_data LIKE '");
            ((StringBuilder)object).append(((n)((Object)hashSet)).E());
            ((StringBuilder)object).append("/");
            ((StringBuilder)object).append("%'");
            string = ((StringBuilder)object).toString();
            l11 = 0L;
            long l12 = l9 - 0L;
            l10 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            object = string;
            if (l10 > 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" AND (");
                ((StringBuilder)object).append("_size");
                ((StringBuilder)object).append(" > ");
                ((StringBuilder)object).append(l9);
                ((StringBuilder)object).append(" OR ");
                ((StringBuilder)object).append("_size");
                ((StringBuilder)object).append(" IS NULL)");
                object = ((StringBuilder)object).toString();
            }
        }
        catch (Exception exception) {
            return null;
        }
        context = context.getContentResolver().query(n0.c("external"), y, (String)object, null, "_data asc");
        if (context == null) {
            return null;
        }
        if (context.getCount() <= 0) {
            context.close();
            return null;
        }
        ArrayList<A> arrayList = new ArrayList<A>();
        ax.c3.K k8 = ((y)((Object)hashSet)).B0();
        L l13 = new L();
        long l14 = l8 / 1000L;
        object = null;
        long l15 = 0L;
        hashSet = a8;
        try {
            while (true) {
                boolean bl2;
                long l16;
                if (!context.moveToNext()) {
                    context.close();
                    return arrayList;
                }
                if (l14 > l11 && (l16 = context.getLong(2)) != l11 && l16 < l14) continue;
                a8 = this.B0(k8, (Cursor)context, l13);
                l16 = a8.e;
                string = a8.a;
                if (object != null && ((A)object).a.equalsIgnoreCase(string)) {
                    if (l16 <= l15) continue;
                    arrayList.remove(object);
                }
                boolean bl3 = true;
                if (hashSet != null && d0.H((String)((Object)hashSet), string)) {
                    bl2 = true;
                } else {
                    hashSet = this.o;
                    hashSet = hashSet != null && hashSet.contains(string) ? string : null;
                    bl2 = false;
                }
                boolean bl4 = bl2;
                if (l8 > l11) {
                    bl4 = bl2;
                    if (a8.c < l8) {
                        bl4 = true;
                    }
                }
                bl2 = bl4;
                if (l10 > 0) {
                    bl2 = bl4;
                    if (a8.d < l9) {
                        bl2 = true;
                    }
                }
                if (!bl && a8.b) {
                    bl2 = bl3;
                }
                if (!bl2) {
                    arrayList.add(a8);
                }
                object = a8;
                l15 = l16;
            }
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean s0(n object) {
        Object object2;
        n n8;
        block16: {
            RuntimeException var1_5;
            Object var5_12;
            block15: {
                OutputStreamWriter outputStreamWriter;
                block14: {
                    Object object3;
                    String string = d0.Q(((n)object).T(), ".hidden");
                    n8 = this.z(string);
                    boolean bl = n8.n();
                    var5_12 = null;
                    object2 = object3 = null;
                    object2 = object3;
                    outputStreamWriter = new OutputStreamWriter(this.c(string, true));
                    if (!bl) break block14;
                    try {
                        outputStreamWriter.write("\n");
                    }
                    catch (Throwable throwable) {
                        object2 = outputStreamWriter;
                        break block15;
                    }
                    catch (IOException iOException) {
                        object = outputStreamWriter;
                        break block16;
                    }
                }
                outputStreamWriter.write(((n)object).B());
                try {
                    outputStreamWriter.close();
                    return true;
                }
                catch (IOException iOException) {
                    return true;
                }
                catch (Throwable throwable) {}
            }
            if (object2 == null) throw var1_5;
            try {
                ((OutputStreamWriter)object2).close();
            }
            catch (IOException iOException) {
                throw var1_5;
            }
            throw var1_5;
            catch (IOException iOException) {
                object = var5_12;
            }
        }
        object2 = object;
        {
            if (n8.isDirectory()) {
                object2 = object;
                ax.Ha.c.h().f().d(".hidden foder exists").g(n8.E()).h();
            }
            if (object == null) return false;
        }
        try {
            ((OutputStreamWriter)object).close();
            return false;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    void u1(List<n> list, ax.c3.K k8) {
        Iterator<String> iterator = t.iterator();
        while (iterator.hasNext()) {
            File file = new File("/", iterator.next());
            if (!file.exists()) continue;
            list.add(new y(this, file, k8));
        }
    }

    public void x0(y n82, y object, ax.u3.c c8, i i8) throws ax.b3.j, ax.b3.a {
        if (((y)n82).isDirectory()) {
            Object object2 = object;
            if (!((y)object).n()) {
                if (((n)object).E().endsWith("com.voxdon.xplorer") && "/Android/data/com.voxdon.xplorer".equals(((y)object).C0())) {
                    ax.Q2.e.q(this.p());
                    object2 = object = (y)this.z(((n)object).E());
                    if (!((y)object).n()) {
                        this.M((n)object);
                        object2 = object;
                    }
                } else {
                    this.M((n)object);
                    object2 = object;
                }
            }
            for (n n82 : this.b0(n82)) {
                this.x0((y)n82, (y)this.z(d0.Q(((n)object2).E(), n82.B())), c8, i8);
            }
            return;
        }
        this.F(n82, (n)object, c8, i8);
    }

    @Override
    public k0 y() throws ax.b3.j {
        switch (b.a[this.u().ordinal()]) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("not reachable storage space : ");
                stringBuilder.append(this.u().I());
                ax.u3.b.g(stringBuilder.toString());
                Logger logger = r;
                stringBuilder = new StringBuilder();
                stringBuilder.append("INVALID GETSTORAGESPACE CALL FOR LOCATOIN : ");
                stringBuilder.append((Object)this.u());
                logger.severe(stringBuilder.toString());
                throw new ax.b3.j();
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return this.Y0();
            }
            case 1: 
            case 10: 
            case 11: 
        }
        return this.X0();
    }

    @Override
    public n z(String object) {
        y y8 = new y(this, new File((String)object), null);
        if (Q.L() && y8.a1() && (object = this.M0(y8, (String)object)) != null) {
            return object;
        }
        return y8;
    }

    public y z0(File file, ax.c3.K k8, boolean bl) {
        return new y(this, file, k8, bl);
    }

    static class c
    extends Y {
        y c0;
        x d0;
        boolean e0;

        c(x x8, y y8, boolean bl, boolean bl2) throws FileNotFoundException {
            super(new FileOutputStream(y8.F0(), bl));
            this.d0 = x8;
            this.c0 = y8;
            this.e0 = bl2;
        }

        @Override
        public void close() throws IOException {
            super.close();
            this.d0.M1(this.c0, false, false, false, this.e0);
        }
    }

    private class d
    extends q<Long, Long, Long> {
        private ArrayList<ax.o3.f> h;
        private long i;
        private long j;
        final x k;

        public d(x x8, ArrayList<ax.o3.f> arrayList, long l8) {
            this.k = x8;
            super(q.e.e0);
            this.i = System.currentTimeMillis();
            this.j = l8;
            this.h = arrayList;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Long w(Long ... longArray) {
            long l8;
            long l9;
            if (this.j > 0L && (l9 = System.currentTimeMillis() - this.i) < (l8 = this.j)) {
                try {
                    Thread.sleep(l8 - l9);
                }
                catch (Exception exception) {}
            }
            this.k.H0(this.h, 0, null);
            return null;
        }
    }

    static class e
    extends H {
        long c0;

        public e(InputStream inputStream, long l8, long l9) {
            super(inputStream);
            this.c0 = l8 - l9;
        }

        @Override
        public int read() throws IOException {
            int n8 = super.read();
            if (n8 != -1) {
                --this.c0;
            }
            return n8;
        }

        @Override
        public int read(byte[] byArray) throws IOException {
            return this.read(byArray, 0, byArray.length);
        }

        @Override
        public int read(byte[] object, int n8, int n9) throws IOException {
            String string;
            IOException iOException2;
            block5: {
                block6: {
                    try {
                        n8 = n9 = super.read((byte[])object, n8, n9);
                    }
                    catch (IOException iOException2) {
                        string = iOException2.getMessage();
                        if (string == null || !string.contains("ENOENT")) break block5;
                        n9 = this.available();
                        if (n9 <= 0) break block6;
                        n8 = super.read((byte[])object, n8, this.available());
                    }
                    if (n8 != -1) {
                        this.c0 -= (long)n8;
                    }
                    return n8;
                }
                if (n9 == 0) {
                    if (this.c0 == 0L) {
                        return -1;
                    }
                    throw iOException2;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("io utils error :");
                ((StringBuilder)object).append(string);
                ax.u3.b.e(((StringBuilder)object).toString());
                throw iOException2;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("io utils error :");
            ((StringBuilder)object).append(string);
            ax.u3.b.e(((StringBuilder)object).toString());
            throw iOException2;
        }
    }

    public static interface f {
        public void a();

        public void b(boolean var1);
    }

    public static class g
    extends q<Void, Void, Boolean> {
        x h;
        n i;
        f j;
        boolean k;
        o l;

        public g(o o8, n n8, boolean bl, f f8) {
            super(q.e.e0);
            this.l = o8;
            this.h = (x)o8.u();
            this.i = n8;
            this.j = f8;
            this.k = bl;
            this.l.n0();
        }

        protected Boolean w(Void ... voidArray) {
            boolean bl = ax.Q2.f.f0(this.i.P());
            boolean bl2 = true;
            boolean bl3 = bl || ax.Q2.f.g0(this.i.P());
            if (this.k) {
                bl = bl3 ? ax.Z2.g.h().n(this.i, true) : this.h.s0(this.i);
            } else {
                boolean bl4 = bl3 ? ax.Z2.g.h().n(this.i, false) : false;
                boolean bl5 = this.h.I1(this.i);
                bl = bl2;
                if (!bl4) {
                    bl = bl5 ? bl2 : false;
                }
            }
            if (Q.X1() && this.l.Y()) {
                this.l.n(null);
            }
            return bl;
        }

        protected void x(Boolean bl) {
            if (this.j != null) {
                if (bl.booleanValue()) {
                    this.j.b(this.k);
                } else {
                    this.j.a();
                }
            }
            this.l.k0(true);
        }
    }
}

