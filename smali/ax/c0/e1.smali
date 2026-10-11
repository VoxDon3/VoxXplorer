.class public final Lax/c0/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/c0/e1$d;,
        Lax/c0/e1$e;,
        Lax/c0/e1$c;,
        Lax/c0/e1$b;,
        Lax/c0/e1$a;
    }
.end annotation


# instance fields
.field private final a:Lax/c0/e1$e;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .registers 5

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lax/c0/P;

    invoke-direct {v0, p2}, Lax/c0/P;-><init>(Landroid/view/View;)V

    .line 5
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt p2, v1, :cond_16

    .line 6
    new-instance p2, Lax/c0/e1$d;

    invoke-direct {p2, p1, p0, v0}, Lax/c0/e1$d;-><init>(Landroid/view/Window;Lax/c0/e1;Lax/c0/P;)V

    iput-object p2, p0, Lax/c0/e1;->a:Lax/c0/e1$e;

    return-void

    :cond_16
    const/16 v1, 0x1a

    if-lt p2, v1, :cond_22

    .line 7
    new-instance p2, Lax/c0/e1$c;

    invoke-direct {p2, p1, v0}, Lax/c0/e1$c;-><init>(Landroid/view/Window;Lax/c0/P;)V

    iput-object p2, p0, Lax/c0/e1;->a:Lax/c0/e1$e;

    return-void

    :cond_22
    const/16 v1, 0x17

    if-lt p2, v1, :cond_2e

    .line 8
    new-instance p2, Lax/c0/e1$b;

    invoke-direct {p2, p1, v0}, Lax/c0/e1$b;-><init>(Landroid/view/Window;Lax/c0/P;)V

    iput-object p2, p0, Lax/c0/e1;->a:Lax/c0/e1$e;

    return-void

    .line 9
    :cond_2e
    new-instance p2, Lax/c0/e1$a;

    invoke-direct {p2, p1, v0}, Lax/c0/e1$a;-><init>(Landroid/view/Window;Lax/c0/P;)V

    iput-object p2, p0, Lax/c0/e1;->a:Lax/c0/e1$e;

    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsetsController;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lax/c0/e1$d;

    new-instance v1, Lax/c0/P;

    invoke-direct {v1, p1}, Lax/c0/P;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, p0, v1}, Lax/c0/e1$d;-><init>(Landroid/view/WindowInsetsController;Lax/c0/e1;Lax/c0/P;)V

    iput-object v0, p0, Lax/c0/e1;->a:Lax/c0/e1$e;

    return-void
.end method

.method public static f(Landroid/view/WindowInsetsController;)Lax/c0/e1;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lax/c0/e1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/c0/e1;-><init>(Landroid/view/WindowInsetsController;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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


# virtual methods
.method public a(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c0/e1;->a:Lax/c0/e1$e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/c0/e1$e;->a(I)V

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

.method public b()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c0/e1;->a:Lax/c0/e1$e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c0/e1$e;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public c(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c0/e1;->a:Lax/c0/e1$e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/c0/e1$e;->c(Z)V

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

.method public d(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c0/e1;->a:Lax/c0/e1$e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/c0/e1$e;->d(Z)V

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

.method public e(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c0/e1;->a:Lax/c0/e1$e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/c0/e1$e;->e(I)V

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
