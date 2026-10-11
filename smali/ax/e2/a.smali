.class public abstract Lax/e2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/e2/a$a;,
        Lax/e2/a$b;
    }
.end annotation


# static fields
.field public static final a:Lax/e2/a$b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/e2/a$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lax/e2/a$b;-><init>(Lax/Gb/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/e2/a;->a:Lax/e2/a$b;

    .line 8
    .line 9
    return-void
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

.method public static final a(Landroid/content/Context;)Lax/e2/a;
    .registers 2

    .line 1
    sget-object v0, Lax/e2/a;->a:Lax/e2/a$b;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lax/e2/a$b;->a(Landroid/content/Context;)Lax/e2/a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
.method public abstract b()Lax/v7/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/v7/e<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Landroid/net/Uri;)Lax/v7/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lax/v7/e<",
            "Lax/sb/t;",
            ">;"
        }
    .end annotation
.end method
