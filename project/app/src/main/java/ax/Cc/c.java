/*
 * Decompiled with CFR 0.152.
 */
package ax.Cc;

import ax.Cc.a;
import ax.Cc.b;
import ax.Cc.g;
import ax.Cc.h;
import ax.Dc.L;
import ax.Kc.n;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

public class c
implements ax.Ac.a {
    private static final c[] B0 = new c[0];
    private long A0 = -1L;
    private final boolean c0;
    private int d0;
    private long e0;
    private long f0;
    private long g0;
    private long h0;
    private boolean i0;
    private byte j0;
    private String k0 = "";
    private String l0 = "ustar\u0000";
    private String m0 = "00";
    private String n0;
    private String o0 = "";
    private int p0;
    private String q = "";
    private int q0;
    private List<g> r0;
    private boolean s0;
    private long t0;
    private boolean u0;
    private boolean v0;
    private boolean w0;
    private final j.Path x0;
    private final j.LinkOption[] y0;
    private final Map<String, String> z0 = new HashMap<String, String>();

    private c(boolean bl) {
        String string;
        String string2 = string = System.getProperty("user.name", "");
        if (string.length() > 31) {
            string2 = string.substring(0, 31);
        }
        this.n0 = string2;
        this.x0 = null;
        this.y0 = n.a;
        this.c0 = bl;
    }

    public c(byte[] byArray, L l8, boolean bl) throws IOException {
        this(false);
        this.y(byArray, l8, false, bl);
    }

    private void A(String string, String string2, Map<String, String> map) throws IOException {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1195018015: {
                if (!string.equals("linkpath")) break;
                n8 = 12;
                break;
            }
            case 530706950: {
                if (!string.equals("SCHILY.filetype")) break;
                n8 = 11;
                break;
            }
            case 111425664: {
                if (!string.equals("uname")) break;
                n8 = 10;
                break;
            }
            case 104223930: {
                if (!string.equals("mtime")) break;
                n8 = 9;
                break;
            }
            case 98496370: {
                if (!string.equals("gname")) break;
                n8 = 8;
                break;
            }
            case 3530753: {
                if (!string.equals("size")) break;
                n8 = 7;
                break;
            }
            case 3433509: {
                if (!string.equals("path")) break;
                n8 = 6;
                break;
            }
            case 115792: {
                if (!string.equals("uid")) break;
                n8 = 5;
                break;
            }
            case 102338: {
                if (!string.equals("gid")) break;
                n8 = 4;
                break;
            }
            case -160380561: {
                if (!string.equals("GNU.sparse.size")) break;
                n8 = 3;
                break;
            }
            case -277496563: {
                if (!string.equals("GNU.sparse.realsize")) break;
                n8 = 2;
                break;
            }
            case -1916619760: {
                if (!string.equals("SCHILY.devminor")) break;
                n8 = 1;
                break;
            }
            case -1916861932: {
                if (!string.equals("SCHILY.devmajor")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                this.z0.put(string, string2);
                return;
            }
            case 12: {
                this.F(string2);
                return;
            }
            case 11: {
                if ("sparse".equals(string2)) {
                    this.g(map);
                }
                return;
            }
            case 10: {
                this.L(string2);
                return;
            }
            case 9: {
                this.G((long)(Double.parseDouble(string2) * 1000.0));
                return;
            }
            case 8: {
                this.E(string2);
                return;
            }
            case 7: {
                long l8 = Long.parseLong(string2);
                if (l8 >= 0L) {
                    this.I(l8);
                    return;
                }
                throw new IOException("Corrupted TAR archive. Entry size is negative");
            }
            case 6: {
                this.H(string2);
                return;
            }
            case 5: {
                this.K(Long.parseLong(string2));
                return;
            }
            case 4: {
                this.D(Long.parseLong(string2));
                return;
            }
            case 3: {
                this.e(map);
                return;
            }
            case 2: {
                this.f(map);
                return;
            }
            case 1: {
                n8 = Integer.parseInt(string2);
                if (n8 >= 0) {
                    this.C(n8);
                    return;
                }
                throw new IOException("Corrupted TAR archive. Dev-Minor is negative");
            }
            case 0: 
        }
        n8 = Integer.parseInt(string2);
        if (n8 >= 0) {
            this.B(n8);
            return;
        }
        throw new IOException("Corrupted TAR archive. Dev-Major is negative");
    }

    public static /* synthetic */ boolean a(g g8) {
        return g8.b() > 0L || g8.a() > 0L;
        {
        }
    }

    private int d(byte[] byArray) {
        if (ax.Kc.a.c("ustar ", byArray, 257, 6)) {
            return 2;
        }
        if (ax.Kc.a.c("ustar\u0000", byArray, 257, 6)) {
            if (ax.Kc.a.c("tar\u0000", byArray, 508, 4)) {
                return 4;
            }
            return 3;
        }
        return 0;
    }

    private static String w(String string, boolean bl) {
        String string2;
        block5: {
            int n8;
            String string3;
            block6: {
                block7: {
                    string2 = string;
                    if (bl) break block5;
                    string3 = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
                    string2 = string;
                    if (string3 == null) break block5;
                    if (!string3.startsWith("windows")) break block6;
                    string2 = string;
                    if (string.length() <= 2) break block5;
                    n8 = string.charAt(0);
                    string2 = string;
                    if (string.charAt(1) != ':') break block5;
                    if (n8 >= 97 && n8 <= 122) break block7;
                    string2 = string;
                    if (n8 < 65) break block5;
                    string2 = string;
                    if (n8 > 90) break block5;
                }
                string2 = string.substring(2);
                break block5;
            }
            string2 = string;
            if (string3.contains("netware")) {
                n8 = string.indexOf(58);
                string2 = string;
                if (n8 != -1) {
                    string2 = string.substring(n8 + 1);
                }
            }
        }
        string = string2.replace(File.separatorChar, '/');
        while (!bl && string.startsWith("/")) {
            string = string.substring(1);
        }
        return string;
    }

    private long x(byte[] byArray, int n8, int n9, boolean bl) {
        if (bl) {
            try {
                long l8 = h.i(byArray, n8, n9);
                return l8;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return -1L;
            }
        }
        return h.i(byArray, n8, n9);
    }

    private void y(byte[] byArray, L l8, boolean bl, boolean bl2) throws IOException {
        try {
            this.z(byArray, l8, bl, bl2);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException("Corrupted TAR archive.", illegalArgumentException);
        }
    }

    private void z(byte[] object, L object2, boolean bl, boolean bl2) throws IOException {
        long l8;
        String string = bl ? h.f((byte[])object, 0, 100) : h.g((byte[])object, 0, 100, (L)object2);
        this.q = string;
        this.d0 = (int)this.x((byte[])object, 100, 8, bl2);
        this.e0 = (int)this.x((byte[])object, 108, 8, bl2);
        this.f0 = (int)this.x((byte[])object, 116, 8, bl2);
        this.g0 = l8 = h.i((byte[])object, 124, 12);
        if (l8 >= 0L) {
            this.h0 = this.x((byte[])object, 136, 12, bl2);
            this.i0 = h.o((byte[])object);
            this.j0 = object[156];
            string = bl ? h.f((byte[])object, 157, 100) : h.g((byte[])object, 157, 100, (L)object2);
            this.k0 = string;
            this.l0 = h.f((byte[])object, 257, 6);
            this.m0 = h.f((byte[])object, 263, 2);
            string = bl ? h.f((byte[])object, 265, 32) : h.g((byte[])object, 265, 32, (L)object2);
            this.n0 = string;
            string = bl ? h.f((byte[])object, 297, 32) : h.g((byte[])object, 297, 32, (L)object2);
            this.o0 = string;
            int n8 = this.j0;
            if (n8 == 51 || n8 == 52) {
                this.p0 = (int)this.x((byte[])object, 329, 8, bl2);
                this.q0 = (int)this.x((byte[])object, 337, 8, bl2);
            }
            if ((n8 = this.d((byte[])object)) != 2) {
                if (n8 != 4) {
                    object = bl ? (Object)h.f((byte[])object, 345, 155) : (Object)h.g((byte[])object, 345, 155, (L)object2);
                    if (this.isDirectory() && !this.q.endsWith("/")) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(this.q);
                        ((StringBuilder)object2).append("/");
                        this.q = ((StringBuilder)object2).toString();
                    }
                    if (!((String)object).isEmpty()) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append((String)object);
                        ((StringBuilder)object2).append("/");
                        ((StringBuilder)object2).append(this.q);
                        this.q = ((StringBuilder)object2).toString();
                        return;
                    }
                } else {
                    object = bl ? (Object)h.f((byte[])object, 345, 131) : (Object)h.g((byte[])object, 345, 131, (L)object2);
                    if (!((String)object).isEmpty()) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append((String)object);
                        ((StringBuilder)object2).append("/");
                        ((StringBuilder)object2).append(this.q);
                        this.q = ((StringBuilder)object2).toString();
                    }
                }
                return;
            }
            this.r0 = new ArrayList<g>(h.n((byte[])object, 386, 4));
            this.s0 = h.d((byte[])object, 482);
            this.t0 = h.h((byte[])object, 483, 12);
            return;
        }
        throw new IOException("broken archive, entry with negative size");
    }

    public void B(int n8) {
        if (n8 >= 0) {
            this.p0 = n8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Major device number is out of range: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void C(int n8) {
        if (n8 >= 0) {
            this.q0 = n8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Minor device number is out of range: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void D(long l8) {
        this.f0 = l8;
    }

    public void E(String string) {
        this.o0 = string;
    }

    public void F(String string) {
        this.k0 = string;
    }

    public void G(long l8) {
        this.h0 = l8 / 1000L;
    }

    public void H(String string) {
        this.q = c.w(string, this.c0);
    }

    public void I(long l8) {
        if (l8 >= 0L) {
            this.g0 = l8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Size is out of range: ");
        stringBuilder.append(l8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void J(List<g> list) {
        this.r0 = list;
    }

    public void K(long l8) {
        this.e0 = l8;
    }

    public void L(String string) {
        this.n0 = string;
    }

    void M(Map<String, String> map) throws IOException {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.A(entry.getKey(), entry.getValue(), map);
        }
    }

    @Override
    public Date b() {
        return this.h();
    }

    public boolean c(c c8) {
        return c8 != null && this.getName().equals(c8.getName());
    }

    void e(Map<String, String> map) {
        this.u0 = true;
        this.t0 = Integer.parseInt(map.get("GNU.sparse.size"));
        if (map.containsKey("GNU.sparse.name")) {
            this.q = map.get("GNU.sparse.name");
        }
    }

    public boolean equals(Object object) {
        if (object != null && this.getClass() == object.getClass()) {
            return this.c((c)object);
        }
        return false;
    }

    void f(Map<String, String> map) throws IOException {
        this.u0 = true;
        this.v0 = true;
        if (map.containsKey("GNU.sparse.name")) {
            this.q = map.get("GNU.sparse.name");
        }
        if (map.containsKey("GNU.sparse.realsize")) {
            try {
                this.t0 = Integer.parseInt(map.get("GNU.sparse.realsize"));
                return;
            }
            catch (NumberFormatException numberFormatException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Corrupted TAR archive. GNU.sparse.realsize header for ");
                stringBuilder.append(this.q);
                stringBuilder.append(" contains non-numeric value");
                throw new IOException(stringBuilder.toString());
            }
        }
    }

    void g(Map<String, String> map) throws IOException {
        this.w0 = true;
        if (map.containsKey("SCHILY.realsize")) {
            try {
                this.t0 = Long.parseLong(map.get("SCHILY.realsize"));
                return;
            }
            catch (NumberFormatException numberFormatException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Corrupted TAR archive. SCHILY.realsize header for ");
                stringBuilder.append(this.q);
                stringBuilder.append(" contains non-numeric value");
                throw new IOException(stringBuilder.toString());
            }
        }
    }

    @Override
    public String getName() {
        return this.q;
    }

    @Override
    public long getSize() {
        return this.g0;
    }

    public Date h() {
        return new Date(this.h0 * 1000L);
    }

    public int hashCode() {
        return this.getName().hashCode();
    }

    public List<g> i() throws IOException {
        Object object = this.r0;
        if (object != null && !object.isEmpty()) {
            g g8;
            object = (List)j.Collection._EL.stream(this.r0).filter((Predicate)new a()).sorted(j.Comparator._CC.comparingLong((ToLongFunction)new b())).collect(j.Collectors.toList());
            int n8 = object.size();
            int n9 = 0;
            while (n9 < n8) {
                g8 = (g)object.get(n9);
                if (++n9 < n8 && g8.b() + g8.a() > ((g)object.get(n9)).b()) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Corrupted TAR archive. Sparse blocks for ");
                    ((StringBuilder)object).append(this.getName());
                    ((StringBuilder)object).append(" overlap each other.");
                    throw new IOException(((StringBuilder)object).toString());
                }
                if (g8.b() + g8.a() >= 0L) continue;
                object = new StringBuilder();
                ((StringBuilder)object).append("Unreadable TAR archive. Offset and numbytes for sparse block in ");
                ((StringBuilder)object).append(this.getName());
                ((StringBuilder)object).append(" too large.");
                throw new IOException(((StringBuilder)object).toString());
            }
            if (!object.isEmpty() && (g8 = (g)object.get(n8 - 1)).b() + g8.a() > this.j()) {
                throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
            }
            return object;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public boolean isDirectory() {
        j.Path path = this.x0;
        if (path != null) {
            return j.Files.isDirectory((j.Path)path, (j.LinkOption[])this.y0);
        }
        if (this.j0 == 53) {
            return true;
        }
        return !this.t() && !this.p() && this.getName().endsWith("/");
    }

    public long j() {
        if (!this.u()) {
            return this.getSize();
        }
        return this.t0;
    }

    public List<g> k() {
        return this.r0;
    }

    public boolean l() {
        return this.s0;
    }

    public boolean m() {
        return this.j0 == 75;
    }

    public boolean n() {
        return this.j0 == 76;
    }

    public boolean o() {
        return this.q() || this.s();
        {
        }
    }

    public boolean p() {
        return this.j0 == 103;
    }

    public boolean q() {
        return this.j0 == 83;
    }

    public boolean r() {
        return this.v0;
    }

    public boolean s() {
        return this.u0;
    }

    public boolean t() {
        byte by = this.j0;
        return by == 120 || by == 88;
        {
        }
    }

    public boolean u() {
        return this.o() || this.v();
        {
        }
    }

    public boolean v() {
        return this.w0;
    }
}

