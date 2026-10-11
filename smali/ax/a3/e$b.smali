.class public Lax/a3/e$b;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Lax/u3/d$a;",
        "Lax/u3/d$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic h:Lax/a3/e;


# direct methods
.method constructor <init>(Lax/a3/e;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/e$b;->h:Lax/a3/e;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->f0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

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
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/e$b;->w([Ljava/lang/Void;)Lax/u3/d$a;

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

.method protected bridge synthetic p(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Lax/u3/d$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/e$b;->x(Lax/u3/d$a;)V

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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Lax/u3/d$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/e$b;->y(Lax/u3/d$a;)V

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

.method protected r()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a3/e$b;->h:Lax/a3/e;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a3/e;->i3(Lax/a3/e;)Lcom/voxdon/xplorer/file/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/a3/e$b;->h:Lax/a3/e;

    .line 11
    .line 12
    invoke-static {v0}, Lax/a3/e;->j3(Lax/a3/e;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method

.method protected varargs w([Ljava/lang/Void;)Lax/u3/d$a;
    .registers 6

    .line 1
    iget-object p1, p0, Lax/a3/e$b;->h:Lax/a3/e;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_27

    .line 9
    .line 10
    invoke-virtual {p0}, Lax/u3/q;->isCancelled()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_10

    .line 15
    .line 16
    goto :goto_27

    .line 17
    :cond_10
    :try_start_10
    iget-object p1, p0, Lax/a3/e$b;->h:Lax/a3/e;

    .line 18
    .line 19
    invoke-static {p1}, Lax/a3/e;->i3(Lax/a3/e;)Lcom/voxdon/xplorer/file/o;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, p0, Lax/a3/e$b;->h:Lax/a3/e;

    .line 24
    .line 25
    invoke-static {v1}, Lax/a3/e;->k3(Lax/a3/e;)Lcom/voxdon/xplorer/file/n;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    invoke-virtual {p1, v1, v2, v3}, Lcom/voxdon/xplorer/file/o;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1, p0}, Lax/u3/d;->a(Ljava/io/InputStream;Lax/u3/c;)Lax/u3/d$a;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_26
    .catch Lax/b3/j; {:try_start_10 .. :try_end_26} :catch_27
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_26} :catch_27

    .line 39
    return-object p1

    .line 40
    :catch_27
    :cond_27
    :goto_27
    return-object v0
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

.method protected x(Lax/u3/d$a;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/a3/e$b;->h:Lax/a3/e;

    .line 2
    .line 3
    invoke-static {p1}, Lax/a3/e;->i3(Lax/a3/e;)Lcom/voxdon/xplorer/file/o;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lax/a3/e$b;->h:Lax/a3/e;

    .line 12
    .line 13
    invoke-static {p1}, Lax/a3/e;->j3(Lax/a3/e;)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/16 v0, 0x8

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method protected y(Lax/u3/d$a;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a3/e$b;->h:Lax/a3/e;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a3/e;->i3(Lax/a3/e;)Lcom/voxdon/xplorer/file/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/a3/e$b;->h:Lax/a3/e;

    .line 12
    .line 13
    invoke-static {v0}, Lax/a3/e;->j3(Lax/a3/e;)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lax/a3/e$b;->h:Lax/a3/e;

    .line 23
    .line 24
    invoke-static {v0, p1}, Lax/a3/e;->l3(Lax/a3/e;Lax/u3/d$a;)V

    .line 25
    .line 26
    .line 27
    return-void
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
.end method
