.class public final Lax/c0/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/c0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lax/c0/d$c;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1f

    .line 7
    .line 8
    if-lt v0, v1, :cond_11

    .line 9
    .line 10
    new-instance v0, Lax/c0/d$b;

    .line 11
    .line 12
    invoke-direct {v0, p1, p2}, Lax/c0/d$b;-><init>(Landroid/content/ClipData;I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lax/c0/d$a;->a:Lax/c0/d$c;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    new-instance v0, Lax/c0/d$d;

    .line 19
    .line 20
    invoke-direct {v0, p1, p2}, Lax/c0/d$d;-><init>(Landroid/content/ClipData;I)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/c0/d$a;->a:Lax/c0/d$c;

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
.end method


# virtual methods
.method public a()Lax/c0/d;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c0/d$a;->a:Lax/c0/d$c;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/c0/d$c;->g()Lax/c0/d;

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

.method public b(Landroid/os/Bundle;)Lax/c0/d$a;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c0/d$a;->a:Lax/c0/d$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/c0/d$c;->setExtras(Landroid/os/Bundle;)V

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

.method public c(I)Lax/c0/d$a;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c0/d$a;->a:Lax/c0/d$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/c0/d$c;->f(I)V

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

.method public d(Landroid/net/Uri;)Lax/c0/d$a;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c0/d$a;->a:Lax/c0/d$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/c0/d$c;->a(Landroid/net/Uri;)V

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
