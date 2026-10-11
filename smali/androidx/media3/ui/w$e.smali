.class Landroidx/media3/ui/w$e;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/ui/w;-><init>(Landroidx/media3/ui/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/media3/ui/d;

.field final synthetic b:Landroidx/media3/ui/w;


# direct methods
.method constructor <init>(Landroidx/media3/ui/w;Landroidx/media3/ui/d;)V
    .registers 3

    .line 1
    iput-object p1, p0, Landroidx/media3/ui/w$e;->b:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/ui/w$e;->a:Landroidx/media3/ui/d;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 23
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
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    .line 1
    iget-object p1, p0, Landroidx/media3/ui/w$e;->b:Landroidx/media3/ui/w;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-static {p1, v0}, Landroidx/media3/ui/w;->s(Landroidx/media3/ui/w;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Landroidx/media3/ui/w$e;->b:Landroidx/media3/ui/w;

    .line 8
    .line 9
    invoke-static {p1}, Landroidx/media3/ui/w;->t(Landroidx/media3/ui/w;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_1f

    .line 14
    .line 15
    iget-object p1, p0, Landroidx/media3/ui/w$e;->a:Landroidx/media3/ui/d;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/ui/w$e;->b:Landroidx/media3/ui/w;

    .line 18
    .line 19
    invoke-static {v0}, Landroidx/media3/ui/w;->v(Landroidx/media3/ui/w;)Ljava/lang/Runnable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Landroidx/media3/ui/w$e;->b:Landroidx/media3/ui/w;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-static {p1, v0}, Landroidx/media3/ui/w;->u(Landroidx/media3/ui/w;Z)Z

    .line 30
    .line 31
    .line 32
    :cond_1f
    return-void
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
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    .line 1
    iget-object p1, p0, Landroidx/media3/ui/w$e;->b:Landroidx/media3/ui/w;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    invoke-static {p1, v0}, Landroidx/media3/ui/w;->s(Landroidx/media3/ui/w;I)V

    .line 5
    .line 6
    .line 7
    return-void
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
