.class public final Lax/c0/F0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/c0/F0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lax/c0/F0$f;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_11

    .line 3
    new-instance v0, Lax/c0/F0$e;

    invoke-direct {v0}, Lax/c0/F0$e;-><init>()V

    iput-object v0, p0, Lax/c0/F0$b;->a:Lax/c0/F0$f;

    return-void

    :cond_11
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1d

    .line 4
    new-instance v0, Lax/c0/F0$d;

    invoke-direct {v0}, Lax/c0/F0$d;-><init>()V

    iput-object v0, p0, Lax/c0/F0$b;->a:Lax/c0/F0$f;

    return-void

    .line 5
    :cond_1d
    new-instance v0, Lax/c0/F0$c;

    invoke-direct {v0}, Lax/c0/F0$c;-><init>()V

    iput-object v0, p0, Lax/c0/F0$b;->a:Lax/c0/F0$f;

    return-void
.end method

.method public constructor <init>(Lax/c0/F0;)V
    .registers 4

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_11

    .line 8
    new-instance v0, Lax/c0/F0$e;

    invoke-direct {v0, p1}, Lax/c0/F0$e;-><init>(Lax/c0/F0;)V

    iput-object v0, p0, Lax/c0/F0$b;->a:Lax/c0/F0$f;

    return-void

    :cond_11
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1d

    .line 9
    new-instance v0, Lax/c0/F0$d;

    invoke-direct {v0, p1}, Lax/c0/F0$d;-><init>(Lax/c0/F0;)V

    iput-object v0, p0, Lax/c0/F0$b;->a:Lax/c0/F0$f;

    return-void

    .line 10
    :cond_1d
    new-instance v0, Lax/c0/F0$c;

    invoke-direct {v0, p1}, Lax/c0/F0$c;-><init>(Lax/c0/F0;)V

    iput-object v0, p0, Lax/c0/F0$b;->a:Lax/c0/F0$f;

    return-void
.end method


# virtual methods
.method public a()Lax/c0/F0;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c0/F0$b;->a:Lax/c0/F0$f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c0/F0$f;->b()Lax/c0/F0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public b(ILax/T/b;)Lax/c0/F0$b;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c0/F0$b;->a:Lax/c0/F0$f;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/c0/F0$f;->c(ILax/T/b;)V

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public c(Lax/T/b;)Lax/c0/F0$b;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lax/c0/F0$b;->a:Lax/c0/F0$f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/c0/F0$f;->e(Lax/T/b;)V

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public d(Lax/T/b;)Lax/c0/F0$b;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lax/c0/F0$b;->a:Lax/c0/F0$f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/c0/F0$f;->g(Lax/T/b;)V

    .line 4
    .line 5
    .line 6
    return-object p0
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
