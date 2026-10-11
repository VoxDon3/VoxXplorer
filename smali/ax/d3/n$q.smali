.class Lax/d3/n$q;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d3/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "q"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private h:Lax/d3/n$t;

.field private i:Z

.field private j:Z

.field private k:Z

.field final synthetic l:Lax/d3/n;


# direct methods
.method constructor <init>(Lax/d3/n;Lax/d3/n$t;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/d3/n$q;->l:Lax/d3/n;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lax/d3/n$q;->h:Lax/d3/n$t;

    .line 9
    .line 10
    return-void
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
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/d3/n$q;->w([Ljava/lang/Void;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected q(Ljava/lang/Object;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/n$q;->l:Lax/d3/n;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-boolean p1, p0, Lax/d3/n$q;->k:Z

    .line 11
    .line 12
    if-eqz p1, :cond_30

    .line 13
    .line 14
    iget-boolean p1, p0, Lax/d3/n$q;->j:Z

    .line 15
    .line 16
    if-nez p1, :cond_30

    .line 17
    .line 18
    iget-object p1, p0, Lax/d3/n$q;->l:Lax/d3/n;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lax/u3/z;->q(Landroid/app/Activity;)V

    .line 25
    .line 26
    .line 27
    iget-boolean p1, p0, Lax/d3/n$q;->i:Z

    .line 28
    .line 29
    if-eqz p1, :cond_29

    .line 30
    .line 31
    iget-object p1, p0, Lax/d3/n$q;->l:Lax/d3/n;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lax/n/c;

    .line 38
    .line 39
    invoke-static {p1}, Lax/u3/z;->g(Lax/n/c;)V

    .line 40
    .line 41
    .line 42
    :cond_29
    iget-object p1, p0, Lax/d3/n$q;->h:Lax/d3/n$t;

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    invoke-interface {p1, v0}, Lax/d3/n$t;->a(Z)V

    .line 46
    .line 47
    .line 48
    goto :goto_36

    .line 49
    :cond_30
    iget-object p1, p0, Lax/d3/n$q;->h:Lax/d3/n$t;

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-interface {p1, v0}, Lax/d3/n$t;->a(Z)V

    .line 53
    .line 54
    .line 55
    :goto_36
    iget-object p1, p0, Lax/d3/n$q;->l:Lax/d3/n;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-static {p1, v0}, Lax/d3/n;->P2(Lax/d3/n;Lax/d3/n$q;)Lax/d3/n$q;

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Object;
    .registers 4

    .line 1
    iget-object p1, p0, Lax/d3/n$q;->l:Lax/d3/n;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_a

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_a
    invoke-static {p1}, Lax/u3/z;->F(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput-boolean v1, p0, Lax/d3/n$q;->k:Z

    .line 16
    .line 17
    invoke-static {p1}, Lax/u3/z;->t(Landroid/content/Context;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput-boolean v1, p0, Lax/d3/n$q;->j:Z

    .line 22
    .line 23
    invoke-static {}, Lax/u3/z;->y()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_35

    .line 28
    .line 29
    iget-boolean v1, p0, Lax/d3/n$q;->j:Z

    .line 30
    .line 31
    if-nez v1, :cond_35

    .line 32
    .line 33
    iget-boolean v1, p0, Lax/d3/n$q;->k:Z

    .line 34
    .line 35
    if-eqz v1, :cond_35

    .line 36
    .line 37
    invoke-static {p1}, Lax/u3/z;->a(Landroid/app/Activity;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iput-boolean v1, p0, Lax/d3/n$q;->i:Z

    .line 42
    .line 43
    if-eqz v1, :cond_35

    .line 44
    .line 45
    invoke-static {}, Lax/X2/Q;->J()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_35

    .line 50
    .line 51
    invoke-static {p1}, Lax/u3/z;->A(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    :cond_35
    return-object v0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
