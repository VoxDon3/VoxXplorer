/*
 * Decompiled with CFR 0.152.
 */
package ax.l6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

public class b {
    public static void a(AnimatorSet animatorSet, List<Animator> list) {
        Animator animator;
        int n8 = list.size();
        long l8 = 0L;
        for (int i8 = 0; i8 < n8; ++i8) {
            animator = list.get(i8);
            l8 = Math.max(l8, animator.getStartDelay() + animator.getDuration());
        }
        animator = ValueAnimator.ofInt((int[])new int[]{0, 0});
        animator.setDuration(l8);
        list.add(0, animator);
        animatorSet.playTogether(list);
    }
}

