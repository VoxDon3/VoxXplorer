.class public interface abstract Lax/f1/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lax/f1/Q;

.field public static final b:Lax/f1/Q;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/f1/N;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/f1/N;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/f1/Q;->a:Lax/f1/Q;

    .line 7
    .line 8
    new-instance v0, Lax/f1/O;

    .line 9
    .line 10
    invoke-direct {v0}, Lax/f1/O;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lax/f1/Q;->b:Lax/f1/Q;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;ZZ)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ)",
            "Ljava/util/List<",
            "Lax/f1/D;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/f1/a0$c;
        }
    .end annotation
.end method
