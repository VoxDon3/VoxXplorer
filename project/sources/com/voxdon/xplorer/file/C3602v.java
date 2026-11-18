package com.voxdon.xplorer.file;

import ax.c3.C1809B;
import ax.c3.d0;
import com.voxdon.xplorer.file.C3601u;
import com.voxdon.xplorer.file.C3603w;
import com.voxdon.xplorer.file.C3605y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* renamed from: com.voxdon.xplorer.file.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3602v extends C3605y {
    private C3601u.a S0;
    private Long T0;
    private String U0;

    /* renamed from: com.voxdon.xplorer.file.v$a */
    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (str != null && str.startsWith(".")) {
                return false;
            }
            if (C3602v.this.S0 != null) {
                return C3602v.this.S0.accept(file, str);
            }
            ax.Ha.c.h().f().b("LIBRARY LOAD NUM CHILDREN").g("location:" + C3602v.this.P() + ",path:" + C3602v.this.E()).h();
            return true;
        }
    }

    public C3602v(C3601u c3601u, File file, C3601u.a aVar, ax.c3.K k) {
        super(c3601u, file, k);
        this.S0 = aVar;
    }

    private static Set<String> B1(File file, File file2, HashMap<String, Set<String>> hashMap) {
        String absolutePath = file.getAbsolutePath();
        Set<String> set = hashMap.get(absolutePath);
        if (set != null) {
            return set;
        }
        if (!file2.exists()) {
            Set<String> set2 = Collections.EMPTY_SET;
            hashMap.put(absolutePath, set2);
            return set2;
        }
        HashSet hashSet = new HashSet();
        Scanner scanner = null;
        try {
            try {
                Scanner scanner2 = new Scanner(file2);
                while (scanner2.hasNext()) {
                    try {
                        hashSet.add(scanner2.nextLine());
                    } catch (FileNotFoundException unused) {
                        scanner = scanner2;
                        Set<String> set3 = Collections.EMPTY_SET;
                        hashMap.put(absolutePath, set3);
                        if (scanner != null) {
                            scanner.close();
                        }
                        return set3;
                    } catch (Throwable th) {
                        th = th;
                        scanner = scanner2;
                        if (scanner != null) {
                            scanner.close();
                        }
                        throw th;
                    }
                }
                scanner2.close();
                if (hashSet.isEmpty()) {
                    file2.delete();
                }
                hashMap.put(absolutePath, hashSet);
                return hashSet;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused2) {
        }
    }

    private static C3605y.b D1(ax.c3.K k, File file, String str, String str2, Boolean bool, Boolean bool2, HashMap<String, C3605y.b> hashMap, HashMap<String, Set<String>> hashMap2) {
        File parentFile;
        C3605y.b bVar;
        String absolutePath = file.isDirectory() ? file.getAbsolutePath() : file.getParent();
        if (hashMap != null && hashMap.containsKey(absolutePath)) {
            return hashMap.get(absolutePath);
        }
        File file2 = new File(absolutePath);
        boolean equals = str.equals(absolutePath);
        Set<String> G = C3603w.G();
        if (d0.z(absolutePath)) {
            C3605y.b bVar2 = C3605y.b.HIDDEN_OS;
            hashMap.put(absolutePath, bVar2);
            return bVar2;
        }
        if (bool == null) {
            bool = Boolean.valueOf(new File(absolutePath, ".nomedia").exists());
        }
        if (!equals && bool.booleanValue()) {
            C3605y.b bVar3 = C3605y.b.HIDDEN_NOMEDIA;
            hashMap.put(absolutePath, bVar3);
            return bVar3;
        }
        if ((bool2 == null || bool2.booleanValue()) && G1(k, file2, hashMap2)) {
            C3605y.b bVar4 = C3605y.b.HIDDEN_DOTHIDDEN;
            hashMap.put(absolutePath, bVar4);
            return bVar4;
        }
        if (G.contains(str2)) {
            C3605y.b bVar5 = C3605y.b.HIDDEN_HIDELIST;
            hashMap.put(absolutePath, bVar5);
            return bVar5;
        }
        if (!equals && (parentFile = file2.getParentFile()) != null && (bVar = hashMap.get(parentFile.getAbsolutePath())) != null) {
            C3605y.b bVar6 = C3605y.b.VISIBLE;
            if (bVar == bVar6) {
                hashMap.put(absolutePath, bVar6);
                return bVar6;
            }
            C3605y.b bVar7 = C3605y.b.HIDDEN_PARENT;
            hashMap.put(absolutePath, bVar7);
            return bVar7;
        }
        String str3 = File.separator;
        if (absolutePath.equals(str3)) {
            C3605y.b bVar8 = C3605y.b.VISIBLE;
            hashMap.put(absolutePath, bVar8);
            return bVar8;
        }
        for (String str4 : d0.X(absolutePath)) {
            str3 = d0.Q(str3, str4);
            if (str3.length() > str.length()) {
                String substring = str3.substring(str.length());
                if (hashMap == null || !hashMap.containsKey(str3)) {
                    if (absolutePath.equals(str3)) {
                        C3605y.b bVar9 = C3605y.b.VISIBLE;
                        hashMap.put(absolutePath, bVar9);
                        return bVar9;
                    }
                    File file3 = new File(str3);
                    File file4 = new File(str3, ".nomedia");
                    if (d0.z(str3)) {
                        hashMap.put(str3, C3605y.b.HIDDEN_OS);
                        C3605y.b bVar10 = C3605y.b.HIDDEN_PARENT;
                        hashMap.put(absolutePath, bVar10);
                        return bVar10;
                    }
                    if (file4.exists()) {
                        hashMap.put(str3, C3605y.b.HIDDEN_NOMEDIA);
                        C3605y.b bVar11 = C3605y.b.HIDDEN_PARENT;
                        hashMap.put(absolutePath, bVar11);
                        return bVar11;
                    }
                    if (G.contains(substring)) {
                        hashMap.put(str3, C3605y.b.HIDDEN_HIDELIST);
                        C3605y.b bVar12 = C3605y.b.HIDDEN_PARENT;
                        hashMap.put(absolutePath, bVar12);
                        return bVar12;
                    }
                    if (G1(k, file3, hashMap2)) {
                        hashMap.put(str3, C3605y.b.HIDDEN_DOTHIDDEN);
                        C3605y.b bVar13 = C3605y.b.HIDDEN_PARENT;
                        hashMap.put(absolutePath, bVar13);
                        return bVar13;
                    }
                    hashMap.put(str3, C3605y.b.VISIBLE);
                } else if (hashMap.get(str3) != C3605y.b.VISIBLE) {
                    C3605y.b bVar14 = C3605y.b.HIDDEN_PARENT;
                    hashMap.put(absolutePath, bVar14);
                    return bVar14;
                }
            }
        }
        C3605y.b bVar15 = C3605y.b.VISIBLE;
        hashMap.put(absolutePath, bVar15);
        return bVar15;
    }

    public static C3605y.b E1(C3602v c3602v, C3603w.e eVar, Boolean bool, HashMap<String, C3605y.b> hashMap, HashMap<String, Set<String>> hashMap2) {
        String x;
        C3605y.b c;
        ax.c3.K k = eVar.a;
        C3605y c3605y = eVar.c;
        String E = c3605y.E();
        String e = k.e();
        try {
            if (c3605y.h()) {
                return C3605y.b.HIDDEN_OS;
            }
            if (d0.H(e, E)) {
                x = d0.x(e, E);
            } else if (d0.H("/sdcard", E)) {
                x = d0.x("/sdcard", E);
                e = "/sdcard";
            } else if (d0.H("/storage/emulated/0", E)) {
                e = "/storage/emulated/0";
                x = d0.x("/storage/emulated/0", E);
            } else {
                ax.Ha.c.h().f().d("Invalid Hidden Media Path problem!").g(E + ":" + e).h();
                x = E;
            }
            if (d0.H("/Android/data", x)) {
                return C3603w.S(x) ? eVar.d.booleanValue() ? C3605y.b.HIDDEN_NOMEDIA : C3605y.b.VISIBLE : C3605y.b.HIDDEN_DATA;
            }
            String f = ax.Z2.g.h().f(c3602v);
            return (f == null || (c = ax.Z2.g.c(f)) == C3605y.b.VISIBLE) ? D1(k, c3605y.F0(), e, x, eVar.d, bool, hashMap, hashMap2) : c;
        } catch (StringIndexOutOfBoundsException unused) {
            ax.Ha.c.h().d("IsHidenMedia Path problem!").g(E + ":" + e).h();
            return C3605y.b.VISIBLE;
        }
    }

    private static boolean G1(ax.c3.K k, File file, HashMap<String, Set<String>> hashMap) {
        if ("S".equals(ax.Z2.g.h().e(k, null, file.getAbsolutePath()))) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        return B1(parentFile, new File(parentFile, ".hidden"), hashMap).contains(file.getName());
    }

    public String A1() {
        return C1809B.U(B0(), E());
    }

    public C3601u.a C1() {
        return this.S0;
    }

    public String F1() {
        return this.U0;
    }

    public void H1(long j) {
        this.T0 = Long.valueOf(j);
    }

    public void I1(String str) {
        this.U0 = str;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3602v)) {
            return F0().getAbsolutePath().equals(((C3602v) obj).F0().getAbsolutePath());
        }
        return false;
    }

    @Override // com.voxdon.xplorer.file.C3605y
    public void g1(boolean z) {
        if (X() == -1 || X() == -3) {
            String[] list = this.n0.list(z ? this.S0 : new a());
            d0(list != null ? list.length : -1);
        }
    }

    @Override // com.voxdon.xplorer.file.C3605y, ax.c3.InterfaceC1814b
    public long q() {
        Long l = this.T0;
        return l != null ? l.longValue() : super.q();
    }

    public C3602v(C3604x c3604x, C3605y c3605y, C3601u.a aVar) {
        super(c3604x, c3605y);
        this.S0 = aVar;
    }
}
