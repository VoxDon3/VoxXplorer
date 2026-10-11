/*
 * Decompiled with CFR 0.152.
 */
package ax.l6;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import ax.l6.a;

public class i {
    private long a;
    private long b;
    private TimeInterpolator c;
    private int d;
    private int e;

    public i(long l8, long l9) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = l8;
        this.b = l9;
    }

    public i(long l8, long l9, TimeInterpolator timeInterpolator) {
        this.d = 0;
        this.e = 1;
        this.a = l8;
        this.b = l9;
        this.c = timeInterpolator;
    }

    static i b(ValueAnimator valueAnimator) {
        i i8 = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        i8.d = valueAnimator.getRepeatCount();
        i8.e = valueAnimator.getRepeatMode();
        return i8;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.c());
        animator.setDuration(this.d());
        animator.setInterpolator(this.e());
        if (animator instanceof ValueAnimator) {
            animator = (ValueAnimator)animator;
            animator.setRepeatCount(this.f());
            animator.setRepeatMode(this.g());
        }
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return ax.l6.a.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof i)) {
            return false;
        }
        object = (i)object;
        if (this.c() != ((i)object).c()) {
            return false;
        }
        if (this.d() != ((i)object).d()) {
            return false;
        }
        if (this.f() != ((i)object).f()) {
            return false;
        }
        if (this.g() != ((i)object).g()) {
            return false;
        }
        return this.e().getClass().equals(((i)object).e().getClass());
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public int hashCode() {
        return ((((int)(this.c() ^ this.c() >>> 32) * 31 + (int)(this.d() ^ this.d() >>> 32)) * 31 + this.e().getClass().hashCode()) * 31 + this.f()) * 31 + this.g();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\n');
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" delay: ");
        stringBuilder.append(this.c());
        stringBuilder.append(" duration: ");
        stringBuilder.append(this.d());
        stringBuilder.append(" interpolator: ");
        stringBuilder.append(this.e().getClass());
        stringBuilder.append(" repeatCount: ");
        stringBuilder.append(this.f());
        stringBuilder.append(" repeatMode: ");
        stringBuilder.append(this.g());
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}

