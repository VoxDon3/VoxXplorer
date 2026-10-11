.class Lax/v2/N$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Lax/v2/k$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/v2/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/view/View;

.field private final b:I

.field private final c:Landroid/view/ViewGroup;

.field private final d:Z

.field private e:Z

.field f:Z


# direct methods
.method constructor <init>(Landroid/view/View;IZ)V
    .registers 5

    .line 1
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lax/v2/N$a;->f:Z

    .line 6
    .line 7
    iput-object p1, p0, Lax/v2/N$a;->a:Landroid/view/View;

    .line 8
    .line 9
    iput p2, p0, Lax/v2/N$a;->b:I

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/view/ViewGroup;

    .line 16
    .line 17
    iput-object p1, p0, Lax/v2/N$a;->c:Landroid/view/ViewGroup;

    .line 18
    .line 19
    iput-boolean p3, p0, Lax/v2/N$a;->d:Z

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-direct {p0, p1}, Lax/v2/N$a;->i(Z)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private h()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/v2/N$a;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_12

    .line 4
    .line 5
    iget-object v0, p0, Lax/v2/N$a;->a:Landroid/view/View;

    .line 6
    .line 7
    iget v1, p0, Lax/v2/N$a;->b:I

    .line 8
    .line 9
    invoke-static {v0, v1}, Lax/v2/A;->f(Landroid/view/View;I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lax/v2/N$a;->c:Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v0, :cond_12

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, v0}, Lax/v2/N$a;->i(Z)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private i(Z)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/v2/N$a;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_11

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/v2/N$a;->e:Z

    .line 6
    .line 7
    if-eq v0, p1, :cond_11

    .line 8
    .line 9
    iget-object v0, p0, Lax/v2/N$a;->c:Landroid/view/ViewGroup;

    .line 10
    .line 11
    if-eqz v0, :cond_11

    .line 12
    .line 13
    iput-boolean p1, p0, Lax/v2/N$a;->e:Z

    .line 14
    .line 15
    invoke-static {v0, p1}, Lax/v2/z;->b(Landroid/view/ViewGroup;Z)V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public a(Lax/v2/k;)V
    .registers 2

    .line 1
    invoke-virtual {p1, p0}, Lax/v2/k;->Z(Lax/v2/k$f;)Lax/v2/k;

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public synthetic b(Lax/v2/k;Z)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/v2/l;->a(Lax/v2/k$f;Lax/v2/k;Z)V

    return-void
.end method

.method public synthetic c(Lax/v2/k;Z)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/v2/l;->b(Lax/v2/k$f;Lax/v2/k;Z)V

    return-void
.end method

.method public d(Lax/v2/k;)V
    .registers 3

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Lax/v2/N$a;->i(Z)V

    .line 3
    .line 4
    .line 5
    iget-boolean p1, p0, Lax/v2/N$a;->f:Z

    .line 6
    .line 7
    if-nez p1, :cond_f

    .line 8
    .line 9
    iget-object p1, p0, Lax/v2/N$a;->a:Landroid/view/View;

    .line 10
    .line 11
    iget v0, p0, Lax/v2/N$a;->b:I

    .line 12
    .line 13
    invoke-static {p1, v0}, Lax/v2/A;->f(Landroid/view/View;I)V

    .line 14
    .line 15
    .line 16
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public e(Lax/v2/k;)V
    .registers 2

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public f(Lax/v2/k;)V
    .registers 3

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Lax/v2/N$a;->i(Z)V

    .line 3
    .line 4
    .line 5
    iget-boolean p1, p0, Lax/v2/N$a;->f:Z

    .line 6
    .line 7
    if-nez p1, :cond_e

    .line 8
    .line 9
    iget-object p1, p0, Lax/v2/N$a;->a:Landroid/view/View;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p1, v0}, Lax/v2/A;->f(Landroid/view/View;I)V

    .line 13
    .line 14
    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public g(Lax/v2/k;)V
    .registers 2

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lax/v2/N$a;->f:Z

    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/v2/N$a;->h()V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;Z)V
    .registers 3

    if-nez p2, :cond_5

    .line 2
    invoke-direct {p0}, Lax/v2/N$a;->h()V

    :cond_5
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .registers 2

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 2

    .line 1
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;Z)V
    .registers 3

    if-eqz p2, :cond_f

    .line 2
    iget-object p1, p0, Lax/v2/N$a;->a:Landroid/view/View;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lax/v2/A;->f(Landroid/view/View;I)V

    .line 3
    iget-object p1, p0, Lax/v2/N$a;->c:Landroid/view/ViewGroup;

    if-eqz p1, :cond_f

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_f
    return-void
.end method
