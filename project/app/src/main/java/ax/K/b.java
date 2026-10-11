/*
 * Decompiled with CFR 0.152.
 */
package ax.K;

import android.util.Pair;
import ax.K.j;
import java.util.HashMap;

public class b {
    static final HashMap<Pair<Integer, Integer>, String> f;
    static final HashMap<String, String> g;
    private final j a;
    private String b = null;
    private String c = null;
    private int d = -1;
    private int e = -1;

    static {
        HashMap<Pair, String> hashMap = new HashMap<Pair, String>();
        f = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        g = hashMap2;
        Integer n8 = 4;
        hashMap.put(Pair.create((Object)n8, (Object)n8), "layout_constraintBottom_toBottomOf");
        Integer n9 = 3;
        hashMap.put(Pair.create((Object)n8, (Object)n9), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create((Object)n9, (Object)n8), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create((Object)n9, (Object)n9), "layout_constraintTop_toTopOf");
        n8 = 6;
        hashMap.put(Pair.create((Object)n8, (Object)n8), "layout_constraintStart_toStartOf");
        n9 = 7;
        hashMap.put(Pair.create((Object)n8, (Object)n9), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create((Object)n9, (Object)n8), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create((Object)n9, (Object)n9), "layout_constraintEnd_toEndOf");
        n8 = 1;
        hashMap.put(Pair.create((Object)n8, (Object)n8), "layout_constraintLeft_toLeftOf");
        n9 = 2;
        hashMap.put(Pair.create((Object)n8, (Object)n9), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create((Object)n9, (Object)n9), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create((Object)n9, (Object)n8), "layout_constraintRight_toLeftOf");
        n8 = 5;
        hashMap.put(Pair.create((Object)n8, (Object)n8), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public b(j j8) {
        this.a = j8;
    }
}

