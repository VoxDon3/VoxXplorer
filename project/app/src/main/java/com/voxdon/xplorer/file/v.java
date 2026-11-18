/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import ax.Ha.b;
import ax.Ha.c;
import ax.Z2.g;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.u;
import com.voxdon.xplorer.file.w;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class v
extends y {
    private u.a S0;
    private Long T0;
    private String U0;

    public v(u u8, File file, u.a a8, K k8) {
        super((x)u8, file, k8);
        this.S0 = a8;
    }

    public v(x x8, y y8, u.a a8) {
        super(x8, y8);
        this.S0 = a8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Set<String> B1(File object, File object2, HashMap<String, Set<String>> hashMap) {
        RuntimeException var1_6;
        block13: {
            Object object3;
            String string;
            block14: {
                string = ((File)object).getAbsolutePath();
                if ((object = hashMap.get(string)) != null) {
                    return object;
                }
                if (!((File)object2).exists()) {
                    object = Collections.EMPTY_SET;
                    hashMap.put(string, (Set<String>)object);
                    return object;
                }
                HashSet<String> hashSet = new HashSet<String>();
                Object var4_10 = null;
                Object var5_11 = null;
                object = var5_11;
                try {
                    object = var5_11;
                    object3 = new Scanner((File)object2);
                }
                catch (Throwable throwable) {
                    break block13;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    object2 = var4_10;
                    break block14;
                }
                try {
                    while (((Scanner)object3).hasNext()) {
                        hashSet.add(((Scanner)object3).nextLine());
                    }
                }
                catch (Throwable throwable) {
                    object = object3;
                    break block13;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    object2 = object3;
                    break block14;
                }
                ((Scanner)object3).close();
                if (hashSet.isEmpty()) {
                    ((File)object2).delete();
                }
                hashMap.put(string, hashSet);
                return hashSet;
            }
            object = object2;
            {
                object3 = Collections.EMPTY_SET;
                object = object2;
                hashMap.put(string, (Set<String>)object3);
                if (object2 != null) {
                    ((Scanner)object2).close();
                }
                return object3;
            }
        }
        if (object != null) {
            ((Scanner)object).close();
        }
        throw var1_6;
    }

    private static y.b D1(K object, File object2, String string, String object3, Boolean stringArray, Boolean comparable, HashMap<String, y.b> hashMap, HashMap<String, Set<String>> hashMap2) {
        object2 = ((File)object2).isDirectory() ? ((File)object2).getAbsolutePath() : ((File)object2).getParent();
        if (hashMap != null && hashMap.containsKey(object2)) {
            return hashMap.get(object2);
        }
        Object object4 = new File((String)object2);
        boolean bl = string.equals(object2);
        Set<String> set = w.G();
        if (d0.z((String)object2)) {
            object = y.b.c0;
            hashMap.put((String)object2, (y.b)((Object)object));
            return object;
        }
        Object object5 = stringArray;
        if (stringArray == null) {
            object5 = new File((String)object2, ".nomedia").exists();
        }
        if (!bl && ((Boolean)object5).booleanValue()) {
            object = y.b.f0;
            hashMap.put((String)object2, (y.b)((Object)object));
            return object;
        }
        if ((comparable == null || comparable.booleanValue()) && v.G1(object, (File)object4, hashMap2)) {
            object = y.b.d0;
            hashMap.put((String)object2, (y.b)((Object)object));
            return object;
        }
        if (set.contains(object3)) {
            object = y.b.h0;
            hashMap.put((String)object2, (y.b)((Object)object));
            return object;
        }
        if (!bl && (object3 = ((File)object4).getParentFile()) != null && (object3 = hashMap.get(((File)object3).getAbsolutePath())) != null) {
            object = y.b.q;
            if (object3 != object) {
                object = y.b.i0;
                hashMap.put((String)object2, (y.b)((Object)object));
                return object;
            }
            hashMap.put((String)object2, (y.b)((Object)object));
            return object;
        }
        object3 = File.separator;
        if (((String)object2).equals(object3)) {
            object = y.b.q;
            hashMap.put((String)object2, (y.b)((Object)object));
            return object;
        }
        stringArray = d0.X((String)object2);
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (((String)(object3 = d0.Q((String)object3, stringArray[i8]))).length() <= string.length()) continue;
            object4 = ((String)object3).substring(string.length());
            if (hashMap != null && hashMap.containsKey(object3)) {
                if (hashMap.get(object3) == y.b.q) continue;
                object = y.b.i0;
                hashMap.put((String)object2, (y.b)((Object)object));
                return object;
            }
            if (((String)object2).equals(object3)) {
                object = y.b.q;
                hashMap.put((String)object2, (y.b)((Object)object));
                return object;
            }
            comparable = new File((String)object3);
            object5 = new File((String)object3, ".nomedia");
            if (d0.z((String)object3)) {
                hashMap.put((String)object3, y.b.c0);
                object = y.b.i0;
                hashMap.put((String)object2, (y.b)((Object)object));
                return object;
            }
            if (((File)object5).exists()) {
                hashMap.put((String)object3, y.b.f0);
                object = y.b.i0;
                hashMap.put((String)object2, (y.b)((Object)object));
                return object;
            }
            if (set.contains(object4)) {
                hashMap.put((String)object3, y.b.h0);
                object = y.b.i0;
                hashMap.put((String)object2, (y.b)((Object)object));
                return object;
            }
            if (v.G1(object, (File)comparable, hashMap2)) {
                hashMap.put((String)object3, y.b.d0);
                object = y.b.i0;
                hashMap.put((String)object2, (y.b)((Object)object));
                return object;
            }
            hashMap.put((String)object3, y.b.q);
        }
        object = y.b.q;
        hashMap.put((String)object2, (y.b)((Object)object));
        return object;
    }

    public static y.b E1(v object, w.e object2, Boolean bl, HashMap<String, y.b> hashMap, HashMap<String, Set<String>> hashMap2) {
        Object object3;
        String string;
        String string2;
        y y8;
        K k8;
        block34: {
            block31: {
                block32: {
                    block33: {
                        block29: {
                            String string3;
                            block27: {
                                block30: {
                                    block28: {
                                        block26: {
                                            k8 = ((w.e)object2).a;
                                            y8 = ((w.e)object2).c;
                                            string3 = y8.E();
                                            string = string2 = k8.e();
                                            try {
                                                if (!y8.h()) break block26;
                                                string = string2;
                                            }
                                            catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                                                object2 = c.h().d("IsHidenMedia Path problem!");
                                                StringBuilder stringBuilder = new StringBuilder();
                                                stringBuilder.append(string3);
                                                stringBuilder.append(":");
                                                stringBuilder.append(string);
                                                ((b)object2).g(stringBuilder.toString()).h();
                                                return y.b.q;
                                            }
                                            return y.b.c0;
                                        }
                                        string = string2;
                                        if (d0.H(string2, string3)) break block27;
                                        string = string2;
                                        if (!d0.H("/sdcard", string3)) break block28;
                                        string = string2;
                                        object3 = d0.x("/sdcard", string3);
                                        string2 = "/sdcard";
                                        break block29;
                                    }
                                    string = string2;
                                    if (!d0.H("/storage/emulated/0", string3)) break block30;
                                    string = string2;
                                    object3 = d0.x("/storage/emulated/0", string3);
                                    string2 = "/storage/emulated/0";
                                    break block29;
                                }
                                string = string2;
                                object3 = c.h().f().d("Invalid Hidden Media Path problem!");
                                string = string2;
                                string = string2;
                                StringBuilder stringBuilder = new StringBuilder();
                                string = string2;
                                stringBuilder.append(string3);
                                string = string2;
                                stringBuilder.append(":");
                                string = string2;
                                stringBuilder.append(string2);
                                string = string2;
                                ((b)object3).g(stringBuilder.toString()).h();
                                object3 = string3;
                                break block29;
                            }
                            string = string2;
                            object3 = d0.x(string2, string3);
                        }
                        string = string2;
                        if (!d0.H("/Android/data", (String)object3)) break block31;
                        string = string2;
                        if (!w.S((String)object3)) break block32;
                        string = string2;
                        if (!((w.e)object2).d.booleanValue()) break block33;
                        string = string2;
                        return y.b.f0;
                    }
                    string = string2;
                    return y.b.q;
                }
                string = string2;
                return y.b.g0;
            }
            string = string2;
            object = g.h().f((n)object);
            if (object == null) break block34;
            string = string2;
            object = g.c((String)object);
            string = string2;
            if (object == y.b.q) break block34;
            return object;
        }
        string = string2;
        object = v.D1(k8, y8.F0(), string2, (String)object3, ((w.e)object2).d, bl, hashMap, hashMap2);
        return object;
    }

    private static boolean G1(K object, File file, HashMap<String, Set<String>> hashMap) {
        if ("S".equals(g.h().e((K)object, null, file.getAbsolutePath()))) {
            return true;
        }
        object = file.getParentFile();
        if (object == null) {
            return false;
        }
        return v.B1((File)object, new File((File)object, ".hidden"), hashMap).contains(file.getName());
    }

    public String A1() {
        return B.U(this.B0(), this.E());
    }

    public u.a C1() {
        return this.S0;
    }

    public String F1() {
        return this.U0;
    }

    public void H1(long l8) {
        this.T0 = l8;
    }

    public void I1(String string) {
        this.U0 = string;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof v)) {
            return false;
        }
        return this.F0().getAbsolutePath().equals(((v)object).F0().getAbsolutePath());
    }

    @Override
    public void g1(boolean bl) {
        int n8 = this.X();
        int n9 = -1;
        if (n8 != -1 && this.X() != -3) {
            return;
        }
        Object object = bl ? this.S0 : new FilenameFilter(this){
            final v q;
            {
                this.q = v8;
            }

            @Override
            public boolean accept(File comparable, String object) {
                if (object != null && ((String)object).startsWith(".")) {
                    return false;
                }
                if (this.q.S0 == null) {
                    object = c.h().f().b("LIBRARY LOAD NUM CHILDREN");
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append("location:");
                    ((StringBuilder)comparable).append((Object)this.q.P());
                    ((StringBuilder)comparable).append(",path:");
                    ((StringBuilder)comparable).append(this.q.E());
                    ((b)object).g(((StringBuilder)comparable).toString()).h();
                    return true;
                }
                return this.q.S0.accept((File)comparable, (String)object);
            }
        };
        object = this.n0.list((FilenameFilter)object);
        if (object != null) {
            n9 = ((String[])object).length;
        }
        this.d0(n9);
    }

    @Override
    public long q() {
        Long l8 = this.T0;
        if (l8 != null) {
            return l8;
        }
        return super.q();
    }
}

