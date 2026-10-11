.class final Lax/p0/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/p0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field static final a:Lax/r0/K;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r0/K<",
            "Ljava/lang/String;",
            "Lax/p0/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 4

    .line 1
    sget-object v0, Lax/r0/u0$b;->l0:Lax/r0/u0$b;

    .line 2
    .line 3
    sget-object v1, Lax/r0/u0$b;->n0:Lax/r0/u0$b;

    .line 4
    .line 5
    invoke-static {}, Lax/p0/h;->S()Lax/p0/h;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, ""

    .line 10
    .line 11
    invoke-static {v0, v3, v1, v2}, Lax/r0/K;->d(Lax/r0/u0$b;Ljava/lang/Object;Lax/r0/u0$b;Ljava/lang/Object;)Lax/r0/K;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lax/p0/f$b;->a:Lax/r0/K;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method
