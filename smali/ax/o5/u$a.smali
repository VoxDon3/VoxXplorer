.class public abstract Lax/o5/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o5/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
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
.method public abstract a()Lax/o5/u;
.end method

.method public abstract b(Lax/o5/o;)Lax/o5/u$a;
.end method

.method public abstract c(Ljava/util/List;)Lax/o5/u$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/o5/t;",
            ">;)",
            "Lax/o5/u$a;"
        }
    .end annotation
.end method

.method abstract d(Ljava/lang/Integer;)Lax/o5/u$a;
.end method

.method abstract e(Ljava/lang/String;)Lax/o5/u$a;
.end method

.method public abstract f(Lax/o5/x;)Lax/o5/u$a;
.end method

.method public abstract g(J)Lax/o5/u$a;
.end method

.method public abstract h(J)Lax/o5/u$a;
.end method

.method public i(I)Lax/o5/u$a;
    .registers 2

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lax/o5/u$a;->d(Ljava/lang/Integer;)Lax/o5/u$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public j(Ljava/lang/String;)Lax/o5/u$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/o5/u$a;->e(Ljava/lang/String;)Lax/o5/u$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
    .line 22
.end method
