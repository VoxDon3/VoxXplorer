.class abstract Lax/p5/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/p5/o$a;
    }
.end annotation


# direct methods
.method constructor <init>()V
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

.method public static a()Lax/p5/o$a;
    .registers 1

    .line 1
    new-instance v0, Lax/p5/c$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/p5/c$b;-><init>()V

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
.end method


# virtual methods
.method public abstract b()Lax/n5/b;
.end method

.method abstract c()Lax/n5/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/n5/c<",
            "*>;"
        }
    .end annotation
.end method

.method public d()[B
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/p5/o;->e()Lax/n5/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lax/p5/o;->c()Lax/n5/c;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lax/n5/c;->c()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Lax/n5/g;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, [B

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method abstract e()Lax/n5/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/n5/g<",
            "*[B>;"
        }
    .end annotation
.end method

.method public abstract f()Lax/p5/p;
.end method

.method public abstract g()Ljava/lang/String;
.end method
