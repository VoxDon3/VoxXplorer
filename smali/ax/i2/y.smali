.class final Lax/i2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$t;


# instance fields
.field private final a:Lax/i2/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/o<",
            "*>;"
        }
    .end annotation
.end field

.field private final b:Lax/i2/v;

.field private c:Landroidx/recyclerview/widget/RecyclerView$t;


# direct methods
.method constructor <init>(Lax/i2/o;Lax/i2/v;Landroidx/recyclerview/widget/RecyclerView$t;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/o<",
            "*>;",
            "Lax/i2/v;",
            "Landroidx/recyclerview/widget/RecyclerView$t;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz p1, :cond_9

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v2, 0x0

    .line 11
    :goto_a
    invoke-static {v2}, Lax/b0/g;->a(Z)V

    .line 12
    .line 13
    .line 14
    if-eqz p2, :cond_10

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    :cond_10
    invoke-static {v0}, Lax/b0/g;->a(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lax/i2/y;->a:Lax/i2/o;

    .line 21
    .line 22
    iput-object p2, p0, Lax/i2/y;->b:Lax/i2/v;

    .line 23
    .line 24
    if-eqz p3, :cond_1c

    .line 25
    .line 26
    iput-object p3, p0, Lax/i2/y;->c:Landroidx/recyclerview/widget/RecyclerView$t;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    new-instance p1, Lax/i2/K;

    .line 30
    .line 31
    invoke-direct {p1}, Lax/i2/K;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lax/i2/y;->c:Landroidx/recyclerview/widget/RecyclerView$t;

    .line 35
    .line 36
    return-void
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


# virtual methods
.method public b(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i2/y;->c:Landroidx/recyclerview/widget/RecyclerView$t;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$t;->b(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public c(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .registers 4

    .line 1
    invoke-static {p2}, Lax/i2/q;->l(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_15

    .line 6
    .line 7
    iget-object v0, p0, Lax/i2/y;->a:Lax/i2/o;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lax/i2/o;->d(Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_15

    .line 14
    .line 15
    iget-object p1, p0, Lax/i2/y;->b:Lax/i2/v;

    .line 16
    .line 17
    invoke-interface {p1, p2}, Lax/i2/v;->a(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_15
    iget-object v0, p0, Lax/i2/y;->c:Landroidx/recyclerview/widget/RecyclerView$t;

    .line 23
    .line 24
    invoke-interface {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$t;->c(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
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

.method public e(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i2/y;->c:Landroidx/recyclerview/widget/RecyclerView$t;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$t;->e(Z)V

    .line 4
    .line 5
    .line 6
    return-void
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
