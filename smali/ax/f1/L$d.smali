.class final Lax/f1/L$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/f1/x$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/f1/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lax/f1/L;


# direct methods
.method private constructor <init>(Lax/f1/L;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/f1/L$d;->a:Lax/f1/L;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/f1/L;Lax/f1/L$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lax/f1/L$d;-><init>(Lax/f1/L;)V

    return-void
.end method


# virtual methods
.method public a()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/f1/L$d;->a:Lax/f1/L;

    .line 2
    .line 3
    invoke-static {v0}, Lax/f1/L;->i0(Lax/f1/L;)Landroidx/media3/exoplayer/M0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    iget-object v0, p0, Lax/f1/L$d;->a:Lax/f1/L;

    .line 10
    .line 11
    invoke-static {v0}, Lax/f1/L;->i0(Lax/f1/L;)Landroidx/media3/exoplayer/M0$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Landroidx/media3/exoplayer/M0$a;->b()V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public b()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/f1/L$d;->a:Lax/f1/L;

    .line 2
    .line 3
    invoke-static {v0}, Lax/f1/L;->i0(Lax/f1/L;)Landroidx/media3/exoplayer/M0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    iget-object v0, p0, Lax/f1/L$d;->a:Lax/f1/L;

    .line 10
    .line 11
    invoke-static {v0}, Lax/f1/L;->i0(Lax/f1/L;)Landroidx/media3/exoplayer/M0$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Landroidx/media3/exoplayer/M0$a;->b()V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
.end method
