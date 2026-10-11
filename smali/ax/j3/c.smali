.class public Lax/j3/c;
.super Ljava/lang/Throwable;
.source "SourceFile"


# instance fields
.field private c0:Ljava/lang/String;

.field private q:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    .line 4
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 2
    iput p2, p0, Lax/j3/c;->q:I

    .line 3
    iput-object p3, p0, Lax/j3/c;->c0:Ljava/lang/String;

    return-void
.end method
