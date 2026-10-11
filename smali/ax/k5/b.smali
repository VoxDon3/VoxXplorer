.class public Lax/k5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/j5/d$a;


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
.method public a(Lax/e5/a;)Lax/j5/b;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    new-instance v1, Lax/k5/a;

    .line 3
    .line 4
    new-instance v2, Lax/e5/c;

    .line 5
    .line 6
    invoke-direct {v2, p1}, Lax/e5/c;-><init>(Lax/e5/a;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v2}, Lax/h5/d;->a(Lax/j5/c;Lax/e5/a;)Lax/h5/b;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, p1, v2}, Lax/k5/a;-><init>(Lax/e5/a;Lax/h5/b;)V
    :try_end_f
    .catch Lax/h5/d$a; {:try_start_1 .. :try_end_f} :catch_10

    .line 14
    .line 15
    .line 16
    return-object v1

    .line 17
    :catch_10
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
