.class public Lax/c4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/c4/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/c4/d<",
        "Lax/b4/c;",
        "[B>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(Lax/P3/s;)Lax/P3/s;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/s<",
            "Lax/b4/c;",
            ">;)",
            "Lax/P3/s<",
            "[B>;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/P3/s;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lax/b4/c;

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/b4/c;->b()Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Lax/Y3/b;

    .line 12
    .line 13
    invoke-static {p1}, Lax/k4/a;->c(Ljava/nio/ByteBuffer;)[B

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v0, p1}, Lax/Y3/b;-><init>([B)V

    .line 18
    .line 19
    .line 20
    return-object v0
    .line 21
    .line 22
.end method
