.class public final Lax/U3/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/U3/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/U3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/U3/n<",
        "Ljava/lang/String;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lax/U3/e$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/U3/e$a<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/U3/e$c$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lax/U3/e$c$a;-><init>(Lax/U3/e$c;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/U3/e$c;->a:Lax/U3/e$a;

    .line 10
    .line 11
    return-void
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
.method public final b(Lax/U3/q;)Lax/U3/m;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/U3/q;",
            ")",
            "Lax/U3/m<",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lax/U3/e;

    .line 2
    .line 3
    iget-object v0, p0, Lax/U3/e$c;->a:Lax/U3/e$a;

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lax/U3/e;-><init>(Lax/U3/e$a;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
